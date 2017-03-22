//add.cpp
#include "com_allen_hellondk_MainActivity.h"
#include <stdio.h>

JNIEXPORT jint JNICALL Java_com_allen_hellondk_MainActivity_add(JNIEnv *env, jobject object, jint a, jint b) {
    return a + b;
}