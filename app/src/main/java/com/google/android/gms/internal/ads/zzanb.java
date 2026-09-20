package com.google.android.gms.internal.ads;

import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanb extends zzgon implements zzgpy {
    private static final zzanb zzb;
    private int zze;
    private zzgnf zzf;
    private zzgnf zzg;
    private zzgnf zzh;
    private zzgnf zzi;

    static {
        zzanb zzanbVar = new zzanb();
        zzb = zzanbVar;
        zzgon.i(zzanb.class, zzanbVar);
    }

    public zzanb() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzf = zzgnfVar;
        this.zzg = zzgnfVar;
        this.zzh = zzgnfVar;
        this.zzi = zzgnfVar;
    }

    public static /* synthetic */ void n(zzanb zzanbVar, zzgnf zzgnfVar) {
        zzanbVar.zze |= 1;
        zzanbVar.zzf = zzgnfVar;
    }

    public static /* synthetic */ void o(zzanb zzanbVar, zzgnf zzgnfVar) {
        zzanbVar.zze |= 2;
        zzanbVar.zzg = zzgnfVar;
    }

    public static /* synthetic */ void p(zzanb zzanbVar, zzgnf zzgnfVar) {
        zzanbVar.zze |= 4;
        zzanbVar.zzh = zzgnfVar;
    }

    public static /* synthetic */ void q(zzanb zzanbVar, zzgnf zzgnfVar) {
        zzanbVar.zze |= 8;
        zzanbVar.zzi = zzgnfVar;
    }

    public static zzana zza() {
        return (zzana) zzb.j();
    }

    public static zzanb zzd(byte[] bArr, zzgnz zzgnzVar) {
        zzgon zzgonVarL = zzgon.l(zzb, bArr, bArr.length, zzgnzVar);
        zzgon.d(zzgonVarL);
        return (zzanb) zzgonVarL;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzanb();
        }
        if (i2 == 4) {
            return new zzana(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnf zze() {
        return this.zzf;
    }

    public final zzgnf zzf() {
        return this.zzg;
    }

    public final zzgnf zzg() {
        return this.zzi;
    }

    public final zzgnf zzh() {
        return this.zzh;
    }
}
