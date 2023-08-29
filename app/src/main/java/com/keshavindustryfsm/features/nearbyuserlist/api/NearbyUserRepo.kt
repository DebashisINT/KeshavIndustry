package com.keshavindustryfsm.features.nearbyuserlist.api

import com.keshavindustryfsm.app.Pref
import com.keshavindustryfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.keshavindustryfsm.features.newcollection.model.NewCollectionListResponseModel
import com.keshavindustryfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}