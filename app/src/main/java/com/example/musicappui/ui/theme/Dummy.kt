package com.example.musicappui.ui.theme

import androidx.annotation.DrawableRes
import com.example.musicappui.R

data class Lib (@DrawableRes val icon: Int, val name:String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_album_24,"Album"),
    Lib(R.drawable.baseline_view_list_24_playlist,"Playlist"),
    Lib(R.drawable.baseline_emoji_people_24_artist,"Artists"),
    Lib(R.drawable.baseline_music_note_24_song,"Songs"),
)