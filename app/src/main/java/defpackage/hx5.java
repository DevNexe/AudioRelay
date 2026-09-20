package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class hx5 implements zzaai {
    public final ex5 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public hx5(ex5 ex5Var, int i, long j, long j2) {
        this.a = ex5Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) ex5Var.c);
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        return zzel.zzw(j * ((long) this.b), 1000000L, this.a.b);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        ex5 ex5Var = this.a;
        long j2 = (((long) ex5Var.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d;
        long jZzr = zzel.zzr(j2, 0L, j3 - 1);
        int i = ex5Var.c;
        long jA = a(jZzr);
        long j4 = this.c;
        zzaaj zzaajVar = new zzaaj(jA, (((long) i) * jZzr) + j4);
        if (jA >= j || jZzr == j3 - 1) {
            return new zzaag(zzaajVar, zzaajVar);
        }
        long j5 = jZzr + 1;
        return new zzaag(zzaajVar, new zzaaj(a(j5), (j5 * ((long) ex5Var.c)) + j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
