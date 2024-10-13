package com.chh.convention.feature.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.chh.convention.core.designsystem.ConventionPluginTheme

@Composable
internal fun SearchRoute(
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val message = searchViewModel.route.message
    SearchScreen(message)
}

@Composable
fun SearchScreen(
    message: String = "empty"
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Search $message")
    }
}


@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    ConventionPluginTheme {
        SearchScreen()
    }
}
