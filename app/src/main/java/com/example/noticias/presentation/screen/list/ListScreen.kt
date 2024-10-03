package com.example.noticias

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.noticias.data.model.News


@Composable
fun ListScreen() {

    val newsList = List(500) {

        News(
            title = "Titulo ${it}",
            description = "Descricao ${it}",
            message = "Mensagem ${it}",
            isFavorite = false
        )
    }

    LazyColumn() {
        items(count = newsList.size){
            Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text=newsList[it].title)
                Text(text=newsList[it].message)
                Text(text=newsList[it].description)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ListScreenPreview() {
    ListScreen()
}