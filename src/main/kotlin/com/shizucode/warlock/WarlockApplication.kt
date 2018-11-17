package com.shizucode.warlock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WarlockApplication

fun main(args: Array<String>) {
    runApplication<WarlockApplication>(*args)
}
