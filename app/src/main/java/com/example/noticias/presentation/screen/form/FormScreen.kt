package com.example.noticias

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FormScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var titulo by remember { mutableStateOf("") }
        var descricao by remember { mutableStateOf("") }
        var mensagem by remember { mutableStateOf("") }

        Form(titulo, "Título") { titulo = it }
        Form(descricao, "Descrição") { descricao = it }
        Form(mensagem, "Mensagem") { mensagem = it }

        Botao()
    }
}

@Composable
fun Form(
    value: String,
    label: String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value,
        onValueChange = { onValueChange(it) },
        label = { Text(text = label) }
    )
}


@Composable
fun Botao() {
    Button(
        onClick = { TODO() },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Login")
    }

}

@Preview (showSystemUi = true)
@Composable
fun FormScreenPreview() {
        FormScreen()
}