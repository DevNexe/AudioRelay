package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgg;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class zzu extends zzt {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdT)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdV)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        int iZzw = zzcgg.zzw(activity, configuration.screenHeightDp);
        int iZzw2 = zzcgg.zzw(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzq();
        DisplayMetrics displayMetricsZzr = zzs.zzr(windowManager);
        int i = displayMetricsZzr.heightPixels;
        int i2 = displayMetricsZzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdR)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        if (Math.abs(i - (iZzw + dimensionPixelSize)) <= iIntValue) {
            return !(Math.abs(i2 - iZzw2) <= iIntValue);
        }
        return true;
    }
}
