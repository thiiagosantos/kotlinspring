package com.thiago.example.kotlinspring.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class InitialController() {

    @GetMapping
    fun getHelloHttp(): HashMap<String, String> {

        val hash = HashMap<String, String>()
        hash.put("message", "Hello Http With Kotlin!")

        return hash;
    }

}