package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class t95<S> {
    public final ti2<S> a;
    public final String b;
    public final kz2 c;
    public final kz2 d;
    public final kz2 e;
    public final kz2 f;
    public final kz2 g;
    public final wp4<t95<S>.LPt8Fixed<?, ?>> h;
    public final wp4<t95<?>> i;
    public final kz2 j;
    public long k;
    public final uj0 l;

    public interface CQf<S> {
        S a();

        boolean b(S s, S s2);

        S c();
    }

    public static final class F1<S> implements CQf<S> {
        public final S a;
        public final S b;

        public F1(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // t95.CQf
        public final S a() {
            return this.a;
        }

        @Override // t95.CQf
        public final boolean b(Object obj, Object obj2) {
            return ur1.a(obj, this.a) && ur1.a(obj2, this.b);
        }

        @Override // t95.CQf
        public final S c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof CQf) {
                CQf cQf = (CQf) obj;
                if (ur1.a(this.a, cQf.a())) {
                    if (ur1.a(this.b, cQf.c())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            S s = this.a;
            int iHashCode = (s != null ? s.hashCode() : 0) * 31;
            S s2 = this.b;
            return iHashCode + (s2 != null ? s2.hashCode() : 0);
        }
    }

    public final class LPt8Fixed<T, V extends z_Mm> implements is4<T> {
        public final kz2 A;
        public final kz2 B;
        public final kz2 C;
        public final kz2 D;
        public V E;
        public final hr4 F;
        public final pb5<T, V> w;
        public final kz2 x;
        public final kz2 y;
        public final kz2 z;

        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(Object obj, z_Mm z_mm, pb5 pb5Var) {
            this.w = pb5Var;
            kz2 kz2VarR = ps0.R(obj);
            this.x = kz2VarR;
            T tInvoke = null;
            this.y = ps0.R(hH.w(0.0f, null, 7));
            this.z = ps0.R(new t05(b(), pb5Var, obj, kz2VarR.getValue(), z_mm));
            this.A = ps0.R(Boolean.TRUE);
            this.B = ps0.R(0L);
            this.C = ps0.R(Boolean.FALSE);
            this.D = ps0.R(obj);
            this.E = z_mm;
            Float f = kk5.a.get(pb5Var);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = pb5Var.a().invoke(obj);
                int iB = vInvoke.b();
                for (int i = 0; i < iB; i++) {
                    vInvoke.e(fFloatValue, i);
                }
                tInvoke = this.w.b().invoke(vInvoke);
            }
            this.F = hH.w(0.0f, tInvoke, 3);
        }

        public static void c(LPt8Fixed lPt8, Object obj, boolean z, int i) {
            if ((i & 1) != 0) {
                obj = lPt8.getValue();
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            lx0<T> lx0VarB = (!z || (lPt8.b() instanceof hr4)) ? lPt8.b() : lPt8.F;
            lPt8.z.setValue(new t05(lx0VarB, lPt8.w, obj2, lPt8.x.getValue(), lPt8.E));
            t95<S> t95Var = t95.this;
            t95Var.g.setValue(Boolean.TRUE);
            if (!t95Var.e()) {
                return;
            }
            ListIterator<t95<S>.LPt8Fixed<?, ?>> listIterator = t95Var.h.listIterator();
            long jMax = 0;
            while (true) {
                ps4 ps4Var = (ps4) listIterator;
                if (!ps4Var.hasNext()) {
                    t95Var.g.setValue(Boolean.FALSE);
                    return;
                }
                LPt8Fixed lPt9 = (LPt8Fixed) ps4Var.next();
                jMax = Math.max(jMax, lPt9.a().h);
                long j = t95Var.k;
                lPt9.D.setValue(lPt9.a().f(j));
                lPt9.E = (V) lPt9.a().d(j);
            }
        }

        public final t05<T, V> a() {
            return (t05) this.z.getValue();
        }

        public final lx0<T> b() {
            return (lx0) this.y.getValue();
        }

        public final void d(T t, T t2, lx0<T> lx0Var) {
            this.x.setValue(t2);
            this.y.setValue(lx0Var);
            if (ur1.a(a().c, t) && ur1.a(a().d, t2)) {
                return;
            }
            c(this, t, false, 2);
        }

        public final void e(T t, lx0<T> lx0Var) {
            kz2 kz2Var = this.x;
            boolean zA = ur1.a(kz2Var.getValue(), t);
            kz2 kz2Var2 = this.C;
            if (!zA || ((Boolean) kz2Var2.getValue()).booleanValue()) {
                kz2Var.setValue(t);
                this.y.setValue(lx0Var);
                kz2 kz2Var3 = this.A;
                c(this, null, !((Boolean) kz2Var3.getValue()).booleanValue(), 1);
                Boolean bool = Boolean.FALSE;
                kz2Var3.setValue(bool);
                this.B.setValue(Long.valueOf(((Number) t95.this.e.getValue()).longValue()));
                kz2Var2.setValue(bool);
            }
        }

        @Override // defpackage.is4
        public final T getValue() {
            return this.D.getValue();
        }
    }

    @if0(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {434}, m = "invokeSuspend")
    public static final class NUlFixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ t95<S> C;

        public static final class QnHx extends cx1 implements j81<Long, sd5> {
            public final /* synthetic */ t95<S> w;
            public final /* synthetic */ float x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(t95<S> t95Var, float f) {
                super(1);
                this.w = t95Var;
                this.x = f;
            }

            @Override // defpackage.j81
            public final sd5 invoke(Long l) {
                long jLongValue = l.longValue();
                t95<S> t95Var = this.w;
                if (!t95Var.e()) {
                    t95Var.f(jLongValue / 1, this.x);
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(t95<S> t95Var, z80<? super NUlFixed> z80Var) {
            super(2, z80Var);
            this.C = t95Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            NUlFixed nUl = new NUlFixed(this.C, z80Var);
            nUl.B = obj;
            return nUl;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            ua0 ua0Var;
            QnHx qnHx;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                ua0Var = (ua0) this.B;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ua0Var = (ua0) this.B;
                C0239D.H(obj);
            }
            do {
                qnHx = new QnHx(this.C, kx4.e(ua0Var.g()));
                this.B = ua0Var;
                this.A = 1;
            } while (fp1.E0(qnHx, this) != va0Var);
            return va0Var;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((NUlFixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public final class QnHx<T, V extends z_Mm> {
        public final pb5<T, V> a;
        public t95<S>.C0204QnHx<T, V>.C0007QnHx<T, V> b;

        /* JADX INFO: renamed from: t95$QnHx$QnHx, reason: collision with other inner class name */
        public final class C0204QnHx<T, V extends z_Mm> implements is4<T> {
            public final t95<S>.LPt8Fixed<T, V> w;
            public j81<? super CQf<S>, ? extends lx0<T>> x;
            public j81<? super S, ? extends T> y;

            public C0204QnHx(t95<S>.LPt8Fixed<T, V> lPt8, j81<? super CQf<S>, ? extends lx0<T>> j81Var, j81<? super S, ? extends T> j81Var2) {
                this.w = lPt8;
                this.x = j81Var;
                this.y = j81Var2;
            }

            public final void a(CQf<S> cQf) {
                T tInvoke = this.y.invoke(cQf.c());
                boolean zE = t95.this.e();
                t95<S>.LPt8Fixed<T, V> lPt8 = this.w;
                if (zE) {
                    lPt8.d(this.y.invoke(cQf.a()), tInvoke, this.x.invoke(cQf));
                } else {
                    lPt8.e(tInvoke, this.x.invoke(cQf));
                }
            }

            @Override // defpackage.is4
            public final T getValue() {
                a(t95.this.c());
                return this.w.getValue();
            }
        }

        public QnHx(qb5 qb5Var, String str) {
            this.a = qb5Var;
        }

        public final C0204QnHx a(j81 j81Var, j81 j81Var2) {
            C0204QnHx c0204QnHx = this.b;
            t95<S> t95Var = t95.this;
            if (c0204QnHx == null) {
                Object objInvoke = j81Var2.invoke(t95Var.b());
                Object objInvoke2 = j81Var2.invoke(t95Var.b());
                pb5<T, V> pb5Var = this.a;
                t95<S>.LPt8Fixed<?, ?> lPt8 = t95Var.new LPt8Fixed<>(objInvoke, ((z_Mm) pb5Var.a().invoke(objInvoke2)).c(), pb5Var);
                c0204QnHx = new C0204QnHx(lPt8, j81Var, j81Var2);
                this.b = c0204QnHx;
                t95Var.h.add(lPt8);
            }
            c0204QnHx.y = j81Var2;
            c0204QnHx.x = j81Var;
            c0204QnHx.a(t95Var.c());
            return c0204QnHx;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ t95<S> w;
        public final /* synthetic */ S x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(t95<S> t95Var, S s, int i) {
            super(2);
            this.w = t95Var;
            this.x = s;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            this.w.i(this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ t95<S> w;
        public final /* synthetic */ S x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(t95<S> t95Var, S s, int i) {
            super(2);
            this.w = t95Var;
            this.x = s;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            this.w.a(this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements h81<Long> {
        public final /* synthetic */ t95<S> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(t95<S> t95Var) {
            super(0);
            this.w = t95Var;
        }

        @Override // defpackage.h81
        public final Long invoke() {
            t95<S> t95Var = this.w;
            ListIterator<t95<S>.LPt8Fixed<?, ?>> listIterator = t95Var.h.listIterator();
            long jMax = 0;
            while (true) {
                ps4 ps4Var = (ps4) listIterator;
                if (!ps4Var.hasNext()) {
                    break;
                }
                jMax = Math.max(jMax, ((LPt8Fixed) ps4Var.next()).a().h);
            }
            ListIterator<t95<?>> listIterator2 = t95Var.i.listIterator();
            while (true) {
                ps4 ps4Var2 = (ps4) listIterator2;
                if (!ps4Var2.hasNext()) {
                    return Long.valueOf(jMax);
                }
                jMax = Math.max(jMax, ((Number) ((t95) ps4Var2.next()).l.getValue()).longValue());
            }
        }
    }

    public t95() {
        throw null;
    }

    public t95(ti2<S> ti2Var, String str) {
        this.a = ti2Var;
        this.b = str;
        this.c = ps0.R(b());
        this.d = ps0.R(new F1(b(), b()));
        this.e = ps0.R(0L);
        this.f = ps0.R(Long.MIN_VALUE);
        this.g = ps0.R(Boolean.TRUE);
        this.h = new wp4<>();
        this.i = new wp4<>();
        this.j = ps0.R(Boolean.FALSE);
        this.l = ps0.x(new auxFixed(this));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(S s, g30 g30Var, int i) {
        int i2;
        boolean zI;
        Object objB0;
        j30 j30VarQ = g30Var.q(-1493585151);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else if (!e()) {
            i(s, j30VarQ, (i2 & 112) | (i2 & 14));
            if (ur1.a(s, b())) {
                if ((((Number) this.f.getValue()).longValue() != Long.MIN_VALUE) || ((Boolean) this.g.getValue()).booleanValue()) {
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(this);
                    objB0 = j30VarQ.b0();
                    if (zI) {
                        objB0 = new NUlFixed(this, null);
                        j30VarQ.F0(objB0);
                    } else {
                        objB0 = new NUlFixed(this, null);
                        j30VarQ.F0(objB0);
                    }
                    j30VarQ.R(false);
                    wq0.d(this, (x81) objB0, j30VarQ);
                }
            } else {
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(this);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new NUlFixed(this, null);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                wq0.d(this, (x81) objB0, j30VarQ);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(this, s, i);
    }

    public final S b() {
        return (S) this.a.a.getValue();
    }

    public final CQf<S> c() {
        return (CQf) this.d.getValue();
    }

    public final S d() {
        return (S) this.c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [V extends z_Mm, z_Mm] */
    public final void f(long j, float f) {
        kz2 kz2Var = this.f;
        if (((Number) kz2Var.getValue()).longValue() == Long.MIN_VALUE) {
            kz2Var.setValue(Long.valueOf(j));
            this.a.c.setValue(Boolean.TRUE);
        }
        this.g.setValue(Boolean.FALSE);
        Long lValueOf = Long.valueOf(j - ((Number) kz2Var.getValue()).longValue());
        kz2 kz2Var2 = this.e;
        kz2Var2.setValue(lValueOf);
        ListIterator<t95<S>.LPt8Fixed<?, ?>> listIterator = this.h.listIterator();
        boolean z = true;
        while (true) {
            ps4 ps4Var = (ps4) listIterator;
            if (!ps4Var.hasNext()) {
                break;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) ps4Var.next();
            boolean zBooleanValue = ((Boolean) lPt8.A.getValue()).booleanValue();
            kz2 kz2Var3 = lPt8.A;
            if (!zBooleanValue) {
                long jLongValue = ((Number) kz2Var2.getValue()).longValue();
                boolean z2 = f == 0.0f;
                kz2 kz2Var4 = lPt8.B;
                long jLongValue2 = z2 ? lPt8.a().h : (long) ((jLongValue - ((Number) kz2Var4.getValue()).longValue()) / f);
                lPt8.D.setValue(lPt8.a().f(jLongValue2));
                lPt8.E = lPt8.a().d(jLongValue2);
                t05 t05VarA = lPt8.a();
                t05VarA.getClass();
                if (iZUl.a(t05VarA, jLongValue2)) {
                    kz2Var3.setValue(Boolean.TRUE);
                    kz2Var4.setValue(0L);
                }
            }
            if (!((Boolean) kz2Var3.getValue()).booleanValue()) {
                z = false;
            }
        }
        ListIterator<t95<?>> listIterator2 = this.i.listIterator();
        while (true) {
            ps4 ps4Var2 = (ps4) listIterator2;
            if (!ps4Var2.hasNext()) {
                break;
            }
            t95 t95Var = (t95) ps4Var2.next();
            if (!ur1.a(t95Var.d(), t95Var.b())) {
                t95Var.f(((Number) kz2Var2.getValue()).longValue(), f);
            }
            if (!ur1.a(t95Var.d(), t95Var.b())) {
                z = false;
            }
        }
        if (z) {
            g();
        }
    }

    public final void g() {
        this.f.setValue(Long.MIN_VALUE);
        S sD = d();
        ti2<S> ti2Var = this.a;
        ti2Var.a.setValue(sD);
        this.e.setValue(0L);
        ti2Var.c.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [V extends z_Mm, z_Mm] */
    public final void h(long j, Object obj, Object obj2) {
        this.f.setValue(Long.MIN_VALUE);
        ti2<S> ti2Var = this.a;
        ti2Var.c.setValue(Boolean.FALSE);
        if (!e() || !ur1.a(b(), obj) || !ur1.a(d(), obj2)) {
            ti2Var.a.setValue(obj);
            this.c.setValue(obj2);
            this.j.setValue(Boolean.TRUE);
            this.d.setValue(new F1(obj, obj2));
        }
        ListIterator<t95<?>> listIterator = this.i.listIterator();
        while (true) {
            ps4 ps4Var = (ps4) listIterator;
            if (!ps4Var.hasNext()) {
                break;
            }
            t95 t95Var = (t95) ps4Var.next();
            if (t95Var.e()) {
                t95Var.h(j, t95Var.b(), t95Var.d());
            }
        }
        ListIterator<t95<S>.LPt8Fixed<?, ?>> listIterator2 = this.h.listIterator();
        while (true) {
            ps4 ps4Var2 = (ps4) listIterator2;
            if (!ps4Var2.hasNext()) {
                this.k = j;
                return;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) ps4Var2.next();
            lPt8.D.setValue(lPt8.a().f(j));
            lPt8.E = lPt8.a().d(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(S s, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-583974681);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !j30VarQ.t()) {
            if (!e() && !ur1.a(d(), s)) {
                this.d.setValue(new F1(d(), s));
                this.a.a.setValue(d());
                this.c.setValue(s);
                if (!(((Number) this.f.getValue()).longValue() != Long.MIN_VALUE)) {
                    this.g.setValue(Boolean.TRUE);
                }
                ListIterator<t95<S>.LPt8Fixed<?, ?>> listIterator = this.h.listIterator();
                while (true) {
                    ps4 ps4Var = (ps4) listIterator;
                    if (!ps4Var.hasNext()) {
                        break;
                    } else {
                        ((LPt8Fixed) ps4Var.next()).C.setValue(Boolean.TRUE);
                    }
                }
            }
        } else {
            j30VarQ.x();
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(this, s, i);
    }
}
