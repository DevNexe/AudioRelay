package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbej {
    public final InputStream a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public zzbej(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.a = inputStream;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public static zzbej zzb(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new zzbej(inputStream, z, z2, j, z3);
    }

    public final long zza() {
        return this.d;
    }

    public final InputStream zzc() {
        return this.a;
    }

    public final boolean zzd() {
        return this.b;
    }

    public final boolean zze() {
        return this.e;
    }

    public final boolean zzf() {
        return this.c;
    }
}
