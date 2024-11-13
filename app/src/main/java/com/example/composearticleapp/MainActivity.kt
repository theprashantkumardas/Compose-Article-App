package com.example.composearticleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticleapp.ui.theme.ComposeArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleAppTheme {
                MainContent()
            }
        }
    }
}


@Preview
@Composable
fun MainContent(){
    Column(modifier = Modifier.fillMaxWidth()) {
        //content of screen

        //Top image
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = "Top Nav Image",
            modifier = Modifier.fillMaxWidth().height(200.dp)
        )

        //Heading Text
        Text(
            text = "Jetpack Compose Tutorials",
            modifier = Modifier.padding(top = 8.dp , bottom = 8.dp , start = 16.dp, end = 16.dp),
            style = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,



            )

        )

        //Paaragraph Content
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.\n\n" +
                    "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. \n\nTo create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier.padding(horizontal = 16.dp , vertical = 16.dp ),
            style = TextStyle(
                fontSize = 16.sp,
                textAlign = TextAlign.Justify,
                lineHeight = 24.sp

            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    ComposeArticleAppTheme {
        MainContent()
    }
}