package com.rafcode.schedulefootball.utils.database

class FavoriteMatch(val idEvent: Int, val gson: String) {

    companion object {
        const val TABLE_MATCH: String = "TABLE_MATCH"

        const val idEvent: String = "idEvent"
        const val gson: String = "gson"
    }

}
