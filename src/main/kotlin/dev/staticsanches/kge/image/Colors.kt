@file:Suppress("unused")

package dev.staticsanches.kge.image

/**
 * Allow easy access to [CSS colors](https://www.w3schools.com/cssref/css_colors.php) as [Pixel]
 */
data object Colors {
    val BLANK = Pixel.rgba(0x00000000u)

    // CSS colors

    val ALICE_BLUE = Pixel.rgba(0xF0F8FFFFu)
    val ANTIQUE_WHITE = Pixel.rgba(0xFAEBD7FFu)
    val AQUA = Pixel.rgba(0x00FFFFFFu)
    val AQUAMARINE = Pixel.rgba(0x7FFFD4FFu)
    val AZURE = Pixel.rgba(0xF0FFFFFFu)
    val BEIGE = Pixel.rgba(0xF5F5DCFFu)
    val BISQUE = Pixel.rgba(0xFFE4C4FFu)
    val BLACK = Pixel.rgba(0x000000FFu)
    val BLANCHED_ALMOND = Pixel.rgba(0xFFEBCDFFu)
    val BLUE = Pixel.rgba(0x0000FFFFu)
    val BLUE_VIOLET = Pixel.rgba(0x8A2BE2FFu)
    val BROWN = Pixel.rgba(0xA52A2AFFu)
    val BURLY_WOOD = Pixel.rgba(0xDEB887FFu)
    val CADET_BLUE = Pixel.rgba(0x5F9EA0FFu)
    val CHARTREUSE = Pixel.rgba(0x7FFF00FFu)
    val CHOCOLATE = Pixel.rgba(0xD2691EFFu)
    val CORAL = Pixel.rgba(0xFF7F50FFu)
    val CORNFLOWER_BLUE = Pixel.rgba(0x6495EDFFu)
    val CORNSILK = Pixel.rgba(0xFFF8DCFFu)
    val CRIMSON = Pixel.rgba(0xDC143CFFu)
    val CYAN = Pixel.rgba(0x00FFFFFFu)
    val DARK_BLUE = Pixel.rgba(0x00008BFFu)
    val DARK_CYAN = Pixel.rgba(0x008B8BFFu)
    val DARK_GOLDEN_ROD = Pixel.rgba(0xB8860BFFu)
    val DARK_GRAY = Pixel.rgba(0xA9A9A9FFu)
    val DARK_GREEN = Pixel.rgba(0x006400FFu)
    val DARK_KHAKI = Pixel.rgba(0xBDB76BFFu)
    val DARK_MAGENTA = Pixel.rgba(0x8B008BFFu)
    val DARK_OLIVE_GREEN = Pixel.rgba(0x556B2FFFu)
    val DARK_ORANGE = Pixel.rgba(0xFF8C00FFu)
    val DARK_ORCHID = Pixel.rgba(0x9932CCFFu)
    val DARK_RED = Pixel.rgba(0x8B0000FFu)
    val DARK_SALMON = Pixel.rgba(0xE9967AFFu)
    val DARK_SEA_GREEN = Pixel.rgba(0x8FBC8FFFu)
    val DARK_SLATE_BLUE = Pixel.rgba(0x483D8BFFu)
    val DARK_SLATE_GRAY = Pixel.rgba(0x2F4F4FFFu)
    val DARK_TURQUOISE = Pixel.rgba(0x00CED1FFu)
    val DARK_VIOLET = Pixel.rgba(0x9400D3FFu)
    val DEEP_PINK = Pixel.rgba(0xFF1493FFu)
    val DEEP_SKY_BLUE = Pixel.rgba(0x00BFFFFFu)
    val DIM_GRAY = Pixel.rgba(0x696969FFu)
    val DODGER_BLUE = Pixel.rgba(0x1E90FFFFu)
    val FIRE_BRICK = Pixel.rgba(0xB22222FFu)
    val FLORAL_WHITE = Pixel.rgba(0xFFFAF0FFu)
    val FOREST_GREEN = Pixel.rgba(0x228B22FFu)
    val FUCHSIA = Pixel.rgba(0xFF00FFFFu)
    val GAINSBORO = Pixel.rgba(0xDCDCDCFFu)
    val GHOST_WHITE = Pixel.rgba(0xF8F8FFFFu)
    val GOLD = Pixel.rgba(0xFFD700FFu)
    val GOLDEN_ROD = Pixel.rgba(0xDAA520FFu)
    val GRAY = Pixel.rgba(0x808080FFu)
    val GREEN = Pixel.rgba(0x008000FFu)
    val GREEN_YELLOW = Pixel.rgba(0xADFF2FFFu)
    val HONEY_DEW = Pixel.rgba(0xF0FFF0FFu)
    val HOT_PINK = Pixel.rgba(0xFF69B4FFu)
    val INDIAN_RED = Pixel.rgba(0xCD5C5CFFu)
    val INDIGO = Pixel.rgba(0x4B0082FFu)
    val IVORY = Pixel.rgba(0xFFFFF0FFu)
    val KHAKI = Pixel.rgba(0xF0E68CFFu)
    val LAVENDER = Pixel.rgba(0xE6E6FAFFu)
    val LAVENDER_BLUSH = Pixel.rgba(0xFFF0F5FFu)
    val LAWN_GREEN = Pixel.rgba(0x7CFC00FFu)
    val LEMON_CHIFFON = Pixel.rgba(0xFFFACDFFu)
    val LIGHT_BLUE = Pixel.rgba(0xADD8E6FFu)
    val LIGHT_CORAL = Pixel.rgba(0xF08080FFu)
    val LIGHT_CYAN = Pixel.rgba(0xE0FFFFFFu)
    val LIGHT_GOLDEN_ROD_YELLOW = Pixel.rgba(0xFAFAD2FFu)
    val LIGHT_GRAY = Pixel.rgba(0xD3D3D3FFu)
    val LIGHT_GREEN = Pixel.rgba(0x90EE90FFu)
    val LIGHT_PINK = Pixel.rgba(0xFFB6C1FFu)
    val LIGHT_SALMON = Pixel.rgba(0xFFA07AFFu)
    val LIGHT_SEA_GREEN = Pixel.rgba(0x20B2AAFFu)
    val LIGHT_SKY_BLUE = Pixel.rgba(0x87CEFAFFu)
    val LIGHT_SLATE_GRAY = Pixel.rgba(0x778899FFu)
    val LIGHT_STEEL_BLUE = Pixel.rgba(0xB0C4DEFFu)
    val LIGHT_YELLOW = Pixel.rgba(0xFFFFE0FFu)
    val LIME = Pixel.rgba(0x00FF00FFu)
    val LIME_GREEN = Pixel.rgba(0x32CD32FFu)
    val LINEN = Pixel.rgba(0xFAF0E6FFu)
    val MAGENTA = Pixel.rgba(0xFF00FFFFu)
    val MAROON = Pixel.rgba(0x800000FFu)
    val MEDIUM_AQUA_MARINE = Pixel.rgba(0x66CDAAFFu)
    val MEDIUM_BLUE = Pixel.rgba(0x0000CDFFu)
    val MEDIUM_ORCHID = Pixel.rgba(0xBA55D3FFu)
    val MEDIUM_PURPLE = Pixel.rgba(0x9370DBFFu)
    val MEDIUM_SEA_GREEN = Pixel.rgba(0x3CB371FFu)
    val MEDIUM_SLATE_BLUE = Pixel.rgba(0x7B68EEFFu)
    val MEDIUM_SPRING_GREEN = Pixel.rgba(0x00FA9AFFu)
    val MEDIUM_TURQUOISE = Pixel.rgba(0x48D1CCFFu)
    val MEDIUM_VIOLET_RED = Pixel.rgba(0xC71585FFu)
    val MIDNIGHT_BLUE = Pixel.rgba(0x191970FFu)
    val MINT_CREAM = Pixel.rgba(0xF5FFFAFFu)
    val MISTY_ROSE = Pixel.rgba(0xFFE4E1FFu)
    val MOCCASIN = Pixel.rgba(0xFFE4B5FFu)
    val NAVAJO_WHITE = Pixel.rgba(0xFFDEADFFu)
    val NAVY = Pixel.rgba(0x000080FFu)
    val OLD_LACE = Pixel.rgba(0xFDF5E6FFu)
    val OLIVE = Pixel.rgba(0x808000FFu)
    val OLIVE_DRAB = Pixel.rgba(0x6B8E23FFu)
    val ORANGE = Pixel.rgba(0xFFA500FFu)
    val ORANGE_RED = Pixel.rgba(0xFF4500FFu)
    val ORCHID = Pixel.rgba(0xDA70D6FFu)
    val PALE_GOLDEN_ROD = Pixel.rgba(0xEEE8AAFFu)
    val PALE_GREEN = Pixel.rgba(0x98FB98FFu)
    val PALE_TURQUOISE = Pixel.rgba(0xAFEEEEFFu)
    val PALE_VIOLET_RED = Pixel.rgba(0xDB7093FFu)
    val PAPAYA_WHIP = Pixel.rgba(0xFFEFD5FFu)
    val PEACH_PUFF = Pixel.rgba(0xFFDAB9FFu)
    val PERU = Pixel.rgba(0xCD853FFFu)
    val PINK = Pixel.rgba(0xFFC0CBFFu)
    val PLUM = Pixel.rgba(0xDDA0DDFFu)
    val POWDER_BLUE = Pixel.rgba(0xB0E0E6FFu)
    val PURPLE = Pixel.rgba(0x800080FFu)
    val RED = Pixel.rgba(0xFF0000FFu)
    val ROSY_BROWN = Pixel.rgba(0xBC8F8FFFu)
    val ROYAL_BLUE = Pixel.rgba(0x4169E1FFu)
    val SADDLE_BROWN = Pixel.rgba(0x8B4513FFu)
    val SALMON = Pixel.rgba(0xFA8072FFu)
    val SANDY_BROWN = Pixel.rgba(0xF4A460FFu)
    val SEA_GREEN = Pixel.rgba(0x2E8B57FFu)
    val SEA_SHELL = Pixel.rgba(0xFFF5EEFFu)
    val SIENNA = Pixel.rgba(0xA0522DFFu)
    val SILVER = Pixel.rgba(0xC0C0C0FFu)
    val SKY_BLUE = Pixel.rgba(0x87CEEBFFu)
    val SLATE_BLUE = Pixel.rgba(0x6A5ACDFFu)
    val SLATE_GRAY = Pixel.rgba(0x708090FFu)
    val SNOW = Pixel.rgba(0xFFFAFAFFu)
    val SPRING_GREEN = Pixel.rgba(0x00FF7FFFu)
    val STEEL_BLUE = Pixel.rgba(0x4682B4FFu)
    val TAN = Pixel.rgba(0xD2B48CFFu)
    val TEAL = Pixel.rgba(0x008080FFu)
    val THISTLE = Pixel.rgba(0xD8BFD8FFu)
    val TOMATO = Pixel.rgba(0xFF6347FFu)
    val TURQUOISE = Pixel.rgba(0x40E0D0FFu)
    val VIOLET = Pixel.rgba(0xEE82EEFFu)
    val WHEAT = Pixel.rgba(0xF5DEB3FFu)
    val WHITE = Pixel.rgba(0xFFFFFFFFu)
    val WHITE_SMOKE = Pixel.rgba(0xF5F5F5FFu)
    val YELLOW = Pixel.rgba(0xFFFF00FFu)
    val YELLOW_GREEN = Pixel.rgba(0x9ACD32FFu)
}
