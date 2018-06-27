package mx.com.ia.comunicacioninterna

import android.content.Context
import android.content.SharedPreferences
import android.text.Editable
import login.mnqobi.com.mx.login.utils.Constants

object SharedPreferencesManager {


    private fun getSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(Constants.GLOBAL_PREFENRES, Context.MODE_PRIVATE)
    }

    fun getToken(context: Context): String {
        return getSharedPreferences(context).getString(Constants.USER_KEY, "") ?: ""
    }


    fun saveToken(context: Context, user: String, userPassword: String) {
        val editor = getSharedPreferences(context).edit()
        editor?.putString(Constants.USER_KEY, user)
        editor?.putString(Constants.PASSWORD_KEY, userPassword)
        editor?.apply()
    }


    fun clearUserData(context: Context){
        val editor = getSharedPreferences(context)!!.edit()
        editor!!.clear()
        editor.apply()
    }




}