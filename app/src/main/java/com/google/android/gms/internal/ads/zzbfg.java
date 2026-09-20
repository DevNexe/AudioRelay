package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfg extends zzgon implements zzgpy {
    private static final zzbfg zzb;
    private zzgow zze = qu6.z;

    static {
        zzbfg zzbfgVar = new zzbfg();
        zzb = zzbfgVar;
        zzgon.i(zzbfg.class, zzbfgVar);
    }

    public static /* synthetic */ void n(zzbfg zzbfgVar, zzbez zzbezVar) {
        zzbezVar.getClass();
        zzgow zzgowVar = zzbfgVar.zze;
        if (!zzgowVar.zzc()) {
            zzbfgVar.zze = zzgon.g(zzgowVar);
        }
        zzbfgVar.zze.add(zzbezVar);
    }

    public static zzbfa zza() {
        return (zzbfa) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbez.class});
        }
        if (i2 == 3) {
            return new zzbfg();
        }
        if (i2 == 4) {
            return new zzbfa(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
