package com.easemob.bsdiff;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.util.Log;

import java.io.File;

/**
 * Created by liyuzhao on 05/07/2017.
 */

public class ApkExtract {

	public static String extract(Context context){
		ApplicationInfo applicationInfo = context.getApplicationInfo();
		String apkPath = applicationInfo.sourceDir;
		Log.d("extract", apkPath);
		return apkPath;
	}

	public static void install(Context context, String apkPath){
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		i.setDataAndType(Uri.fromFile(new File(apkPath)), "application/vnd.android.package-archive");
		context.startActivity(i);
	}

}
