package com.keshavindustryfsmfsm.features.location.shopRevisitStatus

import com.keshavindustryfsmfsm.features.location.shopdurationapi.ShopDurationApi
import com.keshavindustryfsmfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}