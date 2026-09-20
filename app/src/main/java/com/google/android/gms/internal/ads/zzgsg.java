package com.google.android.gms.internal.ads;

import defpackage.qu6;
import defpackage.ru6;
import defpackage.uv6;
import defpackage.vv6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsg extends zzgon implements zzgpy {
    private static final zzgsg zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private zzgow zzi;
    private int zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private String zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private zzgow zzs;
    private boolean zzt;
    private long zzu;

    static {
        zzgsg zzgsgVar = new zzgsg();
        zzb = zzgsgVar;
        zzgon.i(zzgsg.class, zzgsgVar);
    }

    public zzgsg() {
        qu6 qu6Var = qu6.z;
        this.zzi = qu6Var;
        this.zzn = "";
        this.zzs = qu6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgon
    public final Object k(int i, zzgon zzgonVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new ru6(zzb, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဌ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r", new Object[]{"zze", "zzf", vv6.a, "zzg", "zzh", "zzi", "zzj", uv6.a, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzgsd.class, "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzgsg();
        }
        if (i2 == 4) {
            return new zzgsa(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
