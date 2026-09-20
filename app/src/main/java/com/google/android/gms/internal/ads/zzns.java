package com.google.android.gms.internal.ads;

import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
public final class zzns extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzns(int i, int i2, int i3, int i4, zzaf zzafVar, boolean z, Exception exc) {
        String str = true != z ? "" : " (recoverable)";
        StringBuilder sbA = a42.a("AudioTrack init failed ", i, " Config(", i2, ", ");
        sbA.append(i3);
        sbA.append(", ");
        sbA.append(i4);
        sbA.append(")");
        sbA.append(str);
        super(sbA.toString(), exc);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzafVar;
    }
}
