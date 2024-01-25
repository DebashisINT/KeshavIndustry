package com.keshavindustryfsmfsm.features.location.api

import com.keshavindustryfsmfsm.features.location.shopdurationapi.ShopDurationApi
import com.keshavindustryfsmfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}