package id.ac.umn.basicstatecodelab

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier){
    var count = 0
    Text("You've had $count glasses.")
    Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
        Text("Add one")
    }
}