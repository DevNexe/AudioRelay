package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC1487j0;
import j$.util.function.InterfaceC1507z;
import j$.util.function.Supplier;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1525b implements IntFunction, j$.util.function.z0, BiConsumer, InterfaceC1507z, Supplier, ToDoubleFunction, ToIntFunction, j$.util.function.W, j$.util.function.C0, j$.util.function.w0, ToLongFunction, j$.util.function.F0, InterfaceC1487j0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C1525b(int i) {
        this.a = i;
    }

    @Override // j$.util.function.w0
    public final j$.util.function.w0 a(j$.util.function.w0 w0Var) {
        w0Var.getClass();
        return new j$.util.function.t0(this, w0Var, 1);
    }

    @Override // j$.util.function.z0
    public final void accept(Object obj, double d) {
        switch (this.a) {
            case 2:
                double[] dArr = (double[]) obj;
                AbstractC1580n.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                AbstractC1580n.a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                break;
        }
    }

    @Override // j$.util.function.C0
    public final void accept(Object obj, int i) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + ((long) i);
    }

    @Override // j$.util.function.F0
    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC1580n.a(dArr, dArr2[0]);
                AbstractC1580n.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 7:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC1580n.a(dArr3, dArr4[0]);
                AbstractC1580n.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 1:
                return new Double[i];
            case 14:
                int i2 = U.h;
                return new Object[i];
            case 20:
                return new Integer[i];
            default:
                return new Long[i];
        }
    }

    @Override // j$.util.function.InterfaceC1487j0
    public final Object apply(long j) {
        switch (this.a) {
            case 27:
                return AbstractC1616w0.X0(j);
            case 28:
                return AbstractC1616w0.h1(j);
            default:
                return AbstractC1616w0.j1(j);
        }
    }

    @Override // j$.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.InterfaceC1507z
    public final long applyAsLong(double d) {
        return 1L;
    }

    @Override // j$.util.function.W
    public final long applyAsLong(int i) {
        return 1L;
    }

    @Override // j$.util.function.w0
    public final long applyAsLong(long j) {
        return 1L;
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.w0
    public final j$.util.function.w0 b(j$.util.function.w0 w0Var) {
        w0Var.getClass();
        return new j$.util.function.t0(this, w0Var, 0);
    }

    @Override // j$.util.function.BiConsumer
    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.a) {
            case 3:
                biConsumer.getClass();
                break;
            case 7:
                biConsumer.getClass();
                break;
            case 19:
                biConsumer.getClass();
                break;
            default:
                biConsumer.getClass();
                break;
        }
        return new j$.util.concurrent.u(1, this, biConsumer);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 5:
                return new double[4];
            case 6:
            case 7:
            case 8:
            case 14:
            case 15:
            case 16:
            default:
                return new long[2];
            case 9:
                return new double[3];
            case 10:
                return new I();
            case 11:
                return new K();
            case 12:
                return new L();
            case 13:
                return new J();
            case 17:
                return new long[2];
        }
    }
}
