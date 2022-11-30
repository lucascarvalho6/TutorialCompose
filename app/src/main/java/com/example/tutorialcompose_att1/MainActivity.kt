//Declaração de pacote do projeto:
package com.example.tutorialcompose_att1


//Importação de componentes e bibliotecas:
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//Declaração da classe main,
class MainActivity : ComponentActivity() {
    //Sobrescrita de método e chamada do bundle:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o layout da atividade em que as funções de composição são chamadas:
        setContent {
            //Função de recebimento de texto e o uso para configuração do elemento de texto:
            MessageCard("Android")
        }
    }
}

//Anotação de criação de função que pode ter composição de componentes:
@Composable
//Método MessageCard, com passagem da string name
fun MessageCard(name: String) {
    //Utilização do Text é definida pela biblioteca UI, mostrando um identificador de texto na tela:
    Text(text = "Hello $name!")
}

//Permite visualizar as funções de composição no Android Studio sem precisar criar e instalar o app em um emulador ou dispositvo Android:
@Preview

//Anotação de criação de função que pode ter composição de componentes:
@Composable

//Método PreviewMessageCard, que puxa a composição do MessageCard e altera-a utilizando a variável $name:
fun PreviewMessageCard() {
    //Função MessageCard que assume o papel da variável $name
    MessageCard("Android")
}