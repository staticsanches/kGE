package dev.staticsanches.kge.rasterizer

import dev.staticsanches.kge.rasterizer.service.ClearService
import dev.staticsanches.kge.rasterizer.service.DefaultClearService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawCircleService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawLineService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawPartialSpriteService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawRectService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawService
import dev.staticsanches.kge.rasterizer.service.DefaultDrawTriangleService
import dev.staticsanches.kge.rasterizer.service.DefaultFillCircleService
import dev.staticsanches.kge.rasterizer.service.DefaultFillRectService
import dev.staticsanches.kge.rasterizer.service.DefaultFillTriangleService
import dev.staticsanches.kge.rasterizer.service.DrawCircleService
import dev.staticsanches.kge.rasterizer.service.DrawLineService
import dev.staticsanches.kge.rasterizer.service.DrawPartialSpriteService
import dev.staticsanches.kge.rasterizer.service.DrawRectService
import dev.staticsanches.kge.rasterizer.service.DrawService
import dev.staticsanches.kge.rasterizer.service.DrawTriangleService
import dev.staticsanches.kge.rasterizer.service.FillCircleService
import dev.staticsanches.kge.rasterizer.service.FillRectService
import dev.staticsanches.kge.rasterizer.service.FillTriangleService
import dev.staticsanches.kge.spi.KGESPIExtensible

data object Rasterizer :
    ClearService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultClearService,
    DrawService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawService,
    DrawCircleService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawCircleService,
    DrawLineService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawLineService,
    DrawPartialSpriteService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawPartialSpriteService,
    DrawRectService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawRectService,
    DrawTriangleService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultDrawTriangleService,
    FillCircleService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultFillCircleService,
    FillRectService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultFillRectService,
    FillTriangleService by KGESPIExtensible.getOptionalWithHigherPriority() ?: DefaultFillTriangleService {
    override val servicePriority: Int
        get() = Int.MIN_VALUE
}
