package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfz {
    public static int zza(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 1000) {
            return 0;
        }
        return AdError.NO_FILL_ERROR_CODE;
    }
}
