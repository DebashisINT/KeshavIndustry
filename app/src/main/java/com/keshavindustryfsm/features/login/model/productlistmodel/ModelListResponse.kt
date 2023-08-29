package com.keshavindustryfsm.features.login.model.productlistmodel

import com.keshavindustryfsm.app.domain.ModelEntity
import com.keshavindustryfsm.app.domain.ProductListEntity
import com.keshavindustryfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}