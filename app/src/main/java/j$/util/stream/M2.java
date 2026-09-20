package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class M2 extends Q2 implements j$.util.function.L {
    M2() {
    }

    M2(int i) {
        super(i);
    }

    @Override // j$.util.function.L
    public void accept(int i) {
        w();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.L) {
            d((j$.util.function.L) consumer);
        } else {
            if (H3.a) {
                H3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.b0.g(spliterator());
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }

    @Override // j$.util.stream.Q2
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.Q2
    protected final void r(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.L l = (j$.util.function.L) obj2;
        while (i < i2) {
            l.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.Q2
    protected final int s(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, RCHTTPStatusCodes.SUCCESS)));
    }

    @Override // j$.util.stream.Q2
    protected final Object[] v() {
        return new int[8][];
    }

    @Override // j$.util.stream.Q2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.F spliterator() {
        return new L2(this, 0, this.c, 0, this.b);
    }
}
