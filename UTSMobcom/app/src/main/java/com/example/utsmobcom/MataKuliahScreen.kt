package com.example.utsmobcom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.utsmobcom.model.MataKuliah
import com.example.utsmobcom.ui.theme.Black
import com.example.utsmobcom.ui.theme.Shapes

@Composable
fun MataKuliahList(
    matakuliah: List<MataKuliah>,
    modifier:Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
){
    LazyVerticalGrid(columns = GridCells.Fixed(1), contentPadding = contentPadding){
    itemsIndexed(matakuliah){ index, matakuliah ->
        MataKuliahListItem(matakuliah=matakuliah)
    }
    }
}

@Composable
fun MataKuliahListItem(
    matakuliah :MataKuliah,
    modifier:Modifier = Modifier
){
    Card(
        modifier = modifier,
        shape = Shapes.small,
        border = BorderStroke(1.dp, Black)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp)
        ) {
            Image(painter = painterResource(id = matakuliah.img), contentDescription = null )
            Column(modifier=Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(id = matakuliah.nama))
                Text(text = stringResource(id = matakuliah.sks))
            }
        }
    }
}