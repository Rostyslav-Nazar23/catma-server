package com.rnazarenko.catma.server

import io.ktor.server.application.*
//import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.sessions.*
//import kotlinx.serialization.Serializable

fun Application.configureSecurity() {
    install(Sessions) {
//        cookie<MySession>("MY_SESSION") {
//            cookie.extensions["SameSite"] = "lax"
//        }
    }
    routing {
    }
}
