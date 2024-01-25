package com.keshavindustryfsmfsm.features.photoReg.present

import com.keshavindustryfsmfsm.app.domain.ProspectEntity
import com.keshavindustryfsmfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}