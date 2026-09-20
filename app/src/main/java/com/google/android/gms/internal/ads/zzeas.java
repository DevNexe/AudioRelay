package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzeas extends Exception {
    public final int w;

    public zzeas(int i) {
        this.w = i;
    }

    public final int zza() {
        return this.w;
    }

    public zzeas(int i, String str) {
        super(str);
        this.w = i;
    }

    public zzeas(int i, String str, Throwable th) {
        super(str, th);
        this.w = 1;
    }
}
