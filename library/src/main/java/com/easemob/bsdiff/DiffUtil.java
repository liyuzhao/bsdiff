package com.easemob.bsdiff;

/**
 * Created by liyuzhao on 04/07/2017.
 */

public class DiffUtil {

	static{
		System.loadLibrary("bsdiff");
	}

	// 产生APK差分包
	public static native void diff(String oldPath, String newPath, String patchPath);

	public static native int bspatch(String oldApk, String newApk, String patch);



}
