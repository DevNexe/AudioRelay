package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.nl6;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmn {
    public static zzamx zza(Context context, String str, String str2) {
        zzamx zzamxVar;
        try {
            zzamxVar = (zzamx) new nl6(context, str, str2).d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzamxVar = null;
        }
        return zzamxVar == null ? nl6.a() : zzamxVar;
    }
}
