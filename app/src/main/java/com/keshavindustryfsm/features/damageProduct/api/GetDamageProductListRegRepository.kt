package com.keshavindustryfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.keshavindustryfsm.app.FileUtils
import com.keshavindustryfsm.base.BaseResponse
import com.keshavindustryfsm.features.NewQuotation.model.*
import com.keshavindustryfsm.features.addshop.model.AddShopRequestData
import com.keshavindustryfsm.features.addshop.model.AddShopResponse
import com.keshavindustryfsm.features.damageProduct.model.DamageProductResponseModel
import com.keshavindustryfsm.features.damageProduct.model.delBreakageReq
import com.keshavindustryfsm.features.damageProduct.model.viewAllBreakageReq
import com.keshavindustryfsm.features.login.model.userconfig.UserConfigResponseModel
import com.keshavindustryfsm.features.myjobs.model.WIPImageSubmit
import com.keshavindustryfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}