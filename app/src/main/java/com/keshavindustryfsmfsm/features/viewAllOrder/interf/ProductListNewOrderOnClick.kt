package com.keshavindustryfsmfsm.features.viewAllOrder.interf

import com.keshavindustryfsmfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsmfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}