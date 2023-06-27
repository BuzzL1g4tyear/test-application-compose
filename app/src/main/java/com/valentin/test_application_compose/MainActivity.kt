package com.valentin.test_application_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.valentin.test_application_compose.ui.theme.TestapplicationcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestapplicationcomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        title = stringResource(R.string.first),
                        message = stringResource(R.string.second),
                        info = stringResource(id = R.string.third)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier, title: String, message: String, info: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            lineHeight = 32.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = message,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = info,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingImage(
    modifier: Modifier = Modifier,
    title: String,
    message: String,
    info: String,
    image: Painter = painterResource(R.drawable.bg_compose_background)
) {
    Column{
        Image(
            painter = image,
            contentDescription = "background"
        )

        GreetingText(
            title = title,
            message = message,
            info = info,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview() {
//    TestapplicationcomposeTheme {
//        GreetingImage(message = "Hello, world", f = "Valentin")
//    }
//}