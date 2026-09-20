package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {
    private static final Spliterator a = new X();
    private static final F b = new V();
    private static final I c = new W();
    private static final C d = new U();

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static C b() {
        return d;
    }

    public static F c() {
        return b;
    }

    public static I d() {
        return c;
    }

    public static Spliterator e() {
        return a;
    }

    public static InterfaceC1517p f(C c2) {
        c2.getClass();
        return new Q(c2);
    }

    public static InterfaceC1631t g(F f) {
        f.getClass();
        return new O(f);
    }

    public static InterfaceC1635x h(I i) {
        i.getClass();
        return new P(i);
    }

    public static java.util.Iterator i(Spliterator spliterator) {
        spliterator.getClass();
        return new N(spliterator);
    }

    public static C j(double[] dArr, int i, int i2) {
        dArr.getClass();
        a(dArr.length, i, i2);
        return new T(dArr, i, i2, 1040);
    }

    public static F k(int[] iArr, int i, int i2) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new Y(iArr, i, i2, 1040);
    }

    public static I l(long[] jArr, int i, int i2) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new a0(jArr, i, i2, 1040);
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new S(objArr, i, i2, 1040);
    }
}
