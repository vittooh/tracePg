package com.vhcs.tracePg.domain.investiments.cripto

import com.vhcs.tracePg.base.BaseEntity
import javax.persistence.Entity

@Entity
class Crypto(
    var amount: Double = 0.0
) : BaseEntity()