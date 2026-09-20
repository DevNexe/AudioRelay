package com.google.protobuf;

import defpackage.lk;
import defpackage.n54;
import java.nio.charset.Charset;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class YKK {
    public final CodedOutputStream a;

    public YKK(CodedOutputStream codedOutputStream) {
        Charset charset = SjP.a;
        if (codedOutputStream == null) {
            throw new NullPointerException("output");
        }
        this.a = codedOutputStream;
        codedOutputStream.w = this;
    }

    public final void a(int i, boolean z) {
        this.a.w1(i, z);
    }

    public final void b(int i, lk lkVar) {
        this.a.y1(i, lkVar);
    }

    public final void c(double d, int i) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        codedOutputStream.C1(i, Double.doubleToRawLongBits(d));
    }

    public final void d(int i, int i2) {
        this.a.E1(i, i2);
    }

    public final void e(int i, int i2) {
        this.a.A1(i, i2);
    }

    public final void f(int i, List<Integer> list, boolean z) {
        CodedOutputStream codedOutputStream = this.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.A1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).intValue();
            Logger logger = CodedOutputStream.x;
            i3 += 4;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.B1(list.get(i2).intValue());
            i2++;
        }
    }

    public final void g(int i, long j) {
        this.a.C1(i, j);
    }

    public final void h(int i, List<Long> list, boolean z) {
        CodedOutputStream codedOutputStream = this.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.C1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).longValue();
            Logger logger = CodedOutputStream.x;
            i3 += 8;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.D1(list.get(i2).longValue());
            i2++;
        }
    }

    public final void i(float f, int i) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        codedOutputStream.A1(i, Float.floatToRawIntBits(f));
    }

    public final void j(int i, n54 n54Var, Object obj) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.N1(i, 3);
        n54Var.a((DzVS) obj, codedOutputStream.w);
        codedOutputStream.N1(i, 4);
    }

    public final void k(int i, int i2) {
        this.a.E1(i, i2);
    }

    public final void l(int i, long j) {
        this.a.Q1(i, j);
    }

    public final void m(int i, List<Long> list, boolean z) {
        CodedOutputStream codedOutputStream = this.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.Q1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iT1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT1 += CodedOutputStream.t1(list.get(i3).longValue());
        }
        codedOutputStream.P1(iT1);
        while (i2 < list.size()) {
            codedOutputStream.R1(list.get(i2).longValue());
            i2++;
        }
    }

    public final void n(int i, n54 n54Var, Object obj) {
        this.a.H1(i, (DzVS) obj, n54Var);
    }

    public final void o(int i, Object obj) {
        boolean z = obj instanceof lk;
        CodedOutputStream codedOutputStream = this.a;
        if (z) {
            codedOutputStream.K1(i, (lk) obj);
        } else {
            codedOutputStream.J1(i, (DzVS) obj);
        }
    }

    public final void p(int i, int i2) {
        this.a.A1(i, i2);
    }

    public final void q(int i, long j) {
        this.a.C1(i, j);
    }

    public final void r(int i, int i2) {
        this.a.O1(i, (i2 >> 31) ^ (i2 << 1));
    }

    public final void s(int i, long j) {
        this.a.Q1(i, (j >> 63) ^ (j << 1));
    }

    public final void t(int i, int i2) {
        this.a.O1(i, i2);
    }

    public final void u(int i, long j) {
        this.a.Q1(i, j);
    }
}
