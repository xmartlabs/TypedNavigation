package com.xmartlabs.typednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.xmartlabs.typednavigation.ui.theme.TypedNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navigationController: NavHostController = rememberNavController()
            NavHost(navController = navigationController, startDestination = Router.default.route) {
                composable(Router.default) {
                    Default(navigationController = navigationController)
                }
                composable(Router.home) { a1, a2 ->
                    Home(a1, a2)
                }
                composable(Router.sample) { a, b, c ->
                    Sample(a, b, c)
                }
            }
        }
    }
}

@Composable
fun Default(navigationController: NavHostController) = Row(
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceEvenly
) {
    Button(onClick = { navigationController.navigate(Router.home.navigate("asd", 5)) }) {
        Text(text = "Home")
    }
    Button(onClick = { navigationController.navigate(Router.sample.navigate("a", "b", "c")) }) {
        Text(text = "Sample")
    }

}

@Composable
fun Home(a1: String?, a2: Int) {
    Text(text = "Hello $a1 $a2!")
}

@Composable
fun Sample(a1: String?, a2: String?, a3: String?) {
    TypedNavigationTheme {
        Text(text = "Hello ${a1} ${a2} ${a3}!")
    }
}


object Router {
    val default = TypedNavigation.E("default")
    val home = TypedNavigation.A2("home", NavType.StringType, NavType.IntType)
    val sample =
        TypedNavigation.A3("sample", NavType.StringType, NavType.StringType, NavType.StringType)
}
