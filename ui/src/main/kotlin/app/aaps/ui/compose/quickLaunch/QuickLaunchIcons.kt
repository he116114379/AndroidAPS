package app.aaps.ui.compose.quickLaunch

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Extension
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import app.aaps.core.ui.compose.color
import app.aaps.core.ui.compose.descriptionResId
import app.aaps.core.ui.compose.icon
import app.aaps.core.ui.compose.labelResId

/**
 * Resolves icon, label, description, and color for each [QuickLaunchAction].
 * Delegates to [ElementType] for actions that have one; falls back for plugin actions.
 */

fun QuickLaunchAction.icon(): ImageVector =
    elementType?.icon() ?: Icons.Default.Extension

fun QuickLaunchAction.labelResId(): Int =
    elementType?.labelResId() ?: 0

fun QuickLaunchAction.descriptionResId(): Int =
    elementType?.descriptionResId() ?: 0

@Composable
fun QuickLaunchAction.tintColor(): Color =
    elementType?.color() ?: MaterialTheme.colorScheme.primary
