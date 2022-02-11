package com.xmartlabs.typednavigation

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
public class UnitTest {
    @Test
    public fun `urls are correct`() {
        assertEquals(TestRouter.a0.url, "${TestRouter.a0.name}/")
        assertEquals(TestRouter.a1.url, "${TestRouter.a1.name}/{a1}")
        assertEquals(TestRouter.a2.url, "${TestRouter.a2.name}/{a1}/{a2}")
        assertEquals(TestRouter.a3.url, "${TestRouter.a3.name}/{a1}/{a2}/{a3}")
        assertEquals(TestRouter.a4.url, "${TestRouter.a4.name}/{a1}/{a2}/{a3}/{a4}")
        assertEquals(TestRouter.a5.url, "${TestRouter.a5.name}/{a1}/{a2}/{a3}/{a4}/{a5}")
    }

    @Test
    public fun `routes are correct`() {
        val arg1 = "test1"
        val arg2 = "test2"
        val boolarg1 = true
        val boolarg2 = false
        assertEquals(TestRouter.a0.route(), "${TestRouter.a0.name}/")
        assertEquals(TestRouter.a1.route(arg1), "${TestRouter.a1.name}/$arg1")
        assertEquals(TestRouter.a2.route(arg1, arg2), "${TestRouter.a2.name}/$arg1/$arg2")
        assertEquals(TestRouter.a3.route(arg1, boolarg1, boolarg2), "${TestRouter.a3.name}/$arg1/$boolarg1/$boolarg2")
        assertEquals(
            TestRouter.a4.route(arg1, null, boolarg1, arg2),
            "${TestRouter.a4.name}/$arg1/null/$boolarg1/$arg2"
        )
        assertEquals(
            TestRouter.a5.route(arg1, null, boolarg1, boolarg2, arg1),
            "${TestRouter.a5.name}/$arg1/null/$boolarg1/$boolarg2/$arg1"
        )
    }
}