package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class vz6 extends pz6 {
    public final byte[] y;

    public vz6(byte[] bArr) {
        bArr.getClass();
        this.y = bArr;
    }

    @Override // defpackage.a07
    public byte a(int i) {
        return this.y[i];
    }

    @Override // defpackage.a07
    public byte b(int i) {
        return this.y[i];
    }

    @Override // defpackage.a07
    public int c() {
        return this.y.length;
    }

    @Override // defpackage.a07
    public final int d(int i, int i2) {
        Charset charset = f27.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.y[i3];
        }
        return i;
    }

    @Override // defpackage.a07
    public final vz6 e() {
        int iM = a07.m(0, 47, c());
        return iM == 0 ? a07.x : new mz6(this.y, iM);
    }

    @Override // defpackage.a07
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a07) || c() != ((a07) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof vz6)) {
            return obj.equals(this);
        }
        vz6 vz6Var = (vz6) obj;
        int i = this.w;
        int i2 = vz6Var.w;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iC = c();
        if (iC > vz6Var.c()) {
            throw new IllegalArgumentException("Length too large: " + iC + c());
        }
        if (iC > vz6Var.c()) {
            throw new IllegalArgumentException(Md5A.e("Ran off end of other: 0, ", iC, ", ", vz6Var.c()));
        }
        vz6Var.r();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iC) {
            if (this.y[i3] != vz6Var.y[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // defpackage.a07
    public final String f(Charset charset) {
        return new String(this.y, 0, c(), charset);
    }

    @Override // defpackage.a07
    public final void g(j07 j07Var) {
        ((e07) j07Var).z(this.y, c());
    }

    @Override // defpackage.a07
    public final boolean h() {
        return s57.d(this.y, 0, c());
    }

    public void r() {
    }
}
