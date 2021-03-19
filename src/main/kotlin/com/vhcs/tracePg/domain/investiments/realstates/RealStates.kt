package com.vhcs.tracePg.domain.investiments.realstates

import com.vhcs.tracePg.base.BaseEntity
import javax.persistence.Entity

@Entity
class RealStates(
    var amount: Double
) : BaseEntity()