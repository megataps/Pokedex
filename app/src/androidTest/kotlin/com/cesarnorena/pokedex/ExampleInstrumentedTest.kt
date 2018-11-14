package com.cesarnorena.pokedex

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    @Throws(Exception::class)
    fun useAppContext() {
        val appContext: Context = InstrumentationRegistry.getTargetContext()
        assertEquals("com.cesarnorena.pokedex", appContext.packageName)
    }
}
