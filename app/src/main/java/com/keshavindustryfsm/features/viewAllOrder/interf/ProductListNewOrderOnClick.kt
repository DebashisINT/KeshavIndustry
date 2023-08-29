package com.keshavindustryfsm.features.viewAllOrder.interf

import com.keshavindustryfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}