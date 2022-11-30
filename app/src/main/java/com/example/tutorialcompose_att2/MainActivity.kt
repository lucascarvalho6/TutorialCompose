//Declaração de pacote do projeto:
package com.example.tutorialcompose_att2


//Importação de componentes e bibliotecas:
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp


//Declaração da classe main,
class MainActivity : ComponentActivity() {
    //Sobrescrita de método e chamada do bundle:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o layout da atividade em que as funções de composição são chamadas:
        setContent {
            //Função de recebimento de texto e o uso para configuração do elemento de texto:
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }
}

//Classe Message que tem como função guardar dados (por isso é uma data class), sendo eles o autor da mensagem (author) e o texto que ela enviou (body - corpo de texto)
data class Message(val author: String, val body: String)


//Anotação de criação de função que pode ter composição de componentes:
@Composable
fun MessageCard(msg: Message) {
    //Adicionando uma linha para organizar horizontalmente os textos na tela, tendo um modificador do tamanho de preenchimento dos elementos:
    Row(modifier = Modifier.padding(all = 8.dp)) {
        //Declarando imagem que será utilizada na linha de mensagens
        Image(
            //Chamada da imagem:
            painter = painterResource(R.drawable.corinthians),
            //Descrição da imagem:
            contentDescription = "Contact profile picture",
            //Declaração da variável que recebe métodos da classe Modifier
            modifier = Modifier
                // Definindo o tamanho da imagem para 50 dp
                .size(50.dp)
                // Definindo a imagem para que ela possa ter formato circular:
                .clip(CircleShape)
        )

        // Adicionando um espaço horizontal entre a imagem e a coluna
        Spacer(modifier = Modifier.width(8.dp))

        //Adicionando uma coluna para organizar verticalmente os textos na tela:
        Column {
            Text(text = msg.author)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = msg.body)
        }
    }
}

//Permite visualizar as funções de composição no Android Studio sem precisar criar e instalar o app em um emulador ou dispositvo Android:
@Preview

//Anotação de criação de função que pode ter composição de componentes:
@Composable

//Método PreviewMessageCard, que puxa a composição da classe Message, declara a variável msg e puxa os parâmetros dessa classe
//para serem exibidos pelo MessageCard, através da variável msg.
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("Lexi", "Hey, take a look at Jetpack Compose, it's great!")
    )
}