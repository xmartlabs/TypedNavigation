package com.xmartlabs.typednavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

fun NavGraphBuilder.composable(
        screen: TypedNavigationInterface,
        function: @Composable () -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        function()
    }
}

fun <A> NavGraphBuilder.composable(
        screen: TypedNavigationInterface1<A>,
        function: @Composable (A) -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        val arg1 = it.arguments?.get("a1") as A
        function(arg1)
    }
}

fun <A1, A2> NavGraphBuilder.composable(
        screen: TypedNavigationInterface2<A1, A2>,
        function: @Composable (A1, A2) -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        val arg1 = it.arguments?.get("a1") as A1
        val arg2 = it.arguments?.get("a2") as A2
        function(arg1, arg2)
    }
}

fun <A1, A2, A3> NavGraphBuilder.composable(
        screen: TypedNavigationInterface3<A1, A2, A3>,
        function: @Composable (A1, A2, A3) -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        val arg1 = it.arguments?.get("a1") as A1
        val arg2 = it.arguments?.get("a2") as A2
        val arg3 = it.arguments?.get("a3") as A3
        function(arg1, arg2, arg3)
    }
}

fun <A1, A2, A3, A4> NavGraphBuilder.composable(
        screen: TypedNavigationInterface4<A1, A2, A3, A4>,
        function: @Composable (A1, A2, A3, A4) -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        val arg1 = it.arguments?.get("a1") as A1
        val arg2 = it.arguments?.get("a2") as A2
        val arg3 = it.arguments?.get("a3") as A3
        val arg4 = it.arguments?.get("a4") as A4
        function(arg1, arg2, arg3, arg4)
    }
}

fun <A1, A2, A3, A4, A5> NavGraphBuilder.composable(
        screen: TypedNavigationInterface5<A1, A2, A3, A4, A5>,
        function: @Composable (A1, A2, A3, A4, A5) -> Unit
) {
    composable(
            screen.route,
            screen.navArguments
    ) {
        val arg1 = it.arguments?.get("a1") as A1
        val arg2 = it.arguments?.get("a2") as A2
        val arg3 = it.arguments?.get("a3") as A3
        val arg4 = it.arguments?.get("a4") as A4
        val arg5 = it.arguments?.get("a5") as A5
        function(arg1, arg2, arg3, arg4, arg5)
    }
}