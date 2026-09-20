package defpackage;

import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzj;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class qv5 implements aw5 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final zv5 w;
    public final long x;
    public final long y;
    public final cw5 z;

    public qv5(cw5 cw5Var, long j, long j2, long j3, long j4, boolean z) {
        zzdd.zzd(j >= 0 && j2 > j);
        this.z = cw5Var;
        this.x = j;
        this.y = j2;
        if (j3 == j2 - j || z) {
            this.B = j4;
            this.A = 4;
        } else {
            this.A = 0;
        }
        this.w = new zv5();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    @Override // defpackage.aw5
    public final long zzd(zzzg zzzgVar) throws IOException {
        long jZzr;
        long j;
        int i = this.A;
        long j2 = this.y;
        zv5 zv5Var = this.w;
        if (i == 0) {
            long jZzf = zzzgVar.zzf();
            this.C = jZzf;
            this.A = 1;
            long j3 = (-65307) + j2;
            if (j3 > jZzf) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.E;
                long j5 = this.F;
                if (j4 == j5) {
                    jZzr = -1;
                    j = -1;
                } else {
                    long jZzf2 = zzzgVar.zzf();
                    if (zv5Var.b(zzzgVar, j5)) {
                        zv5Var.a(zzzgVar, false);
                        zzzgVar.zzj();
                        long j6 = this.D;
                        long j7 = zv5Var.b;
                        long j8 = j6 - j7;
                        int i2 = zv5Var.d + zv5Var.e;
                        if (j8 < 0 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.F = jZzf2;
                                this.H = j7;
                            } else {
                                this.E = zzzgVar.zzf() + ((long) i2);
                                this.G = j7;
                            }
                            long j9 = this.F;
                            long j10 = this.E;
                            long j11 = j9 - j10;
                            if (j11 < 100000) {
                                this.F = j10;
                                jZzr = j10;
                            } else {
                                long jZzf3 = ((j8 * j11) / (this.H - this.G)) + (zzzgVar.zzf() - (((long) i2) * (j8 <= 0 ? 2L : 1L)));
                                j = -1;
                                jZzr = zzel.zzr(jZzf3, j10, j9 - 1);
                            }
                        } else {
                            jZzr = -1;
                            j = -1;
                        }
                    } else {
                        jZzr = this.E;
                        if (jZzr == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    j = -1;
                }
                if (jZzr != j) {
                    return jZzr;
                }
                this.A = 3;
            } else {
                if (i != 3) {
                    return -1L;
                }
                j = -1;
            }
            while (true) {
                zv5Var.b(zzzgVar, j);
                zv5Var.a(zzzgVar, false);
                if (zv5Var.b > this.D) {
                    zzzgVar.zzj();
                    this.A = 4;
                    return -(this.G + 2);
                }
                ((zzyv) zzzgVar).zzo(zv5Var.d + zv5Var.e, false);
                this.E = zzzgVar.zzf();
                this.G = zv5Var.b;
                j = -1;
            }
        }
        zv5Var.a = 0;
        zv5Var.b = 0L;
        zv5Var.c = 0;
        zv5Var.d = 0;
        zv5Var.e = 0;
        if (!zv5Var.b(zzzgVar, -1L)) {
            throw new EOFException();
        }
        zv5Var.a(zzzgVar, false);
        ((zzyv) zzzgVar).zzo(zv5Var.d + zv5Var.e, false);
        long j12 = zv5Var.b;
        while ((zv5Var.a & 4) != 4 && zv5Var.b(zzzgVar, -1L) && zzzgVar.zzf() < j2 && zv5Var.a(zzzgVar, true) && zzzj.zze(zzzgVar, zv5Var.d + zv5Var.e)) {
            j12 = zv5Var.b;
        }
        this.B = j12;
        this.A = 4;
        return this.C;
    }

    @Override // defpackage.aw5
    public final /* bridge */ /* synthetic */ zzaai zze() {
        if (this.B != 0) {
            return new pv5(this);
        }
        return null;
    }

    @Override // defpackage.aw5
    public final void zzg(long j) {
        this.D = zzel.zzr(j, 0L, (-1) + this.B);
        this.A = 2;
        this.E = this.x;
        this.F = this.y;
        this.G = 0L;
        this.H = this.B;
    }
}
