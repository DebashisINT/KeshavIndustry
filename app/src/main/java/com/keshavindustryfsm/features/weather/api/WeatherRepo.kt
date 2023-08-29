package com.keshavindustryfsm.features.weather.api

import com.keshavindustryfsm.base.BaseResponse
import com.keshavindustryfsm.features.task.api.TaskApi
import com.keshavindustryfsm.features.task.model.AddTaskInputModel
import com.keshavindustryfsm.features.weather.model.ForeCastAPIResponse
import com.keshavindustryfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}