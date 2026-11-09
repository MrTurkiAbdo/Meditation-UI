package com.example.meditationui.Custom.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.meditationui.R

val gothicA1 = FontFamily(
    listOf(
        Font(R.font.gothic_a1_regular, FontWeight.Normal),
        Font(R.font.gothic_a1_medium, FontWeight.Medium),
        Font(R.font.gothic_a1_bold, FontWeight.SemiBold),
        Font(R.font.gothic_a1_bold, FontWeight.Bold),
        Font(R.font.gothic_a1_black, FontWeight.Black),
    )
)

val Typography = Typography(
    bodyMedium = TextStyle(
        color = AquaBlue,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    headlineMedium = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleLarge = TextStyle(
        color = TextWhite,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)


