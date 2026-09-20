package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public boolean f;
    public int g = 1;

    public r0(long j, long j2, long j3) {
        this.a = j2;
        this.b = j3;
        this.c = Math.max(1000L, j);
    }

    public final void a(int i) {
        int i2 = this.g;
        boolean z = false;
        boolean z2 = i2 == 2 && i == 3;
        if (i2 == 3 && i == 2) {
            z = true;
        }
        if (!z2 && !z) {
            a62 a62Var = a62.a;
        }
        this.g = i;
    }

    public final int b(long j) {
        int iH = O.h(this.g);
        if (iH == 0) {
            if (j < this.a) {
                a(4);
            } else {
                a(2);
            }
            return b(j);
        }
        if (iH != 1) {
            if (iH != 2) {
                if (iH == 3) {
                    if (j < this.a) {
                        a62 a62Var = a62.a;
                        return 2;
                    }
                    a62 a62Var2 = a62.a;
                    a(2);
                    return 4;
                }
                if (iH != 4) {
                    if (iH != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (j <= this.a) {
                        a62 a62Var3 = a62.a;
                        a(2);
                    }
                    return 1;
                }
                if (zs.QnHx.a.c() - this.e >= 1000) {
                    if (this.f) {
                        a(6);
                        return 1;
                    }
                    a(2);
                } else if (j > this.b) {
                    a62 a62Var4 = a62.a;
                    this.f = true;
                }
            } else if (j >= this.a) {
                a(2);
            } else if (zs.QnHx.a.c() - this.d >= this.c) {
                a(4);
                return 3;
            }
        } else if (j < this.a) {
            this.d = zs.QnHx.a.c();
            a(3);
        } else if (j > this.b) {
            this.e = zs.QnHx.a.c();
            this.f = false;
            a(5);
        }
        return 5;
    }
}
