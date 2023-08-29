package com.keshavindustryfsm.features.newcollectionreport

import com.keshavindustryfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}