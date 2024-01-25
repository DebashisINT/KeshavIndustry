package com.keshavindustryfsmfsm.features.weather.api

import com.keshavindustryfsmfsm.base.BaseResponse
import com.keshavindustryfsmfsm.features.task.api.TaskApi
import com.keshavindustryfsmfsm.features.task.model.AddTaskInputModel
import com.keshavindustryfsmfsm.features.weather.model.ForeCastAPIResponse
import com.keshavindustryfsmfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}