package com.keshavindustryfsmfsm.features.viewAllOrder.interf

import com.keshavindustryfsmfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsmfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}