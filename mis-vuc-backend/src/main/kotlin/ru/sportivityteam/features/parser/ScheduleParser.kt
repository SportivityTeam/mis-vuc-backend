package ru.sportivityteam.features.parser


import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.io.readExcel
import org.jetbrains.kotlinx.dataframe.io.toJson
import java.io.File

internal fun readFromExcel() {
    val dataFrame = DataFrame.readExcel(File("schedule.xlsx"))
    println(dataFrame.toJson())
}
