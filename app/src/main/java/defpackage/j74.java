package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j74 extends mk {
    public final transient byte[][] A;
    public final transient int[] B;

    public j74(byte[][] bArr, int[] iArr) {
        super(mk.z.w);
        this.A = bArr;
        this.B = iArr;
    }

    @Override // defpackage.mk
    public final String a() {
        return new mk(o()).a();
    }

    @Override // defpackage.mk
    public final int c() {
        return this.B[this.A.length - 1];
    }

    @Override // defpackage.mk
    public final String d() {
        byte[] bArrO = o();
        char[] cArr = new char[bArrO.length * 2];
        int length = bArrO.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArrO[i];
            i++;
            int i3 = i2 + 1;
            char[] cArr2 = m57.D;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.mk
    public final byte[] e() {
        return o();
    }

    @Override // defpackage.mk
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mk) {
                mk mkVar = (mk) obj;
                if (mkVar.c() != c() || !m(mkVar, c())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.mk
    public final byte g(int i) {
        byte[][] bArr = this.A;
        int length = bArr.length - 1;
        int[] iArr = this.B;
        cp5.a(iArr[length], i, 1L);
        int iK = AY.K(this, i);
        return bArr[iK][(i - (iK == 0 ? 0 : iArr[iK - 1])) + iArr[bArr.length + iK]];
    }

    @Override // defpackage.mk
    public final int hashCode() {
        int i = this.x;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.B;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.x = i3;
        return i3;
    }

    @Override // defpackage.mk
    public final boolean l(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iK = AY.K(this, i);
        while (true) {
            boolean z = true;
            if (i >= i4) {
                return true;
            }
            int[] iArr = this.B;
            int i5 = iK == 0 ? 0 : iArr[iK - 1];
            int i6 = iArr[iK] - i5;
            byte[][] bArr2 = this.A;
            int i7 = iArr[bArr2.length + iK];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            byte[] bArr3 = bArr2[iK];
            gg.QnHx qnHx = cp5.a;
            if (iMin > 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9 + 1;
                    if (bArr3[i9 + i8] != bArr[i9 + i2]) {
                        z = false;
                        break;
                    }
                    if (i10 >= iMin) {
                        break;
                    }
                    i9 = i10;
                }
            }
            if (!z) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iK++;
        }
    }

    @Override // defpackage.mk
    public final boolean m(mk mkVar, int i) {
        if (c() - i < 0) {
            return false;
        }
        int i2 = i + 0;
        int iK = AY.K(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = this.B;
            int i5 = iK == 0 ? 0 : iArr[iK - 1];
            int i6 = iArr[iK] - i5;
            byte[][] bArr = this.A;
            int i7 = iArr[bArr.length + iK];
            int iMin = Math.min(i2, i6 + i5) - i3;
            if (!mkVar.l(i4, (i3 - i5) + i7, iMin, bArr[iK])) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iK++;
        }
        return true;
    }

    @Override // defpackage.mk
    public final mk n() {
        return new mk(o()).n();
    }

    @Override // defpackage.mk
    public final byte[] o() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.A;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.B;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.mk
    public final void q(gg ggVar, int i) {
        int i2 = 0 + i;
        int iK = AY.K(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.B;
            int i4 = iK == 0 ? 0 : iArr[iK - 1];
            int i5 = iArr[iK] - i4;
            byte[][] bArr = this.A;
            int i6 = iArr[bArr.length + iK];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            g74 g74Var = new g74(bArr[iK], i7, i7 + iMin, true, false);
            g74 g74Var2 = ggVar.w;
            if (g74Var2 == null) {
                g74Var.g = g74Var;
                g74Var.f = g74Var;
                ggVar.w = g74Var;
            } else {
                g74Var2.g.b(g74Var);
            }
            i3 += iMin;
            iK++;
        }
        ggVar.x += (long) i;
    }

    @Override // defpackage.mk
    public final String toString() {
        return new mk(o()).toString();
    }
}
