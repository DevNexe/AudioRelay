package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.aw5;
import defpackage.bw5;
import defpackage.cw5;
import defpackage.d7G;
import defpackage.ew5;
import defpackage.qv5;
import defpackage.xApe;
import defpackage.xv5;
import defpackage.yv5;
import defpackage.zv5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagc implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzagb
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzagc()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public zzzi a;
    public cw5 b;
    public boolean c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean a(zzzg zzzgVar) {
        zv5 zv5Var = new zv5();
        if (zv5Var.a(zzzgVar, true) && (zv5Var.a & 2) == 2) {
            int iMin = Math.min(zv5Var.e, 8);
            zzed zzedVar = new zzed(iMin);
            ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin, false);
            zzedVar.zzF(0);
            if (zzedVar.zza() >= 5 && zzedVar.zzk() == 127 && zzedVar.zzs() == 1179402563) {
                this.b = new xv5();
            } else {
                zzedVar.zzF(0);
                try {
                    if (zzaas.zzd(1, zzedVar, true)) {
                        this.b = new ew5();
                    } else {
                        zzedVar.zzF(0);
                        if (bw5.e(zzedVar, bw5.o)) {
                            this.b = new bw5();
                        }
                    }
                } catch (zzbu unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        zzdd.zzb(this.a);
        if (this.b == null) {
            if (!a(zzzgVar)) {
                throw zzbu.zza("Failed to determine bitstream type", null);
            }
            zzzgVar.zzj();
        }
        if (!this.c) {
            zzaam zzaamVarZzv = this.a.zzv(0, 1);
            this.a.zzB();
            cw5 cw5Var = this.b;
            cw5Var.c = this.a;
            cw5Var.b = zzaamVarZzv;
            cw5Var.b(true);
            this.c = true;
        }
        cw5 cw5Var2 = this.b;
        zzdd.zzb(cw5Var2.b);
        int i = zzel.zza;
        int i2 = cw5Var2.h;
        yv5 yv5Var = cw5Var2.a;
        if (i2 == 0) {
            while (yv5Var.a(zzzgVar)) {
                long jZzf = zzzgVar.zzf();
                long j = cw5Var2.f;
                cw5Var2.k = jZzf - j;
                d7G d7g = cw5Var2.j;
                zzed zzedVar = yv5Var.b;
                if (!cw5Var2.c(zzedVar, j, d7g)) {
                    zzaf zzafVar = (zzaf) cw5Var2.j.x;
                    cw5Var2.i = zzafVar.zzA;
                    if (!cw5Var2.m) {
                        cw5Var2.b.zzk(zzafVar);
                        cw5Var2.m = true;
                    }
                    aw5 aw5Var = (aw5) cw5Var2.j.y;
                    if (aw5Var == null) {
                        if (zzzgVar.zzd() == -1) {
                            cw5Var2.d = new xApe(0);
                        } else {
                            zv5 zv5Var = yv5Var.a;
                            cw5Var2.d = new qv5(cw5Var2, cw5Var2.f, zzzgVar.zzd(), zv5Var.d + zv5Var.e, zv5Var.b, (zv5Var.a & 4) != 0);
                        }
                        cw5Var2.h = 2;
                        if (zzedVar.zzH().length != 65025) {
                            zzedVar.zzD(Arrays.copyOf(zzedVar.zzH(), Math.max(65025, zzedVar.zzd())), zzedVar.zzd());
                        }
                        return 0;
                    }
                    cw5Var2.d = aw5Var;
                    cw5Var2.h = 2;
                    if (zzedVar.zzH().length != 65025) {
                        zzedVar.zzD(Arrays.copyOf(zzedVar.zzH(), Math.max(65025, zzedVar.zzd())), zzedVar.zzd());
                    }
                    return 0;
                }
                cw5Var2.f = zzzgVar.zzf();
            }
            cw5Var2.h = 3;
            return -1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                long jZzd = cw5Var2.d.zzd(zzzgVar);
                if (jZzd >= 0) {
                    zzaafVar.zza = jZzd;
                    return 1;
                }
                if (jZzd < -1) {
                    cw5Var2.d(-(jZzd + 2));
                }
                if (!cw5Var2.l) {
                    zzaai zzaaiVarZze = cw5Var2.d.zze();
                    zzdd.zzb(zzaaiVarZze);
                    cw5Var2.c.zzL(zzaaiVarZze);
                    cw5Var2.l = true;
                }
                if (cw5Var2.k > 0 || yv5Var.a(zzzgVar)) {
                    cw5Var2.k = 0L;
                    zzed zzedVar2 = yv5Var.b;
                    long jA = cw5Var2.a(zzedVar2);
                    if (jA >= 0) {
                        long j2 = cw5Var2.g;
                        if (j2 + jA >= cw5Var2.e) {
                            long j3 = (j2 * 1000000) / ((long) cw5Var2.i);
                            zzaak.zzb(cw5Var2.b, zzedVar2, zzedVar2.zzd());
                            cw5Var2.b.zzs(j3, 1, zzedVar2.zzd(), 0, null);
                            cw5Var2.e = -1L;
                        }
                    }
                    cw5Var2.g += jA;
                } else {
                    cw5Var2.h = 3;
                }
            }
            return -1;
        }
        ((zzyv) zzzgVar).zzo((int) cw5Var2.f, false);
        cw5Var2.h = 2;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.a = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        cw5 cw5Var = this.b;
        if (cw5Var != null) {
            yv5 yv5Var = cw5Var.a;
            zv5 zv5Var = yv5Var.a;
            zv5Var.a = 0;
            zv5Var.b = 0L;
            zv5Var.c = 0;
            zv5Var.d = 0;
            zv5Var.e = 0;
            yv5Var.b.zzC(0);
            yv5Var.c = -1;
            yv5Var.e = false;
            if (j == 0) {
                cw5Var.b(!cw5Var.l);
                return;
            }
            if (cw5Var.h != 0) {
                long j3 = (((long) cw5Var.i) * j2) / 1000000;
                cw5Var.e = j3;
                aw5 aw5Var = cw5Var.d;
                int i = zzel.zza;
                aw5Var.zzg(j3);
                cw5Var.h = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        try {
            return a(zzzgVar);
        } catch (zzbu unused) {
            return false;
        }
    }
}
