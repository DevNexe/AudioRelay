package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i30 extends h30 {
    public final boolean c;

    public i30(dv1 dv1Var, boolean z) {
        super(dv1Var);
        this.c = z;
    }

    @Override // defpackage.h30
    public final void c(byte b) {
        String strA = tc5.a(b);
        if (this.c) {
            this.a.b(strA);
        } else {
            g(strA);
        }
    }

    @Override // defpackage.h30
    public final void e(int i) {
        String string = Long.toString(4294967295L & ((long) i), 10);
        if (this.c) {
            this.a.b(string);
        } else {
            g(string);
        }
    }

    @Override // defpackage.h30
    public final void f(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            this.a.b(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        g(str);
    }

    @Override // defpackage.h30
    public final void h(short s) {
        String strA = ed5.a(s);
        if (this.c) {
            this.a.b(strA);
        } else {
            g(strA);
        }
    }
}
