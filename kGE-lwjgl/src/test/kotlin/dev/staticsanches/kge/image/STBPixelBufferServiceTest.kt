package dev.staticsanches.kge.image

import dev.staticsanches.kge.image.Colors.BLACK
import dev.staticsanches.kge.image.Colors.BLANK
import dev.staticsanches.kge.image.Colors.BLUE
import dev.staticsanches.kge.image.Colors.LIME
import dev.staticsanches.kge.image.Colors.ORANGE
import dev.staticsanches.kge.image.Colors.RED
import dev.staticsanches.kge.image.Colors.YELLOW
import dev.staticsanches.kge.types.vector.by
import kotlin.test.Test
import kotlin.test.assertEquals

class STBPixelBufferServiceTest {

	@Test
	fun checkCreate_function() =
		Sprite.create(5, 5) { x, y -> xmas5By5PngPixels[y * 5 + x] }.use {
			it.fullCheck()
		}

	@Test
	fun checkCreate_defaultPixel() = Sprite.create(5, 5, defaultPixel = RED).use {
		assertEquals(setOf(RED), it.toSet())

		// Write the expected pixels
		for (x in 0..<5) {
			for (y in 0..<5) {
				it[x, y] = xmas5By5PngPixels[y * 5 + x]
			}
		}

		it.fullCheck()
	}

	@Test
	fun checkLoadFromMemory() =
		Sprite.load(STBPixelBufferServiceTest::class.java.getResource("/xmas_5x5.png")!!).use {
			it.fullCheck()
		}

	@Test
	fun checkLoadFromFileName() =
		Sprite.load(STBPixelBufferServiceTest::class.java.getResource("/xmas_5x5.png")!!.file).use {
			it.fullCheck()
		}

	private fun Sprite.fullCheck() {
		this.validateXmas5By5PngPixels()
		this.duplicate().use { copy ->
			copy.validateXmas5By5PngPixels()

			// Set all of copy's pixels to BLACK
			for (x in 0..<5) {
				for (y in 0..<5) {
					copy[x, y] = BLACK
				}
			}

			// Checks that the original is intact
			this.validateXmas5By5PngPixels()

			// Checks that the copy has only black pixels
			assertEquals(setOf(BLACK), copy.toSet())

			// Write the original pixels back
			for (x in 0..<5) {
				for (y in 0..<5) {
					copy[x, y] = xmas5By5PngPixels[y * 5 + x]
				}
			}

			// Checks that the copy is back to normal
			copy.validateXmas5By5PngPixels()
		}
		this.duplicate(1 by 2, 2 by 2).use { copy ->
			assertEquals(listOf(LIME, LIME, RED, LIME), copy.toList())
		}
	}

	private fun Sprite.validateXmas5By5PngPixels() {
		assertEquals(5, width)
		assertEquals(5, height)
		assertEquals(xmas5By5PngPixels, toList())
		inv()
		inv()
		assertEquals(xmas5By5PngPixels, toList())
	}

	private val xmas5By5PngPixels: List<Pixel> = listOf(
		BLUE, BLUE, YELLOW, BLUE, BLUE,
		BLUE, RED, LIME, LIME, BLUE,
		BLUE, LIME, LIME, RED, BLUE,
		LIME, RED, LIME, LIME, RED,
		BLANK, BLANK, ORANGE, BLANK, BLANK,
	)

}