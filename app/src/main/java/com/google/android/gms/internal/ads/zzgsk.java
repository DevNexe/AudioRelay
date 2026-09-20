package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsk extends zzgon implements zzgpy {
    private static final zzgsk zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgsk zzgskVar = new zzgsk();
        zzb = zzgskVar;
        zzgon.i(zzgsk.class, zzgskVar);
    }

    public static /* synthetic */ void n(zzgsk zzgskVar, String str) {
        zzgskVar.zze |= 1;
        zzgskVar.zzf = str;
    }

    public static zzgsj zza() {
        return (zzgsj) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgsk();
        }
        if (i2 == 4) {
            return new zzgsj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
