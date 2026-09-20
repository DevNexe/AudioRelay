package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.ua7;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsp {
    public final CopyOnWriteArrayList a;
    public final int zza;
    public final zzsg zzb;

    public zzsp() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public zzsp(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsg zzsgVar) {
        this.a = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsgVar;
    }

    public static final long a(long j) {
        long jZzz = zzel.zzz(j);
        if (jZzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzz;
    }

    public final zzsp zza(int i, zzsg zzsgVar, long j) {
        return new zzsp(this.a, i, zzsgVar);
    }

    public final void zzb(Handler handler, zzsq zzsqVar) {
        zzsqVar.getClass();
        this.a.add(new ua7(handler, zzsqVar));
    }

    public final void zzc(final zzsc zzscVar) {
        for (ua7 ua7Var : this.a) {
            final zzsq zzsqVar = ua7Var.b;
            zzel.zzY(ua7Var.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsj
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp zzspVar = this.zza;
                    zzsqVar.zzaf(zzspVar.zza, zzspVar.zzb, zzscVar);
                }
            });
        }
    }

    public final void zzd(int i, zzaf zzafVar, int i2, Object obj, long j) {
        zzc(new zzsc(1, i, zzafVar, 0, null, a(j), -9223372036854775807L));
    }

    public final void zze(final zzrx zzrxVar, final zzsc zzscVar) {
        for (ua7 ua7Var : this.a) {
            final zzsq zzsqVar = ua7Var.b;
            zzel.zzY(ua7Var.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsk
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp zzspVar = this.zza;
                    zzsqVar.zzag(zzspVar.zza, zzspVar.zzb, zzrxVar, zzscVar);
                }
            });
        }
    }

    public final void zzf(zzrx zzrxVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zze(zzrxVar, new zzsc(1, -1, null, 0, null, a(j), a(j2)));
    }

    public final void zzg(final zzrx zzrxVar, final zzsc zzscVar) {
        for (ua7 ua7Var : this.a) {
            final zzsq zzsqVar = ua7Var.b;
            zzel.zzY(ua7Var.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp zzspVar = this.zza;
                    zzsqVar.zzah(zzspVar.zza, zzspVar.zzb, zzrxVar, zzscVar);
                }
            });
        }
    }

    public final void zzh(zzrx zzrxVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzg(zzrxVar, new zzsc(1, -1, null, 0, null, a(j), a(j2)));
    }

    public final void zzi(final zzrx zzrxVar, final zzsc zzscVar, final IOException iOException, final boolean z) {
        for (ua7 ua7Var : this.a) {
            final zzsq zzsqVar = ua7Var.b;
            zzel.zzY(ua7Var.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp zzspVar = this.zza;
                    zzsqVar.zzai(zzspVar.zza, zzspVar.zzb, zzrxVar, zzscVar, iOException, z);
                }
            });
        }
    }

    public final void zzj(zzrx zzrxVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        zzi(zzrxVar, new zzsc(1, -1, null, 0, null, a(j), a(j2)), iOException, z);
    }

    public final void zzk(final zzrx zzrxVar, final zzsc zzscVar) {
        for (ua7 ua7Var : this.a) {
            final zzsq zzsqVar = ua7Var.b;
            zzel.zzY(ua7Var.a, new Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
                @Override // java.lang.Runnable
                public final void run() {
                    zzsp zzspVar = this.zza;
                    zzsqVar.zzaj(zzspVar.zza, zzspVar.zzb, zzrxVar, zzscVar);
                }
            });
        }
    }

    public final void zzl(zzrx zzrxVar, int i, int i2, zzaf zzafVar, int i3, Object obj, long j, long j2) {
        zzk(zzrxVar, new zzsc(1, -1, null, 0, null, a(j), a(j2)));
    }

    public final void zzm(zzsq zzsqVar) {
        CopyOnWriteArrayList<ua7> copyOnWriteArrayList = this.a;
        for (ua7 ua7Var : copyOnWriteArrayList) {
            if (ua7Var.b == zzsqVar) {
                copyOnWriteArrayList.remove(ua7Var);
            }
        }
    }
}
