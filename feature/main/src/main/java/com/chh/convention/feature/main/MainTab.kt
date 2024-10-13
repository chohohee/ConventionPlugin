package com.chh.convention.feature.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.chh.convention.core.navigation.Route

internal enum class MainTab(
    val label: String = "",
    val icon: ImageVector = Icons.Filled.Home,
    val route: Route
) {
    HOME(
        label = "Home",
        icon = Icons.Filled.Home,
        route = Route.Home
    ),
    SEARCH(
        label = "Search",
        icon = Icons.Filled.Search,
        route = Route.Search("click")
    )
}
