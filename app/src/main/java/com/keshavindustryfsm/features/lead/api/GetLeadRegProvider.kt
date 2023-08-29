package com.keshavindustryfsm.features.lead.api

import com.keshavindustryfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.keshavindustryfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}