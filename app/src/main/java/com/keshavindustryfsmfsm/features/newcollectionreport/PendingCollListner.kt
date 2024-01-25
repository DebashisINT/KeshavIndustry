package com.keshavindustryfsmfsm.features.newcollectionreport

import com.keshavindustryfsmfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}