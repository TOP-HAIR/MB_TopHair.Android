package com.example.tophair.app.screen.menu.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tophair.R
import com.example.tophair.app.data.entities.enum.FilterServicoEnum
import com.example.tophair.app.utils.CustomLogo
import com.example.tophair.app.utils.MarginSpace

@Preview(showBackground = true)
@Composable
fun HomeComponent() {

    val textoSobreposto = Color(red = 0, green = 0, blue = 0, alpha = 200)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {

        CustomLogo()


        Column(modifier = Modifier
            .padding(14.dp) ) {

            MarginSpace(height = 4.dp)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(alignment = Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.Center
            ) {
                FilterServicoEnum.values().forEach { icon ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = icon.imagemFiltro),
                            contentDescription = icon.descricaoFiltro,
                            modifier = Modifier
                                .size(85.dp, 90.dp)
                                .border(2.dp, color = Color.DarkGray, shape = RoundedCornerShape(10.dp))
                                .clickable { icon.onClick() }
                        )
                        Text(stringResource(id = icon.textoFiltro)
                        )
                    }
                }
            }


            MarginSpace(height = 4.dp)

            Text(
                modifier = Modifier
                    .padding(20.dp),
                text = stringResource(id = R.string.txt_estabelecimentos_mais_avaliados),
                fontSize = 20.sp
            )

            MarginSpace(height = 15.dp)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .padding(20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.mipmap.imagem_de_fundo),
                    contentDescription = "Imagem de Fundo 01",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )

                Text(
                    text = "Canto superior direito",
                    color = Color.White,
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.TopEnd)
                )
            }

            MarginSpace(height = 15.dp)

            Text(
                text = stringResource(id = R.string.txt_estabelecimentos_recomendados),
                modifier = Modifier
                    .padding(20.dp),
                fontSize = 20.sp
            )
        }



        MarginSpace(height = 15.dp)

//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(220.dp)
//        ) {
//
//            Image(
//                painter = painterResource(id = R.mipmap.imagem_de_fundo),
//                contentDescription = "Imagem de Fundo 01",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight()
//            )
//
//            Row(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopEnd)
//                    .padding(top = 13.dp, end = 56.dp)
//                    .width(90.dp)
//                    .height(50.dp)
//                    .background(color = textoSobreposto, shape = RoundedCornerShape(5.dp))
//            ) {
//
//                Text(
//                    text = stringResource(id = R.string.txt_taxa_de_avaliacao),
//                    modifier = Modifier.padding(start = 15.dp, top = 5.dp),
//                    fontSize = 24.sp,
//                    color = Color.White
//                )
//
//                Image(
//                    painter = painterResource(id = R.mipmap.imagem_estrela_dourada),
//                    contentDescription = "Imagem de estrela dourada",
//                    modifier = Modifier
//                        .width(20.dp)
//                        .height(10.dp)
//                        .align(Alignment.CenterVertically),
//                    alignment = Alignment.CenterEnd
//
//                )
//
//                Text(
//                    text = stringResource(id = R.string.txt_qtd_de_avaliacoes),
//                    color = Color.White,
//                    fontSize = 5.sp,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(top = 20.dp, end = 10.dp)
//                )
//
//
//            }
//
//            Row(
//                modifier = Modifier
//                    .align(alignment = Alignment.BottomStart)
//                    .padding(start = 56.dp, bottom = 18.dp, end = 56.dp)
//                    .width(280.dp)
//                    .height(60.dp)
//                    .background(color = textoSobreposto, shape = RoundedCornerShape(2.dp))
//            ) {
//
//                //  Text(text = stringResource(id =),
//                //    color = Color.White,
//                //    fontSize = 5.sp,
//                //    textAlign = TextAlign.Center,
//                //    modifier = Modifier.padding(top = 20.dp, end = 10.dp)
//                //  )
//
//
//            }
//
//
//        }

    }

//    LazyColumn(
//        modifier = Modifier.height(770.dp),
//        state = rememberLazyListState(0, 0),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        userScrollEnabled = true,
//    ) {
//        items(1) {
//
//            Box(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(220.dp)
//            ) {
//
//                Image(
//                    painter = painterResource(id = R.mipmap.imagem_de_fundo),
//                    contentDescription = "Imagem de Fundo 01",
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .fillMaxHeight()
//                )
//
//                Row(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopEnd)
//                        .padding(top = 13.dp, end = 56.dp)
//                        .width(90.dp)
//                        .height(50.dp)
//                        .background(color = textoSobreposto, shape = RoundedCornerShape(5.dp))
//                ) {
//
//                    Text(
//                        text = stringResource(id = R.string.txt_taxa_de_avaliacao),
//                        modifier = Modifier.padding(start = 15.dp, top = 5.dp),
//                        fontSize = 24.sp,
//                        color = Color.White
//                    )
//
//                    Image(
//                        painter = painterResource(id = R.mipmap.imagem_estrela_dourada),
//                        contentDescription = "Imagem de estrela dourada",
//                        modifier = Modifier
//                            .width(20.dp)
//                            .height(10.dp)
//                            .align(Alignment.CenterVertically),
//                        alignment = Alignment.CenterEnd
//
//                    )
//
//                    Text(
//                        text = stringResource(id = R.string.txt_qtd_de_avaliacoes),
//                        color = Color.White,
//                        fontSize = 5.sp,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.padding(top = 20.dp, end = 10.dp)
//                    )
//
//
//                }
//
//                Row(
//                    modifier = Modifier
//                        .align(alignment = Alignment.BottomStart)
//                        .padding(start = 56.dp, bottom = 18.dp, end = 56.dp)
//                        .width(280.dp)
//                        .height(60.dp)
//                        .background(color = textoSobreposto, shape = RoundedCornerShape(2.dp))
//                ) {
//
//                    //  Text(text = stringResource(id =),
//                    //    color = Color.White,
//                    //    fontSize = 5.sp,
//                    //    textAlign = TextAlign.Center,
//                    //    modifier = Modifier.padding(top = 20.dp, end = 10.dp)
//                    //  )
//
//
//                }
//
//
//            }
//
//        }
//    }

}




