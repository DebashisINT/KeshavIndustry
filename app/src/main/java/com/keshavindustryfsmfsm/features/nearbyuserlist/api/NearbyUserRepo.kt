package com.keshavindustryfsmfsm.features.nearbyuserlist.api

import com.keshavindustryfsmfsm.app.Pref
import com.keshavindustryfsmfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.keshavindustryfsmfsm.features.newcollection.model.NewCollectionListResponseModel
import com.keshavindustryfsmfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}