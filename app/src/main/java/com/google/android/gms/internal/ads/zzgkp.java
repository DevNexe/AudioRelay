package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzgkp extends zzgon implements zzgpy {
    private static final zzgkp zzb;
    private String zze = "";
    private zzgow zzf = qu6.z;

    static {
        zzgkp zzgkpVar = new zzgkp();
        zzb = zzgkpVar;
        zzgon.i(zzgkp.class, zzgkpVar);
    }

    public static zzgkp zzc() {
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
            return new ru6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzgjo.class});
        }
        if (i2 == 3) {
            return new zzgkp();
        }
        if (i2 == 4) {
            return new zzgko(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzd() {
        return this.zzf;
    }
}
