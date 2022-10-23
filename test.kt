Column(
    verticalArrangement = Arrangement.spacedBy(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    TextField(
        value = input1.value,
        onValueChange = {
            input1.value = it
        },
        placeholder = {
            Text("Input1")
        }
    )
    TextField(
        value = input2.value,
        onValueChange = {
            input2.value = it
        },
        placeholder = {
            Text("Input2")
        }
    )
    Button(onClick = {
        val input1Number = input1.value.toInt()
        val input2Number = input2.value.toInt()
        val resultNumber = input1Number + input2Number
        result.value = resultNumber.toString()
    }) {
        Text("Click Me")
    }
    Text("Result:${result.value}")
}
