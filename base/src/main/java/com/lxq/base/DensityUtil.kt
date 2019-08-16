package com.lxq.base

import android.app.Activity
import android.util.TypedValue

/**
 * @author Created by lxq on 2019/8/16.
 * Description
 */
fun Activity.dp2px(dp: Float): Float =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, this.resources.displayMetrics)

//fun Activity.width():Float =this.resources.displayMetrics.heightPixels
