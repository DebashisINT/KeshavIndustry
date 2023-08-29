package com.keshavindustryfsm.features.login.model.productlistmodel

import com.keshavindustryfsm.app.domain.NewOrderScrOrderEntity
import com.keshavindustryfsm.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}