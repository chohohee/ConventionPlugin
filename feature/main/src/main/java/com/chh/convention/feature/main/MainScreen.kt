package com.chh.convention.feature.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import com.chh.convention.core.designsystem.ConventionPluginTheme
import com.chh.convention.feature.home.navigation.homeNavGraph
import com.chh.convention.feature.search.navigation.searchNavGraph

@Composable
internal fun MainScreen(
    modifier: Modifier = Modifier,
    navigator: MainNavigator = rememberMainNavigator()
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            NavigationBar {
                MainTab.entries.forEach { tab ->
                    NavigationBarItem(
                        selected = tab == navigator.currentTab,
                        label = { Text(tab.label) },
                        icon = {
                            Icon(
                                imageVector = tab.icon,
                                contentDescription = tab.label
                            )
                        },
                        onClick = { navigator.navigate(tab) }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navigator.navController,
            startDestination = navigator.startDestination,
            modifier = Modifier.padding(paddingValues = innerPadding)
        ) {
            homeNavGraph()
            searchNavGraph()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ConventionPluginTheme {
        MainScreen()
    }
}
