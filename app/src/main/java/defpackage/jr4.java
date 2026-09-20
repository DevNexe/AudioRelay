package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class jr4<T> implements tk4<T> {
    public static final int E = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object F = new Object();
    public AtomicReferenceArray<Object> A;
    public final int B;
    public AtomicReferenceArray<Object> C;
    public final AtomicLong D;
    public final AtomicLong w;
    public int x;
    public long y;
    public final int z;

    public jr4(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.w = atomicLong;
        this.D = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.A = atomicReferenceArray;
        this.z = i2;
        this.x = Math.min(iNumberOfLeadingZeros / 4, E);
        this.C = atomicReferenceArray;
        this.B = i2;
        this.y = i2 - 1;
        atomicLong.lazySet(0L);
    }

    public final void a(b11.CQf cQf, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.A;
        AtomicLong atomicLong = this.w;
        long j = atomicLong.get();
        long j2 = 2 + j;
        int i = this.z;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = i & ((int) j);
            atomicReferenceArray.lazySet(i2 + 1, obj);
            atomicReferenceArray.lazySet(i2, cQf);
            atomicLong.lazySet(j2);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.A = atomicReferenceArray2;
        int i3 = i & ((int) j);
        atomicReferenceArray2.lazySet(i3 + 1, obj);
        atomicReferenceArray2.lazySet(i3, cQf);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, F);
        atomicLong.lazySet(j2);
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
        return this.w.get() == this.D.get();
    }

    @Override // defpackage.uk4
    public final boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.A;
        AtomicLong atomicLong = this.w;
        long j = atomicLong.get();
        int i = this.z;
        int i2 = ((int) j) & i;
        if (j < this.y) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = ((long) this.x) + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.y = j2 - 1;
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, t);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.A = atomicReferenceArray2;
        this.y = (((long) i) + j) - 1;
        atomicReferenceArray2.lazySet(i2, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, F);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // defpackage.tk4, defpackage.uk4
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.C;
        AtomicLong atomicLong = this.D;
        long j = atomicLong.get();
        int i = this.B;
        int i2 = ((int) j) & i;
        T t = (T) atomicReferenceArray.get(i2);
        boolean z = t == F;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return t;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.C = atomicReferenceArray2;
        T t2 = (T) atomicReferenceArray2.get(i2);
        if (t2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return t2;
    }
}
