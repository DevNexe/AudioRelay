package defpackage;

import com.google.android.gms.internal.ads.zzaak;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;

/* JADX INFO: loaded from: classes3.dex */
public final class dx5 implements cx5 {
    public final zzzi a;
    public final zzaam b;
    public final ex5 c;
    public final zzaf d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public dx5(zzzi zzziVar, zzaam zzaamVar, ex5 ex5Var, String str, int i) throws zzbu {
        this.a = zzziVar;
        this.b = zzaamVar;
        this.c = ex5Var;
        int i2 = ex5Var.d;
        int i3 = ex5Var.a;
        int i4 = (i2 * i3) / 8;
        int i5 = ex5Var.c;
        if (i5 != i4) {
            throw zzbu.zza("Expected block size: " + i4 + "; got: " + i5, null);
        }
        int i6 = ex5Var.b;
        int i7 = i6 * i4;
        int i8 = i7 * 8;
        int iMax = Math.max(i4, i7 / 10);
        this.e = iMax;
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        zzadVar.zzv(i8);
        zzadVar.zzO(i8);
        zzadVar.zzL(iMax);
        zzadVar.zzw(i3);
        zzadVar.zzT(i6);
        zzadVar.zzN(i);
        this.d = zzadVar.zzY();
    }

    @Override // defpackage.cx5
    public final boolean a(zzzg zzzgVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iZza = zzaak.zza(this.b, zzzgVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.g += iZza;
                j2 -= (long) iZza;
            }
        }
        ex5 ex5Var = this.c;
        int i3 = ex5Var.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long jZzw = zzel.zzw(this.h, 1000000L, ex5Var.b);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.zzs(j3 + jZzw, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.cx5
    public final void zza(int i, long j) {
        this.a.zzL(new hx5(this.c, 1, i, j));
        this.b.zzk(this.d);
    }

    @Override // defpackage.cx5
    public final void zzb(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }
}
