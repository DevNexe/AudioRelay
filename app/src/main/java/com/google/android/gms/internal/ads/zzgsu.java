package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsu extends zzgon implements zzgpy {
    private static final zzgsu zzb;
    private int zze;
    private zzgst zzf;
    private zzgnf zzh;
    private zzgnf zzi;
    private int zzj;
    private byte zzk = 2;
    private zzgow zzg = qu6.z;

    static {
        zzgsu zzgsuVar = new zzgsu();
        zzb = zzgsuVar;
        zzgon.i(zzgsu.class, zzgsuVar);
    }

    public zzgsu() {
        zzgnf zzgnfVar = zzgnf.zzb;
        this.zzh = zzgnfVar;
        this.zzi = zzgnfVar;
    }

    public static /* synthetic */ void n(zzgsu zzgsuVar, zzgsq zzgsqVar) {
        zzgsqVar.getClass();
        zzgow zzgowVar = zzgsuVar.zzg;
        if (!zzgowVar.zzc()) {
            zzgsuVar.zzg = zzgon.g(zzgowVar);
        }
        zzgsuVar.zzg.add(zzgsqVar);
    }

    public static zzgsr zza() {
        return (zzgsr) zzb.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgsq.class, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgsu();
        }
        if (i2 == 4) {
            return new zzgsr(b);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = zzgonVar != null ? (byte) 1 : (byte) 0;
        return null;
    }
}
