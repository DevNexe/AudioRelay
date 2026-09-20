package defpackage;

import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzvc;
import com.google.android.gms.internal.ads.zzvo;

/* JADX INFO: loaded from: classes3.dex */
public final class dc7 extends ec7 implements Comparable {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;

    public dc7(int i, zzcp zzcpVar, int i2, zzvc zzvcVar, int i3, String str) {
        int iB;
        super(i, zzcpVar, i2);
        int i4 = 0;
        this.B = zzvo.d(i3, false);
        int i5 = this.z.zze;
        int i6 = zzvcVar.zzx;
        this.C = 1 == (i5 & 1);
        this.D = (i5 & 2) != 0;
        zzfuv zzfuvVarZzp = zzvcVar.zzv.isEmpty() ? zzfuv.zzp("") : zzvcVar.zzv;
        int i7 = 0;
        while (true) {
            if (i7 >= zzfuvVarZzp.size()) {
                i7 = Integer.MAX_VALUE;
                iB = 0;
                break;
            } else {
                iB = zzvo.b(this.z, (String) zzfuvVarZzp.get(i7), false);
                if (iB > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.E = i7;
        this.F = iB;
        int i8 = this.z.zzf;
        int iBitCount = Integer.bitCount(0);
        this.G = iBitCount;
        int i9 = this.z.zzf;
        int iB2 = zzvo.b(this.z, str, zzvo.c(str) == null);
        this.H = iB2;
        boolean z = iB > 0 || (zzvcVar.zzv.isEmpty() && iBitCount > 0) || this.C || (this.D && iB2 > 0);
        if (zzvo.d(i3, zzvcVar.zzQ) && z) {
            i4 = 1;
        }
        this.A = i4;
    }

    @Override // defpackage.ec7
    public final int a() {
        return this.A;
    }

    @Override // defpackage.ec7
    public final /* bridge */ /* synthetic */ boolean c(ec7 ec7Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dc7 dc7Var) {
        zzfuk zzfukVarZzc = zzfuk.zzj().zzd(this.B, dc7Var.B).zzc(Integer.valueOf(this.E), Integer.valueOf(dc7Var.E), zzfwd.zzc().zza());
        int i = dc7Var.F;
        int i2 = this.F;
        zzfuk zzfukVarZzb = zzfukVarZzc.zzb(i2, i);
        int i3 = dc7Var.G;
        int i4 = this.G;
        zzfuk zzfukVarZzb2 = zzfukVarZzb.zzb(i4, i3).zzd(this.C, dc7Var.C).zzc(Boolean.valueOf(this.D), Boolean.valueOf(dc7Var.D), i2 == 0 ? zzfwd.zzc() : zzfwd.zzc().zza()).zzb(this.H, dc7Var.H);
        if (i4 == 0) {
            zzfukVarZzb2 = zzfukVarZzb2.zze(false, false);
        }
        return zzfukVarZzb2.zza();
    }
}
