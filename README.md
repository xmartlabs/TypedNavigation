# TypedNavigation

[![Run detekt and build](https://github.com/xmartlabs/TypedNavigation/actions/workflows/compile-and-check.yml/badge.svg)](https://github.com/xmartlabs/TypedNavigation/actions/workflows/compile-and-check.yml)
[![](https://jitpack.io/v/xmartlabs/TypedNavigation.svg)](https://jitpack.io/#xmartlabs/TypedNavigation)

A lightweight library to help you navigate in compose with well typed functions.

## Installation:

You can add this library to your project by just adding the following code to your root `build.gradle`

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

Then import the library in your app `build.gradle` file.

```groovy
implementation 'com.github.xmartlabs:TypedNavigation:0.0.2'
```

## Usage:

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
    NavHost(navController = navigationController, startDestination = Router.default.url) {
        composable(Router.default) {
            Default(navigationController = navigationController)
        }
        composable(Router.sample) { a: String?, b: String?, c: String? ->
            Sample(a, b, c)
        }
    }
}
```

To navigate from one screen to another:

```kotlin
navigationController.navigate(Router.sample.route("a", "b", "c"))
```

Add deep linking to your screen by setting up the correct path to the url:

```kotlin
   val sample =
    TypedNavigation.A3("sample", NavType.StringType, NavType.StringType, NavType.StringType,
        listOf { a1, a2, a3 -> // a1, a2 and a3 contains the keys for the attributes previously defined
            "www.example.com/$a1/$a2/$a3" 
        }
    )
```

For more examples you can check out our sample app.

## About

Made with ❤️ by [XMARTLABS](http://xmartlabs.com)