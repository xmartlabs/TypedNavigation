package com.xmartlabs.typednavigation

import androidx.navigation.NavType

public object TestRouter {
    public val a0: TypedNavigation.E = TypedNavigation.E("example")
    public val a1: TypedNavigation.A1<String> = TypedNavigation.A1(
        "example1", NavType.NotNullString
    )
    public val a2: TypedNavigation.A2<String?, String?> =
        TypedNavigation.A2(
            "example2",
            NavType.StringType,
            NavType.StringType
        )
    public val a3: TypedNavigation.A3<String?, Boolean?, Boolean> =
        TypedNavigation.A3("example3", NavType.StringType, NavType.NullableBool, NavType.BoolType)
    public val a4: TypedNavigation.A4<String?, Boolean?, Boolean, String?> =
        TypedNavigation.A4(
            "example4",
            NavType.StringType,
            NavType.NullableBool,
            NavType.BoolType,
            NavType.StringType
        )
    public val a5: TypedNavigation.A5<String?, Boolean?, Boolean, Boolean, String?> =
        TypedNavigation.A5(
            "example5",
            NavType.StringType,
            NavType.NullableBool,
            NavType.BoolType,
            NavType.BoolType,
            NavType.StringType
        )
}
