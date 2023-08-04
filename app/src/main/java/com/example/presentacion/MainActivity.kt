package com.example.presentacion
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentacion.ui.theme.PresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Cyan
                )
                {
                    //
                }
            }
        }
    }
}

@Composable
fun Presentacion(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .background(color = Color.Blue)
            )
            Text(
                text = "Emill Daniel",
                fontSize = 24.sp,
            )
            Text(
                text = "Android Student",
                fontSize = 24.sp,
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.outline_travel_explore_black_48),
                    contentDescription = "GitHub",
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "github.com/DanielEmill",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.baseline_call_black_18),
                    contentDescription = "Telefono",
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = "8493934891",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun PresentacionPreview(){
    PresentacionTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Cyan
        ){
        Presentacion()
        }
    }
}
