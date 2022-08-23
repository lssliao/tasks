package org.tasks.compose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun SyncAccount(
    @StringRes title: Int,
    @StringRes description: Int,
    @DrawableRes icon: Int,
    tint: Color? = null,
    onClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .clickable { onClick() }
            .padding(vertical = 8.dp, horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = stringResource(id = title),
            tint = tint ?: Color.Unspecified,
            modifier = Modifier.padding(end = 16.dp).size(48.dp),
        )
        Column {
            Text(
                text = stringResource(id = title),
                style = MaterialTheme.typography.body1,
            )
            Text(
                text = stringResource(id = description),
                style = MaterialTheme.typography.body2,
            )
        }
    }
}