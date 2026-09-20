package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class OVbg<T, V extends z_Mm> {
    public final pb5<T, V> a;
    public final T b;
    public final AOdm<T, V> c;
    public final kz2 e;
    public final hr4<T> g;
    public final V h;
    public final V i;
    public final V j;
    public final V k;
    public final kz2 d = ps0.R(Boolean.FALSE);
    public final wi2 f = new wi2();

    @if0(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements j81<z80<? super sd5>, Object> {
        public final /* synthetic */ OVbg<T, V> A;
        public final /* synthetic */ T B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(OVbg<T, V> oVbg, T t, z80<? super QnHx> z80Var) {
            super(1, z80Var);
            this.A = oVbg;
            this.B = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            OVbg<T, V> oVbg = this.A;
            AOdm<T, V> aOdm = oVbg.c;
            aOdm.y.d();
            aOdm.z = Long.MIN_VALUE;
            oVbg.d.setValue(Boolean.FALSE);
            Object objA = OVbg.a(oVbg, this.B);
            oVbg.c.x.setValue(objA);
            oVbg.e.setValue(objA);
            return sd5.a;
        }

        @Override // defpackage.j81
        public final Object invoke(z80<? super sd5> z80Var) {
            return new QnHx(this.A, this.B, z80Var).i(sd5.a);
        }
    }

    public OVbg(T t, pb5<T, V> pb5Var, T t2) {
        this.a = pb5Var;
        this.b = t2;
        this.c = new AOdm<>(pb5Var, t, null, 60);
        this.e = ps0.R(t);
        this.g = new hr4<>(t2, 3);
        V vInvoke = pb5Var.a().invoke(t);
        int iB = vInvoke.b();
        for (int i = 0; i < iB; i++) {
            vInvoke.e(Float.NEGATIVE_INFINITY, i);
        }
        this.h = vInvoke;
        V vInvoke2 = this.a.a().invoke(t);
        int iB2 = vInvoke2.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            vInvoke2.e(Float.POSITIVE_INFINITY, i2);
        }
        this.i = vInvoke2;
        this.j = vInvoke;
        this.k = vInvoke2;
    }

    public static final Object a(OVbg oVbg, Object obj) {
        V v = oVbg.h;
        V v2 = oVbg.j;
        boolean zA = ur1.a(v2, v);
        V v3 = oVbg.k;
        if (zA && ur1.a(v3, oVbg.i)) {
            return obj;
        }
        pb5<T, V> pb5Var = oVbg.a;
        V vInvoke = pb5Var.a().invoke(obj);
        int iB = vInvoke.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (vInvoke.a(i) < v2.a(i) || vInvoke.a(i) > v3.a(i)) {
                vInvoke.e(AY.n(vInvoke.a(i), v2.a(i), v3.a(i)), i);
                z = true;
            }
        }
        return z ? pb5Var.b().invoke(vInvoke) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object c(OVbg oVbg, Object obj, Ah ah, iy4.QnHx.C0150QnHx c0150QnHx, z80 z80Var, int i) {
        if ((i & 2) != 0) {
            ah = oVbg.g;
        }
        return oVbg.b(obj, ah, (i & 4) != 0 ? oVbg.a.b().invoke(oVbg.c.y) : null, (i & 8) != 0 ? null : c0150QnHx, z80Var);
    }

    public final Object b(T t, Ah<T> ah, T t2, j81<? super OVbg<T, V>, sd5> j81Var, z80<? super nSu<T, V>> z80Var) {
        T tD = d();
        pb5<T, V> pb5Var = this.a;
        tF tFVar = new tF(this, t2, new t05(ah, pb5Var, tD, t, pb5Var.a().invoke(t2)), this.c.z, j81Var, null);
        wi2 wi2Var = this.f;
        wi2Var.getClass();
        return fp1.R(new xi2(1, wi2Var, tFVar, null), z80Var);
    }

    public final T d() {
        return this.c.getValue();
    }

    public final Object e(T t, z80<? super sd5> z80Var) {
        QnHx qnHx = new QnHx(this, t, null);
        wi2 wi2Var = this.f;
        wi2Var.getClass();
        Object objR = fp1.R(new xi2(1, wi2Var, qnHx, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }
}
