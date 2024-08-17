package com.yasinmaden.odev3.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasinmaden.odev3.R
import com.yasinmaden.odev3.ui.components.CustomButton
import com.yasinmaden.odev3.ui.components.CustomTextField
import com.yasinmaden.odev3.ui.theme.DarkPrimaryColor
import com.yasinmaden.odev3.ui.theme.LightSecondaryColor
import com.yasinmaden.odev3.ui.theme.MainColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val config = LocalConfiguration.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Sign In",
                        fontFamily = FontFamily(Font(R.font.lilita)),
                        fontSize = 30.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MainColor,
                    titleContentColor = DarkPrimaryColor
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            HorizontalDivider(
                thickness = 2.dp,
                modifier = Modifier.padding(top = (config.screenWidthDp * 50 / 100).dp,
                    bottom = 16.dp)
            )

            Text(
                text = "Welcome Back!",
                fontFamily = FontFamily(Font(R.font.lilita)),
                fontSize = 45.sp,
                modifier = Modifier.padding(
                    start = (config.screenWidthDp * 5 / 100).dp,


                    )
            )
            Text(
                text = "To keep connected with us please login with your personal info",
                fontSize = 16.sp,
                color = LightSecondaryColor,
                modifier = Modifier.padding(start = (config.screenWidthDp * 5 / 100).dp, top = 8.dp)
            )

            CustomTextField(modifier = Modifier, "Email Address")
            CustomTextField(modifier = Modifier, "Password")

            CustomButton(text = "Sign In")
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(thickness = 2.dp)
        }

    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}