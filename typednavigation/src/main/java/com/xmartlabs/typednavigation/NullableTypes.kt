package com.xmartlabs.typednavigation

import android.os.Bundle
import androidx.navigation.NavType

@Suppress("MagicNumber")
public val NavType.Companion.NullableInt: NavType<Int?>
    get() = object : NavType<Int?>(isNullableAllowed = true) {
        override val name: String
            get() = "integer?"

        override fun get(bundle: Bundle, key: String): Int? =
            if (bundle.containsKey(key)) bundle.getInt(key) else null


        override fun put(bundle: Bundle, key: String, value: Int?) = value?.let {
            bundle.putInt(key, value)
        } ?: Unit

        override fun parseValue(value: String): Int? {
            return if (value.startsWith("0x")) {
                value.substring(2).toIntOrNull(16)
            } else {
                value.toIntOrNull()
            }
        }
    }

@Suppress("MagicNumber")
public val NavType.Companion.NullableLong: NavType<Long?>
    get() = object : NavType<Long?>(true) {
        override val name: String
            get() = "long?"

        override fun put(bundle: Bundle, key: String, value: Long?) = value?.let {
            bundle.putLong(key, it)
        } ?: Unit

        override fun get(bundle: Bundle, key: String): Long? =
            if (bundle.containsKey(key)) bundle.getLong(key) else null

        override fun parseValue(value: String): Long? {
            // At runtime the L suffix is optional, contrary to the Safe Args plugin.
            // This is in order to be able to parse long numbers passed as deep link URL
            // parameters
            var localValue = value
            if (value.endsWith("L")) {
                localValue = localValue.substring(0, value.length - 1)
            }
            return if (value.startsWith("0x")) {
                localValue.substring(2).toLongOrNull(16)
            } else {
                localValue.toLongOrNull()
            }
        }
    }

public val NavType.Companion.NullableBool: NavType<Boolean?>
    get() = object : NavType<Boolean?>(isNullableAllowed = true) {
        override val name: String
            get() = "boolean?"

        override fun get(bundle: Bundle, key: String): Boolean? =
            if (bundle.containsKey(key)) bundle.getBoolean(key) else null


        override fun put(bundle: Bundle, key: String, value: Boolean?) = value?.let {
            bundle.putBoolean(key, value)
        } ?: Unit

        override fun parseValue(value: String): Boolean? {
            return when (value) {
                "true" -> true
                "false" -> false
                else -> null
            }
        }
    }

public val NavType.Companion.NullableFloat: NavType<Float?>
    get() = object : NavType<Float?>(true) {
        override val name: String
            get() = "float?"

        override fun put(bundle: Bundle, key: String, value: Float?) = value?.let {
            bundle.putFloat(key, it)
        } ?: Unit

        override fun get(bundle: Bundle, key: String): Float? =
            if (bundle.containsKey(key)) bundle.getFloat(key) else null

        override fun parseValue(value: String): Float {
            return value.toFloat()
        }
    }

public val NavType.Companion.NotNullString: NavType<String>
    get() = object : NavType<String>(false) {
        override val name: String
            get() = "String?"

        override fun put(bundle: Bundle, key: String, value: String) = bundle.putString(key, value)


        override fun get(bundle: Bundle, key: String): String = bundle.getString(key)!!

        override fun parseValue(value: String): String = value
    }
