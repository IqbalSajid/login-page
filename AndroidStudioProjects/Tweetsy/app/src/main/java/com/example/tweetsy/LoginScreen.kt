package com.example.tweetsy

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password1 by remember { mutableStateOf("") }
    val context = LocalContext.current
    val Green = Color(0xFF00FF00)
    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xff270b2c),
                Color(0xff5b07f1),
                Color(0xff07cff1),
                Color(0xFFA6D86D),
                Color(0xfff5c309),
                Color(0xffe5d289),
                Color(0xffe71313)
            )
        )
    }
    val borderWidth = 2.dp
    GrandientBox(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.10f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "WelCome To Valenca",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White
                )

            }
            Image(
                painter = painterResource(id = R.drawable.attachment),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(130.dp)
                    .border(
                        BorderStroke(borderWidth, rainbowColorsBrush),
                        CircleShape
                    )
                    .padding(borderWidth)
                    .clip(CircleShape)
            )




            // Column with rounded corners
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.9f)
                    .padding(10.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 40.dp,
                            topEnd = 40.dp,
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        )
                    )
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(modifier = Modifier.size(40.dp))

                OutlinedTextField(
                    value = username,
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) },
                    onValueChange = {
                        username = it
                    },
                    label = { Text(text = "Email address") },
                    placeholder = { Text(text = "Enter your e-mail") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                )

                Box(modifier = Modifier.size(30.dp))

                OutlinedTextField(
                    value = password1,
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = null) },
                    onValueChange = {
                        password1 = it
                    },
                    label = { Text(text = "Password") },
                    placeholder = { Text(text = "Enter your Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Black,
                    )
                )

                Box(modifier = Modifier.size(30.dp))


                Button(
                    onClick = { // Handle login button click
                         },
                    modifier = Modifier
                        .width(300.dp)
                        .height(52.dp)
                        .padding(horizontal = 10.dp)
                        .clip(RoundedCornerShape(2.dp)),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
                ) {
                    Text(
                        text = "LOGIN",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White
                    )
                }

                Box(modifier = Modifier.size(20.dp))

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .width(350.dp)
                        .fillMaxWidth()
                        .padding(10.dp),
//                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.download),
                            contentDescription = "drawable icons",
                            modifier = Modifier.size(30.dp),

                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Continue With Google",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.headlineSmall,
                        )
                    }
                }


                Box(modifier = Modifier.size(10.dp))

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .width(350.dp)

                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.downloads),
                            contentDescription = "drawable icons",
                            modifier = Modifier.size(30.dp),

                            )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(
                            text = "Continue with facebook",
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }

//                Box(modifier = Modifier.size(10.dp))

                Row(
                    modifier = Modifier.padding(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Don't have an account")
                    TextButton(onClick = {
                        val intent = Intent(context, MainActivity2::class.java)
                        context.startActivity(intent)
                    }) {
                        Text(text = "Create New Account")
                    }
                }

                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Forgot Password",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Black
                )

            }
        }
    }
}
