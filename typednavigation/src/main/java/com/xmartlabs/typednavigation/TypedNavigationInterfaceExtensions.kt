package com.xmartlabs.typednavigation

import androidx.lifecycle.SavedStateHandle

/**
Executes a function with the attributes defined in the [TypedNavigationInterface1]
 *
 * @property savedStateHandle the [SavedStateHandle] to extract the arguments
 * @property function the function to execute
 *
 * @return an execution of the given function
 */
fun <A> TypedNavigationInterface1<A>.withAttributes(
    savedStateHandle: SavedStateHandle,
    function: (A) -> Unit
) {
    val arg1 = savedStateHandle.get<A>("a1") as A
    function(arg1)
}

/**
Executes a function with the attributes defined in the [TypedNavigationInterface2]
 *
 * @property savedStateHandle the [SavedStateHandle] to extract the arguments
 * @property function the function to execute
 *
 * @return an execution of the given function
 */
fun <A1, A2> TypedNavigationInterface2<A1, A2>.withAttributes(
    savedStateHandle: SavedStateHandle,
    function: (A1, A2) -> Unit
) {
    val arg1 = savedStateHandle.get<A1>("a1") as A1
    val arg2 = savedStateHandle.get<A2>("a2") as A2
    function(arg1, arg2)
}

/**
Executes a function with the attributes defined in the [TypedNavigationInterface3]
 *
 * @property savedStateHandle the [SavedStateHandle] to extract the arguments
 * @property function the function to execute
 *
 * @return an execution of the given function
 */
fun <A1, A2, A3> TypedNavigationInterface3<A1, A2, A3>.withAttributes(
    savedStateHandle: SavedStateHandle,
    function: (A1, A2, A3) -> Unit
) {
    val arg1 = savedStateHandle.get<A1>("a1") as A1
    val arg2 = savedStateHandle.get<A2>("a2") as A2
    val arg3 = savedStateHandle.get<A3>("a3") as A3
    function(arg1, arg2, arg3)
}

/**
Executes a function with the attributes defined in the [TypedNavigationInterface4]
 *
 * @property savedStateHandle the [SavedStateHandle] to extract the arguments
 * @property function the function to execute
 *
 * @return an execution of the given function
 */
fun <A1, A2, A3, A4> TypedNavigationInterface4<A1, A2, A3, A4>.withAttributes(
    savedStateHandle: SavedStateHandle,
    function: (A1, A2, A3, A4) -> Unit
) {
    val arg1 = savedStateHandle.get<A1>("a1") as A1
    val arg2 = savedStateHandle.get<A2>("a2") as A2
    val arg3 = savedStateHandle.get<A3>("a3") as A3
    val arg4 = savedStateHandle.get<A4>("a4") as A4
    function(arg1, arg2, arg3, arg4)
}

/**
Executes a function with the attributes defined in the [TypedNavigationInterface5]
 *
 * @property savedStateHandle the [SavedStateHandle] to extract the arguments
 * @property function the function to execute
 *
 * @return an execution of the given function
 */
fun <A1, A2, A3, A4, A5> TypedNavigationInterface5<A1, A2, A3, A4, A5>.withAttributes(
    savedStateHandle: SavedStateHandle,
    function: (A1, A2, A3, A4, A5) -> Unit
) {
    val arg1 = savedStateHandle.get<A1>("a1") as A1
    val arg2 = savedStateHandle.get<A2>("a2") as A2
    val arg3 = savedStateHandle.get<A3>("a3") as A3
    val arg4 = savedStateHandle.get<A4>("a4") as A4
    val arg5 = savedStateHandle.get<A5>("a5") as A5
    function(arg1, arg2, arg3, arg4, arg5)
}
