package dev.staticsanches.kge.renderer

import dev.staticsanches.kge.engine.window.Window
import dev.staticsanches.kge.image.Pixel
import dev.staticsanches.kge.image.Sprite
import dev.staticsanches.kge.spi.KGESPIExtensible
import dev.staticsanches.kge.types.vector.Float2D
import dev.staticsanches.kge.types.vector.Int2D

interface Renderer : KGESPIExtensible {

	fun beforeWindowCreation()

	context(Window)
	fun afterWindowCreation()

	context(Window)
	fun createTexture(filtered: Boolean, clamp: Boolean): Int

	context(Window)
	fun deleteTexture(id: Int)

	context(Window)
	fun updateTexture(id: Int, sprite: Sprite)

	context(Window)
	fun readTexture(id: Int, sprite: Sprite)

	context(Window)
	fun applyTexture(id: Int)

	context(Window)
	fun prepareDrawing()

	context(Window)
	fun clearBuffer(pixel: Pixel, depth: Boolean)

	context(Window)
	fun updateViewport(position: Int2D, size: Int2D)

	context(Window)
	fun displayFrame()

	context(Window)
	fun drawDecal(decal: DecalInstance)

	context(Window)
	fun drawLayerQuad(offset: Float2D, scale: Float2D, tint: Pixel)

	companion object : Renderer by KGESPIExtensible.getWithHigherPriority()

}
