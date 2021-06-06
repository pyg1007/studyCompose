package com.compose.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        // Greeting("Android") // Text
         MultipleColumnText() // 열로 정렬된 text
        // MultipleRowText() // 행으로 정렬된 text
        // ColumnWithRowText() // 행과 열로 정렬된 text
    }
}

@Composable
fun MultipleColumnText(onclick: () -> Unit){
    Column(Modifier.clickable(onclick = onclick).padding(5.dp)) {
        Text(text = "Hello")
        Text(text = "This text is column")
        Text(text = "sorted")
    }
}

@Composable
fun MultipleRowText(){
    Row(Modifier.padding(5.dp)) {
        Text(text = "Hello")
        Text(text = "This text is column")
        Text(text = "sorted")
    }
}

@Composable
fun ColumnWithRowText(){
    Row(Modifier.padding(5.dp), verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Hello, MyName is ")
        Column(Modifier.padding(5.dp)) {
            Text(text = "Ura")
            Text(text = "Janis")
        }
    }
}