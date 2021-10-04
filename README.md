# TypedNavigation

A lightweith libary to help you navigate in compose with well typed functions. 

You just have to define your screens and the arguments they receive:

```kotlin
object Router {
  val default = TypedNavigation.E("default")
  val sample = TypedNavigation.A3("sample", NavType.StringType, NavType.StringType, NavType.StringType)
}
```
And after that the library will provide you with the following functions:

To add your screen to the `NavHost`:

```kotlin
setContent {
  val navigationController: NavHostController = rememberNavController()
  NavHost(navController = navigationController, startDestination = Router.default.route) {
    composable(Router.default) {
      Default(navigationController = navigationController)
    }
    composable(Router.sample) { a : String?, b : String?, c : String? ->
      Sample(a, b, c)
    }
  }
}
```

To navigate from one screen to another:

```[kotlin]
navigationController.navigate(Router.sample.navigate("a", "b", "c"))
```

For more examples you can check out our sample app.
