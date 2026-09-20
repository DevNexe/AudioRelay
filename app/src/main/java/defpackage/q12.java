package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q12 implements w64 {
    public static final f34 s = NRt.b(QnHx.w, CQf.w);
    public final j12 a;
    public final kz2 b;
    public final di2 c;
    public float d;
    public final kz2 e;
    public final th0 f;
    public final boolean g;
    public int h;
    public e02.QnHx i;
    public boolean j;
    public final kz2 k;
    public final F1 l;
    public final x4 m;
    public final kz2 n;
    public final kz2 o;
    public boolean p;
    public boolean q;
    public final e02 r;

    public static final class CQf extends cx1 implements j81<List<? extends Integer>, q12> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final q12 invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            return new q12(list2.get(0).intValue(), list2.get(1).intValue());
        }
    }

    public static final class F1 implements wl3 {
        public F1() {
        }

        @Override // defpackage.pg2
        public final /* synthetic */ boolean B(f30.F1 f1) {
            return dj.a(this, f1);
        }

        @Override // defpackage.pg2
        public final Object m0(Object obj, x81 x81Var) {
            return x81Var.invoke(obj, this);
        }

        @Override // defpackage.wl3
        public final void u(yy1 yy1Var) {
            q12.this.k.setValue(yy1Var);
        }

        @Override // defpackage.pg2
        public final /* synthetic */ pg2 y(pg2 pg2Var) {
            return hj0.b(this, pg2Var);
        }

        @Override // defpackage.pg2
        public final Object z(Object obj, x81 x81Var) {
            return x81Var.invoke(this, obj);
        }
    }

    @if0(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {257, 258}, m = "scroll")
    public static final class LPt8Fixed extends b90 {
        public vi2 A;
        public x81 B;
        public /* synthetic */ Object C;
        public int E;
        public q12 z;

        public LPt8Fixed(z80<? super LPt8Fixed> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return q12.this.b(null, null, this);
        }
    }

    public static final class NUlFixed extends cx1 implements j81<Float, Float> {
        public NUlFixed() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.j81
        public final Float invoke(Float f) {
            e02.QnHx qnHxB;
            e02.QnHx qnHx;
            float f2 = -f.floatValue();
            q12 q12Var = q12.this;
            if ((f2 >= 0.0f || q12Var.q) && (f2 <= 0.0f || q12Var.p)) {
                boolean z = false;
                if (!(Math.abs(q12Var.d) <= 0.5f)) {
                    throw new IllegalStateException(("entered drag with non-zero pending scroll: " + q12Var.d).toString());
                }
                float f3 = q12Var.d + f2;
                q12Var.d = f3;
                if (Math.abs(f3) > 0.5f) {
                    float f4 = q12Var.d;
                    vl3 vl3Var = (vl3) q12Var.k.getValue();
                    if (vl3Var != null) {
                        vl3Var.d();
                    }
                    boolean z2 = q12Var.g;
                    if (z2) {
                        float f5 = f4 - q12Var.d;
                        if (z2) {
                            y02 y02VarG = q12Var.g();
                            if (!y02VarG.e().isEmpty()) {
                                boolean z3 = f5 < 0.0f;
                                int index = z3 ? ((k02) wu.N0(y02VarG.e())).getIndex() + 1 : ((k02) wu.H0(y02VarG.e())).getIndex() - 1;
                                if (index != q12Var.h) {
                                    if (index >= 0 && index < y02VarG.d()) {
                                        z = true;
                                    }
                                    if (z) {
                                        if (q12Var.j != z3 && (qnHx = q12Var.i) != null) {
                                            qnHx.cancel();
                                        }
                                        q12Var.j = z3;
                                        q12Var.h = index;
                                        long j = ((g70) q12Var.o.getValue()).a;
                                        e02.CQf cQf = (e02.CQf) q12Var.r.a.getValue();
                                        if (cQf == null || (qnHxB = cQf.b(index, j)) == null) {
                                            qnHxB = v3A.w;
                                        }
                                        q12Var.i = qnHxB;
                                    }
                                }
                            }
                        }
                    }
                }
                if (Math.abs(q12Var.d) > 0.5f) {
                    f2 -= q12Var.d;
                    q12Var.d = 0.0f;
                }
            } else {
                f2 = 0.0f;
            }
            return Float.valueOf(-f2);
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, q12, List<? extends Integer>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final List<? extends Integer> invoke(g34 g34Var, q12 q12Var) {
            q12 q12Var2 = q12Var;
            return ps0.M(Integer.valueOf(q12Var2.e()), Integer.valueOf(q12Var2.f()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q12() {
        int i = 0;
        this(i, 3, i);
    }

    public q12(int i, int i2) {
        this.a = new j12(i, i2);
        this.b = ps0.R(bs0.a);
        this.c = new di2();
        this.e = ps0.R(new jj0(1.0f, 1.0f));
        this.f = new th0(new NUlFixed());
        this.g = true;
        this.h = -1;
        this.k = ps0.R(null);
        this.l = new F1();
        this.m = new x4();
        this.n = ps0.R(null);
        this.o = ps0.R(new g70(FWT.n(0, 0, 15)));
        this.r = new e02();
    }

    public static Object h(q12 q12Var, int i, z80 z80Var) throws Throwable {
        q12Var.getClass();
        Object objB = q12Var.b(vi2.Default, new r12(q12Var, i, 0, null), z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }

    @Override // defpackage.w64
    public final boolean a() {
        return this.f.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.w64
    public final Object b(vi2 vi2Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super sd5> z80Var) throws Throwable {
        LPt8Fixed lPt8;
        q12 q12Var;
        if (z80Var instanceof LPt8Fixed) {
            lPt8 = (LPt8Fixed) z80Var;
            int i = lPt8.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                lPt8.E = i - Integer.MIN_VALUE;
            } else {
                lPt8 = new LPt8Fixed(z80Var);
            }
        } else {
            lPt8 = new LPt8Fixed(z80Var);
        }
        Object obj = lPt8.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = lPt8.E;
        if (i2 != 0) {
            if (i2 == 1) {
                x81Var = lPt8.B;
                vi2Var = lPt8.A;
                q12Var = lPt8.z;
                C0239D.H(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        lPt8.z = this;
        lPt8.A = vi2Var;
        lPt8.B = x81Var;
        lPt8.E = 1;
        if (this.m.a(lPt8) == va0Var) {
            return va0Var;
        }
        q12Var = this;
        th0 th0Var = q12Var.f;
        lPt8.z = null;
        lPt8.A = null;
        lPt8.B = null;
        lPt8.E = 2;
        if (th0Var.b(vi2Var, x81Var, lPt8) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    @Override // defpackage.w64
    public final float c(float f) {
        return this.f.c(f);
    }

    public final Object d(int i, int i2, ly2 ly2Var) throws Throwable {
        float f = l12.a;
        if (!(((float) i) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
        Object objB = b(vi2.Default, new k12(this, i, i2, null), ly2Var);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (objB != va0Var) {
            objB = sd5.a;
        }
        return objB == va0Var ? objB : sd5.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((re0) this.a.a.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f() {
        return ((Number) this.a.b.getValue()).intValue();
    }

    public final y02 g() {
        return (y02) this.b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i, int i2) {
        j12 j12Var = this.a;
        j12Var.a(i, i2);
        j12Var.d = null;
        m02 m02Var = (m02) this.n.getValue();
        if (m02Var != null) {
            m02Var.c.clear();
            m02Var.d = ds0.w;
            m02Var.e = -1;
            m02Var.f = 0;
            m02Var.g = -1;
            m02Var.h = 0;
        }
        vl3 vl3Var = (vl3) this.k.getValue();
        if (vl3Var != null) {
            vl3Var.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(o02 o02Var) {
        Integer num;
        j12 j12Var = this.a;
        j12Var.getClass();
        cp4 cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
        try {
            cp4 cp4VarI = cp4VarF.i();
            try {
                Object obj = j12Var.d;
                int iIntValue = ((re0) j12Var.a.getValue()).a;
                if (obj != null && ((iIntValue >= o02Var.g() || !ur1.a(obj, o02Var.a(iIntValue))) && (num = o02Var.f().get(obj)) != null)) {
                    iIntValue = num.intValue();
                }
                j12Var.a(iIntValue, ((Number) j12Var.b.getValue()).intValue());
                sd5 sd5Var = sd5.a;
                cp4.o(cp4VarI);
                cp4VarF.c();
            } catch (Throwable th) {
                cp4.o(cp4VarI);
                throw th;
            }
        } catch (Throwable th2) {
            cp4VarF.c();
            throw th2;
        }
    }

    public /* synthetic */ q12(int i, int i2, int i3) {
        this((i2 & 1) != 0 ? 0 : i, 0);
    }
}
