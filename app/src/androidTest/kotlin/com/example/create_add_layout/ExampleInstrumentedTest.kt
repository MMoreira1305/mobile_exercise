<<<<<<<< HEAD:app/src/androidTest/java/com/example/hello_world/ExampleInstrumentedTest.kt
package com.example.hello_world
========
package com.example.create_add_layout
>>>>>>>> 8b955e703595bc74a9339f12578446a7016e5819:app/src/androidTest/kotlin/com/example/create_add_layout/ExampleInstrumentedTest.kt

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.networkconection", appContext.packageName)
    }
}