package com.xmartlabs.typednavigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink
import androidx.navigation.NavType

/**
An interface that implements the basic attributes needed for navigation
 *
 * @property name the name of the destination screen
 * @property url the url string for the navigation
 * @property navArguments the list of [NamedNavArgument] for the destination screen
 * @property deepLinks the list of [NavDeepLink] for the destination screen
 */
sealed interface TypedNavigationInterface {
    val name: String
    val url: String
    val navArguments: List<NamedNavArgument>
    val deepLinks: List<NavDeepLink>
}

/** Defines the navigation without parameters
 *
 */
interface TypedNavigationInterface0 : TypedNavigationInterface {

    /** Returns the route of the destination */
    fun route(): String
}

/** An interface that implements navigation with 1 parameter
 *
 * @property t1 the [NavType] for the argument
 *
 */
interface TypedNavigationInterface1<A> : TypedNavigationInterface {
    val t1: NavType<A>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     *
     * @return the [String] containing the route of the destination
     */
    fun route(arg1: A): String
}

/** An interface that implements navigation with 2 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 *
 */
interface TypedNavigationInterface2<A1, A2> : TypedNavigationInterface {
    val t1: NavType<A1>
    val t2: NavType<A2>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     *
     * @return the [String] containing the route of the destination
     */
    fun route(arg1: A1, arg2: A2): String
}

/** An interface that implements navigation with 3 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 * @property t3 the [NavType] for the third argument
 *
 */
interface TypedNavigationInterface3<A1, A2, A3> : TypedNavigationInterface {
    val t1: NavType<A1>
    val t2: NavType<A2>
    val t3: NavType<A3>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     *
     * @return the [String] containing the route of the destination
     */
    fun route(arg1: A1, arg2: A2, arg3: A3): String
}

/** An interface that implements navigation with 4 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 * @property t3 the [NavType] for the third argument
 * @property t4 the [NavType] for the fourth argument
 *
 */
interface TypedNavigationInterface4<A1, A2, A3, A4> : TypedNavigationInterface {
    val t1: NavType<A1>
    val t2: NavType<A2>
    val t3: NavType<A3>
    val t4: NavType<A4>


    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     * @param arg4 the argument corresponding to the [NavType] of [t4]
     *
     * @return the [String] containing the route of the destination
     */
    fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4): String
}

/** An interface that implements navigation with 5 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 * @property t3 the [NavType] for the third argument
 * @property t4 the [NavType] for the fourth argument
 * @property t5 the [NavType] for the fifth argument
 *
 */
interface TypedNavigationInterface5<A1, A2, A3, A4, A5> : TypedNavigationInterface {
    val t1: NavType<A1>
    val t2: NavType<A2>
    val t3: NavType<A3>
    val t4: NavType<A4>
    val t5: NavType<A5>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     * @param arg4 the argument corresponding to the [NavType] of [t4]
     * @param arg5 the argument corresponding to the [NavType] of [t5]
     *
     * @return the [String] containing the route of the destination
     */
    fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): String
}
