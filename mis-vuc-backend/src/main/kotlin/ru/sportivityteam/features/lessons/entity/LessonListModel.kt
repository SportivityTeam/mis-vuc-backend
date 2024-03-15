package ru.sportivityteam.features.lessons.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LessonListModel(
    @SerialName("date")
    val date: String,
    @SerialName("lessons_list")
    val lessonsList: List<LessonModel>
)