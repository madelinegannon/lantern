package com.example.androidthings.lantern.shared

import org.json.JSONObject

fun JSONObject.clone(): JSONObject {
    return JSONObject(this, keys().asSequence().toList().toTypedArray())
}
