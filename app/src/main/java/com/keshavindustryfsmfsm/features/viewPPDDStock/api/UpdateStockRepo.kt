package com.keshavindustryfsmfsm.features.viewPPDDStock.api

import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.viewPPDDStock.model.UpdateStockInputParamsModel
import io.reactivex.Observable

/**
 * Created by Saikat on 05-10-2018.
 */
class UpdateStockRepo(val apiService: UpdateStockApi) {
    fun updateStock(updateStockObj: UpdateStockInputParamsModel): Observable<BaseResponse> {
        return apiService.updateStock(updateStockObj)
    }
}