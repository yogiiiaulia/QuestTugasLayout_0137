package com.example.t4

import androidx.compose.runtime.Composable

@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = student.bgColorRes) // Warna dari Resource
        )
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Logo Kiri
            Image(
                painter = painterResource(id = R.drawable.ic_umy_logo),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )

            // Teks Tengah
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = student.nameRes), // Teks dari Resource
                    color = colorResource(id = R.color.white),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = student.phoneRes),
                    color = colorResource(id = R.color.text_light_blue),
                    fontSize = 12.sp
                )
                Text(
                    text = stringResource(id = student.addressRes),
                    color = colorResource(id = R.color.text_yellow),
                    fontSize = 12.sp
                )
            }

            // Logo Kanan
            Image(
                painter = painterResource(id = R.drawable.ic_umy_logo),
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
        }
    }
}