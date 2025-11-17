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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37c.ui.theme.Ai37CTheme

class Spotify : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ai37CTheme {
                SpotifyBody()

            }
        }
    }
}


@Composable
fun SpotifyBody(){
    Scaffold { padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(color = colorResource(R.color.black))
        ){
            Row {

                Text("Listen Again",
                    style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold),
                    color = colorResource(R.color.white),
                    modifier = Modifier
                        .padding(end = 235.dp),
                    )
                Row {
                    Icon(
                        painter = painterResource(R.drawable.baseline_notifications_none_24),
                        contentDescription = null,
                        tint = colorResource(R.color.white)
                    )
                    Icon(painter = painterResource(R.drawable.baseline_access_time_24),
                        contentDescription = null,
                        tint = colorResource(R.color.white)
                    )
                    Icon(
                        painter = painterResource(R.drawable.baseline_more_horiz_24),
                        contentDescription = null,
                        tint = colorResource(R.color.white)
                    )
                }

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
                 ){
                Column {
                    Image(
                        painter = painterResource(R.drawable.lanadelrey),
                        contentDescription = null,
                        modifier = Modifier
                            .height(125.dp)
                            .width(125.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop,
                        )
                    Text("Lana Del Rey",
                        color = colorResource(R.color.white),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .padding(10.dp))}
                Column {
                    Image(
                        painter = painterResource(R.drawable.cas),
                        contentDescription = null,
                        modifier = Modifier
                            .height(125.dp)
                            .width(125.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        "Cigrattes after Sex",
                        color = colorResource(R.color.white),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .padding(10.dp),

                        )
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.radiohead),
                        contentDescription = null,
                        modifier = Modifier
                            .height(125.dp)
                            .width(125.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("RadioHead",
                        color = colorResource(R.color.white),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),
                        modifier = Modifier
                            .padding(10.dp))
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(R.drawable.ousen),
                    contentDescription =null,
                    modifier = Modifier
                        .height(125.dp)
                        .width(125.dp)
                )
                Column {
                    Text("#Spotify",
                        color = colorResource(R.color.white),
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold),)
                    Text("Your 2025 in view",
                    color = colorResource(R.color.white),style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold),)
                }
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Column {
                    Image(
                        painter = painterResource(R.drawable.golodenhour),
                        contentDescription = null,
                        modifier = Modifier
                            .height (150.dp)
                            .width(150.dp)
                    )
                    Text("Your top songs",
                        color = colorResource(R.color.white),style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)
                    )


                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.xxxtentacion),
                        contentDescription = null,
                        modifier = Modifier
                            .height (150.dp)
                            .width(150.dp)
                    )
                    Text("Your Artists",
                        color = colorResource(R.color.white),style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold)

                    )
                }
            }
            Row (
                modifier = Modifier
                    .padding(20.dp)
            ){
                Text("Editors pick",
                    color = colorResource(R.color.white),style = TextStyle(
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold),)

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 1.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Column {
                    Image(
                        painter = painterResource(R.drawable.frankocean),
                        contentDescription = null,
                        modifier = Modifier
                            .height (150.dp)
                            .width(150.dp)
                    )
                    Text("FrankOcean,GunsNRoses",
                        color = colorResource(R.color.white),style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)
                    )


                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.theleaf),
                        contentDescription = null,
                        modifier = Modifier
                            .height (150.dp)
                            .width(150.dp)
                    )
                    Text("CAS,Radiohead,Frank",
                        color = colorResource(R.color.white),style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold)

                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SpotifyPreview() {
    SpotifyBody()

}