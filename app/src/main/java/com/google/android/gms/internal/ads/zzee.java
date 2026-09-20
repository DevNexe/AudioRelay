package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.hh6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzee implements zzde {
    @Override // com.google.android.gms.internal.ads.zzde
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdn zzb(Looper looper, Handler.Callback callback) {
        return new hh6(new Handler(looper, callback));
    }
}
