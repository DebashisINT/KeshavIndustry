package com.keshavindustryfsm.features.location.api

import com.keshavindustryfsm.features.location.shopdurationapi.ShopDurationApi
import com.keshavindustryfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}