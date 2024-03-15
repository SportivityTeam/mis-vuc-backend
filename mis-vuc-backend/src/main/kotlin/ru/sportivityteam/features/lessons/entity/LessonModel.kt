package ru.sportivityteam.features.lessons.entity

import kotlinx.serialization.Serializable

@Serializable
data class LessonModel(
    val id: String,
    val audience: String,
    val lesson: String,
    val employee: String,
    val lessonTime: String
)