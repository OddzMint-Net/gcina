package com.oddzmint.gcina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.oddzmint.gcina.presentation.components.PrimaryButton
import com.oddzmint.gcina.presentation.theme.AppTheme
import com.oddzmint.gcina.ui.theme.GcinaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Surface {
                    PrimaryButton(
                        text = "Apply",
                        onClick = {},
                        enabled = true
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {

    }
}