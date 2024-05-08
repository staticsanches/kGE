package dev.staticsanches.kge.image.pixelmap.buffer

import dev.staticsanches.kge.annotations.KGESensitiveAPI
import dev.staticsanches.kge.endian.EndianAwareUtils
import dev.staticsanches.kge.image.Pixel
import dev.staticsanches.kge.image.pixelmap.buffer.PixelBuffer.Type
import dev.staticsanches.kge.resource.KGECleanAction
import dev.staticsanches.kge.resource.KGECleaner
import java.nio.ByteBuffer


/**
 * [PixelBuffer] associated with [PixelBuffer.Type.RGBA].
 */
@OptIn(KGESensitiveAPI::class)
open class RGBABuffer(width: Int, height: Int, buffer: ByteBuffer, bufferCleanAction: KGECleanAction) :
	PixelBuffer<Type.RGBA>(width, height, Type.RGBA, buffer) {

	private val cleanable = KGECleaner.registerLeakDetector(this, representation, bufferCleanAction)

	override fun uncheckedGet(x: Int, y: Int): Pixel =
		Pixel.fromNativeRGBA(internalBuffer.getInt((y * width + x) * 4))

	override fun uncheckedSet(x: Int, y: Int, pixel: Pixel): Boolean {
		internalBuffer.putInt((y * width + x) * 4, pixel.nativeRGBA)
		return true
	}

	override fun clear(pixel: Pixel) {
		internalBuffer.clear()
		while (internalBuffer.hasRemaining()) {
			internalBuffer.putInt(pixel.nativeRGBA)
		}
	}

	override fun clear(pixelByXY: (x: Int, y: Int) -> Pixel) {
		internalBuffer.clear()
		for (y in 0..<height) {
			for (x in 0..<width) {
				internalBuffer.putInt(pixelByXY(x, y).nativeRGBA)
			}
		}
	}

	override fun inv() = EndianAwareUtils.invRGBABuffer(internalBuffer)

	override fun close() = cleanable.clean()

}
