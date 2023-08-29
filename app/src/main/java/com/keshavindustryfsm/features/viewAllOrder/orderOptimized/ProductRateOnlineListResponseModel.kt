package com.keshavindustryfsm.features.viewAllOrder.orderOptimized

import com.keshavindustryfsm.app.domain.ProductOnlineRateTempEntity
import com.keshavindustryfsm.base.BaseResponse
import com.keshavindustryfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}