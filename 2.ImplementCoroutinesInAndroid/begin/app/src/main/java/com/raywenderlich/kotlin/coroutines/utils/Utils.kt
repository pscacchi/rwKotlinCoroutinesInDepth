package com.raywenderlich.kotlin.coroutines.utils

import android.util.Log
import kotlin.coroutines.CoroutineContext

/**
 *  Helps to log information about coroutines.
 */

fun logCoroutine(methodsName: String, coroutineContext: CoroutineContext) {
    Log.d("TestCoroutine", "Thread for $methodsName is: ${Thread. currentThread().name}" +
            "and the context is $coroutineContext")

}