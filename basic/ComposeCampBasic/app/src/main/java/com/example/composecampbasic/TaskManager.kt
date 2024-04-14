package com.example.composecampbasic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskCompletedScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        TaskCompletedImage()
        TaskCompletedTexts(
            title = stringResource(R.string.all_tasks_completed),
            description = stringResource(R.string.nice_work)
        )
    }
}

@Composable
fun TaskCompletedImage() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun TaskCompletedTexts(title: String, description: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp).fillMaxWidth(),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
    Text(
        text = description,
        fontSize = 16.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}