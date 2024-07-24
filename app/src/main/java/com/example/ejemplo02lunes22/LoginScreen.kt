package com.example.ejemplo02lunes22

import androidx.compose.foundation.layout.*
//import androidx.compose.material3
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.Modifier

@Composable
fun LoginScreen(navController: NavController){
    var userName by remember { mutableStateOf("") }
    var password  by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            value = userName,
            onValueChange = { userName = it},
            label = {Text ( "Userame")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))


        TextField(
            value = password,
            onValueChange = {userName = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("password")}
        )
        Spacer(modifier = Modifier.height(16.dp))


        Button(
            onClick = {
                navController.navigate(Screen.Home.route)
            },
            modifier = Modifier.fillMaxWidth()
            ) {
            Text("Login")

        }
    }
}