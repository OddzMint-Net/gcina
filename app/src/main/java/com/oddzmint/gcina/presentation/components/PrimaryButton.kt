package com.oddzmint.gcina.presentation.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oddzmint.gcina.presentation.theme.AppTheme

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {

    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(52.dp),
        enabled = enabled,
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@Preview(showBackground = true, name = "enabled button")
@Composable
private fun PrimaryButtonEnabledPreview() {
    AppTheme {
        PrimaryButton(
            text = "Apply",
            onClick = {},
            enabled = true
        )
    }
}

@Preview(showBackground = true, name = "disabled button")
@Composable
private fun PrimaryButtonDisabledPreview() {
    AppTheme {
        PrimaryButton(
            text = "Apply",
            onClick = {},
            enabled = false
        )
    }
}

@Preview(showBackground = true, name = "dark theme button", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun PrimaryButtonDarkThemePreview() {
    AppTheme {
        PrimaryButton(
            text = "Apply",
            onClick = {},
            enabled = true
        )
    }
}