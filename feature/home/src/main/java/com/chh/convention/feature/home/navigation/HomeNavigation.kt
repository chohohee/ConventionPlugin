package com.chh.convention.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.chh.convention.core.navigation.Route
import com.chh.convention.feature.home.HomeRoute

fun NavController.navigateHome(navOptions: NavOptions) {
    navigate(Route.Home, navOptions)
}

fun NavGraphBuilder.homeNavGraph() {
    composable<Route.Home> {
        HomeRoute()
    }
}
