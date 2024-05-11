package dev.staticsanches.kge.engine.window

import dev.staticsanches.kge.annotations.KGESensitiveAPI
import dev.staticsanches.kge.engine.window.state.DimensionState
import dev.staticsanches.kge.engine.window.state.InputState
import dev.staticsanches.kge.engine.window.state.TimeState
import dev.staticsanches.kge.image.Decal
import dev.staticsanches.kge.image.Pixel
import dev.staticsanches.kge.image.Sprite
import dev.staticsanches.kge.renderer.LayerDescriptor
import dev.staticsanches.kge.resource.IdentifiedResource
import dev.staticsanches.kge.resource.KGEInternalResource
import dev.staticsanches.kge.resource.KGEResource
import dev.staticsanches.kge.types.vector.Int2D
import dev.staticsanches.kge.utils.invokeForAll
import dev.staticsanches.kge.utils.invokeForAllRemoving
import org.lwjgl.glfw.Callbacks
import org.lwjgl.glfw.GLFW
import org.lwjgl.opengl.GLCapabilities

@OptIn(KGESensitiveAPI::class)
class Window @KGESensitiveAPI constructor(
	glfwHandle: Long, @property:KGESensitiveAPI val glCapabilities: GLCapabilities
) : KGEInternalResource {

	private val glfwWindow = IdentifiedResource("GLFW Window", { glfwHandle }, ::clearGLFWWindow)
	private val boundResources = ArrayList<KGEResource>()

	init {
		bindResource(glfwWindow)
	}

	@KGESensitiveAPI
	val glfwHandle: Long by glfwWindow::id

	val dimensionState: DimensionState = DimensionState()
	val screenSize: Int2D by dimensionState::screenSize

	val inputState: InputState = InputState()
	val timeState: TimeState = TimeState()

	var decalMode = Decal.Mode.NORMAL
	var pixelMode: Pixel.Mode = Pixel.Mode.Normal
	var decalStructure = Decal.Structure.FAN
	var suspendTextureTransfer = false

	@KGESensitiveAPI
	val layers = ArrayList<LayerDescriptor>()

	@KGESensitiveAPI
	var targetLayerIndex = 0

	var drawTarget: Sprite? = null
		set(value) {
			if (value == null) {
				targetLayerIndex = 0
				field = layers[0].drawTarget.sprite
			} else {
				field = value
			}
		}

	@KGESensitiveAPI
	fun bindResource(resource: KGEResource) {
		boundResources.add(0, resource)
	}

	@KGESensitiveAPI
	override fun close() = boundResources.invokeForAllRemoving(KGEResource::close)

	private val extraInfoMap: MutableMap<ExtraInfoKey<*>, Any> = mutableMapOf()

	@KGESensitiveAPI
	fun <T : Any> registerExtraInfo(key: ExtraInfoKey<T>, extraInfo: T) {
		extraInfoMap[key] = extraInfo
	}

	@KGESensitiveAPI
	@Suppress("UNCHECKED_CAST")
	fun <T : Any> retrieveExtraInfo(key: ExtraInfoKey<T>): T =
		extraInfoMap[key] as? T ?: throw RuntimeException("Missing extra info for the informed key: $key")

	override fun toString(): String = glfwWindow.toString()

	interface ExtraInfoKey<T>

	companion object {

		private fun clearGLFWWindow(handle: Long) =
			invokeForAll(
				{ Callbacks.glfwFreeCallbacks(handle) },
				{ GLFW.glfwDestroyWindow(handle) },
			) { it() }

	}

}
