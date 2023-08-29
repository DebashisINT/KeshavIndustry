package com.keshavindustryfsm.features.viewAllOrder.model

import com.keshavindustryfsm.app.domain.NewOrderColorEntity
import com.keshavindustryfsm.app.domain.NewOrderGenderEntity
import com.keshavindustryfsm.app.domain.NewOrderProductEntity
import com.keshavindustryfsm.app.domain.NewOrderSizeEntity
import com.keshavindustryfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

