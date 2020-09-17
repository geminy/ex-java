// TestJNI.c
#include <stdio.h>
#include "TestJNI.h"

JNIEXPORT jint JNICALL Java_TestJNI_testJniAdd(JNIEnv *env, jobject obj, jint v1, jint v2)
{	
	int ret = v1 + v2;
	printf("%s called, %d + %d = %d\n", __func__, v1, v2, ret);

	return v1 + v2;
}
