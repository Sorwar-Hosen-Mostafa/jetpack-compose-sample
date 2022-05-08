package com.example.jetpackcomposesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposesample.ui.theme.JetpackComposeSampleTheme
import com.example.jetpackcomposesample.ui.theme.Typography
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    CustomText(name = "Robin")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun CustomText(name: String) {
    Text(
        style = Typography.h5,
        text = name
    )
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeSampleTheme {
        Column{
            Greeting("Android")
            CustomText("Fantastic")
        }
    }
}*/

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeSampleTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
            ) {
                Surface(
                    modifier =
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    color = MaterialTheme.colors.primary
                ) {}
                Surface(
                    modifier =
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    color = MaterialTheme.colors.secondary
                ) {}
                Surface(
                    modifier =
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    color = MaterialTheme.colors.primaryVariant
                ) { }
                Surface(
                    modifier =
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    color = MaterialTheme.colors.secondaryVariant
                ) { }

            }

            Surface(
                modifier =
                Modifier
                    .height(50.dp)
                    .width(200.dp),
                color = MaterialTheme.colors.secondary
            ) {}

            Surface(
                modifier =
                Modifier
                    .height(50.dp)
                    .width(200.dp),
                color = MaterialTheme.colors.primaryVariant
            ) {}

            Surface(
                modifier =
                Modifier
                    .height(50.dp)
                    .width(200.dp),
                color = MaterialTheme.colors.secondaryVariant
            ) {}
        }
    }
}