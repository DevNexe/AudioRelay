package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b84 {
    public final s84 a;
    public vb1 d;
    public ys e;
    public x55 f;
    public kt2 i;
    public iy1 j;
    public final kz2 k;
    public final kz2 l;
    public final kz2 m;
    public final kz2 n;
    public final kz2 o;
    public final kz2 p;
    public final kz2 b = ps0.R(null);
    public j81<? super n74, sd5> c = T23.w;
    public final b31 g = new b31();
    public final kz2 h = ps0.R(Boolean.FALSE);

    public static final class CQf extends cx1 implements y81<iy1, kt2, o74, sd5> {
        public CQf() {
            super(3);
        }

        @Override // defpackage.y81
        public final sd5 invoke(iy1 iy1Var, kt2 kt2Var, o74 o74Var) {
            long j = kt2Var.a;
            o74 o74Var2 = o74Var;
            b84 b84Var = b84.this;
            kt2 kt2VarA = b84Var.a(iy1Var, j);
            if (kt2VarA != null) {
                b84 b84Var2 = b84.this;
                long j2 = kt2VarA.a;
                b84Var2.l(j2, j2, null, false, o74Var2);
                b84Var.g.a();
                b84Var.e();
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Long, sd5> {
        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            vb1 vb1Var;
            long jLongValue = l.longValue();
            b84 b84Var = b84.this;
            n74 n74VarD = b84Var.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            iy1 iy1VarG = b84Var.g();
            s84 s84Var = b84Var.a;
            ArrayList arrayListK = s84Var.k(iy1VarG);
            int size = arrayListK.size();
            n74 n74VarC = null;
            for (int i = 0; i < size; i++) {
                k74 k74Var = (k74) arrayListK.get(i);
                n74 n74VarE = k74Var.d() == jLongValue ? k74Var.e() : null;
                if (n74VarE != null) {
                    linkedHashMap.put(Long.valueOf(k74Var.d()), n74VarE);
                }
                n74VarC = j84.c(n74VarC, n74VarE);
            }
            if (!ur1.a(n74VarC, n74VarD) && (vb1Var = b84Var.d) != null) {
                vb1Var.a();
            }
            if (!ur1.a(n74VarC, b84Var.d())) {
                s84Var.l.setValue(linkedHashMap);
                b84Var.c.invoke(n74VarC);
            }
            b84Var.g.a();
            b84Var.e();
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements c91<iy1, kt2, kt2, Boolean, o74, Boolean> {
        public LPt8Fixed() {
            super(5);
        }

        @Override // defpackage.c91
        public final Boolean j0(iy1 iy1Var, kt2 kt2Var, kt2 kt2Var2, Boolean bool, o74 o74Var) {
            iy1 iy1Var2 = iy1Var;
            long j = kt2Var.a;
            long j2 = kt2Var2.a;
            b84 b84Var = b84.this;
            return Boolean.valueOf(b84Var.m(b84Var.a(iy1Var2, j), b84Var.a(iy1Var2, j2), bool.booleanValue(), o74Var));
        }
    }

    public static final class NUlFixed extends cx1 implements h81<sd5> {
        public NUlFixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            b84 b84Var = b84.this;
            b84Var.j();
            b84Var.i(null);
            b84Var.h(null);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<Long, sd5> {
        public QnHx() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0034  */
        /* JADX WARN: Code duplicated, block: B:22:0x003d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0041  */
        /* JADX WARN: Code duplicated, block: B:26:0x0047  */
        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            x55 x55Var;
            n74.QnHx qnHx;
            n74.QnHx qnHx2;
            long jLongValue = l.longValue();
            b84 b84Var = b84.this;
            n74 n74VarD = b84Var.d();
            if ((n74VarD == null || (qnHx2 = n74VarD.a) == null || jLongValue != qnHx2.c) ? false : true) {
                b84Var.k();
                if (b84Var.c()) {
                    x55Var = b84Var.f;
                    if ((x55Var != null ? x55Var.c() : 0) == 1) {
                        b84Var.j();
                    }
                }
            } else {
                n74 n74VarD2 = b84Var.d();
                if ((n74VarD2 == null || (qnHx = n74VarD2.b) == null || jLongValue != qnHx.c) ? false : true) {
                    b84Var.k();
                    if (b84Var.c()) {
                        x55Var = b84Var.f;
                        if ((x55Var != null ? x55Var.c() : 0) == 1) {
                            b84Var.j();
                        }
                    }
                }
            }
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements j81<n74, sd5> {
        public static final T23 w = new T23();

        public T23() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(n74 n74Var) {
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements j81<Long, sd5> {
        public YKK() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            Long lValueOf = Long.valueOf(l.longValue());
            b84 b84Var = b84.this;
            if (b84Var.a.i().containsKey(lValueOf)) {
                b84Var.f();
                b84Var.b.setValue(null);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements j81<Long, sd5> {
        public auxFixed() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0033  */
        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            n74.QnHx qnHx;
            n74.QnHx qnHx2;
            long jLongValue = l.longValue();
            b84 b84Var = b84.this;
            n74 n74VarD = b84Var.d();
            if ((n74VarD == null || (qnHx2 = n74VarD.a) == null || jLongValue != qnHx2.c) ? false : true) {
                b84Var.m.setValue(null);
                b84Var.n.setValue(null);
            } else {
                n74 n74VarD2 = b84Var.d();
                if ((n74VarD2 == null || (qnHx = n74VarD2.b) == null || jLongValue != qnHx.c) ? false : true) {
                    b84Var.m.setValue(null);
                    b84Var.n.setValue(null);
                }
            }
            return sd5.a;
        }
    }

    public static final class byN extends cx1 implements h81<sd5> {
        public byN() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
        @Override // defpackage.h81
        public final sd5 invoke() {
            ys ysVar;
            int i;
            ArrayList arrayList;
            n74 n74Var;
            b84 b84Var = b84.this;
            ArrayList arrayListK = b84Var.a.k(b84Var.g());
            n74 n74VarD = b84Var.d();
            Z7jl z7jlA = null;
            if (n74VarD != null) {
                int size = arrayListK.size();
                int i2 = 0;
                while (i2 < size) {
                    k74 k74Var = (k74) arrayListK.get(i2);
                    long jD = k74Var.d();
                    n74.QnHx qnHx = n74VarD.a;
                    long j = qnHx.c;
                    n74.QnHx qnHx2 = n74VarD.b;
                    if (jD == j || k74Var.d() == qnHx2.c || z7jlA != null) {
                        Z7jl text = k74Var.getText();
                        long jD2 = k74Var.d();
                        i = i2;
                        long j2 = qnHx.c;
                        boolean z = n74VarD.c;
                        if (jD2 != j2) {
                            arrayList = arrayListK;
                            n74Var = n74VarD;
                            if (k74Var.d() != qnHx2.c) {
                            }
                            if (z7jlA != null) {
                                z7jlA = z7jlA.a(text);
                            } else {
                                z7jlA = text;
                            }
                            if ((k74Var.d() != qnHx2.c && !z) || (k74Var.d() == j2 && z)) {
                                break;
                            }
                        } else {
                            arrayList = arrayListK;
                            n74Var = n74VarD;
                        }
                        long jD3 = k74Var.d();
                        int i3 = qnHx.b;
                        if (jD3 == j2 && k74Var.d() == qnHx2.c) {
                            int i4 = qnHx2.b;
                            text = z ? text.subSequence(i4, i3) : text.subSequence(i3, i4);
                        } else if (k74Var.d() == j2) {
                            text = z ? text.subSequence(0, i3) : text.subSequence(i3, text.length());
                        } else {
                            text = z ? text.subSequence(qnHx2.b, text.length()) : text.subSequence(0, qnHx2.b);
                        }
                        if (z7jlA != null) {
                            z7jlA = z7jlA.a(text);
                        } else {
                            z7jlA = text;
                        }
                        if (k74Var.d() != qnHx2.c) {
                        }
                    } else {
                        arrayList = arrayListK;
                        n74Var = n74VarD;
                        i = i2;
                    }
                    i2 = i + 1;
                    arrayListK = arrayList;
                    n74VarD = n74Var;
                }
            }
            if (z7jlA != null && (ysVar = b84Var.e) != null) {
                ysVar.a(z7jlA);
            }
            b84Var.f();
            return sd5.a;
        }
    }

    public b84(s84 s84Var) {
        this.a = s84Var;
        long j = kt2.b;
        this.k = ps0.R(new kt2(j));
        this.l = ps0.R(new kt2(j));
        this.m = ps0.R(null);
        this.n = ps0.R(null);
        this.o = ps0.R(null);
        this.p = ps0.R(null);
        s84Var.e = new QnHx();
        s84Var.f = new CQf();
        s84Var.g = new F1();
        s84Var.h = new LPt8Fixed();
        s84Var.i = new NUlFixed();
        s84Var.j = new YKK();
        s84Var.k = new auxFixed();
    }

    public final kt2 a(iy1 iy1Var, long j) {
        iy1 iy1Var2 = this.j;
        if (iy1Var2 == null || !iy1Var2.q()) {
            return null;
        }
        return new kt2(g().L(iy1Var, j));
    }

    public final k74 b(n74.QnHx qnHx) {
        return (k74) this.a.c.get(Long.valueOf(qnHx.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n74 d() {
        return (n74) this.b.getValue();
    }

    public final void e() {
        x55 x55Var;
        if (c()) {
            x55 x55Var2 = this.f;
            if ((x55Var2 != null ? x55Var2.c() : 0) != 1 || (x55Var = this.f) == null) {
                return;
            }
            x55Var.a();
        }
    }

    public final void f() {
        this.a.l.setValue(ds0.w);
        e();
        if (d() != null) {
            this.c.invoke(null);
            vb1 vb1Var = this.d;
            if (vb1Var != null) {
                vb1Var.a();
            }
        }
    }

    public final iy1 g() {
        iy1 iy1Var = this.j;
        if (!(iy1Var != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (iy1Var.q()) {
            return iy1Var;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void h(kt2 kt2Var) {
        this.p.setValue(kt2Var);
    }

    public final void i(eb1 eb1Var) {
        this.o.setValue(eb1Var);
    }

    public final void j() {
        x55 x55Var;
        iy1 iy1VarF;
        iy1 iy1VarF2;
        iy1 iy1Var;
        if (!c() || d() == null || (x55Var = this.f) == null) {
            return;
        }
        n74 n74VarD = d();
        dl3 dl3Var = dl3.e;
        if (n74VarD != null) {
            n74.QnHx qnHx = n74VarD.a;
            k74 k74VarB = b(qnHx);
            n74.QnHx qnHx2 = n74VarD.b;
            k74 k74VarB2 = b(qnHx2);
            if (k74VarB != null && (iy1VarF = k74VarB.f()) != null && k74VarB2 != null && (iy1VarF2 = k74VarB2.f()) != null && (iy1Var = this.j) != null && iy1Var.q()) {
                long jL = iy1Var.L(iy1VarF, k74VarB.c(n74VarD, true));
                long jL2 = iy1Var.L(iy1VarF2, k74VarB2.c(n74VarD, false));
                long jO = iy1Var.O(jL);
                long jO2 = iy1Var.O(jL2);
                dl3Var = new dl3(Math.min(kt2.c(jO), kt2.c(jO2)), Math.min(kt2.d(iy1Var.O(iy1Var.L(iy1VarF, X.a(0.0f, k74VarB.a(qnHx.b).b)))), kt2.d(iy1Var.O(iy1Var.L(iy1VarF2, X.a(0.0f, k74VarB2.a(qnHx2.b).b))))), Math.max(kt2.c(jO), kt2.c(jO2)), Math.max(kt2.d(jO), kt2.d(jO2)) + ((float) (((double) v74.b) * 4.0d)));
            }
        }
        x55Var.b(dl3Var, new byN(), null, null, null);
    }

    public final void k() {
        n74.QnHx qnHx;
        n74.QnHx qnHx2;
        n74 n74VarD = d();
        iy1 iy1Var = this.j;
        k74 k74VarB = (n74VarD == null || (qnHx2 = n74VarD.a) == null) ? null : b(qnHx2);
        k74 k74VarB2 = (n74VarD == null || (qnHx = n74VarD.b) == null) ? null : b(qnHx);
        iy1 iy1VarF = k74VarB != null ? k74VarB.f() : null;
        iy1 iy1VarF2 = k74VarB2 != null ? k74VarB2.f() : null;
        kz2 kz2Var = this.n;
        kz2 kz2Var2 = this.m;
        if (n74VarD == null || iy1Var == null || !iy1Var.q() || iy1VarF == null || iy1VarF2 == null) {
            kz2Var2.setValue(null);
            kz2Var.setValue(null);
            return;
        }
        long jL = iy1Var.L(iy1VarF, k74VarB.c(n74VarD, true));
        long jL2 = iy1Var.L(iy1VarF2, k74VarB2.c(n74VarD, false));
        dl3 dl3VarD = j84.d(iy1Var);
        kz2Var2.setValue(j84.b(jL, dl3VarD) ? new kt2(jL) : null);
        kz2Var.setValue(j84.b(jL2, dl3VarD) ? new kt2(jL2) : null);
    }

    public final boolean l(long j, long j2, kt2 kt2Var, boolean z, o74 o74Var) {
        i(z ? eb1.SelectionStart : eb1.SelectionEnd);
        h(z ? new kt2(j) : new kt2(j2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        iy1 iy1VarG = g();
        s84 s84Var = this.a;
        ArrayList arrayListK = s84Var.k(iy1VarG);
        int size = arrayListK.size();
        n74 n74VarC = null;
        int i = 0;
        boolean z2 = false;
        while (i < size) {
            k74 k74Var = (k74) arrayListK.get(i);
            int i2 = i;
            n74 n74Var = n74VarC;
            int i3 = size;
            ArrayList arrayList = arrayListK;
            s84 s84Var2 = s84Var;
            uy2<n74, Boolean> uy2VarB = k74Var.b(j, j2, kt2Var, z, g(), o74Var, s84Var.i().get(Long.valueOf(k74Var.d())));
            n74 n74Var2 = uy2VarB.w;
            z2 = z2 || uy2VarB.x.booleanValue();
            if (n74Var2 != null) {
                linkedHashMap.put(Long.valueOf(k74Var.d()), n74Var2);
            }
            n74VarC = j84.c(n74Var, n74Var2);
            i = i2 + 1;
            s84Var = s84Var2;
            arrayListK = arrayList;
            size = i3;
        }
        n74 n74Var3 = n74VarC;
        s84 s84Var3 = s84Var;
        if (!ur1.a(n74Var3, d())) {
            vb1 vb1Var = this.d;
            if (vb1Var != null) {
                vb1Var.a();
            }
            s84Var3.l.setValue(linkedHashMap);
            this.c.invoke(n74Var3);
        }
        return z2;
    }

    public final boolean m(kt2 kt2Var, kt2 kt2Var2, boolean z, o74 o74Var) {
        n74 n74VarD;
        if (kt2Var != null && (n74VarD = d()) != null) {
            k74 k74Var = (k74) this.a.c.get(Long.valueOf(z ? n74VarD.b.c : n74VarD.a.c));
            kt2 kt2VarA = k74Var == null ? null : a(k74Var.f(), v74.a(k74Var.c(n74VarD, !z)));
            if (kt2VarA != null) {
                long j = kt2Var.a;
                long j2 = kt2VarA.a;
                return l(z ? j : j2, z ? j2 : j, kt2Var2, z, o74Var);
            }
        }
        return false;
    }
}
