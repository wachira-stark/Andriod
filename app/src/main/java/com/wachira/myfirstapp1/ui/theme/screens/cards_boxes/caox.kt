package com.wachira.myfirstapp1.ui.theme.screens.cards_boxes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Caoxscreen() {
    Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
               verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier
                    .size(40.dp))
                Box(modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme
                        .colorScheme.primaryContainer),
                    contentAlignment = Alignment.Center) {
                    Text("Wachira",
                        fontStyle = MaterialTheme.typography.headlineMedium.fontStyle,
                        color = Color.Black)
                }
            }
        }

    }
}

@Preview
@Composable
private fun Caoxprev() {
    Caoxscreen()

}