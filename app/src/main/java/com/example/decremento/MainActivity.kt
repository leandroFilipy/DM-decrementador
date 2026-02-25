package com.example.decremento

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.decremento.ui.theme.DecrementoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DecrementoTheme {
                decrementador(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun decrementador(modifier: Modifier = Modifier){

    var valor by remember {
        mutableStateOf(0)
    }
    
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(text = "o valor é: $valor")
        
        Button(onClick = { valor++}) {
            Text(text = "incrementar")
        }
        Button(onClick = {
            if(valor > 0){
                valor--
            }
        }){
            Text(text = "decrementar")
        }
        Button(onClick = { valor = 0 }) {
            Text(text = "resetar")
        }
    }

}

