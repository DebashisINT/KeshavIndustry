package com.keshavindustryfsmfsm.features.orderList.model

import com.keshavindustryfsmfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}