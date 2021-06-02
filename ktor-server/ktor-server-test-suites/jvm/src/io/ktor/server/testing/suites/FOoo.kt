/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.server.testing.suites

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import org.junit.*

class FOoo {

    @Test
    fun testTest() {
    }

    fun Application.x() {
        routing {
            get {
                call.respond("FOO")
            }
        }
    }

}
