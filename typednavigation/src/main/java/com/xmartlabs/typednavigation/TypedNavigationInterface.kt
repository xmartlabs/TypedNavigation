package com.xmartlabs.typednavigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType


sealed interface TypedNavigationInterface {
  val name: String
  val route: String
  val navArguments: List<NamedNavArgument>
}

interface TypedNavigationInterface1<A> : TypedNavigationInterface {
  val t1: NavType<A>

  fun navigate(arg1: A): String
}

interface TypedNavigationInterface2<A1, A2> : TypedNavigationInterface {
  val t1: NavType<A1>
  val t2: NavType<A2>

  fun navigate(arg1: A1, arg2: A2): String
}

interface TypedNavigationInterface3<A1, A2, A3> : TypedNavigationInterface {
  val t1: NavType<A1>
  val t2: NavType<A2>
  val t3: NavType<A3>

  fun navigate(arg1: A1, arg2: A2, arg3: A3): String
}

interface TypedNavigationInterface4<A1, A2, A3, A4> : TypedNavigationInterface {
  val t1: NavType<A1>
  val t2: NavType<A2>
  val t3: NavType<A3>
  val t4: NavType<A4>

  fun navigate(arg1: A1, arg2: A2, arg3: A3, arg4: A4): String
}

interface TypedNavigationInterface5<A1, A2, A3, A4, A5> : TypedNavigationInterface {
  val t1: NavType<A1>
  val t2: NavType<A2>
  val t3: NavType<A3>
  val t4: NavType<A4>
  val t5: NavType<A5>

  fun navigate(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): String
}