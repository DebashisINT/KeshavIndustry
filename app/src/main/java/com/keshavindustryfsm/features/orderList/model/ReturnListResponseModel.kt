package com.keshavindustryfsm.features.orderList.model

import com.keshavindustryfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}