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
public sealed interface TypedNavigationInterface {
    public val name: String
    public val url: String
    public val navArguments: List<NamedNavArgument>
    public val deepLinks: List<NavDeepLink>
}

/** Defines the navigation without parameters
 *
 */
public interface TypedNavigationInterface0 : TypedNavigationInterface {

    /** Returns the route of the destination */
    public fun route(): String
}

/** An interface that implements navigation with 1 parameter
 *
 * @property t1 the [NavType] for the argument
 *
 */
public interface TypedNavigationInterface1<A> : TypedNavigationInterface {
    public val t1: NavType<A>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     *
     * @return the [String] containing the route of the destination
     */
    public fun route(arg1: A): String
}

/** An interface that implements navigation with 2 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 *
 */
public interface TypedNavigationInterface2<A1, A2> : TypedNavigationInterface {
    public val t1: NavType<A1>
    public val t2: NavType<A2>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     *
     * @return the [String] containing the route of the destination
     */
    public fun route(arg1: A1, arg2: A2): String
}

/** An interface that implements navigation with 3 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 * @property t3 the [NavType] for the third argument
 *
 */
public interface TypedNavigationInterface3<A1, A2, A3> : TypedNavigationInterface {
    public val t1: NavType<A1>
    public val t2: NavType<A2>
    public val t3: NavType<A3>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     *
     * @return the [String] containing the route of the destination
     */
    public fun route(arg1: A1, arg2: A2, arg3: A3): String
}

/** An interface that implements navigation with 4 parameters
 *
 * @property t1 the [NavType] for the first argument
 * @property t2 the [NavType] for the second argument
 * @property t3 the [NavType] for the third argument
 * @property t4 the [NavType] for the fourth argument
 *
 */
public interface TypedNavigationInterface4<A1, A2, A3, A4> : TypedNavigationInterface {
    public val t1: NavType<A1>
    public val t2: NavType<A2>
    public val t3: NavType<A3>
    public val t4: NavType<A4>


    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     * @param arg4 the argument corresponding to the [NavType] of [t4]
     *
     * @return the [String] containing the route of the destination
     */
    public fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4): String
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
public interface TypedNavigationInterface5<A1, A2, A3, A4, A5> : TypedNavigationInterface {
    public val t1: NavType<A1>
    public val t2: NavType<A2>
    public val t3: NavType<A3>
    public val t4: NavType<A4>
    public val t5: NavType<A5>

    /** Get the [String] route for the destination
     * @param arg1 the argument corresponding to the [NavType] of [t1]
     * @param arg2 the argument corresponding to the [NavType] of [t2]
     * @param arg3 the argument corresponding to the [NavType] of [t3]
     * @param arg4 the argument corresponding to the [NavType] of [t4]
     * @param arg5 the argument corresponding to the [NavType] of [t5]
     *
     * @return the [String] containing the route of the destination
     */
    public fun route(arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): String
}
