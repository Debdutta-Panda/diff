Column(
    verticalArrangement = Arrangement.spacedBy(8.dp),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text("Input1")
        }
    )
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text("Input2")
        }
    )
    Button(onClick = { /*TODO*/ }) {
        Text("Click Me")
    }
    Text("Result:")
}
