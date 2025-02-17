package dev.sanjaygangwar.tempproject.utils

object TextFormatterUtil {
    fun Float.formatFloat(): String {
        return "%.1f".format(this)
    }
}