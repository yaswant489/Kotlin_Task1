package com.example.ai37c


import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37c.ui.theme.Ai37CTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold { padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null

                )
                Text(
                    "Yaswant", style = TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,

                        )
                )
                Icon(
                    painter = painterResource(R.drawable.baseline_more_horiz_24),
                    contentDescription = null

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Image(
                    painter = painterResource(R.drawable.ousen),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Column {
                    Text(
                        "10",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraBold
                        )
                    )
                    Text("Post")
                }
                Column {
                    Text(
                        "10M",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraBold
                        )
                    )
                    Text("Followers")
                }
                Column {
                    Text(
                        "10M",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraBold
                        )
                    )
                    Text("Likes")
                }
            }
            Column {
                Text(
                    "Yaswant Poudel",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraBold
                    )
                )
                Text("God is great")
                Text("Be happy")
            }
            Row {
                Button(onClick = {},
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(2.dp, Color.Black),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth()

                    ) {
                    Text("Follow")
                }
            }
            Row {
                Card (
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)
                ){  }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Image(
                        painter = painterResource(R.drawable.ousen),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("highlights")
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.ousen),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("highlights")
                }
                Column {
                    Image(
                        painter = painterResource(R.drawable.ousen),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text("highlights")
                }

            }
        }

    }
}


@Preview
@Composable
fun ProfilePreview(){
    ProfileBody()
}
