package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzyr {
    public final zzyl a;
    public final zzyq b;
    public zzyn c;
    public final int d;

    public zzyr(zzyo zzyoVar, zzyq zzyqVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = zzyqVar;
        this.d = i;
        this.a = new zzyl(zzyoVar, j, 0L, j2, j3, j4, j5);
    }

    public static final int a(zzzg zzzgVar, long j, zzaaf zzaafVar) {
        if (j == zzzgVar.zzf()) {
            return 0;
        }
        zzaafVar.zza = j;
        return 1;
    }

    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws EOFException, InterruptedIOException {
        boolean z;
        while (true) {
            zzyn zzynVar = this.c;
            zzdd.zzb(zzynVar);
            long j = zzynVar.f;
            long j2 = zzynVar.g;
            long j3 = zzynVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            zzyq zzyqVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                zzyqVar.zzb();
                return a(zzzgVar, j, zzaafVar);
            }
            long jZzf = j3 - zzzgVar.zzf();
            if (jZzf < 0 || jZzf > 262144) {
                z = false;
            } else {
                ((zzyv) zzzgVar).zzo((int) jZzf, false);
                z = true;
            }
            if (!z) {
                return a(zzzgVar, j3, zzaafVar);
            }
            zzzgVar.zzj();
            zzyp zzypVarZza = zzyqVar.zza(zzzgVar, zzynVar.b);
            int i = zzypVarZza.a;
            if (i == -3) {
                this.c = null;
                zzyqVar.zzb();
                return a(zzzgVar, j3, zzaafVar);
            }
            long j6 = zzypVarZza.b;
            long j7 = zzypVarZza.c;
            if (i == -2) {
                zzynVar.d = j6;
                zzynVar.f = j7;
                zzynVar.h = zzyn.a(zzynVar.b, j6, zzynVar.e, j7, zzynVar.g, zzynVar.c);
            } else {
                if (i != -1) {
                    long jZzf2 = j7 - zzzgVar.zzf();
                    if (jZzf2 >= 0 && jZzf2 <= 262144) {
                        ((zzyv) zzzgVar).zzo((int) jZzf2, false);
                    }
                    this.c = null;
                    zzyqVar.zzb();
                    return a(zzzgVar, j7, zzaafVar);
                }
                zzynVar.e = j6;
                zzynVar.g = j7;
                zzynVar.h = zzyn.a(zzynVar.b, zzynVar.d, j6, zzynVar.f, j7, zzynVar.c);
            }
        }
    }

    public final zzaai zzb() {
        return this.a;
    }

    public final void zzd(long j) {
        zzyn zzynVar = this.c;
        if (zzynVar == null || zzynVar.a != j) {
            zzyl zzylVar = this.a;
            this.c = new zzyn(j, zzylVar.zzf(j), zzylVar.c, zzylVar.d, zzylVar.e, zzylVar.f);
        }
    }

    public final boolean zze() {
        return this.c != null;
    }
}
