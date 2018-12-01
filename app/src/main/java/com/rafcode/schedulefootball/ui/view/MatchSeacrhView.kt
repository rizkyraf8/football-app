package com.rafcode.schedulefootball.ui.view

import com.rafcode.schedulefootball.api.response.Events
import com.rafcode.schedulefootball.api.response.EventsSearch
import com.rafcode.schedulefootball.repository.ApiRepositoryCallback

interface MatchSeacrhView : ApiRepositoryCallback<EventsSearch> {
    fun onShowLoadingMatch()
    fun onHideLoadingMatch()
}