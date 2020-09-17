LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := libjnitest
LOCAL_SRC_FILES := TestJNI.c

include $(BUILD_SHARED_LIBRARY)
