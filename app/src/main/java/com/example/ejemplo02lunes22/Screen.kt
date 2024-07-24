package com.example.ejemplo02lunes22

sealed class Screen(val route: String){
    object  Login: Screen("Login")
    object  Home: Screen("Home")
}

