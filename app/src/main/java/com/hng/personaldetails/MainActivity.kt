package com.hng.personaldetails

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hng.personaldetails.ui.theme.PersonalDetailsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalDetailsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PersonalDetailsApp()
                }
            }
        }
    }
}

@Composable
fun PersonalDetailsApp() {
    Column {
        DisplayUserName()
        DisplayUserPicture()
        DisplayOpenGithubButton()
    }
}

@Composable
fun DisplayUserPicture(){
    Text(text = "Display Picture")
}

@Composable
fun DisplayUserName(){
    Text(text = "Display Name")
}


@Composable
fun DisplayOpenGithubButton(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Open Github")
    }
}


@Preview(showBackground = true)
@Composable
fun PersonalDetailsPreview() {
    PersonalDetailsApp()
}