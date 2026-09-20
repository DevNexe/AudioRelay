package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjy extends zzgon implements zzgpy {
    private static final zzgjy zzb;
    private int zze;
    private zzgow zzf = qu6.z;

    static {
        zzgjy zzgjyVar = new zzgjy();
        zzb = zzgjyVar;
        zzgon.i(zzgjy.class, zzgjyVar);
    }

    public static /* synthetic */ void o(zzgjy zzgjyVar, zzgjx zzgjxVar) {
        zzgjxVar.getClass();
        zzgow zzgowVar = zzgjyVar.zzf;
        if (!zzgowVar.zzc()) {
            zzgjyVar.zzf = zzgon.g(zzgowVar);
        }
        zzgjyVar.zzf.add(zzgjxVar);
    }

    public static zzgjv zza() {
        return (zzgjv) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgjx.class});
        }
        if (i2 == 3) {
            return new zzgjy();
        }
        if (i2 == 4) {
            return new zzgjv(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
