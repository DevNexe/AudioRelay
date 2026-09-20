package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjx extends zzgon implements zzgpy {
    private static final zzgjx zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgjx zzgjxVar = new zzgjx();
        zzb = zzgjxVar;
        zzgon.i(zzgjx.class, zzgjxVar);
    }

    public static /* synthetic */ void n(zzgjx zzgjxVar, String str) {
        str.getClass();
        zzgjxVar.zze = str;
    }

    public static zzgjw zza() {
        return (zzgjw) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgjx();
        }
        if (i2 == 4) {
            return new zzgjw(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
