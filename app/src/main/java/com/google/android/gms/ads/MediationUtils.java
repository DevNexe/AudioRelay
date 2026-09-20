package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0036 A[SYNTHETIC] */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.e && !adSize.g) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    if (((double) width) * 0.5d <= width2 && width >= width2) {
                        if (adSize.g) {
                            int i = adSize.h;
                            if (((Integer) zzay.zzc().zzb(zzbiy.zzgH)).intValue() <= width2) {
                                if (((Integer) zzay.zzc().zzb(zzbiy.zzgI)).intValue() <= height2 && i >= height2) {
                                    if (adSize2 != null) {
                                        if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                        }
                                    }
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.e) {
                            if (adSize.f >= height2) {
                                if (adSize2 != null) {
                                    if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                    }
                                }
                                adSize2 = adSize3;
                            }
                        } else if (((double) height) * 0.7d <= height2 && height >= height2) {
                            if (adSize2 != null) {
                                if (adSize2.getHeight() * adSize2.getWidth() <= adSize3.getHeight() * adSize3.getWidth()) {
                                }
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
