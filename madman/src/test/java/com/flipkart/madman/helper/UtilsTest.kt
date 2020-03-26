/*
 * Copyright (C) 2020 Flipkart Internet Pvt Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flipkart.madman.helper

import org.junit.Test

/**
 * Test for [Utils]
 */
class UtilsTest {

    @Test
    fun testConvertAdTimeOffsetToSeconds() {
        // start time offset maps to 0
        assert(Utils.convertAdTimeOffsetToSeconds("start") == 0F)

        // end time offset maps to -1
        assert(Utils.convertAdTimeOffsetToSeconds("end") == Float.MAX_VALUE)

        // string
        assert(Utils.convertAdTimeOffsetToSeconds("00:00:00") == 0F)
        assert(Utils.convertAdTimeOffsetToSeconds("00:00:00.0") == 0F)
        assert(Utils.convertAdTimeOffsetToSeconds("00:00:00.00") == 0F)
        assert(Utils.convertAdTimeOffsetToSeconds("00:00:00.000") == 0F)
        assert(Utils.convertAdTimeOffsetToSeconds(null) == Float.MAX_VALUE)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testPrecondition() {
        Precondition.checkNonNull(null, "")
    }
}
