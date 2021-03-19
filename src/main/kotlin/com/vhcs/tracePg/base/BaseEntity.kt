package com.vhcs.tracePg.base

import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity(
    @Id
    @GeneratedValue
    val id: Long? = null
)