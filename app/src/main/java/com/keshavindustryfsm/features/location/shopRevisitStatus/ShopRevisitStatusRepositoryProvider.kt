package com.keshavindustryfsm.features.location.shopRevisitStatus

import com.keshavindustryfsm.features.location.shopdurationapi.ShopDurationApi
import com.keshavindustryfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}