package com.xmartlabs.typednavigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class TypedNavigation {
    data class E(
        override val name: String,
        override val url: String = "$name/",
        override val navArguments: List<NamedNavArgument> = listOf()
    ) : TypedNavigation(), TypedNavigationInterface0 {
        override fun route(): String = "$name/"
    }

    data class A1<A>(
        override val name: String,
        override val t1: NavType<A>,
        override val url: String = "$name/{a1}",
        override val navArguments: List<NamedNavArgument> = listOf(
            navArgument("a1") { type = t1 }
        ),
    ) : TypedNavigation(), TypedNavigationInterface1<A> {
        override fun route(arg1: A): String = "$name/${arg1.toString()}"
    }

    data class A2<A1, A2>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val url: String = "$name/{a1}/{a2}",
        override val navArguments: List<NamedNavArgument> = listOf(
            navArgument("a1") { type = t1 },
            navArgument("a2") { type = t2 }
        ),
    ) : TypedNavigation(), TypedNavigationInterface2<A1, A2> {
        override fun route(arg1: A1, arg2: A2): String =
            "$name/${arg1.toString()}/${arg2.toString()}"
    }

    data class A3<A1, A2, A3>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        override val url: String = "$name/{a1}/{a2}/{a3}",
        override val navArguments: List<NamedNavArgument> = listOf(
            navArgument("a1") { type = t1 },
            navArgument("a2") { type = t2 },
            navArgument("a3") { type = t3 },
        ),
    ) : TypedNavigation(), TypedNavigationInterface3<A1, A2, A3> {
        override fun route(arg1: A1, arg2: A2, arg3: A3): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}"
    }

    data class A4<A1, A2, A3, A4>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        override val t4: NavType<A4>,
        override val url: String = "$name/{a1}/{a2}/{a3}/{a4}",
        override val navArguments: List<NamedNavArgument> = listOf(
            navArgument("a1") { type = t1 },
            navArgument("a2") { type = t2 },
            navArgument("a3") { type = t3 },
            navArgument("a4") { type = t4 },
        ),
    ) : TypedNavigation(), TypedNavigationInterface4<A1, A2, A3, A4> {
        override fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}/${arg4.toString()}"
    }

    data class A5<A1, A2, A3, A4, A5>(
        override val name: String,
        override val t1: NavType<A1>,
        override val t2: NavType<A2>,
        override val t3: NavType<A3>,
        override val t4: NavType<A4>,
        override val t5: NavType<A5>,
        override val url: String = "$name/{a1}/{a2}/{a3}/{a4}/{a5}",
        override val navArguments: List<NamedNavArgument> = listOf(
            navArgument("a1") { type = t1 },
            navArgument("a2") { type = t2 },
            navArgument("a3") { type = t3 },
            navArgument("a4") { type = t4 },
            navArgument("a5") { type = t5 },
        ),
    ) : TypedNavigation(), TypedNavigationInterface5<A1, A2, A3, A4, A5> {
        override fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): String =
            "$name/${arg1.toString()}/${arg2.toString()}/${arg3.toString()}/${arg4.toString()}/${arg5.toString()}"
    }
}
