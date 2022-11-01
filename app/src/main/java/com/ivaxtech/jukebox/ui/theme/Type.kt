package com.ivaxtech.jukebox.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ivaxtech.jukebox.R

val PALANQUIN = FontFamily(
    Font(R.font.palanquin_thin, FontWeight.Thin),
    Font(R.font.palanquin_extra_light, FontWeight.ExtraLight),
    Font(R.font.palanquin_light, FontWeight.Light),
    Font(R.font.palanquin_regular, FontWeight.Normal),
    Font(R.font.palanquin_medium, FontWeight.Medium),
    Font(R.font.palanquin_semi_bold, FontWeight.SemiBold),
    Font(R.font.palanquin_bold, FontWeight.Bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Black,
        fontSize = 96.sp
    ),
    h2 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp
    ),
    h3 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp
    ),
    h4 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp
    ),
    h5 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    h6= TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    subtitle1= TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    subtitle2= TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),

    button = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp
    ),

    body1 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2 = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),

    caption = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),

    overline = TextStyle(
        fontFamily = PALANQUIN,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
)