package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoc extends Exception {
    public final int w;

    public zzfoc(int i, String str) {
        super(str);
        this.w = i;
    }

    public final int zza() {
        return this.w;
    }

    public zzfoc(int i, Throwable th) {
        super(th);
        this.w = i;
    }
}
