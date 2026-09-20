package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pz2 {
    public String a;
    public w91 b;
    public int c = -1;
    public int d = -1;

    public pz2(String str) {
        this.a = str;
    }

    public final int a() {
        w91 w91Var = this.b;
        if (w91Var == null) {
            return this.a.length();
        }
        return (w91Var.a - (w91Var.d - w91Var.c)) + (this.a.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        w91 w91Var = this.b;
        if (w91Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - iMin;
            ps0.m0(this.a, cArr, 0, i3, i);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            ps0.m0(this.a, cArr, i4, i2, i5);
            ps0.m0(str, cArr, iMin, 0, str.length());
            this.b = new w91(cArr, str.length() + iMin, i4);
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > w91Var.a - (w91Var.d - w91Var.c)) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length = str.length() - (i8 - i7);
        int i9 = w91Var.d - w91Var.c;
        if (length > i9) {
            int i10 = length - i9;
            int i11 = w91Var.a;
            do {
                i11 *= 2;
            } while (i11 - w91Var.a < i10);
            char[] cArr2 = new char[i11];
            System.arraycopy(w91Var.b, 0, cArr2, 0, w91Var.c - 0);
            int i12 = w91Var.a;
            int i13 = w91Var.d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            System.arraycopy(w91Var.b, i13, cArr2, i15, (i14 + i13) - i13);
            w91Var.b = cArr2;
            w91Var.a = i11;
            w91Var.d = i15;
        }
        int i16 = w91Var.c;
        if (i7 < i16 && i8 <= i16) {
            int i17 = i16 - i8;
            char[] cArr3 = w91Var.b;
            System.arraycopy(cArr3, i8, cArr3, w91Var.d - i17, i17);
            w91Var.c = i7;
            w91Var.d -= i17;
        } else if (i7 >= i16 || i8 < i16) {
            int i18 = w91Var.d;
            int i19 = i18 - i16;
            int i20 = i7 + i19;
            int i21 = i19 + i8;
            int i22 = i20 - i18;
            char[] cArr4 = w91Var.b;
            System.arraycopy(cArr4, i18, cArr4, i16, i22);
            w91Var.c += i22;
            w91Var.d = i21;
        } else {
            w91Var.d = (w91Var.d - i16) + i8;
            w91Var.c = i7;
        }
        ps0.m0(str, w91Var.b, w91Var.c, 0, str.length());
        w91Var.c = str.length() + w91Var.c;
    }

    public final String toString() {
        w91 w91Var = this.b;
        if (w91Var == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append(w91Var.b, 0, w91Var.c);
        char[] cArr = w91Var.b;
        int i = w91Var.d;
        sb.append(cArr, i, w91Var.a - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
