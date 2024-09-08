package com.example.taleandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.taleandroid.ui.theme.InfoTextStyle
import com.example.taleandroid.ui.theme.myGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            myGameTheme {
                defaultPreview()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun defaultPreview() {
    myGameTheme { // Ensure the theme is applied here
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background) // Use background from theme
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp) // Padding around the row
                    .align(Alignment.TopStart)
                    .background(color = MaterialTheme.colorScheme.primary),
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ){
                Surface(
                    modifier = Modifier
                        .weight(1f) // Weight for equal width
                        .height(30.dp)
                        .border(2.dp, Color.LightGray, RoundedCornerShape(4.dp)),
                ) {
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ){
                        Text("Energy:",style = InfoTextStyle)

                    }
                }


            }

            // Apply background and border to the Row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp) // Padding around the row
                    .align(Alignment.BottomStart)
                    .background(color = MaterialTheme.colorScheme.background),
                horizontalArrangement = Arrangement.spacedBy(12.dp) // Space between surfaces
            ) {
                Surface(
                    modifier = Modifier
                        .weight(1f) // Weight for equal width
                        .height(100.dp)
                        .border(2.dp, Color.LightGray, RoundedCornerShape(4.dp)),
                    color = MaterialTheme.colorScheme.primary // Use secondary color from theme

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(4.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp) // Space between elements
                    ) {
                        Text("Hp:", style = InfoTextStyle)
                        Text("Exp:", style = InfoTextStyle)
                        Text("Level:", style = InfoTextStyle)
                        Text("Coins:", style = InfoTextStyle)
                    }
                }

                Surface(
                    modifier = Modifier
                        .weight(1f) // Weight for equal width
                        .height(100.dp)
                        .border(2.dp, Color.LightGray, RoundedCornerShape(4.dp)),
                    color = MaterialTheme.colorScheme.primary // Use error color from theme
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(4.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text("Name", style = InfoTextStyle)
                        Text("Level", style = InfoTextStyle)
                        Text("Class", style = InfoTextStyle)
                        Text("Job", style = InfoTextStyle)
                    }
                }
            }
        }
    }
}