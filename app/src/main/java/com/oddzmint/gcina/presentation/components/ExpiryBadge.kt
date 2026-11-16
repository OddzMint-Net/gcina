package com.oddzmint.gcina.presentation.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oddzmint.gcina.R
import com.oddzmint.gcina.presentation.theme.AppTheme

@Composable
fun ExpiryBadge(
    status: ExpiryStatus,
    modifier: Modifier = Modifier
) {
    val (label, containerColor, contentColor) = when (status) {
        ExpiryStatus.FRESH -> Triple(
            stringResource(R.string.fresh), colorScheme.primaryContainer, colorScheme.primary
        )

        ExpiryStatus.EXPIRING_SOON -> Triple(
            stringResource(R.string.expiring_soon), colorScheme.secondaryContainer, colorScheme.onSecondaryContainer
        )

        ExpiryStatus.EXPIRED -> Triple(
            stringResource(R.string.expired), colorScheme.errorContainer, colorScheme.onErrorContainer
        )
    }

    Text(
        text = label,
        modifier = modifier
            .background(
                color = containerColor,
                shape = RoundedCornerShape(50)
            )
            .padding(
                horizontal = 12.dp,
                vertical = 6.dp
            ),
        color = contentColor,
        style = MaterialTheme.typography.labelSmall
    )
}

@Preview(showBackground = true, name = "Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ExpiryBadgeDarkPreview() {
    AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ExpiryBadge(ExpiryStatus.FRESH)
            ExpiryBadge(ExpiryStatus.EXPIRING_SOON)
            ExpiryBadge(ExpiryStatus.EXPIRED)
        }
    }
}

@Preview(showBackground = true, name = "Light Theme")
@Composable
private fun ExpiryBadgePreview() {
    AppTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ExpiryBadge(ExpiryStatus.FRESH)
            ExpiryBadge(ExpiryStatus.EXPIRING_SOON)
            ExpiryBadge(ExpiryStatus.EXPIRED)
        }
    }
}