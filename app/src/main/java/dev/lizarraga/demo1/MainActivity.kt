package dev.lizarraga.demo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.lizarraga.demo1.ui.theme.JetpackComposeDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiComponente()
        }
    }

    @Composable
    fun MiComponente() {
       Column() {
           MiItem(titulo = "Mike Nieva", subtitulo = "Javascript Engineer", imagen = R.drawable.expositor01)
           MiItem(titulo = "Pablo Perez", subtitulo = "Google Developer Expert", imagen = R.drawable.expositor02)
           MiItem(titulo = "Francisco Arce", subtitulo = "Software Engineer", imagen = R.drawable.expositor03)
           MiItem(titulo = "Gustavo Lizárraga", subtitulo = "GitHub Campus Expert", imagen = R.drawable.expositor04)
       }
    }
    
    @Composable
    fun MiImagen(image: Int) {
        Image(
            painterResource(image),
            "Mi Imagen",
            modifier = Modifier
                .size(35.dp)
                .clip(CircleShape)
        )
    }
    
    @Composable 
    fun MiDescripcion(titulo: String, subtitulo: String) {
        Column() {
            Text(text = titulo, Modifier.padding(start = 5.dp), fontWeight = FontWeight.Bold)
            Text(text = subtitulo, Modifier.padding(start = 5.dp), fontSize = 10.sp)
        }
    }

    @Composable
    fun MiItem(titulo:String, subtitulo: String, imagen: Int) {
        Row(modifier = Modifier.padding(5.dp)) {
            MiImagen(image = imagen)
            MiDescripcion(titulo = titulo, subtitulo = subtitulo)
        }
    }

    @Preview(
        name = "Mi App",
        showBackground = true
    )
    @Composable
    fun DefaultPreview() {
        MiComponente()
    }
    
}