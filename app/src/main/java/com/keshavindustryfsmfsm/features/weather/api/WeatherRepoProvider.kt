package com.keshavindustryfsmfsm.features.weather.api

import com.keshavindustryfsmfsm.features.task.api.TaskApi
import com.keshavindustryfsmfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}