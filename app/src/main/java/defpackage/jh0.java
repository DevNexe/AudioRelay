package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jh0<T> implements nq2<T> {
    public static final AtomicLongFieldUpdater<jh0<?>> A;
    private volatile long top;
    public final int w;
    public final int x;
    public final AtomicReferenceArray<T> y;
    public final int[] z;

    public /* synthetic */ class QnHx extends mi2 {
        public static final /* synthetic */ int D = 0;

        public QnHx() {
            super(jh0.class, "top", "getTop()J", 0);
        }

        @Override // defpackage.mi2, defpackage.pv1
        public final Object get(Object obj) {
            return Long.valueOf(((jh0) obj).top);
        }
    }

    static {
        int i = QnHx.D;
        A = AtomicLongFieldUpdater.newUpdater(jh0.class, "top");
    }

    public jh0(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException(GM.a("capacity should be positive but it is ", i).toString());
        }
        if (!(i <= 536870911)) {
            throw new IllegalArgumentException(GM.a("capacity should be less or equal to 536870911 but it is ", i).toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.w = iHighestOneBit;
        this.x = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.y = new AtomicReferenceArray<>(i2);
        this.z = new int[i2];
    }

    @Override // defpackage.nq2
    public final T B() {
        T tC;
        T tH = h();
        return (tH == null || (tC = c(tH)) == null) ? g() : tC;
    }

    public T c(T t) {
        return t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e();
    }

    public final void e() {
        while (true) {
            T tH = h();
            if (tH == null) {
                return;
            } else {
                f(tH);
            }
        }
    }

    public void f(T t) {
    }

    public abstract T g();

    public final T h() {
        int i;
        while (true) {
            long j = this.top;
            i = 0;
            if (j == 0) {
                break;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            int i2 = (int) (4294967295L & j);
            if (i2 == 0) {
                break;
            }
            if (A.compareAndSet(this, j, (j2 << 32) | ((long) this.z[i2]))) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            return null;
        }
        return this.y.getAndSet(i, null);
    }

    public void i(T t) {
    }

    @Override // defpackage.nq2
    public final void p0(T t) {
        boolean z;
        long j;
        long j2;
        i(t);
        boolean z2 = true;
        int iIdentityHashCode = ((System.identityHashCode(t) * (-1640531527)) >>> this.x) + 1;
        int i = 0;
        while (true) {
            if (i >= 8) {
                z2 = false;
                break;
            }
            AtomicReferenceArray<T> atomicReferenceArray = this.y;
            while (true) {
                if (atomicReferenceArray.compareAndSet(iIdentityHashCode, null, t)) {
                    z = true;
                    break;
                } else if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (!(iIdentityHashCode > 0)) {
                    throw new IllegalArgumentException("index should be positive".toString());
                }
                do {
                    j = this.top;
                    j2 = ((long) iIdentityHashCode) | ((((j >> 32) & 4294967295L) + 1) << 32);
                    this.z[iIdentityHashCode] = (int) (4294967295L & j);
                } while (!A.compareAndSet(this, j, j2));
            } else {
                iIdentityHashCode--;
                if (iIdentityHashCode == 0) {
                    iIdentityHashCode = this.w;
                }
                i++;
            }
        }
        if (z2) {
            return;
        }
        f(t);
    }
}
