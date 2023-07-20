package com.pradeep.composeexplorer.ui_components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MarqueeTextLayout() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Text(text = "This is a MarqueeText which moves from left to right.",
            modifier = Modifier.padding(horizontal = 8.dp).basicMarquee(),
            fontSize = 20.sp,
            fontWeight = FontWeight.W500,
            color = Color(0xFFFF6D00)
        )
    }

}