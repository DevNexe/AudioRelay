package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbje {
    public static final void zza(zzbjd zzbjdVar, zzbjb zzbjbVar) {
        if (zzbjbVar.c == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        String str = zzbjbVar.d;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbjdVar.zzd(zzbjbVar.c, str, zzbjbVar.a, zzbjbVar.b);
    }
}
