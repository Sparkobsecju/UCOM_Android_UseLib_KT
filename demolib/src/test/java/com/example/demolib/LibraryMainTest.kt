package com.example.demolib

import org.junit.Assert
import org.junit.Test

class LibraryMainTest {
    @Test
    fun testAddIsCorrect() {
        Assert.assertEquals(4, LibraryMain.add(2, 2))
    }

    @Test
    fun testAddIsCorrectMore() {
        Assert.assertEquals(6, LibraryMain.add(3, 3))
    }

}