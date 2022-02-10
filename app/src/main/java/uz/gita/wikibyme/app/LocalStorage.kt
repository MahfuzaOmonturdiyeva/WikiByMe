package uz.gita.wikibyme.app

import android.content.Context
import android.content.SharedPreferences

class LocalStorage(val context: Context) {
    private val rm = "rmFile"
    private val j = "jFile"
    private val sg = "sgFile"
    private val jHope = "j_hFile"
    private val jm = "jmFile"
    private val v = "vFile"
    private val jk = "jkFile"
    private lateinit var sharedPreferences: SharedPreferences

    init {
        sharedPreferences = context.getSharedPreferences("Local", Context.MODE_PRIVATE)
    }

    var getRM: String
        get() = sharedPreferences.getString(rm,"").toString()
        set(value) = sharedPreferences.edit().putString(rm, value).apply()
    var getJ: String
        get() = sharedPreferences.getString(j,"").toString()
        set(value) = sharedPreferences.edit().putString(j, value).apply()
    var getSG: String
        get() = sharedPreferences.getString(sg,"").toString()
        set(value) = sharedPreferences.edit().putString(sg, value).apply()
    var getJHOPE: String
        get() = sharedPreferences.getString(jHope,"").toString()
        set(value) = sharedPreferences.edit().putString(jHope, value).apply()
    var getJM: String
        get() = sharedPreferences.getString(jm,"").toString()
        set(value) = sharedPreferences.edit().putString(jm, value).apply()
    var getV: String
        get() = sharedPreferences.getString(v,"").toString()
        set(value) = sharedPreferences.edit().putString(v, value).apply()
    var getJK: String
        get() = sharedPreferences.getString(jk,"").toString()
        set(value) = sharedPreferences.edit().putString(jk, value).apply()

}