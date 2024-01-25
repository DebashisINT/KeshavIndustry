package com.keshavindustryfsmfsm.features.lead.api

import com.keshavindustryfsmfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.keshavindustryfsmfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}