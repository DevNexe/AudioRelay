package com.google.android.gms.internal.ads;

import defpackage.f46;
import defpackage.g46;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgp extends zzgon implements zzgpy {
    private static final zzbgp zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbgp zzbgpVar = new zzbgp();
        zzb = zzbgpVar;
        zzgon.i(zzbgp.class, zzbgpVar);
    }

    public static /* synthetic */ void n(zzbgp zzbgpVar, int i) {
        zzbgpVar.zzf = i - 1;
        zzbgpVar.zze |= 1;
    }

    public static /* synthetic */ void o(zzbgp zzbgpVar, int i) {
        zzbgpVar.zzg = i - 1;
        zzbgpVar.zze |= 2;
    }

    public static zzbgi zza() {
        return (zzbgi) zzb.j();
    }

    public static zzbgp zzd() {
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
            return new ru6(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", g46.a, "zzg", f46.a});
        }
        if (i2 == 3) {
            return new zzbgp();
        }
        if (i2 == 4) {
            return new zzbgi(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int iZza = zzbgl.zza(this.zzg);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzh() {
        int iZza = zzbgo.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}
