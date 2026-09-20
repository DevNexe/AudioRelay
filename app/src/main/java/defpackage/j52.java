package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class j52<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final py4 g = new py4("REMOVE_FROZEN");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(j52.class, Object.class, "_next");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(j52.class, "_state");

    public static final class QnHx {
        public final int a;

        public QnHx(int i) {
            this.a = i;
        }
    }

    public j52(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(E e2) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.b && this.d.get(i2 & i3) != null) {
                int i4 = this.a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.d.set(i2 & i3, e2);
                j52<E> j52VarE = this;
                while ((j52VarE._state & 1152921504606846976L) != 0) {
                    j52VarE = j52VarE.e();
                    AtomicReferenceArray atomicReferenceArray = j52VarE.d;
                    int i5 = j52VarE.c & i2;
                    Object obj = atomicReferenceArray.get(i5);
                    if ((obj instanceof QnHx) && ((QnHx) obj).a == i2) {
                        atomicReferenceArray.set(i5, e2);
                    } else {
                        j52VarE = null;
                    }
                    if (j52VarE == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final boolean d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j52<E> e() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            j52<E> j52Var = (j52) this._next;
            if (j52Var != null) {
                return j52Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            j52 j52Var2 = new j52(this.a * 2, this.b);
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object qnHx = this.d.get(i4);
                if (qnHx == null) {
                    qnHx = new QnHx(i);
                }
                j52Var2.d.set(j52Var2.c & i, qnHx);
                i++;
            }
            j52Var2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, j52Var2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.d.get(i4);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else {
                if (obj instanceof QnHx) {
                    return null;
                }
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                if (f.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.d.set(this.c & i, null);
                    return obj;
                }
                if (this.b) {
                    j52<E> j52VarE = this;
                    while (true) {
                        long j3 = j52VarE._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            j52VarE = j52VarE.e();
                        } else {
                            if (f.compareAndSet(j52VarE, j3, (j3 & (-1073741824)) | j2)) {
                                j52VarE.d.set(j52VarE.c & i5, null);
                                j52VarE = null;
                            } else {
                                continue;
                            }
                        }
                        if (j52VarE == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
