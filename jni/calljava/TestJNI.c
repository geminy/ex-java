// TestJNI.c
#include <stdio.h>
#include <stdlib.h>
#include "TestJNI.h"

JNIEXPORT jint JNICALL Java_TestJNI_testJniAdd(JNIEnv *env, jobject obj, jint v1, jint v2)
{
	printf("%s called\n", __func__);

	jclass cls = (*env)->FindClass(env, "TestJNI");
	jmethodID mid = (*env)->GetMethodID(env, cls, "negate", "(I)I");
	jint ret = (*env)->CallIntMethod(env, obj, mid, 12);
	printf("called java from native: negate(12) is %d\n", ret);

	return v1 + v2;
}

