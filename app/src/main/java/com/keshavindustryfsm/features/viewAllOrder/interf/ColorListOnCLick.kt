package com.keshavindustryfsm.features.viewAllOrder.interf

import com.keshavindustryfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}