package com.dnzk.leap.ui.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dnzk.leap.R

enum class LogoColor {
    BLACK, WHITE
}

@Composable
fun AppLogo(modifier: Modifier = Modifier, color: LogoColor = LogoColor.BLACK) {
    val id =
        if (color == LogoColor.BLACK)
            R.drawable.logo_jump_black
        else
            R.drawable.logo_jump_white
    Icon(
        painter = painterResource(id = id),
        contentDescription = "Jump Logo",
        modifier = modifier
    )
}

@Preview
@Composable
fun PreviewAppLogo() {
    AppLogo()
}

@Preview
@Composable
fun PreviewAppLogoWhite() {
    AppLogo(color = LogoColor.WHITE)
}