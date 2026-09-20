package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f12 implements k02 {
    public final int a;
    public final int b;
    public final Object c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final List<d12> i;
    public final m02 j;
    public final long k;
    public final boolean l;

    public f12() {
        throw null;
    }

    public f12(int i, int i2, Object obj, int i3, int i4, int i5, int i6, boolean z, ArrayList arrayList, m02 m02Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.i = arrayList;
        this.j = m02Var;
        this.k = j;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i7 = 0; i7 < size; i7++) {
            if (b(i7) != null) {
                z2 = true;
                break;
            }
        }
        this.l = z2;
    }

    @Override // defpackage.k02
    public final int a() {
        return this.d;
    }

    public final lx0<mp1> b(int i) {
        Object obj = this.i.get(i).c;
        if (obj instanceof lx0) {
            return (lx0) obj;
        }
        return null;
    }

    public final int c(int i) {
        b43 b43Var = this.i.get(i).b;
        return this.h ? b43Var.x : b43Var.w;
    }

    public final long d(int i) {
        return this.i.get(i).a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(b43.QnHx qnHx) {
        List<d12> list;
        int i;
        int i2;
        b43 b43Var;
        boolean z;
        long jD;
        int i3;
        List<d12> list2 = this.i;
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            b43 b43Var2 = list2.get(i4).b;
            boolean z2 = this.h;
            int i5 = this.f - (z2 ? b43Var2.x : b43Var2.w);
            if (b(i4) != null) {
                long jD2 = d(i4);
                m02 m02Var = this.j;
                gs1 gs1Var = (gs1) m02Var.c.get(this.c);
                if (gs1Var == null) {
                    i = size;
                    i3 = i4;
                    b43Var = b43Var2;
                    z = z2;
                    list = list2;
                    jD = jD2;
                } else {
                    c43 c43Var = (c43) gs1Var.b.get(i4);
                    long j = c43Var.b.d().a;
                    long j2 = gs1Var.a;
                    list = list2;
                    i = size;
                    jD = C0239D.d(((int) (j >> 32)) + ((int) (j2 >> 32)), mp1.a(j2) + mp1.a(j));
                    long j3 = c43Var.c;
                    long j4 = gs1Var.a;
                    i3 = i4;
                    b43Var = b43Var2;
                    z = z2;
                    long jD3 = C0239D.d(((int) (j3 >> 32)) + ((int) (j4 >> 32)), mp1.a(j4) + mp1.a(j3));
                    if (((Boolean) c43Var.d.getValue()).booleanValue()) {
                        if (m02Var.c(jD3) >= i5 || m02Var.c(jD) >= i5) {
                            int iC = m02Var.c(jD3);
                            int i6 = this.g;
                            if (iC <= i6 || m02Var.c(jD) <= i6) {
                            }
                        }
                        fp1.k0(m02Var.a, null, 0, new l02(c43Var, null), 3);
                    }
                }
                i2 = i3;
            } else {
                list = list2;
                i = size;
                i2 = i4;
                b43Var = b43Var2;
                z = z2;
                jD = d(i2);
            }
            long j5 = this.k;
            if (z) {
                b43.QnHx.j(qnHx, b43Var, C0239D.d(((int) (jD >> 32)) + ((int) (j5 >> 32)), mp1.a(j5) + mp1.a(jD)));
            } else {
                b43 b43Var3 = b43Var;
                long jD4 = C0239D.d(((int) (jD >> 32)) + ((int) (j5 >> 32)), mp1.a(j5) + mp1.a(jD));
                b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
                d43.QnHx qnHx2 = d43.a;
                if (qnHx.a() == jy1.Ltr || qnHx.b() == 0) {
                    long jG0 = b43Var3.g0();
                    b43Var3.m0(C0239D.d(((int) (jD4 >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(jD4)), 0.0f, qnHx2);
                } else {
                    long jD5 = C0239D.d((qnHx.b() - ((int) (b43Var3.y >> 32))) - ((int) (jD4 >> 32)), mp1.a(jD4));
                    long jG1 = b43Var3.g0();
                    b43Var3.m0(C0239D.d(((int) (jD5 >> 32)) + ((int) (jG1 >> 32)), mp1.a(jG1) + mp1.a(jD5)), 0.0f, qnHx2);
                }
            }
            i4 = i2 + 1;
            list2 = list;
            size = i;
        }
    }

    @Override // defpackage.k02
    public final int getIndex() {
        return this.b;
    }

    @Override // defpackage.k02
    public final int getOffset() {
        return this.a;
    }
}
