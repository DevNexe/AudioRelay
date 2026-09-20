package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzghn extends zzgon implements zzgpy {
    private static final zzghn zzb;
    private zzgjl zze;

    static {
        zzghn zzghnVar = new zzghn();
        zzb = zzghnVar;
        zzgon.i(zzghn.class, zzghnVar);
    }

    public static /* synthetic */ void n(zzghn zzghnVar, zzgjl zzgjlVar) {
        zzgjlVar.getClass();
        zzghnVar.zze = zzgjlVar;
    }

    public static zzghm zza() {
        return (zzghm) zzb.j();
    }

    public static zzghn zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzghn();
        }
        if (i2 == 4) {
            return new zzghm(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjl zze() {
        zzgjl zzgjlVar = this.zze;
        return zzgjlVar == null ? zzgjl.zzd() : zzgjlVar;
    }
}
