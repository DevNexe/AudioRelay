package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ip4 {
    public static final QnHx a = QnHx.w;
    public static final cq4 b = new cq4(0);
    public static final Object c = new Object();
    public static gp4 d;
    public static int e;
    public static final fp4 f;
    public static final ArrayList g;
    public static final ArrayList h;
    public static final AtomicReference<ia1> i;

    public static final class CQf extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ j81<Object, sd5> w;
        public final /* synthetic */ j81<Object, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2) {
            super(1);
            this.w = j81Var;
            this.x = j81Var2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            this.w.invoke(obj);
            this.x.invoke(obj);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<gp4, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(gp4 gp4Var) {
            return sd5.a;
        }
    }

    static {
        gp4 gp4Var = gp4.A;
        d = gp4Var;
        e = 1;
        f = new fp4();
        g = new ArrayList();
        h = new ArrayList();
        int i2 = e;
        e = i2 + 1;
        ia1 ia1Var = new ia1(i2, gp4Var);
        d = d.f(ia1Var.b);
        AtomicReference<ia1> atomicReference = new AtomicReference<>(ia1Var);
        i = atomicReference;
        atomicReference.get();
    }

    public static final void a() {
        e(hp4.w);
    }

    public static final j81 b(j81 j81Var, j81 j81Var2) {
        if (j81Var == null || j81Var2 == null || ur1.a(j81Var, j81Var2)) {
            return j81Var == null ? j81Var2 : j81Var;
        }
        return new jp4(j81Var, j81Var2);
    }

    public static final HashMap c(qi2 qi2Var, qi2 qi2Var2, gp4 gp4Var) {
        xs4 xs4VarM;
        Set<ws4> setU = qi2Var2.u();
        int iD = qi2Var.d();
        if (setU == null) {
            return null;
        }
        gp4 gp4VarE = qi2Var2.e().f(qi2Var2.d()).e(qi2Var2.h);
        HashMap map = null;
        for (ws4 ws4Var : setU) {
            xs4 xs4VarA = ws4Var.a();
            xs4 xs4VarM2 = m(xs4VarA, iD, gp4Var);
            if (xs4VarM2 != null && (xs4VarM = m(xs4VarA, iD, gp4VarE)) != null && !ur1.a(xs4VarM2, xs4VarM)) {
                xs4 xs4VarM3 = m(xs4VarA, qi2Var2.d(), qi2Var2.e());
                if (xs4VarM3 == null) {
                    l();
                    throw null;
                }
                xs4 xs4VarB = ws4Var.b(xs4VarM, xs4VarM2, xs4VarM3);
                if (xs4VarB == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(xs4VarM2, xs4VarB);
            }
        }
        return map;
    }

    public static final void d(cp4 cp4Var) {
        if (!d.c(cp4Var.d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T> T e(j81<? super gp4, ? extends T> j81Var) {
        T t;
        ArrayList arrayList;
        ia1 ia1Var = i.get();
        Object obj = c;
        synchronized (obj) {
            t = (T) p(ia1Var, j81Var);
        }
        Set<ws4> set = ia1Var.g;
        if (set != null) {
            synchronized (obj) {
                arrayList = new ArrayList(g);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((x81) arrayList.get(i2)).invoke(set, ia1Var);
            }
        }
        return t;
    }

    public static final cp4 f(cp4 cp4Var, j81<Object, sd5> j81Var, boolean z) {
        boolean z2 = cp4Var instanceof qi2;
        if (z2 || cp4Var == null) {
            return new qa5(z2 ? (qi2) cp4Var : null, j81Var, null, false, z);
        }
        return new ra5(cp4Var, j81Var, z);
    }

    public static final <T extends xs4> T g(T t, cp4 cp4Var) {
        T t2 = (T) m(t, cp4Var.d(), cp4Var.e());
        if (t2 != null) {
            return t2;
        }
        l();
        throw null;
    }

    public static final cp4 h() {
        cp4 cp4Var = (cp4) b.h();
        return cp4Var == null ? i.get() : cp4Var;
    }

    public static final j81<Object, sd5> i(j81<Object, sd5> j81Var, j81<Object, sd5> j81Var2, boolean z) {
        if (!z) {
            j81Var2 = null;
        }
        if (j81Var == null || j81Var2 == null || ur1.a(j81Var, j81Var2)) {
            return j81Var == null ? j81Var2 : j81Var;
        }
        return new CQf(j81Var, j81Var2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public static final <T extends xs4> T j(T t, ws4 ws4Var) {
        boolean z;
        int i2 = e;
        fp4 fp4Var = f;
        if (fp4Var.a > 0) {
            i2 = fp4Var.b[0];
        }
        int i3 = i2 - 1;
        T t2 = null;
        xs4 xs4Var = null;
        for (xs4 xs4VarA = ws4Var.a(); xs4VarA != null; xs4VarA = xs4VarA.b) {
            int i4 = xs4VarA.a;
            if (i4 != 0) {
                if (i4 != 0 && i4 <= i3) {
                    int i5 = i4 + 0;
                    z = i5 < 0 || i5 >= 64 ? !(i5 < 64 || i5 >= 128 || (((1 << (i5 + (-64))) & 0) > 0L ? 1 : (((1 << (i5 + (-64))) & 0) == 0L ? 0 : -1)) == 0) : (((1 << i5) & 0) > 0L ? 1 : (((1 << i5) & 0) == 0L ? 0 : -1)) != 0 ? false : true;
                }
                if (z) {
                    if (xs4Var != null) {
                        if (xs4VarA.a >= xs4Var.a) {
                            t2 = (T) xs4Var;
                            break;
                        }
                        break;
                    }
                    xs4Var = xs4VarA;
                }
            }
            t2 = (T) xs4VarA;
            break;
        }
        if (t2 != null) {
            t2.a = Integer.MAX_VALUE;
            return t2;
        }
        T t3 = (T) t.b();
        t3.a = Integer.MAX_VALUE;
        t3.b = ws4Var.a();
        ws4Var.f(t3);
        return t3;
    }

    public static final void k(cp4 cp4Var, ws4 ws4Var) {
        j81<Object, sd5> j81VarH = cp4Var.h();
        if (j81VarH != null) {
            j81VarH.invoke(ws4Var);
        }
    }

    public static final void l() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends xs4> T m(T t, int i2, gp4 gp4Var) {
        T t2 = null;
        while (t != null) {
            int i3 = t.a;
            if (((i3 == 0 || i3 > i2 || gp4Var.c(i3)) ? false : true) && (t2 == null || t2.a < t.a)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends xs4> T n(T t, ws4 ws4Var, cp4 cp4Var) {
        j81<Object, sd5> j81VarF = cp4Var.f();
        if (j81VarF != null) {
            j81VarF.invoke(ws4Var);
        }
        T t2 = (T) m(t, cp4Var.d(), cp4Var.e());
        if (t2 != null) {
            return t2;
        }
        l();
        throw null;
    }

    public static final void o(int i2) {
        int i3;
        fp4 fp4Var = f;
        int i4 = fp4Var.d[i2];
        fp4Var.b(i4, fp4Var.a - 1);
        fp4Var.a--;
        int[] iArr = fp4Var.b;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            fp4Var.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = fp4Var.b;
        int i8 = fp4Var.a >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < fp4Var.a && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                fp4Var.b(i9, i4);
                i4 = i9;
            } else {
                if (iArr2[i10] >= iArr2[i4]) {
                    break;
                }
                fp4Var.b(i10, i4);
                i4 = i10;
            }
        }
        fp4Var.d[i2] = fp4Var.e;
        fp4Var.e = i2;
    }

    public static final Object p(ia1 ia1Var, j81 j81Var) {
        Object objInvoke = j81Var.invoke(d.b(ia1Var.b));
        synchronized (c) {
            int i2 = e;
            e = i2 + 1;
            gp4 gp4VarB = d.b(ia1Var.b);
            d = gp4VarB;
            i.set(new ia1(i2, gp4VarB));
            ia1Var.c();
            d = d.f(i2);
            sd5 sd5Var = sd5.a;
        }
        return objInvoke;
    }

    public static final <T extends xs4> T q(T t, ws4 ws4Var, cp4 cp4Var) {
        if (cp4Var.g()) {
            cp4Var.m(ws4Var);
        }
        T t2 = (T) m(t, cp4Var.d(), cp4Var.e());
        if (t2 == null) {
            l();
            throw null;
        }
        if (t2.a == cp4Var.d()) {
            return t2;
        }
        T t3 = (T) j(t2, ws4Var);
        t3.a(t2);
        t3.a = cp4Var.d();
        cp4Var.m(ws4Var);
        return t3;
    }
}
