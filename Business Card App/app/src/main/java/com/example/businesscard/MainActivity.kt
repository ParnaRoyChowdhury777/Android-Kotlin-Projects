package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp () {
    Surface(color = Color(0xFFDAE5DB)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val image = painterResource(R.drawable.android_logo)
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color(0xFF182C35)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                }
                Text(
                    text = "Jennifer Doe",
                    fontSize = 50.sp
                )
                Text(
                    text = "Android Developer Extraordinaire",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFF386B53)
                )
            }

            Column(
                modifier = Modifier.padding(top = 100.dp, bottom = 70.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Row {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Phone Icon",
                        tint = Color(0xFF386B53)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "+91 95786 25934"
                    )
                }
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share Icon",
                        tint = Color(0xFF386B53)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "@Android Dev"
                    )
                }
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email Icon",
                        tint = Color(0xFF386B53)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "jDoe@outlook.com"
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardApp()
    }
}