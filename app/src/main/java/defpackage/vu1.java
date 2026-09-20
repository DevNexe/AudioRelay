package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vu1 implements dv1 {
    public char[] a;
    public int b;

    public vu1() {
        char[] cArr;
        synchronized (ep.a) {
            syh<char[]> syhVar = ep.b;
            cArr = null;
            char[] cArrRemoveLast = syhVar.isEmpty() ? null : syhVar.removeLast();
            if (cArrRemoveLast != null) {
                ep.c -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        this.a = cArr == null ? new char[128] : cArr;
    }

    @Override // defpackage.dv1
    public final void a(char c) {
        d(this.b, 1);
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.dv1
    public final void b(String str) {
        byte b;
        d(this.b, str.length() + 2);
        char[] cArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = uu4.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    d(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = uu4.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        this.a[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = uu4.a[cCharAt];
                        d(i4, str2.length());
                        str2.getChars(0, str2.length(), this.a, i4);
                        int length3 = str2.length() + i4;
                        this.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = this.a;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        this.b = i4;
                    }
                }
                d(i4, 1);
                this.a[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    @Override // defpackage.dv1
    public final void c(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        d(this.b, length);
        str.getChars(0, str.length(), this.a, this.b);
        this.b += length;
    }

    public final void d(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.a = Arrays.copyOf(cArr, i3);
        }
    }

    public final void e() {
        ep epVar = ep.a;
        char[] cArr = this.a;
        synchronized (epVar) {
            int i = ep.c;
            if (cArr.length + i < ep.d) {
                ep.c = i + cArr.length;
                ep.b.addLast(cArr);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }

    @Override // defpackage.dv1
    public final void writeLong(long j) {
        c(String.valueOf(j));
    }
}
