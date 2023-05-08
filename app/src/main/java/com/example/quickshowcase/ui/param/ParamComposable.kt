package com.example.quickshowcase.ui.param

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.android.showkase.annotation.ShowkaseComposable

@Composable
fun ParamCard(name: String, email: String) {
    Card(modifier = Modifier.padding(16.dp)) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Name: $name")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Email: $email")
        }
    }
}

@ShowkaseComposable("Param", "Column")
@Preview
@Composable
fun ParamCardPreview() {
    ParamCard(name = "Ezra", email = "10kanake@gmail.com")
}
