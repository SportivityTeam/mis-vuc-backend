package ru.sportivityteam.features.lessons.entity

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.lessonRouting() {
    routing {
        get("/lessons") {
            call.respond(
                listOf(
                    LessonModel(
                        id = "2323",
                        audience = "Ауд. 101",
                        lesson = "ВСП",
                        employee = "Ренкавик В.А.",
                        lessonTime = "09:00-10:30"
                    ),
                    LessonModel(
                        id = "2323",
                        audience = "Ауд. 101",
                        lesson = "ВСП",
                        employee = "Ренкавик В.А.",
                        lessonTime = "09:00-10:30"
                    ),
                    LessonModel(
                        id = "2323",
                        audience = "Ауд. 101",
                        lesson = "ВСП",
                        employee = "Ренкавик В.А.",
                        lessonTime = "09:00-10:30"
                    ),
                    LessonModel(
                        id = "2323",
                        audience = "Ауд. 101",
                        lesson = "ВСП",
                        employee = "Ренкавик В.А.",
                        lessonTime = "09:00-10:30"
                    ),
                )
            )
        }
    }
}
