package app.aaps.core.utils.pump

import android.os.Build

/**
 * Created by geoff on 5/27/16.
 */
object ThreadUtil {

    fun sig(): String {
        val t = Thread.currentThread()
        return t.name + "[" + threadId() + "]"
    }

    @Suppress("DEPRECATION")
    fun threadId() =
Thread.currentThread().id

}