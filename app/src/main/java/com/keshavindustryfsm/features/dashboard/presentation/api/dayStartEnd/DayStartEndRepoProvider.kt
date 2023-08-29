package com.keshavindustryfsm.features.dashboard.presentation.api.dayStartEnd

import com.keshavindustryfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.keshavindustryfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}