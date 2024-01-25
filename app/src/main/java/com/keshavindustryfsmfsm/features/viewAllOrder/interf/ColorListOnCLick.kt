package com.keshavindustryfsmfsm.features.viewAllOrder.interf

import com.keshavindustryfsmfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsmfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}