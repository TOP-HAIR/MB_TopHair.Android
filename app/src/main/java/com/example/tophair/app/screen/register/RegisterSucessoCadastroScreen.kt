package com.example.tophair.app.screen.register

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tophair.R
import com.example.tophair.app.utils.CustomButton
import com.example.tophair.app.screen.login.LoginView
import com.example.tophair.app.utils.RegisterComponent
import com.example.tophair.ui.theme.TopHairTheme

class RegisterSucessoCadastroView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TopHairTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RegisterSucessoCadastroScreen()
                }
            }
        }
    }
}

@Composable
fun RegisterSucessoCadastroScreen() {
    val route = LocalContext.current

    RegisterComponent(
        componentContent = {
            Text(
                stringResource(id = R.string.titulo_tela_cadastro_sucesso),
                fontSize = 28.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                textAlign = TextAlign.Center,
                lineHeight = 40.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(18.dp))

            Image(
                painter = painterResource(id = R.mipmap.icon_success_cadastro),
                contentDescription = "Ícone de Cadastro Bem-Sucedido",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 120.dp, height = 120.dp)
            )

            CustomButton(
                text = stringResource(id = R.string.btn_txt_voltar_login),
                onClick = {
                    val loginView = Intent(route, LoginView::class.java)

                    route.startActivity(loginView)
                },
                Color(31, 116, 109, 255),
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun RegisterSucessoCadastroPreview() {
    TopHairTheme {
        RegisterSucessoCadastroScreen()
    }
}