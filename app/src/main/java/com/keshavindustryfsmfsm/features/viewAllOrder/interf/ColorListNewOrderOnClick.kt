package com.keshavindustryfsmfsm.features.viewAllOrder.interf

import com.keshavindustryfsmfsm.app.domain.NewOrderColorEntity
import com.keshavindustryfsmfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}