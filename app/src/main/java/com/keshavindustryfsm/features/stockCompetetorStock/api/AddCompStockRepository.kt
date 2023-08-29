package com.keshavindustryfsm.features.stockCompetetorStock.api

import com.keshavindustryfsm.base.BaseResponse
import com.keshavindustryfsm.features.orderList.model.NewOrderListResponseModel
import com.keshavindustryfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.keshavindustryfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}