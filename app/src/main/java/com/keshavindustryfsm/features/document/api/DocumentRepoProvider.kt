package com.keshavindustryfsm.features.document.api

import com.keshavindustryfsm.features.dymanicSection.api.DynamicApi
import com.keshavindustryfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}