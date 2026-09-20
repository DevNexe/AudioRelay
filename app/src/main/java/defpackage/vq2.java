package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vq2<T> implements us2<T> {
    public static et2 D(long j, TimeUnit timeUnit) {
        return E(j, timeUnit, j54.b);
    }

    public static et2 E(long j, TimeUnit timeUnit, c54 c54Var) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var != null) {
            return new et2(Math.max(j, 0L), timeUnit, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    public static <T, R> vq2<R> f(i91<? super Object[], ? extends R> i91Var, int i, us2<? extends T>... us2VarArr) {
        if (us2VarArr.length == 0) {
            return or2.w;
        }
        mq2.c(i, "bufferSize");
        return new yq2(us2VarArr, null, i91Var, i << 1);
    }

    public static vq2 h(vq2 vq2Var, vq2 vq2Var2, Z z, ds2 ds2Var, b91 b91Var) {
        if (vq2Var2 != null) {
            return f(new m91.LPt8Fixed(b91Var), a11.w, vq2Var, vq2Var2, z, ds2Var);
        }
        throw new NullPointerException("source2 is null");
    }

    public static vq2 i(vq2 vq2Var, vq2 vq2Var2, vq2 vq2Var3, z81 z81Var) {
        if (vq2Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vq2Var2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (vq2Var3 != null) {
            return f(new m91.F1(z81Var), a11.w, vq2Var, vq2Var2, vq2Var3);
        }
        throw new NullPointerException("source3 is null");
    }

    public static vq2 j(vq2 vq2Var, vq2 vq2Var2, vq2 vq2Var3, vq2 vq2Var4, vq2 vq2Var5, d91 d91Var) {
        if (vq2Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vq2Var2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (vq2Var3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (vq2Var4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (vq2Var5 != null) {
            return f(new m91.NUlFixed(d91Var), a11.w, vq2Var, vq2Var2, vq2Var3, vq2Var4, vq2Var5);
        }
        throw new NullPointerException("source5 is null");
    }

    public static vq2 k(vq2 vq2Var, us2 us2Var, ba baVar) {
        if (vq2Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (us2Var != null) {
            return f(new m91.CQf(baVar), a11.w, vq2Var, us2Var);
        }
        throw new NullPointerException("source2 is null");
    }

    public static yq2 l(ArrayList arrayList, k71 k71Var) {
        int i = a11.w;
        mq2.c(i, "bufferSize");
        return new yq2(null, arrayList, k71Var, i << 1);
    }

    public static <T> vq2<T> m(us2<? extends T>... us2VarArr) {
        if (us2VarArr.length == 0) {
            return or2.w;
        }
        if (us2VarArr.length != 1) {
            return new zq2(q(us2VarArr), m91.a, a11.w, 2);
        }
        us2<? extends T> us2Var = us2VarArr[0];
        if (us2Var != null) {
            return us2Var instanceof vq2 ? (vq2) us2Var : new xr2(us2Var);
        }
        throw new NullPointerException("source is null");
    }

    public static <T> vq2<T> q(T... tArr) {
        if (tArr.length == 0) {
            return or2.w;
        }
        return tArr.length == 1 ? s(tArr[0]) : new tr2(tArr);
    }

    public static as2 r(long j, long j2, TimeUnit timeUnit, c54 c54Var) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var != null) {
            return new as2(Math.max(0L, j), Math.max(0L, j2), timeUnit, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    public static bs2 s(Object obj) {
        if (obj != null) {
            return new bs2(obj);
        }
        throw new NullPointerException("item is null");
    }

    public static vq2 t(vq2 vq2Var, vq2 vq2Var2) {
        if (vq2Var == null) {
            throw new NullPointerException("source1 is null");
        }
        if (vq2Var2 != null) {
            return q(vq2Var, vq2Var2).p(m91.a, 2);
        }
        throw new NullPointerException("source2 is null");
    }

    public final vs2 A(c54 c54Var) {
        if (c54Var != null) {
            return new vs2(this, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> vq2<R> B(i91<? super T, ? extends us2<? extends R>> i91Var) {
        vq2<R> ws2Var;
        int i = a11.w;
        mq2.c(i, "bufferSize");
        if (this instanceof s34) {
            Object objCall = ((s34) this).call();
            if (objCall == null) {
                return or2.w;
            }
            ws2Var = new ns2.CQf<>(i91Var, objCall);
        } else {
            ws2Var = new ws2<>(this, i91Var, i);
        }
        return ws2Var;
    }

    public final dt2 C(long j, TimeUnit timeUnit) {
        c54 c54Var = j54.b;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (c54Var != null) {
            return new dt2(this, j, timeUnit, c54Var);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;)La11<TT;>; */
    public final a11 F(int i) {
        f11 f11Var = new f11(this);
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return f11Var;
        }
        if (i2 == 1) {
            return new l11(f11Var);
        }
        if (i2 == 3) {
            return new k11(f11Var);
        }
        if (i2 == 4) {
            return new m11(f11Var);
        }
        int i3 = a11.w;
        mq2.c(i3, "capacity");
        return new j11(f11Var, i3);
    }

    @Override // defpackage.us2
    public final void a(ht2<? super T> ht2Var) {
        if (ht2Var == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            z(ht2Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            XTd3.w(th);
            m14.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> vq2<R> n(i91<? super T, ? extends us2<? extends R>> i91Var) {
        vq2<R> zq2Var;
        mq2.c(2, "prefetch");
        if (this instanceof s34) {
            Object objCall = ((s34) this).call();
            if (objCall == null) {
                return or2.w;
            }
            zq2Var = new ns2.CQf<>(i91Var, objCall);
        } else {
            zq2Var = new zq2<>(this, i91Var, 2, 1);
        }
        return zq2Var;
    }

    public final ar2 o(i91 i91Var) {
        mq2.c(2, "capacityHint");
        return new ar2(this, i91Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vq2 p(i91 i91Var, int i) {
        int i2 = a11.w;
        mq2.c(i, "maxConcurrency");
        mq2.c(i2, "bufferSize");
        if (!(this instanceof s34)) {
            return new qr2(this, i91Var, i, i2);
        }
        Object objCall = ((s34) this).call();
        return objCall == null ? or2.w : new ns2.CQf(i91Var, objCall);
    }

    public final ds2 u(c54 c54Var) {
        int i = a11.w;
        if (c54Var == null) {
            throw new NullPointerException("scheduler is null");
        }
        mq2.c(i, "bufferSize");
        return new ds2(this, c54Var, i);
    }

    public final cs2 v(Class cls) {
        return new cs2(new pr2(this, new m91.auxFixed(cls)), new m91.YKK(cls));
    }

    public final vq2 w(vq2 vq2Var) {
        return m(vq2Var, this);
    }

    public final vq2<T> x(T t) {
        if (t != null) {
            return m(s(t), this);
        }
        throw new NullPointerException("item is null");
    }

    public final fx1 y(m70 m70Var, m70 m70Var2, InterfaceC1443fH interfaceC1443fH) {
        if (interfaceC1443fH == null) {
            throw new NullPointerException("onComplete is null");
        }
        fx1 fx1Var = new fx1(m70Var, m70Var2, interfaceC1443fH);
        a(fx1Var);
        return fx1Var;
    }

    public abstract void z(ht2<? super T> ht2Var);
}
