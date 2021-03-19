package com.vhcs.tracePg.domain.investiments.cripto

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.Repository
@org.springframework.stereotype.Repository
interface CryptoRepository : JpaRepository<Crypto, Long>