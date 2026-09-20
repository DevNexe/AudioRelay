package defpackage;

import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzaft;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class jv5 {
    public final zzaam a;
    public ov5 d;
    public hv5 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final nv5 b = new nv5();
    public final zzed c = new zzed();
    public final zzed j = new zzed(1);
    public final zzed k = new zzed();

    public jv5(zzaam zzaamVar, ov5 ov5Var, hv5 hv5Var) {
        this.a = zzaamVar;
        this.d = ov5Var;
        this.e = hv5Var;
        this.d = ov5Var;
        this.e = hv5Var;
        zzaamVar.zzk(ov5Var.a.zzf);
        c();
    }

    public final int a(int i, int i2) {
        zzed zzedVar;
        zzaft zzaftVarB = b();
        if (zzaftVarB == null) {
            return 0;
        }
        int length = zzaftVarB.zzd;
        nv5 nv5Var = this.b;
        if (length != 0) {
            zzedVar = nv5Var.n;
        } else {
            byte[] bArr = (byte[]) zzel.zzH(zzaftVarB.zze);
            length = bArr.length;
            zzed zzedVar2 = this.k;
            zzedVar2.zzD(bArr, length);
            zzedVar = zzedVar2;
        }
        boolean z = nv5Var.k && nv5Var.l[this.f];
        boolean z2 = z || i2 != 0;
        zzed zzedVar3 = this.j;
        zzedVar3.zzH()[0] = (byte) ((true != z2 ? 0 : 128) | length);
        zzedVar3.zzF(0);
        zzaam zzaamVar = this.a;
        zzaamVar.zzr(zzedVar3, 1, 1);
        zzaamVar.zzr(zzedVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        zzed zzedVar4 = this.c;
        if (!z) {
            zzedVar4.zzC(8);
            byte[] bArrZzH = zzedVar4.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 1;
            bArrZzH[2] = 0;
            bArrZzH[3] = (byte) i2;
            bArrZzH[4] = (byte) ((i >> 24) & 255);
            bArrZzH[5] = (byte) ((i >> 16) & 255);
            bArrZzH[6] = (byte) ((i >> 8) & 255);
            bArrZzH[7] = (byte) (i & 255);
            zzaamVar.zzr(zzedVar4, 8, 1);
            return length + 9;
        }
        zzed zzedVar5 = nv5Var.n;
        int iZzo = zzedVar5.zzo();
        zzedVar5.zzG(-2);
        int i3 = (iZzo * 6) + 2;
        if (i2 != 0) {
            zzedVar4.zzC(i3);
            byte[] bArrZzH2 = zzedVar4.zzH();
            zzedVar5.zzB(bArrZzH2, 0, i3);
            int i4 = (((bArrZzH2[2] & 255) << 8) | (bArrZzH2[3] & 255)) + i2;
            bArrZzH2[2] = (byte) ((i4 >> 8) & 255);
            bArrZzH2[3] = (byte) (i4 & 255);
        } else {
            zzedVar4 = zzedVar5;
        }
        zzaamVar.zzr(zzedVar4, i3, 1);
        return length + 1 + i3;
    }

    public final zzaft b() {
        if (!this.l) {
            return null;
        }
        nv5 nv5Var = this.b;
        hv5 hv5Var = nv5Var.a;
        int i = zzel.zza;
        int i2 = hv5Var.a;
        zzaft zzaftVarZza = nv5Var.m;
        if (zzaftVarZza == null) {
            zzaftVarZza = this.d.a.zza(i2);
        }
        if (zzaftVarZza == null || !zzaftVarZza.zza) {
            return null;
        }
        return zzaftVarZza;
    }

    public final void c() {
        nv5 nv5Var = this.b;
        nv5Var.d = 0;
        nv5Var.p = 0L;
        nv5Var.q = false;
        nv5Var.k = false;
        nv5Var.o = false;
        nv5Var.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }

    public final boolean d() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }
}
