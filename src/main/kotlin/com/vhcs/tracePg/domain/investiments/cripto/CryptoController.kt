package com.vhcs.tracePg.domain.investiments.cripto

import org.springframework.web.bind.annotation.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/v1/crypto")
class CryptoController(
    val cryptoRepository: CryptoRepository
) {

    @GetMapping("/{id}")
    fun getCrypto(@PathVariable id: Long): Crypto? {
        return cryptoRepository.findById(id).orElse(null)
    }

}