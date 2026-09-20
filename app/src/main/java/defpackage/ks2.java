package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ks2<T> extends r50<T> implements kp3 {
    public final us2<T> w;
    public final AtomicReference<auxFixed<T>> x;
    public final CQf<T> y;
    public final us2<T> z;

    public interface CQf<T> {
        NUlFixed<T> call();
    }

    public static final class EQ implements CQf<Object> {
        @Override // ks2.CQf
        public final NUlFixed<Object> call() {
            return new FJCM();
        }
    }

    public static final class F1<T> extends AtomicInteger implements vl0 {
        public final auxFixed<T> w;
        public final ht2<? super T> x;
        public Serializable y;
        public volatile boolean z;

        public F1(auxFixed<T> auxVar, ht2<? super T> ht2Var) {
            this.w = auxVar;
            this.x = ht2Var;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.z) {
                return;
            }
            this.z = true;
            this.w.d(this);
            this.y = null;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.z;
        }
    }

    public static final class FJCM<T> extends ArrayList<Object> implements NUlFixed<T> {
        public volatile int w;

        public FJCM() {
            super(16);
        }

        @Override // ks2.NUlFixed
        public final void a(T t) {
            add(t);
            this.w++;
        }

        @Override // ks2.NUlFixed
        public final void c(F1<T> f1) {
            if (f1.getAndIncrement() != 0) {
                return;
            }
            ht2<? super T> ht2Var = f1.x;
            int iAddAndGet = 1;
            while (!f1.z) {
                int i = this.w;
                Integer num = (Integer) f1.y;
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i) {
                    if (gq2.a(ht2Var, get(iIntValue)) || f1.z) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                f1.y = Integer.valueOf(iIntValue);
                iAddAndGet = f1.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // ks2.NUlFixed
        public final void d(Throwable th) {
            add(new gq2.CQf(th));
            this.w++;
        }

        @Override // ks2.NUlFixed
        public final void h() {
            add(gq2.COMPLETE);
            this.w++;
        }
    }

    public static final class LPt8Fixed extends AtomicReference<LPt8Fixed> {
        public final Object w;

        public LPt8Fixed(Object obj) {
            this.w = obj;
        }
    }

    public interface NUlFixed<T> {
        void a(T t);

        void c(F1<T> f1);

        void d(Throwable th);

        void h();
    }

    public static abstract class QnHx<T> extends AtomicReference<LPt8Fixed> implements NUlFixed<T> {
        public LPt8Fixed w;
        public int x;

        public QnHx() {
            LPt8Fixed lPt8 = new LPt8Fixed(null);
            this.w = lPt8;
            set(lPt8);
        }

        @Override // ks2.NUlFixed
        public final void a(T t) {
            LPt8Fixed lPt8 = new LPt8Fixed(t);
            this.w.set(lPt8);
            this.w = lPt8;
            this.x++;
            byN byn = (byN) this;
            if (byn.x > byn.y) {
                LPt8Fixed lPt9 = byn.get().get();
                byn.x--;
                byn.set(lPt9);
            }
        }

        @Override // ks2.NUlFixed
        public final void c(F1<T> f1) {
            if (f1.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                LPt8Fixed lPt8 = (LPt8Fixed) f1.y;
                if (lPt8 == null) {
                    lPt8 = get();
                    f1.y = lPt8;
                }
                while (true) {
                    if (f1.z) {
                        f1.y = null;
                        return;
                    }
                    LPt8Fixed lPt9 = lPt8.get();
                    if (lPt9 != null) {
                        if (gq2.a(f1.x, lPt9.w)) {
                            f1.y = null;
                            return;
                        }
                        lPt8 = lPt9;
                    }
                }
                f1.y = lPt8;
                iAddAndGet = f1.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // ks2.NUlFixed
        public final void d(Throwable th) {
            LPt8Fixed lPt8 = new LPt8Fixed(new gq2.CQf(th));
            this.w.set(lPt8);
            this.w = lPt8;
            this.x++;
            LPt8Fixed lPt9 = get();
            if (lPt9.w != null) {
                LPt8Fixed lPt10 = new LPt8Fixed(null);
                lPt10.lazySet(lPt9.get());
                set(lPt10);
            }
        }

        @Override // ks2.NUlFixed
        public final void h() {
            LPt8Fixed lPt8 = new LPt8Fixed(gq2.COMPLETE);
            this.w.set(lPt8);
            this.w = lPt8;
            this.x++;
            LPt8Fixed lPt9 = get();
            if (lPt9.w != null) {
                LPt8Fixed lPt10 = new LPt8Fixed(null);
                lPt10.lazySet(lPt9.get());
                set(lPt10);
            }
        }
    }

    public static final class T23<T> implements us2<T> {
        public final AtomicReference<auxFixed<T>> w;
        public final CQf<T> x;

        public T23(AtomicReference<auxFixed<T>> atomicReference, CQf<T> cQf) {
            this.w = atomicReference;
            this.x = cQf;
        }

        @Override // defpackage.us2
        public final void a(ht2<? super T> ht2Var) {
            auxFixed<T> auxVar;
            boolean z;
            boolean z2;
            while (true) {
                auxVar = this.w.get();
                if (auxVar != null) {
                    break;
                }
                auxFixed<T> auxVar2 = new auxFixed<>(this.x.call());
                AtomicReference<auxFixed<T>> atomicReference = this.w;
                while (true) {
                    if (atomicReference.compareAndSet(null, auxVar2)) {
                        z2 = true;
                        break;
                    } else if (atomicReference.get() != null) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    auxVar = auxVar2;
                    break;
                }
            }
            F1<T> f1 = new F1<>(auxVar, ht2Var);
            ht2Var.c(f1);
            do {
                AtomicReference<F1[]> atomicReference2 = auxVar.y;
                F1[] f1Arr = atomicReference2.get();
                if (f1Arr == auxFixed.B) {
                    break;
                }
                int length = f1Arr.length;
                F1[] f1Arr2 = new F1[length + 1];
                System.arraycopy(f1Arr, 0, f1Arr2, 0, length);
                f1Arr2[length] = f1;
                while (true) {
                    if (atomicReference2.compareAndSet(f1Arr, f1Arr2)) {
                        z = true;
                        break;
                    } else if (atomicReference2.get() != f1Arr) {
                        z = false;
                        break;
                    }
                }
            } while (!z);
            if (f1.z) {
                auxVar.d(f1);
            } else {
                auxVar.w.c(f1);
            }
        }
    }

    public static final class YKK<T> implements CQf<T> {
        public final int a = 1;

        @Override // ks2.CQf
        public final NUlFixed<T> call() {
            return new byN(this.a);
        }
    }

    public static final class auxFixed<T> extends AtomicReference<vl0> implements ht2<T>, vl0 {
        public static final F1[] A = new F1[0];
        public static final F1[] B = new F1[0];
        public final NUlFixed<T> w;
        public boolean x;
        public final AtomicReference<F1[]> y = new AtomicReference<>(A);
        public final AtomicBoolean z = new AtomicBoolean();

        public auxFixed(NUlFixed<T> nUl) {
            this.w = nUl;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.set(B);
            bm0.c(this);
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.x) {
                return;
            }
            this.x = true;
            NUlFixed<T> nUl = this.w;
            nUl.h();
            for (F1<T> f1 : this.y.getAndSet(B)) {
                nUl.c(f1);
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                for (F1<T> f1 : this.y.get()) {
                    this.w.c(f1);
                }
            }
        }

        public final void d(F1<T> f1) {
            boolean z;
            F1[] f1Arr;
            do {
                AtomicReference<F1[]> atomicReference = this.y;
                F1[] f1Arr2 = atomicReference.get();
                int length = f1Arr2.length;
                if (length == 0) {
                    return;
                }
                z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (f1Arr2[i].equals(f1)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    f1Arr = A;
                } else {
                    F1[] f1Arr3 = new F1[length - 1];
                    System.arraycopy(f1Arr2, 0, f1Arr3, 0, i);
                    System.arraycopy(f1Arr2, i + 1, f1Arr3, i, (length - i) - 1);
                    f1Arr = f1Arr3;
                }
                do {
                    if (atomicReference.compareAndSet(f1Arr2, f1Arr)) {
                        z = true;
                        break;
                    }
                } while (atomicReference.get() == f1Arr2);
            } while (!z);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.get() == B;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.x) {
                return;
            }
            NUlFixed<T> nUl = this.w;
            nUl.a(t);
            for (F1<T> f1 : this.y.get()) {
                nUl.c(f1);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.x) {
                m14.b(th);
                return;
            }
            this.x = true;
            NUlFixed<T> nUl = this.w;
            nUl.d(th);
            for (F1<T> f1 : this.y.getAndSet(B)) {
                nUl.c(f1);
            }
        }
    }

    public static final class byN<T> extends QnHx<T> {
        public final int y;

        public byN(int i) {
            this.y = i;
        }
    }

    static {
        new EQ();
    }

    public ks2(T23 t23, us2 us2Var, AtomicReference atomicReference, CQf cQf) {
        this.z = t23;
        this.w = us2Var;
        this.x = atomicReference;
        this.y = cQf;
    }

    @Override // defpackage.r50
    public final void G(m70<? super vl0> m70Var) {
        auxFixed<T> auxVar;
        boolean z;
        while (true) {
            AtomicReference<auxFixed<T>> atomicReference = this.x;
            auxVar = atomicReference.get();
            if (auxVar != null && !auxVar.e()) {
                break;
            }
            auxFixed<T> auxVar2 = new auxFixed<>(this.y.call());
            while (true) {
                if (atomicReference.compareAndSet(auxVar, auxVar2)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != auxVar) {
                    z = false;
                    break;
                }
            }
            if (z) {
                auxVar = auxVar2;
                break;
            }
        }
        boolean z2 = auxVar.z.get();
        AtomicBoolean atomicBoolean = auxVar.z;
        boolean z3 = !z2 && atomicBoolean.compareAndSet(false, true);
        try {
            m70Var.accept(auxVar);
            if (z3) {
                this.w.a(auxVar);
            }
        } catch (Throwable th) {
            if (z3) {
                atomicBoolean.compareAndSet(true, false);
            }
            XTd3.w(th);
            throw uu0.d(th);
        }
    }

    @Override // defpackage.kp3
    public final void d(vl0 vl0Var) {
        AtomicReference<auxFixed<T>> atomicReference;
        auxFixed<T> auxVar = (auxFixed) vl0Var;
        do {
            atomicReference = this.x;
            if (atomicReference.compareAndSet(auxVar, null)) {
                return;
            }
        } while (atomicReference.get() == auxVar);
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.z.a(ht2Var);
    }
}
