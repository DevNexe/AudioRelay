package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkr {

    @SuppressLint({"StaticFieldLeak"})
    public static final zzfkr b = new zzfkr();
    public Context a;

    public static zzfkr zzb() {
        return b;
    }

    public final Context zza() {
        return this.a;
    }

    public final void zzc(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }
}
