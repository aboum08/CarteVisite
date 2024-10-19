package com.example.cartevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartevisite.ui.theme.CarteVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteVisiteTheme {
                GreetingMain()
            }
        }
    }
}
@Composable
fun GreetingImage(name: String, titre: String, modifier: Modifier=Modifier){
    val image= painterResource(R.drawable.logo1)
    Column(
      verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(100.dp).padding(bottom = 10.dp)
        )
        Text(
            text=name,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text=titre,
            fontSize = 16.sp
        )
    }
}

@Composable
fun GreetingIcon( modifier: Modifier=Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier= Modifier.padding(start = 10.dp, top = 16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically ) {
            GreetingIconeEmail(stringResource(R.string.email))

        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GreetingIconeTel(stringResource(R.string.telephone))
        }
    }
}
@Composable
fun GreetingIconeEmail(txt1: String, modifier: Modifier=Modifier){
    val icone= painterResource(R.drawable.mail_clipart_small_icon_png_17)
    Image(
        painter = icone,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(15.dp)
    )
    Text(
        text=txt1,
        fontSize = 16.sp,
        modifier=Modifier.padding(start = 2.dp)
    )
}
@Composable
fun GreetingIconeTel(txt2: String, modifier: Modifier=Modifier){
    val icone= painterResource(R.drawable.tel)
    Image(
        painter = icone,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(15.dp)
    )
    Text(
        text=txt2,
        fontSize = 16.sp,
        modifier=Modifier.padding(start = 2.dp)
    )
}
@Composable
fun GreetingMain(modifier: Modifier=Modifier){
    Surface (
        contentColor = Color.Blue,
        modifier = Modifier.fillMaxHeight().fillMaxSize(),

    ){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GreetingImage(stringResource(R.string.name), stringResource(R.string.titre))
            GreetingIcon()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteVisiteTheme {
        GreetingMain()

    }
}