package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.function.C1488k;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1494n;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class K2 extends Q2 implements InterfaceC1494n {
    K2() {
    }

    K2(int i) {
        super(i);
    }

    @Override // j$.util.function.InterfaceC1494n
    public void accept(double d) {
        w();
        double[] dArr = (double[]) this.e;
        int i = this.b;
        this.b = i + 1;
        dArr[i] = d;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC1494n) {
            d((InterfaceC1494n) consumer);
        } else {
            if (H3.a) {
                H3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.b0.f(spliterator());
    }

    @Override // j$.util.function.InterfaceC1494n
    public final InterfaceC1494n m(InterfaceC1494n interfaceC1494n) {
        interfaceC1494n.getClass();
        return new C1488k(this, interfaceC1494n);
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.Q2
    protected final void r(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC1494n interfaceC1494n = (InterfaceC1494n) obj2;
        while (i < i2) {
            interfaceC1494n.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Q2
    protected final int s(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, RCHTTPStatusCodes.SUCCESS)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] v() {
        return new double[8][];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.C spliterator() {
        return new J2(this, 0, this.c, 0, this.b);
    }
}
