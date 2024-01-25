package com.keshavindustryfsmfsm.features.location.shopRevisitStatus

import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.location.model.ShopDurationRequest
import com.keshavindustryfsmfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}