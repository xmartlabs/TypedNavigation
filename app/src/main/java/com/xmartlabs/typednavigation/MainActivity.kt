package com.xmartlabs.typednavigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.xmartlabs.typednavigation.ui.hiltExapmle.HiltExample
import com.xmartlabs.typednavigation.ui.hiltExapmle.HiltExampleViewModel
import com.xmartlabs.typednavigation.ui.theme.TypedNavigationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navigationController: NavHostController = rememberNavController()
            NavHost(navController = navigationController, startDestination = Router.default.url) {
                composable(Router.default) {
                    Default(navigationController = navigationController)
                }
                composable(Router.home) { a1, a2 ->
                    Home(a1, a2)
                }
                composable(Router.example) { a, b, c ->
                    Example(a, b, c)
                }
                composable(Router.hiltExample) {
                    val hiltExampleViewModel = hiltViewModel<HiltExampleViewModel>()
                    HiltExample(hiltExampleViewModel)
                }
            }
        }
    }
}

@Composable
fun Default(navigationController: NavHostController) = Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = { navigationController.navigate(Router.home.route("example", 5)) },
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = { navigationController.navigate(Router.example.route("a", "b", "c")) },
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Text(text = "Example")
        }
        Button(onClick = { navigationController.navigate(Router.hiltExample.route(null, null, false)) }) {
            Text(text = "Hilt Example")
        }
    }
}

@Composable
fun Home(a1: String?, a2: Int) = Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()
) {
    Text(text = "Hello $a1 $a2!")
}

@Composable
fun Example(a1: String?, a2: String?, a3: String?) = Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()
) {
    TypedNavigationTheme {
        Text(text = "Hello $a1 $a2 $a3!")
    }
}

object Router {
    val default = TypedNavigation.E("default")
    val home = TypedNavigation.A2("home", NavType.StringType, NavType.IntType)
    val example =
        TypedNavigation.A3("example", NavType.StringType, NavType.StringType, NavType.StringType, listOf { a1, a2, a3 ->
            "www.example.com/$a1/$a2/$a3"
        }
        )
    val hiltExample =
        TypedNavigation.A3("hiltExample", NavType.StringType, NavType.NullableBool, NavType.BoolType)
}
