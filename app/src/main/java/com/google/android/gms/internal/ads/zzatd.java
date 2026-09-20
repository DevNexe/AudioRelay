package com.google.android.gms.internal.ads;

import defpackage.i06;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzatd {
    public static final zzatd zza = new i06();

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzatb zzd(int i, zzatb zzatbVar, boolean z);

    public abstract zzatc zze(int i, zzatc zzatcVar, boolean z, long j);

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final int zzf(int i, zzatb zzatbVar, zzatc zzatcVar, int i2) {
        zzd(i, zzatbVar, false);
        zzg(0, zzatcVar, false);
        int i3 = 1;
        if (i != 0) {
            return i + 1;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 0;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                if (zzc() - 1 == 0) {
                    i3 = 0;
                }
            }
        } else if (zzc() - 1 == 0) {
            i3 = -1;
        }
        if (i3 == -1) {
            return -1;
        }
        zzg(i3, zzatcVar, false);
        return 0;
    }

    public final zzatc zzg(int i, zzatc zzatcVar, boolean z) {
        return zze(i, zzatcVar, false, 0L);
    }

    public final boolean zzh() {
        return zzc() == 0;
    }
}
