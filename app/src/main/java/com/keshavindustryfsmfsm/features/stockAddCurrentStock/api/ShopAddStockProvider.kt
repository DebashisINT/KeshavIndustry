package com.keshavindustryfsmfsm.features.stockAddCurrentStock.api

import com.keshavindustryfsmfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.keshavindustryfsmfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}