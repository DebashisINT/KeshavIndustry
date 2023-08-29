package com.keshavindustryfsm.features.stockAddCurrentStock.api

import com.keshavindustryfsm.base.BaseResponse
import com.keshavindustryfsm.features.location.model.ShopRevisitStatusRequest
import com.keshavindustryfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.keshavindustryfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.keshavindustryfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.keshavindustryfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}