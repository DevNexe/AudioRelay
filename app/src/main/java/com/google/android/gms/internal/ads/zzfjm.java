package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjm extends zzgon implements zzgpy {
    private static final zzfjm zzb;
    private zzgow zze = qu6.z;

    static {
        zzfjm zzfjmVar = new zzfjm();
        zzb = zzfjmVar;
        zzgon.i(zzfjm.class, zzfjmVar);
    }

    public static void n(zzfjm zzfjmVar) {
        zzfjmVar.zze = qu6.z;
    }

    public static /* synthetic */ void o(zzfjm zzfjmVar, zzfjl zzfjlVar) {
        zzfjlVar.getClass();
        zzgow zzgowVar = zzfjmVar.zze;
        if (!zzgowVar.zzc()) {
            zzfjmVar.zze = zzgon.g(zzgowVar);
        }
        zzfjmVar.zze.add(zzfjlVar);
    }

    public static zzfjj zzc() {
        return (zzfjj) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfjl.class});
        }
        if (i2 == 3) {
            return new zzfjm();
        }
        if (i2 == 4) {
            return new zzfjj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zza() {
        return this.zze.size();
    }
}
