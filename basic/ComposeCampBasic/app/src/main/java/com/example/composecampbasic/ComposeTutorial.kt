package com.example.composecampbasic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ComposeTutorialMainScreen() {
    Column {
        ComposeTutorialImage()
        ComposeTutorialContents(
            title = stringResource(R.string.jetpack_compose_tutorial_title),
            description1 = stringResource(R.string.jetpack_compose_description_1),
            description2 = stringResource(R.string.jetpack_compose_description_2)
        )
    }
}

@Composable
fun ComposeTutorialImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ComposeTutorialContents(
    title: String,
    description1: String,
    description2: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
    Text(
        text = description1,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = description2,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}
