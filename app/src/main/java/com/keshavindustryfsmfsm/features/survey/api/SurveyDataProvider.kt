package com.keshavindustryfsmfsm.features.survey.api

import com.keshavindustryfsmfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.keshavindustryfsmfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}