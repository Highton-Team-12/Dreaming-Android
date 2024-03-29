package com.example.dreaming.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dreaming.ui.component.DreamingTypography.Body4
import com.example.dreaming.ui.theme.black
import com.example.dreaming.ui.theme.hint
import com.example.dreaming.ui.theme.main
import com.example.dreaming.ui.theme.noting
import com.example.dreaming.ui.theme.white

@Composable
fun TextField(
    text: String,
    isSecret: Boolean = false,
    onTextChange: (String) -> Unit,
    placeholder: String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    BasicTextField(
        value = text,
        onValueChange = onTextChange,
        decorationBox = {
            Box(contentAlignment = Alignment.CenterStart) {
                if (text.isEmpty()) {
                    Column {
                        Body1(placeholder, color = white)
                        Spacer(Modifier.size(4.dp))
                    }
                }
                it()
            }
        },
        singleLine = true,
        maxLines = 1,
        keyboardOptions = keyboardOptions,
        cursorBrush = SolidColor(main),
        visualTransformation = if (isSecret) PasswordVisualTransformation() else VisualTransformation.None,
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(noting)
            .border(
                width = 1.dp,
                color = if (text.isBlank()) {
                    hint
                } else {
                    main
                },
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp)
    )
}

//@SuppressLint("UnrememberedMutableInteractionSource")
//@Composable
//fun TextFieldBtn(
//    text: String,
//    placeholder: String = "",
//    onClick: () -> Unit
//) {
//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(44.dp)
//            .background(
//                if (text.isBlank()){ gray50 }
//                else { white }
//            )
//            .clip(RoundedCornerShape(8.dp))
//            .border(
//                width = 1.dp,
//                color = if (text.isBlank()){ gray300} else { black },
//                shape = RoundedCornerShape(8.dp))
//            .padding(horizontal = 16.dp)
//            .clickable(
//                interactionSource = MutableInteractionSource(),
//                indication = null,
//            ) {
//                onClick()
//            },
//        contentAlignment = Alignment.CenterStart
//    ) {
//        if (text.isEmpty()) {
//            Body1(text = placeholder, color = gray300)
//        } else {
//            Body1(text = text)
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    var text by remember { mutableStateOf("") }
    TextField(
        text = text,
        onTextChange = {
            text = it
        },
        placeholder = "영문, 숫자 6~20자"
    )
}