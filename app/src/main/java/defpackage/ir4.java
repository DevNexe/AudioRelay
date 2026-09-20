package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ir4<E> extends AtomicReferenceArray<E> implements tk4<E> {
    public static final Integer B = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int A;
    public final int w;
    public final AtomicLong x;
    public long y;
    public final AtomicLong z;

    public ir4(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.w = length() - 1;
        this.x = new AtomicLong();
        this.z = new AtomicLong();
        this.A = Math.min(i / 4, B.intValue());
    }

    @Override // defpackage.uk4
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.uk4
    public final boolean isEmpty() {
        return this.x.get() == this.z.get();
    }

    @Override // defpackage.uk4
    public final boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.x;
        long j = atomicLong.get();
        int i = this.w;
        int i2 = ((int) j) & i;
        if (j >= this.y) {
            long j2 = ((long) this.A) + j;
            if (get(i & ((int) j2)) == null) {
                this.y = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, e);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.tk4, defpackage.uk4
    public final E poll() {
        AtomicLong atomicLong = this.z;
        long j = atomicLong.get();
        int i = ((int) j) & this.w;
        E e = get(i);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return e;
    }
}
