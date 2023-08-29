package com.keshavindustryfsm.features.viewAllOrder.interf

import com.keshavindustryfsm.app.domain.NewOrderColorEntity
import com.keshavindustryfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}