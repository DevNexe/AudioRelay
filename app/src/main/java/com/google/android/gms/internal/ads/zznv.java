package com.google.android.gms.internal.ads;

import defpackage.GM;

/* JADX INFO: loaded from: classes3.dex */
public final class zznv extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zznv(int i, zzaf zzafVar, boolean z) {
        super(GM.a("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzafVar;
    }
}
