package com.keshavindustryfsm.features.activities.api

import com.keshavindustryfsm.features.member.api.TeamApi
import com.keshavindustryfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}