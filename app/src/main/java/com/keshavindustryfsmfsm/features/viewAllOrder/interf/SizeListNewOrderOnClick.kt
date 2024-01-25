package com.keshavindustryfsmfsm.features.viewAllOrder.interf

import com.keshavindustryfsmfsm.app.domain.NewOrderProductEntity
import com.keshavindustryfsmfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}