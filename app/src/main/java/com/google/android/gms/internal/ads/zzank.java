package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;
import defpackage.ry5;
import defpackage.ty5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzank extends zzgon implements zzgpy {
    private static final zzank zzb;
    private int zze;
    private zzgow zzf = qu6.z;
    private zzgnf zzg = zzgnf.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzank zzankVar = new zzank();
        zzb = zzankVar;
        zzgon.i(zzank.class, zzankVar);
    }

    public static /* synthetic */ void n(zzank zzankVar, zzgnf zzgnfVar) {
        zzgow zzgowVar = zzankVar.zzf;
        if (!zzgowVar.zzc()) {
            zzankVar.zzf = zzgon.g(zzgowVar);
        }
        zzankVar.zzf.add(zzgnfVar);
    }

    public static /* synthetic */ void o(zzank zzankVar, zzgnf zzgnfVar) {
        zzankVar.zze |= 1;
        zzankVar.zzg = zzgnfVar;
    }

    public static /* synthetic */ void p(zzank zzankVar, int i) {
        zzankVar.zzi = i - 1;
        zzankVar.zze |= 4;
    }

    public static zzanj zza() {
        return (zzanj) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", ty5.a, "zzi", ry5.a});
        }
        if (i2 == 3) {
            return new zzank();
        }
        if (i2 == 4) {
            return new zzanj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
