package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzvc;
import com.google.android.gms.internal.ads.zzvo;

/* JADX INFO: loaded from: classes3.dex */
public final class fc7 extends ec7 {
    public final boolean A;
    public final zzvc B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final int L;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    public fc7(int i, zzcp zzcpVar, int i2, zzvc zzvcVar, int i3, boolean z) {
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        byte b;
        zzaf zzafVar;
        int i5;
        int i6;
        int i7;
        super(i, zzcpVar, i2);
        this.B = zzvcVar;
        int i8 = 1;
        int i9 = true != zzvcVar.zzI ? 16 : 24;
        if (z) {
            zzaf zzafVar2 = this.z;
            int i10 = zzafVar2.zzr;
            float f = zzafVar2.zzt;
            if (f == -1.0f || f <= 2.14748365E9f) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.A = z2;
        if (!z || (((i5 = (zzafVar = this.z).zzr) != -1 && i5 < 0) || ((i6 = zzafVar.zzs) != -1 && i6 < 0))) {
            z3 = false;
        } else {
            float f2 = zzafVar.zzt;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i7 = zzafVar.zzi) == -1 || i7 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.C = z3;
        this.D = zzvo.d(i3, false);
        zzaf zzafVar3 = this.z;
        this.E = zzafVar3.zzi;
        this.F = zzafVar3.zza();
        int i11 = this.z.zzf;
        this.H = Integer.bitCount(0);
        int i12 = this.z.zzf;
        int i13 = 0;
        while (true) {
            if (i13 >= zzvcVar.zzo.size()) {
                i13 = Integer.MAX_VALUE;
                break;
            }
            String str = this.z.zzm;
            if (str != null && str.equals(zzvcVar.zzo.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        this.G = i13;
        this.J = (i3 & 128) == 128;
        this.K = (i3 & 64) == 64;
        zzaf zzafVar4 = this.z;
        String str2 = zzafVar4.zzm;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = 3;
            switch (str2) {
                case "video/av01":
                    b = 0;
                    break;
                case "video/hevc":
                    b = 1;
                    break;
                case "video/avc":
                    b = 3;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i4 = 4;
            } else if (b != 1) {
                if (b == 2) {
                    i4 = 2;
                } else if (b != 3) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            }
        }
        this.L = i4;
        zzvc zzvcVar2 = this.B;
        if (!zzvo.d(i3, zzvcVar2.zzQ) || (!(z4 = this.A) && !zzvcVar2.zzG)) {
            i8 = 0;
        } else if (zzvo.d(i3, false) && this.C && z4 && zzafVar4.zzi != -1 && (i9 & i3) != 0) {
            i8 = 2;
        }
        this.I = i8;
    }

    @Override // defpackage.ec7
    public final int a() {
        return this.I;
    }

    @Override // defpackage.ec7
    public final /* bridge */ /* synthetic */ boolean c(ec7 ec7Var) {
        fc7 fc7Var = (fc7) ec7Var;
        if (!zzel.zzT(this.z.zzm, fc7Var.z.zzm)) {
            return false;
        }
        boolean z = this.B.zzJ;
        return this.J == fc7Var.J && this.K == fc7Var.K;
    }
}
