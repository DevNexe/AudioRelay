package com.google.android.gms.internal.ads;

import defpackage.cw6;
import defpackage.dw6;
import defpackage.qu6;
import defpackage.ru6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgtx extends zzgon implements zzgpy {
    private static final zzgtx zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh = 4;
    private zzgow zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private double zzm;
    private zzgow zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;

    static {
        zzgtx zzgtxVar = new zzgtx();
        zzb = zzgtxVar;
        zzgon.i(zzgtx.class, zzgtxVar);
    }

    public zzgtx() {
        qu6 qu6Var = qu6.z;
        this.zzi = qu6Var;
        this.zzj = "";
        this.zzk = "";
        this.zzn = qu6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\nဌ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zze", "zzf", "zzh", dw6.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzgtv.class, "zzg", "zzo", cw6.a, "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzgtx();
        }
        if (i2 == 4) {
            return new zzgts(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
