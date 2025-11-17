package com.example.ai37c

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37c.ui.theme.Ai37CTheme

class Card2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardActivity2()
            viewer2()

        }
    }
}

@Composable
fun  CardActivity2() {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .padding()
                .fillMaxSize()

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, end = 10.dp)
                    .background(color = colorResource(R.color.teal_700)),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(R.drawable.xxxtentacion),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .clip(shape = CircleShape)

                )
            }
            Column(
                modifier = Modifier
                    
                    .background(color = colorResource(R.color.teal_700))
                    .fillMaxWidth(),
            ) {
                Text(
                    "Card", style = TextStyle(
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 40.sp
                    )
                )
                Text(
                    "Simple and easy to use app", style = TextStyle(
                        fontSize = 20.sp
                    )
                )
            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Column {
                Row(
                    modifier = Modifier
                ) {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .weight(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp
                        )

                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()

                        ) {

                            Text(
                                "Text", style = TextStyle(
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "teen titans", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Light
                                )
                            )
                        }
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Column {
                Row(
                    modifier = Modifier
                ) {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .weight(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp
                        )

                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()

                        ) {
                            Text(
                                "Text", style = TextStyle(
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "teen titans", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Light
                                )
                            )
                        }
                    }
                }
            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Column {
                Row(
                    modifier = Modifier
                ) {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .weight(1f)
                            .padding(10.dp),
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 20.dp
                        )

                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()

                        ) {

                            Text(
                                "Text", style = TextStyle(
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                            Text(
                                "teen titans", style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Light
                                )
                            )
                        }
                    }
                }
            }
        }
    }

}

@Preview
@Composable
fun viewer2(){
    CardActivity2()
}