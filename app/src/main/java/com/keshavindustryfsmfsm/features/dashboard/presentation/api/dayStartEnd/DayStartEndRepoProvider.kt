package com.keshavindustryfsmfsm.features.dashboard.presentation.api.dayStartEnd

import com.keshavindustryfsmfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.keshavindustryfsmfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}