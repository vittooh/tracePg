package com.vhcs.tracePg

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
@RequestMapping("/v1")
class HiController {

    @GetMapping
    fun hi() : String{
        return "Hi, hour :: ${Instant.now()}"
    }
}