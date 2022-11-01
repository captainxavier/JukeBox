package com.ivaxtech.jukebox.ui.theme.presentations.sections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.ivaxtech.jukebox.R
import com.ivaxtech.jukebox.ui.theme.LightBlack
import com.ivaxtech.jukebox.ui.theme.LightGrey

@Composable
fun SearchSection() {
    var query by remember { mutableStateOf("") }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = LightBlack,
                shape = RoundedCornerShape(50.dp)
            ),
        value = query,
        onValueChange = { },
        maxLines = 1,
        textStyle = MaterialTheme.typography.subtitle1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        placeholder = {
            Text(
                text = stringResource(R.string.hint_search_query),
                color = LightGrey,
            )
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Rounded.Search,
                tint = LightGrey,
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Rounded.Clear,
                    tint = LightGrey,
                    contentDescription = "Clear Icon"
                )
            }
        }
    )

}