package com.keshavindustryfsmfsm.features.login.model.productlistmodel

import com.keshavindustryfsmfsm.app.domain.ModelEntity
import com.keshavindustryfsmfsm.app.domain.ProductListEntity
import com.keshavindustryfsmfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}