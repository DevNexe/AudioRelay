package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfoq implements Closeable {
    public static zzfpc zza() {
        return new zzfpc();
    }

    public static zzfpc zzb(final int i, zzfpb zzfpbVar) {
        return new zzfpc(new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfoo
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return Integer.valueOf(i);
            }
        }, new zzfsv() { // from class: com.google.android.gms.internal.ads.zzfop
            @Override // com.google.android.gms.internal.ads.zzfsv
            public final Object zza() {
                return -1;
            }
        }, zzfpbVar);
    }

    public static zzfpc zzc(zzfsv<Integer> zzfsvVar, zzfsv<Integer> zzfsvVar2, zzfpb zzfpbVar) {
        return new zzfpc(zzfsvVar, zzfsvVar2, zzfpbVar);
    }
}
