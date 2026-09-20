package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzew extends IOException {
    public final int zza;

    public zzew(int i) {
        this.zza = i;
    }

    public zzew(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzew(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzew(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
