package com.example.t4

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val students = listOf(
        Student(R.string.mhs1_name, R.string.mhs1_phone, R.string.mhs1_address, R.color.card_gray),
        Student(R.string.mhs2_name, R.string.mhs2_phone, R.string.mhs2_address, R.color.card_purple),
        Student(R.string.mhs3_name, R.string.mhs3_phone, R.string.mhs3_address, R.color.card_blue),
        Student(R.string.mhs4_name, R.string.mhs4_phone, R.string.mhs4_address, R.color.card_green)
    )

    Column(
        modifier = modifier // <-- Pakai modifier dari parameter
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black)
        )
        Text(
            text = stringResource(id = R.string.app_subtitle),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.black),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(24.dp))

        // List Card
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(students) { student ->
                StudentCard(student = student)
            }
        }

        // Footer
        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            color = colorResource(id = R.color.black),
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}