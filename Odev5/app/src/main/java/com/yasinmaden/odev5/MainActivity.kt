package com.yasinmaden.odev5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasinmaden.odev5.ui.theme.Odev5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev5Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {
                    CalculatorApp()
                }
            }
        }
    }
}

@Composable
fun CalculatorApp() {
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    var isSecondNumber by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = result.ifEmpty { if (isSecondNumber) secondNumber else firstNumber }, fontSize = 32.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            Row {
                CalculatorButton("1") { addToNumber("1", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("2") { addToNumber("2", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("3") { addToNumber("3", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
            }
            Row {
                CalculatorButton("4") { addToNumber("4", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("5") { addToNumber("5", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("6") { addToNumber("6", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
            }
            Row {
                CalculatorButton("7") { addToNumber("7", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("8") { addToNumber("8", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("9") { addToNumber("9", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
            }
            Row {
                CalculatorButton("0") { addToNumber("0", isSecondNumber, firstNumber, secondNumber, { firstNumber = it }, { secondNumber = it }) }
                CalculatorButton("+") { isSecondNumber = true }
                CalculatorButton("=") {
                    result = (firstNumber.toInt() + secondNumber.toInt()).toString()
                }
            }
            Row {
                CalculatorButton("C") {
                    firstNumber = ""
                    secondNumber = ""
                    result = ""
                    isSecondNumber = false
                }
            }
        }
    }
}

@Composable
fun CalculatorButton(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(8.dp)
            .size(64.dp)
    ) {
        Text(text = text, fontSize = 24.sp)
    }
}

fun addToNumber(
    digit: String,
    isSecondNumber: Boolean,
    firstNumber: String,
    secondNumber: String,
    updateFirstNumber: (String) -> Unit,
    updateSecondNumber: (String) -> Unit
) {
    if (isSecondNumber) {
        updateSecondNumber(secondNumber + digit)
    } else {
        updateFirstNumber(firstNumber + digit)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Odev5Theme {
        CalculatorApp()
    }
}
