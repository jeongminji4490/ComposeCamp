package com.example.composecampbasic

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecampbasic.ui.theme.ComposeCampBasicTheme

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainDescription(
            name = stringResource(R.string.business_card_name),
            jobTitle = stringResource(R.string.business_card_job_title),
        )
        SubDescription(
            phoneNum = stringResource(R.string.business_card_phone_num),
            instagramId = stringResource(R.string.business_card_instagram_id),
            email = stringResource(R.string.business_card_email),
        )
    }
}

@Composable
fun MainDescription(
    name: String,
    jobTitle: String,
) {
    val image = painterResource(id = R.drawable.android_logo)
    val imageModifier = Modifier
        .size(100.dp)
        .background(color = Color(0xFFF000035))
    Column(
        modifier = Modifier
            .fillMaxHeight(fraction = 0.6f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = imageModifier
        )
        Text(
            text = name,
            fontSize = 50.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = jobTitle,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(top = 10.dp),
            color = Color(0xFF357A38)
        )
    }
}

@Composable
fun SubDescription(
    phoneNum: String,
    instagramId: String,
    email: String,
) {
    Column(
        modifier = Modifier
            .fillMaxHeight(fraction = 0.4f),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconText(
            icon = Icons.Default.Phone,
            text = phoneNum
        )
        IconText(
            icon = Icons.Default.Share,
            text = instagramId
        )
        IconText(
            icon = Icons.Default.Email,
            text = email
        )
    }
}

@Composable
fun IconText(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 5.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF357A38),
            modifier = Modifier.weight(0.3f)
        )
        Text(
            text = text,
            modifier = Modifier.weight(0.5f)
        )
    }
}
