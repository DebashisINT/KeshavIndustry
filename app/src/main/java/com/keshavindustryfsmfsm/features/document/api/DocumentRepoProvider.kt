package com.keshavindustryfsmfsm.features.document.api

import com.keshavindustryfsmfsm.features.dymanicSection.api.DynamicApi
import com.keshavindustryfsmfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}