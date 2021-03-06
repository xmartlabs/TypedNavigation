package com.xmartlabs.typednavigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink


/** Sealed class that implements [TypedNavigationInterface] */
public sealed class TypedNavigation {
    /** Implementation for the [TypedNavigationInterface0]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class E(
        override val name: String,
        private val deepLinksBuilder: List<() -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface0 {
        override val url: String = "$name/"
        override val navArguments: List<NamedNavArgument> = listOf()
        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map {
            navDeepLink {
                uriPattern = it.invoke()
            }
        }

        override fun route(): String = "$name/"
    }

    /** Implementation for the [TypedNavigationInterface1]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class A1<A>(
        override val name: String,
        override val t1: NavType<A>,
        private val deepLinksBuilder: List<(String) -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface1<A> {
        override val url: String = "$name/{a1}"
        override val navArguments: List<NamedNavArgument> = listOf(
            t1.toNavArgument("a1"),
        )
        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map { func ->
            navDeepLink {
                uriPattern = func.invoke("{a1}")
            }
        }

        override fun route(arg1: A): String = "$name/${arg1.toString()}"
    }

    /** Implementation for the [TypedNavigationInterface2]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class A2<A1, A2>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        private val deepLinksBuilder: List<(String, String) -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface2<A1, A2> {
        override val url: String = "$name/{a1}/{a2}"
        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map { func ->
            navDeepLink {
                uriPattern = func.invoke("{a1}", "{a2}")
            }
        }


        override val navArguments: List<NamedNavArgument> = listOf(
            t1.toNavArgument("a1"),
            t2.toNavArgument("a2"),
        )

        override fun route(arg1: A1, arg2: A2): String =
            "$name/${arg1.toString()}/${arg2.toString()}"
    }

    /** Implementation for the [TypedNavigationInterface3]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class A3<A1, A2, A3>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        private val deepLinksBuilder: List<(String, String, String) -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface3<A1, A2, A3> {
        override val url: String = "$name/{a1}/{a2}/{a3}"
        override val navArguments: List<NamedNavArgument> = listOf(
            t1.toNavArgument("a1"),
            t2.toNavArgument("a2"),
            t3.toNavArgument("a3"),
        )
        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map { func ->
            navDeepLink {
                uriPattern = func.invoke("{a1}", "{a2}", "{a3}")
            }
        }

        override fun route(arg1: A1, arg2: A2, arg3: A3): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}"
    }

    /** Implementation for the [TypedNavigationInterface4]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class A4<A1, A2, A3, A4>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        override val t4: NavType<A4>,
        private val deepLinksBuilder: List<(String, String, String, String) -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface4<A1, A2, A3, A4> {
        override val url: String = "$name/{a1}/{a2}/{a3}/{a4}"
        override val navArguments: List<NamedNavArgument> = listOf(
            t1.toNavArgument("a1"),
            t2.toNavArgument("a2"),
            t3.toNavArgument("a3"),
            t4.toNavArgument("a4"),
        )
        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map { func ->
            navDeepLink {
                uriPattern = func.invoke("{a1}", "{a2}", "{a3}", "{a4}")
            }
        }

        override fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}/${arg4.toString()}"
    }

    /**Implementation for the [TypedNavigationInterface5]
     * @property deepLinksBuilder is a list of functions that when executed provide the uriPattern for the deep linking
     * */
    public data class A5<A1, A2, A3, A4, A5>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        override val t4: NavType<A4>,
        override val t5: NavType<A5>,
        private val deepLinksBuilder: List<(String, String, String, String, String) -> String> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface5<A1, A2, A3, A4, A5> {
        override val url: String = "$name/{a1}/{a2}/{a3}/{a4}/{a5}"

        override val navArguments: List<NamedNavArgument> = listOf(
            t1.toNavArgument("a1"),
            t2.toNavArgument("a2"),
            t3.toNavArgument("a3"),
            t4.toNavArgument("a4"),
            t5.toNavArgument("a5"),
        )

        override val deepLinks: List<NavDeepLink> = deepLinksBuilder.map { func ->
            navDeepLink {
                uriPattern = func.invoke("{a1}", "{a2}", "{a3}", "{a4}", "{a5}")
            }
        }

        override fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}/${arg4.toString()}/${arg5.toString()}"
    }
}

private fun NavType<*>.toNavArgument(name: String) = navArgument(name) {
    type = this@toNavArgument
    nullable = isNullableAllowed
}
