package com.example.tophair.app.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.tophair.R
import com.example.tophair.ui.theme.TopHairTheme

@Composable
fun FormattedCpfTextField(
    initialValue: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var textState by remember { mutableStateOf(TextFieldValue(initialValue)) }
    val focusManager = LocalFocusManager.current

    TextField(
        value = textState,
        onValueChange = { newText ->
            val digits = newText.text.filter { it.isDigit() }
            if (newText.text.length <= textState.text.length) {
                textState = textState.copy(
                    text = digits,
                    selection = TextRange(digits.length)
                )
                onValueChange(digits)
            } else if (digits.length <= 11) {
                val formattedText = formatCpf(digits)
                textState = textState.copy(
                    text = formattedText,
                    selection = TextRange(formattedText.length)
                )
                onValueChange(digits)
            }
        },
        label = { Text(stringResource(id = R.string.txt_cpf)) },
        modifier = modifier,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = {
                focusManager.moveFocus(FocusDirection.Next)
                focusManager.clearFocus()
            }
        ),
        singleLine = true
    )
}

fun formatCpf(digits: String): String {
    val formatted = StringBuilder()
    for (i in digits.indices) {
        formatted.append(digits[i])
        if (i == 2 || i == 5) formatted.append(".")
        if (i == 8) formatted.append("-")
    }
    return formatted.toString()
}

fun removeCpfMask(input: String): String {
    return input.filter { it.isDigit() }
}

@Preview(showBackground = true)
@Composable
fun FormattedCpfTextFieldPreview() {
    TopHairTheme {
        val cpf = remember { mutableStateOf("") }

        FormattedCpfTextField(
            initialValue = cpf.value,
            onValueChange = { cpf.value = removeCpfMask(it) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}