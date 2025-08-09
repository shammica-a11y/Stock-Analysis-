package com.shammi.portfolioapp

import android.content.Context

object Prefs {
    private const val KEY = "prefs"
    private const val URL = "url"

    fun getUrl(ctx: Context): String? =
        ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE).getString(URL, null)

    fun setUrl(ctx: Context, value: String) {
        ctx.getSharedPreferences(KEY, Context.MODE_PRIVATE).edit().putString(URL, value).apply()
    }
}
