package ru.sportivityteam

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.sportivityteam.features.lessons.entity.lessonRouting
import ru.sportivityteam.features.parser.readFromExcel
import ru.sportivityteam.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
readFromExcel()
}

fun Application.module() {
    configureMonitoring()
    configureSerialization()
    configureDatabases()
    lessonRouting()
    configureRouting()
}
