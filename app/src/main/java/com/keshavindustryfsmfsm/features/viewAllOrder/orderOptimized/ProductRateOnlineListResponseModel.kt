package com.keshavindustryfsmfsm.features.viewAllOrder.orderOptimized

import com.keshavindustryfsmfsm.app.domain.ProductOnlineRateTempEntity
import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}