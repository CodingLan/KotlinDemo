package com.lxq.base

import android.app.Activity
import android.content.Intent

/**
 * @author Created by lxq on 2019/8/16.
 * Description
 */

fun <T> Activity.startActivityU(
    activity: Activity,
    clazz: Class<T>,
    map: Map<String, Any>? = null,
    requestCode: Int? = null,
    isFinished: Boolean? = null
) {
    var intent = Intent(activity, clazz)
    if (map != null) {
        if (map.isNotEmpty()) {
            map.forEach(
                {
                    var key: String = it.key
                    when (val value: Any = it.value) {
                        is Double -> intent.putExtra(key, value)
                        is String -> intent.putExtra(key, value)
                    }
                })
        }
    }
    requestCode?.let { this.startActivityForResult(intent, requestCode) }
    requestCode ?: this.startActivity(intent)
    isFinished?.let { this.finish() }

}