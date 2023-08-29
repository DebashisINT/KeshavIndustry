package com.keshavindustryfsm.features.weather.api

import com.keshavindustryfsm.features.task.api.TaskApi
import com.keshavindustryfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}