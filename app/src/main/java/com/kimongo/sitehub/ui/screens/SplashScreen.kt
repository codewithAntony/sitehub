package com.kimongo.sitehub.ui.screens

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kimongo.sitehub.R

@Preview
@Composable
fun SplashScreen() {
    val kittentFont = FontFamily(Font(R.font.kitten))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.white))
    ) {
        Image(
            painter = painterResource(R.drawable.bottom_arc),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
        )

        Text(
            text = stringResource(id = R.string.welcome),
            fontFamily = kittentFont,
            color = colorResource(id = R.color.purple),
            fontSize = 66.sp,
            lineHeight = 66.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 80.dp)
        )

        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SplashButton(
                text = stringResource(R.string.signup),
                iconResId = R.drawable.signup,
                topPadding = 48.dp,
                bottomPadding = 0.dp,
                onClick = {}
            )
            SplashButton(
                text = stringResource(R.string.login),
                iconResId = R.drawable.login,
                topPadding = 0.dp,
                bottomPadding = 48.dp,
                onClick = {}
            )
        }
    }
}

@Composable
fun SplashButton(
    text: String,
    iconResId: Int,
    topPadding: Dp,
    bottomPadding: Dp,
    onClick: () -> Unit
    ) {

    Box(
        modifier = Modifier
            .width(150.dp)
            .height(300.dp)
            .padding(topPadding, bottom = bottomPadding)
            .clip(CircleShape)
            .background(colorResource(R.color.purple))
            .padding(vertical = 24.dp)
            .clickable{onClick()}
    ) {

        Text(
            text = text,
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.TopCenter)
        )

        Box(
            modifier = Modifier
                .size(110.dp)
                .align(Alignment.BottomCenter)
                .clip(CircleShape)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(iconResId),
                contentDescription = null
            )
        }
    }
}