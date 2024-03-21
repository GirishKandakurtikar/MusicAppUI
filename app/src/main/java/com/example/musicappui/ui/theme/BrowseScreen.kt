package com.example.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.items
import com.example.musicappui.R

@Composable
fun Browse(){
    val categories = listOf("Hits","Happy","Workout","Health","Finance","Fashion","Stock","Food")
    LazyVerticalGrid(columns = GridCells.Fixed(2)){
        items(categories){
                cat->
            BrowserItem(cat=cat, drawable = R.drawable.baseline_apps_24)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BrowserPreview(){
    Browse()
}