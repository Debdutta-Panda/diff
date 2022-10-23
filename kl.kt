val input1Number = try {
    input1.value.toInt()
} catch (e: Exception) {
    result.value = "Error"
    return@Button
}
val input2Number = try {
    input2.value.toInt()
} catch (e: Exception) {
    result.value = "Error"
    return@Button
}
