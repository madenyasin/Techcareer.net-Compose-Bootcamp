package com.yasinmaden.odev3.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField(modifier: Modifier = Modifier, placeholder: String) {
    var text by remember { mutableStateOf("") }
    val width = LocalConfiguration.current.screenWidthDp
    TextField(
        value = text,
        onValueChange = { text = it },
        placeholder = { Text(placeholder) },
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = (width / 20).dp, end = (width / 20).dp)
    )
}




@Preview(showBackground = true)
@Composable
fun CustomTextFieldPreview() {
    CustomTextField(modifier = Modifier, "Email Address")
}