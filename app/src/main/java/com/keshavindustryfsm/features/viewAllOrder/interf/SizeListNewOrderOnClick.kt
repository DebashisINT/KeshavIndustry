package com.keshavindustryfsm.features.viewAllOrder.interf

import com.keshavindustryfsm.app.domain.NewOrderProductEntity
import com.keshavindustryfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}