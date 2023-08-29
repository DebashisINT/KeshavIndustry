package com.keshavindustryfsm.features.photoReg.present

import com.keshavindustryfsm.app.domain.ProspectEntity
import com.keshavindustryfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}