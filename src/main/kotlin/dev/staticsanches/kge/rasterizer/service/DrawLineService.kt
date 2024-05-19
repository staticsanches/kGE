package dev.staticsanches.kge.rasterizer.service

import dev.staticsanches.kge.image.Pixel
import dev.staticsanches.kge.image.pixelmap.PixelMap
import dev.staticsanches.kge.rasterizer.Rasterizer
import dev.staticsanches.kge.rasterizer.utils.BresenhamLine
import dev.staticsanches.kge.spi.KGESPIExtensible
import dev.staticsanches.kge.types.vector.Int2D
import dev.staticsanches.kge.types.vector.by

interface DrawLineService : KGESPIExtensible {
    fun drawLine(
        start: Int2D,
        end: Int2D,
        color: Pixel,
        target: PixelMap,
        pixelMode: Pixel.Mode,
    )

    fun drawLine(
        startX: Int,
        startY: Int,
        endX: Int,
        endY: Int,
        color: Pixel,
        target: PixelMap,
        pixelMode: Pixel.Mode,
    )
}

internal object DefaultDrawLineService : DrawLineService {
    override fun drawLine(
        start: Int2D,
        end: Int2D,
        color: Pixel,
        target: PixelMap,
        pixelMode: Pixel.Mode,
    ) = BresenhamLine(start, end, target, false).forEach { Rasterizer.draw(it, color, target, pixelMode) }

    override fun drawLine(
        startX: Int,
        startY: Int,
        endX: Int,
        endY: Int,
        color: Pixel,
        target: PixelMap,
        pixelMode: Pixel.Mode,
    ) = drawLine(startX by startY, endX by endY, color, target, pixelMode)

    override val servicePriority: Int
        get() = Int.MIN_VALUE
}
