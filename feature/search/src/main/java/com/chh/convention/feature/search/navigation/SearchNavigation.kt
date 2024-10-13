package com.chh.convention.feature.search.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.chh.convention.core.navigation.Route
import com.chh.convention.feature.search.SearchRoute

fun NavController.navigateSearch(route: Route, navOptions: NavOptions) {
    navigate(route, navOptions)
}

fun NavGraphBuilder.searchNavGraph() {
    composable<Route.Search> {
        SearchRoute()
    }
}
