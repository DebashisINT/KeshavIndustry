package com.keshavindustryfsmfsm.features.stockAddCurrentStock.api

import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.location.model.ShopRevisitStatusRequest
import com.keshavindustryfsmfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.keshavindustryfsmfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.keshavindustryfsmfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.keshavindustryfsmfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}