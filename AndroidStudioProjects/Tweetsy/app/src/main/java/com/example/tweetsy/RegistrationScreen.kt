package com.example.tweetsy

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun RegistrationScreen() {
    var name by remember { mutableStateOf(TextFieldValue("")) }
    var useremail by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var password1 by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf(TextFieldValue("")) }
    GrandientBox2(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.
            fillMaxSize()
            .verticalScroll(rememberScrollState())
        ) {
            Box(modifier = Modifier.size(30.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.25f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "REGISTRATION",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.Black
                )
            }

            Box(modifier = Modifier.size(50.dp))

            // Column with rounded corners
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(3f)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp, bottomStart = 40.dp, bottomEnd = 40.dp ))
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(modifier = Modifier.size(20.dp))

                Text(
                    text = "REGISTER",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.Black
                )

                Box(modifier = Modifier.size(30.dp))

                OutlinedTextField(
                    value =name,
                    leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) },
                    onValueChange = {
                       name = it },
                    label = { Text(text = "Enter Your Name") },
                    placeholder = { Text(text = "Enter Your Name") },
                )

                Box(modifier = Modifier.size(20.dp))

                OutlinedTextField(
                    value = useremail,
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) },
                    onValueChange = {
                        useremail = it },
                    label = { Text(text = "Enter Email") },
                    placeholder = { Text(text = "Enter your Email") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    visualTransformation = PasswordVisualTransformation()
                )
                Box(modifier = Modifier.size(20.dp))

                OutlinedTextField(
                    value = password,
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = null) },
                    onValueChange = {
                        password = it },
                    label = { Text(text = "Password") },
                    placeholder = { Text(text = "Enter your Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )

                Box(modifier = Modifier.size(20.dp))

                OutlinedTextField(
                    value = password1,
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = null) },
                    onValueChange = {
                        password1 = it },
                    label = { Text(text = "Confirm Password") },
                    placeholder = { Text(text = "Please Confirm Your Password") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation()
                )

                Box(modifier = Modifier.size(20.dp))

                OutlinedTextField(
                    value = phone,
                    leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = null) },
                    onValueChange = {
                        phone = it },
                    label = { Text(text = "Phone Number") },
                    placeholder = { Text(text = "Phone Number") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

                )

                Box(modifier = Modifier.size(20.dp))

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(300.dp)
                        .height(56.dp)
                        .padding(horizontal = 10.dp)
                        .clip(RoundedCornerShape(5.dp)),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
                ) {
                    Text(
                        text = "SINGUP",
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White
                    )
                }
                Box(modifier = Modifier.size(30.dp))

            }
        }
    }
}
