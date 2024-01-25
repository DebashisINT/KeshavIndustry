package com.keshavindustryfsmfsm.features.activities.api

import com.keshavindustryfsmfsm.features.member.api.TeamApi
import com.keshavindustryfsmfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}