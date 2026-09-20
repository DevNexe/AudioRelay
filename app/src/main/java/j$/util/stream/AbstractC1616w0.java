package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1481g0;
import j$.util.function.InterfaceC1493m0;
import j$.util.function.InterfaceC1494n;
import j$.util.function.InterfaceC1501t;
import j$.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1616w0 implements E3 {
    private static final Y0 a = new Y0();
    private static final C0 b = new W0();
    private static final D0 c = new X0();
    private static final B0 d = new V0();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    public /* synthetic */ AbstractC1616w0() {
    }

    public /* synthetic */ AbstractC1616w0(W2 w2) {
    }

    public static void A0(C0 c0, Integer[] numArr, int i) {
        if (H3.a) {
            H3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c0.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void B0(D0 d0, Long[] lArr, int i) {
        if (H3.a) {
            H3.a(d0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d0.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void C0(B0 b0, Consumer consumer) {
        if (consumer instanceof InterfaceC1494n) {
            b0.d((InterfaceC1494n) consumer);
        } else {
            if (H3.a) {
                H3.a(b0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.C) b0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void D0(C0 c0, Consumer consumer) {
        if (consumer instanceof j$.util.function.L) {
            c0.d((j$.util.function.L) consumer);
        } else {
            if (H3.a) {
                H3.a(c0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.F) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void E0(D0 d0, Consumer consumer) {
        if (consumer instanceof InterfaceC1481g0) {
            d0.d((InterfaceC1481g0) consumer);
        } else {
            if (H3.a) {
                H3.a(d0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.I) d0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static B0 F0(B0 b0, long j, long j2) {
        if (j == 0 && j2 == b0.count()) {
            return b0;
        }
        long j3 = j2 - j;
        j$.util.C c2 = (j$.util.C) b0.spliterator();
        InterfaceC1620x0 interfaceC1620x0X0 = X0(j3);
        interfaceC1620x0X0.f(j3);
        for (int i = 0; i < j && c2.o(new l3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && c2.o(interfaceC1620x0X0); i2++) {
        }
        interfaceC1620x0X0.end();
        return interfaceC1620x0X0.build();
    }

    public static C0 G0(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.F f2 = (j$.util.F) c0.spliterator();
        InterfaceC1624y0 interfaceC1624y0H1 = h1(j3);
        interfaceC1624y0H1.f(j3);
        for (int i = 0; i < j && f2.o(new n3(1)); i++) {
        }
        for (int i2 = 0; i2 < j3 && f2.o(interfaceC1624y0H1); i2++) {
        }
        interfaceC1624y0H1.end();
        return interfaceC1624y0H1.build();
    }

    public static D0 H0(D0 d0, long j, long j2) {
        if (j == 0 && j2 == d0.count()) {
            return d0;
        }
        long j3 = j2 - j;
        j$.util.I i = (j$.util.I) d0.spliterator();
        InterfaceC1628z0 interfaceC1628z0J1 = j1(j3);
        interfaceC1628z0J1.f(j3);
        for (int i2 = 0; i2 < j && i.o(new p3(1)); i2++) {
        }
        for (int i3 = 0; i3 < j3 && i.o(interfaceC1628z0J1); i3++) {
        }
        interfaceC1628z0J1.end();
        return interfaceC1628z0J1.build();
    }

    public static F0 I0(F0 f0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == f0.count()) {
            return f0;
        }
        Spliterator spliterator = f0.spliterator();
        long j3 = j2 - j;
        A0 a0P0 = P0(j3, intFunction);
        a0P0.f(j3);
        for (int i = 0; i < j && spliterator.a(new C1546f0(5)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.a(a0P0); i2++) {
        }
        a0P0.end();
        return a0P0.build();
    }

    static long J0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator K0(W2 w2, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = AbstractC1595q2.a[w2.ordinal()];
        if (i == 1) {
            return new s3(spliterator, j, j4);
        }
        if (i == 2) {
            return new o3((j$.util.F) spliterator, j, j4);
        }
        if (i == 3) {
            return new q3((j$.util.I) spliterator, j, j4);
        }
        if (i == 4) {
            return new m3((j$.util.C) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape " + w2);
    }

    static long L0(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    static A0 P0(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C1601s1() : new C1522a1(j, intFunction);
    }

    public static F0 Q0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jA1 = abstractC1616w0.a1(spliterator);
        if (jA1 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f0 = (F0) new L0(spliterator, intFunction, abstractC1616w0).invoke();
            return z ? c1(f0, intFunction) : f0;
        }
        if (jA1 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jA1);
        new C1594q1(spliterator, abstractC1616w0, objArr).invoke();
        return new I0(objArr);
    }

    public static B0 R0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        long jA1 = abstractC1616w0.a1(spliterator);
        if (jA1 < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b0 = (B0) new L0(0, spliterator, abstractC1616w0).invoke();
            return z ? d1(b0) : b0;
        }
        if (jA1 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jA1];
        new C1582n1(spliterator, abstractC1616w0, dArr).invoke();
        return new S0(dArr);
    }

    public static C0 S0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        long jA1 = abstractC1616w0.a1(spliterator);
        if (jA1 < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c0 = (C0) new L0(1, spliterator, abstractC1616w0).invoke();
            return z ? e1(c0) : c0;
        }
        if (jA1 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jA1];
        new C1586o1(spliterator, abstractC1616w0, iArr).invoke();
        return new C1527b1(iArr);
    }

    public static D0 T0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        long jA1 = abstractC1616w0.a1(spliterator);
        if (jA1 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d0 = (D0) new L0(2, spliterator, abstractC1616w0).invoke();
            return z ? f1(d0) : d0;
        }
        if (jA1 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jA1];
        new C1590p1(spliterator, abstractC1616w0, jArr).invoke();
        return new C1570k1(jArr);
    }

    static H0 U0(W2 w2, F0 f0, F0 f1) {
        int i = G0.a[w2.ordinal()];
        if (i == 1) {
            return new R0(f0, f1);
        }
        if (i == 2) {
            return new O0((C0) f0, (C0) f1);
        }
        if (i == 3) {
            return new P0((D0) f0, (D0) f1);
        }
        if (i == 4) {
            return new N0((B0) f0, (B0) f1);
        }
        throw new IllegalStateException("Unknown shape " + w2);
    }

    static InterfaceC1620x0 X0(long j) {
        return (j < 0 || j >= 2147483639) ? new U0() : new T0(j);
    }

    public static G Y0(j$.util.C c2) {
        return new A(c2, V2.l(c2));
    }

    static Z0 Z0(W2 w2) {
        Object obj;
        int i = G0.a[w2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            obj = b;
        } else if (i == 3) {
            obj = c;
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape " + w2);
            }
            obj = d;
        }
        return (Z0) obj;
    }

    private static int b1(long j) {
        return (j != -1 ? V2.u : 0) | V2.t;
    }

    public static F0 c1(F0 f0, IntFunction intFunction) {
        if (f0.j() <= 0) {
            return f0;
        }
        long jCount = f0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C1609u1(f0, objArr).invoke();
        return new I0(objArr);
    }

    public static B0 d1(B0 b0) {
        if (b0.j() <= 0) {
            return b0;
        }
        long jCount = b0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C1605t1(b0, dArr).invoke();
        return new S0(dArr);
    }

    public static C0 e1(C0 c0) {
        if (c0.j() <= 0) {
            return c0;
        }
        long jCount = c0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C1605t1(c0, iArr).invoke();
        return new C1527b1(iArr);
    }

    public static D0 f1(D0 d0) {
        if (d0.j() <= 0) {
            return d0;
        }
        long jCount = d0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C1605t1(d0, jArr).invoke();
        return new C1570k1(jArr);
    }

    static InterfaceC1624y0 h1(long j) {
        return (j < 0 || j >= 2147483639) ? new C1537d1() : new C1532c1(j);
    }

    public static IntStream i1(j$.util.F f2) {
        return new C1521a0(f2, V2.l(f2));
    }

    static InterfaceC1628z0 j1(long j) {
        return (j < 0 || j >= 2147483639) ? new C1578m1() : new C1574l1(j);
    }

    public static InterfaceC1581n0 k1(j$.util.I i) {
        return new C1556h0(i, V2.l(i));
    }

    public static G l1(AbstractC1530c abstractC1530c, long j, long j2) {
        if (j >= 0) {
            return new C1591p2(abstractC1530c, b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C1608u0 m1(InterfaceC1501t interfaceC1501t, EnumC1604t0 enumC1604t0) {
        interfaceC1501t.getClass();
        enumC1604t0.getClass();
        return new C1608u0(W2.DOUBLE_VALUE, enumC1604t0, new C1584o(3, enumC1604t0, interfaceC1501t));
    }

    public static IntStream n1(AbstractC1530c abstractC1530c, long j, long j2) {
        if (j >= 0) {
            return new C1575l2(abstractC1530c, b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C1608u0 o1(j$.util.function.P p, EnumC1604t0 enumC1604t0) {
        p.getClass();
        enumC1604t0.getClass();
        return new C1608u0(W2.INT_VALUE, enumC1604t0, new C1584o(1, enumC1604t0, p));
    }

    public static void p0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC1581n0 p1(AbstractC1530c abstractC1530c, long j, long j2) {
        if (j >= 0) {
            return new C1583n2(abstractC1530c, b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void q0(InterfaceC1543e2 interfaceC1543e2, Double d2) {
        if (H3.a) {
            H3.a(interfaceC1543e2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC1543e2.accept(d2.doubleValue());
    }

    public static C1608u0 q1(InterfaceC1493m0 interfaceC1493m0, EnumC1604t0 enumC1604t0) {
        interfaceC1493m0.getClass();
        enumC1604t0.getClass();
        return new C1608u0(W2.LONG_VALUE, enumC1604t0, new C1584o(4, enumC1604t0, interfaceC1493m0));
    }

    public static void s0(InterfaceC1548f2 interfaceC1548f2, Integer num) {
        if (H3.a) {
            H3.a(interfaceC1548f2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC1548f2.accept(num.intValue());
    }

    public static C1608u0 s1(Predicate predicate, EnumC1604t0 enumC1604t0) {
        predicate.getClass();
        enumC1604t0.getClass();
        return new C1608u0(W2.REFERENCE, enumC1604t0, new C1584o(2, enumC1604t0, predicate));
    }

    public static Stream t1(AbstractC1530c abstractC1530c, long j, long j2) {
        if (j >= 0) {
            return new C1567j2(abstractC1530c, b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void u0(InterfaceC1553g2 interfaceC1553g2, Long l) {
        if (H3.a) {
            H3.a(interfaceC1553g2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC1553g2.accept(l.longValue());
    }

    public static Stream v1(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new W1(spliterator, V2.l(spliterator), z);
    }

    public static void w0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void x0() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] y0(E0 e0, IntFunction intFunction) {
        if (H3.a) {
            H3.a(e0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e0.count());
        e0.e(objArr, 0);
        return objArr;
    }

    public static void z0(B0 b0, Double[] dArr, int i) {
        if (H3.a) {
            H3.a(b0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) b0.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    @Override // j$.util.stream.E3
    public /* synthetic */ int P() {
        return 0;
    }

    abstract void V0(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2);

    abstract void W0(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2);

    abstract long a1(Spliterator spliterator);

    abstract int g1();

    @Override // j$.util.stream.E3
    public Object n0(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        P1 p1U1 = u1();
        abstractC1616w0.w1(spliterator, p1U1);
        return p1U1.get();
    }

    abstract A0 r1(long j, IntFunction intFunction);

    public abstract P1 u1();

    abstract InterfaceC1558h2 w1(Spliterator spliterator, InterfaceC1558h2 interfaceC1558h2);

    abstract InterfaceC1558h2 x1(InterfaceC1558h2 interfaceC1558h2);

    @Override // j$.util.stream.E3
    public Object y(AbstractC1616w0 abstractC1616w0, Spliterator spliterator) {
        return ((P1) new R1(this, abstractC1616w0, spliterator).invoke()).get();
    }
}
