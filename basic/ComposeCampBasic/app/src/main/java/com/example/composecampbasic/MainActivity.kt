package com.example.composecampbasic

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCampBasicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFC1FDC1),
                ) {
                    // ComposeTutorialMainScreen()
                    // TaskCompletedScreen()
                    // QuadrantScreen()
                    BusinessCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeTutorialPreview() {
    ComposeCampBasicTheme {
        Surface {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xFFEAFEEA),
            ) {
                // ComposeTutorialMainScreen()
                // TaskCompletedScreen()
                BusinessCard()
            }
        }
    }
}