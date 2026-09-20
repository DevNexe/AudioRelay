package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import defpackage.im6;
import defpackage.od6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfqb {
    @SuppressLint({"RestrictedApi"})
    public static zzfqa zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new od6(new im6(context), 6);
    }
}
