package com.pingping

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PingServiceApplication

fun main(args: Array<String>) {
    runApplication<PingServiceApplication>(*args)
}
