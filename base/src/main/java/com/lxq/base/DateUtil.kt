package com.lxq.base

import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Created by lxq on 2019/8/16.
 * Description
 */
fun Long.long2String(): String {
    var format = SimpleDateFormat("yyyy-MM-dd hh-mm-ss")
    return format.format(Date(this))
}