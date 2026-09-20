package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzun;
import com.google.android.gms.internal.ads.zzvc;
import com.google.android.gms.internal.ads.zzvo;

/* JADX INFO: loaded from: classes3.dex */
public final class vb7 extends ec7 implements Comparable {
    public final int A;
    public final boolean B;
    public final String C;
    public final zzvc D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final boolean K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final boolean P;
    public final boolean Q;

    public vb7(int i, zzcp zzcpVar, int i2, zzvc zzvcVar, int i3, boolean z, zzun zzunVar) {
        int i4;
        int iB;
        int iB2;
        boolean z2;
        super(i, zzcpVar, i2);
        this.D = zzvcVar;
        this.C = zzvo.c(this.z.zzd);
        int i5 = 0;
        this.E = zzvo.d(i3, false);
        int i6 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i6 >= zzvcVar.zzq.size()) {
                i6 = Integer.MAX_VALUE;
                iB = 0;
                break;
            } else {
                iB = zzvo.b(this.z, (String) zzvcVar.zzq.get(i6), false);
                if (iB > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.G = i6;
        this.F = iB;
        int i7 = this.z.zzf;
        this.H = Integer.bitCount(0);
        zzaf zzafVar = this.z;
        int i8 = zzafVar.zzf;
        this.K = 1 == (zzafVar.zze & 1);
        this.L = zzafVar.zzz;
        this.M = zzafVar.zzA;
        this.N = zzafVar.zzi;
        this.B = zzunVar.zza(zzafVar);
        String[] strArrZzaf = zzel.zzaf();
        int i9 = 0;
        while (true) {
            if (i9 >= strArrZzaf.length) {
                i9 = Integer.MAX_VALUE;
                iB2 = 0;
                break;
            } else {
                iB2 = zzvo.b(this.z, strArrZzaf[i9], false);
                if (iB2 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.I = i9;
        this.J = iB2;
        for (int i10 = 0; i10 < zzvcVar.zzu.size(); i10++) {
            String str = this.z.zzm;
            if (str != null && str.equals(zzvcVar.zzu.get(i10))) {
                i4 = i10;
                break;
            }
        }
        this.O = i4;
        this.P = (i3 & 128) == 128;
        this.Q = (i3 & 64) == 64;
        zzvc zzvcVar2 = this.D;
        if (zzvo.d(i3, zzvcVar2.zzQ) && ((z2 = this.B) || zzvcVar2.zzK)) {
            i5 = (!zzvo.d(i3, false) || !z2 || this.z.zzi == -1 || (!zzvcVar2.zzS && z)) ? 1 : 2;
        }
        this.A = i5;
    }

    @Override // defpackage.ec7
    public final int a() {
        return this.A;
    }

    @Override // defpackage.ec7
    public final /* bridge */ /* synthetic */ boolean c(ec7 ec7Var) {
        String str;
        int i;
        vb7 vb7Var = (vb7) ec7Var;
        boolean z = this.D.zzN;
        zzaf zzafVar = this.z;
        int i2 = zzafVar.zzz;
        if (i2 == -1) {
            return false;
        }
        zzaf zzafVar2 = vb7Var.z;
        return i2 == zzafVar2.zzz && (str = zzafVar.zzm) != null && TextUtils.equals(str, zzafVar2.zzm) && (i = zzafVar.zzA) != -1 && i == zzafVar2.zzA && this.P == vb7Var.P && this.Q == vb7Var.Q;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vb7 vb7Var) {
        boolean z = this.E;
        boolean z2 = this.B;
        zzfwd zzfwdVarZza = (z2 && z) ? zzvo.i : zzvo.i.zza();
        zzfuk zzfukVarZzc = zzfuk.zzj().zzd(z, vb7Var.E).zzc(Integer.valueOf(this.G), Integer.valueOf(vb7Var.G), zzfwd.zzc().zza()).zzb(this.F, vb7Var.F).zzb(this.H, vb7Var.H).zzd(this.K, vb7Var.K).zzd(true, true).zzc(Integer.valueOf(this.I), Integer.valueOf(vb7Var.I), zzfwd.zzc().zza()).zzb(this.J, vb7Var.J).zzd(z2, vb7Var.B).zzc(Integer.valueOf(this.O), Integer.valueOf(vb7Var.O), zzfwd.zzc().zza());
        int i = this.N;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = vb7Var.N;
        Integer numValueOf2 = Integer.valueOf(i2);
        boolean z3 = this.D.zzz;
        zzfwd zzfwdVar = zzvo.j;
        zzfuk zzfukVarZzc2 = zzfukVarZzc.zzc(numValueOf, numValueOf2, zzfwdVar).zzd(this.P, vb7Var.P).zzd(this.Q, vb7Var.Q).zzc(Integer.valueOf(this.L), Integer.valueOf(vb7Var.L), zzfwdVarZza).zzc(Integer.valueOf(this.M), Integer.valueOf(vb7Var.M), zzfwdVarZza);
        Integer numValueOf3 = Integer.valueOf(i);
        Integer numValueOf4 = Integer.valueOf(i2);
        if (!zzel.zzT(this.C, vb7Var.C)) {
            zzfwdVarZza = zzfwdVar;
        }
        return zzfukVarZzc2.zzc(numValueOf3, numValueOf4, zzfwdVarZza).zza();
    }
}
