package com.example.linkerdlearn.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class LinkerdController {
    private val random: Random =Random()
    @GetMapping("hi")
    fun getProperty(@Value("\${property:George}") property: String):String {
        val randomInt:Int= random.nextInt()*(10-1)+1
        return if(randomInt>5)
            throw RuntimeException("Error occurred")
        else
            "Hi from version $property"
    }
}