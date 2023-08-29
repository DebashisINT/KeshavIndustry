package com.keshavindustryfsm.features.stockAddCurrentStock.api

import com.keshavindustryfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.keshavindustryfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}