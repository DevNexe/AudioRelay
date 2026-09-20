package com.google.android.gms.internal.ads;

import defpackage.aw6;
import defpackage.qu6;
import defpackage.ru6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgth extends zzgon implements zzgpy {
    private static final zzgth zzb;
    private int zze;
    private int zzf;
    private zzgsu zzh;
    private zzgsy zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private zzgos zzk = yt6.z;
    private String zzl = "";
    private zzgow zzn = qu6.z;

    static {
        zzgth zzgthVar = new zzgth();
        zzb = zzgthVar;
        zzgon.i(zzgth.class, zzgthVar);
    }

    public static /* synthetic */ void n(zzgth zzgthVar, int i) {
        zzgthVar.zze |= 1;
        zzgthVar.zzf = i;
    }

    public static /* synthetic */ void o(zzgth zzgthVar, String str) {
        str.getClass();
        zzgthVar.zze |= 2;
        zzgthVar.zzg = str;
    }

    public static /* synthetic */ void p(zzgth zzgthVar, zzgsu zzgsuVar) {
        zzgsuVar.getClass();
        zzgthVar.zzh = zzgsuVar;
        zzgthVar.zze |= 4;
    }

    public static /* synthetic */ void q(zzgth zzgthVar, String str) {
        str.getClass();
        zzgow zzgowVar = zzgthVar.zzn;
        if (!zzgowVar.zzc()) {
            zzgthVar.zzn = zzgon.g(zzgowVar);
        }
        zzgthVar.zzn.add(str);
    }

    public static /* synthetic */ void r(zzgth zzgthVar, int i) {
        zzgthVar.zzm = i - 1;
        zzgthVar.zze |= 64;
    }

    public static zzgtg zzc() {
        return (zzgtg) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", aw6.a, "zzn"});
        }
        if (i2 == 3) {
            return new zzgth();
        }
        if (i2 == 4) {
            return new zzgtg(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzo = zzgonVar != null ? (byte) 1 : (byte) 0;
        return null;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final String zze() {
        return this.zzg;
    }
}
