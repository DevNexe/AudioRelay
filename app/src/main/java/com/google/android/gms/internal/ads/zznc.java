package com.google.android.gms.internal.ads;

import defpackage.a42;
import defpackage.ex0;

/* JADX INFO: loaded from: classes3.dex */
public final class zznc {
    public static final zznc zza = new zznc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zznc(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzel.zzV(i3) ? zzel.zzo(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        return ex0.c(a42.a("AudioFormat[sampleRate=", i, ", channelCount=", i2, ", encoding="), this.zzd, "]");
    }
}
