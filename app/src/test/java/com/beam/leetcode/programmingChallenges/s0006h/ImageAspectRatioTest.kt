package com.beam.leetcode.programmingChallenges.s0006h

import org.junit.Assert.assertEquals
import org.junit.Test

class ImageAspectRatioTest {
    private val imageAspectRatio = ImageAspectRatio()

    @Test
    fun case_1() {
        val url = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png"
        val expected = "16:9"

        val result = imageAspectRatio.solve(url)

        assertEquals(expected, result)
    }
}