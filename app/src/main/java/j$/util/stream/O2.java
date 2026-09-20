package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.function.C1475d0;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1481g0;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class O2 extends Q2 implements InterfaceC1481g0 {
    O2() {
    }

    O2(int i) {
        super(i);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public void accept(long j) {
        w();
        long[] jArr = (long[]) this.e;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC1481g0) {
            d((InterfaceC1481g0) consumer);
        } else {
            if (H3.a) {
                H3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.b0.h(spliterator());
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i) {
        return new long[i];
    }

    @Override // j$.util.stream.Q2
    protected final void r(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        InterfaceC1481g0 interfaceC1481g0 = (InterfaceC1481g0) obj2;
        while (i < i2) {
            interfaceC1481g0.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Q2
    protected final int s(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, RCHTTPStatusCodes.SUCCESS)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] v() {
        return new long[8][];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.I spliterator() {
        return new N2(this, 0, this.c, 0, this.b);
    }
}
