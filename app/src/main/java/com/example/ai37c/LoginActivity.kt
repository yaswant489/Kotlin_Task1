package com.example.ai37c

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37c.ui.theme.Ai37CTheme
import com.example.ai37c.ui.theme.Blue

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ai37CTheme {
                LoginBody()
                PreviewLogin()


            }
        }
    }
}

@Composable
fun LoginBody(){
    Scaffold {
        padding->
        Column (modifier = Modifier
            .padding()){
            Spacer(modifier = Modifier
                .height(80.dp))

            Text("Sign In", style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                color = Blue
            ),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text("It was popularized in the 1960s with the release of Letraset sheetscontains lorem im",
                style = TextStyle(
                    fontWeight = FontWeight.Light
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                textAlign = TextAlign.Center
            )
            Card(){
                Row {
                    Image(
                        painter = painterResource(R)
                    )
                }
            }

        }
    }

}
@Composable


@Preview
@Composable
fun PreviewLogin(){
    LoginBody()
}