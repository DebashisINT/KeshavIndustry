package com.keshavindustryfsm.features.viewAllOrder.interf

import com.keshavindustryfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}