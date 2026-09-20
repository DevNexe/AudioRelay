package defpackage;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class m91 {
    public static final FJCM a = new FJCM();
    public static final EQ b = new EQ();
    public static final T23 c = new T23();
    public static final byN d = new byN();
    public static final LPt6Fixed e = new LPt6Fixed();
    public static final Xn1 f = new Xn1();

    public static final class CQf<T1, T2, R> implements i91<Object[], R> {
        public final ba<? super T1, ? super T2, ? extends R> w;

        public CQf(ba<? super T1, ? super T2, ? extends R> baVar) {
            this.w = baVar;
        }

        @Override // defpackage.i91
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.w.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    public static final class EQ implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    public static final class F1<T1, T2, T3, R> implements i91<Object[], R> {
        public final z81<T1, T2, T3, R> w;

        public F1(z81<T1, T2, T3, R> z81Var) {
            this.w = z81Var;
        }

        @Override // defpackage.i91
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            return this.w.b((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2]);
        }
    }

    public static final class FJCM implements i91<Object, Object> {
        @Override // defpackage.i91
        public final Object apply(Object obj) {
            return obj;
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    public static final class LPt6Fixed implements m70<Throwable> {
        @Override // defpackage.m70
        public final void accept(Throwable th) {
            m14.b(new OnErrorNotImplementedException(th));
        }
    }

    public static final class LPt8Fixed<T1, T2, T3, T4, R> implements i91<Object[], R> {
        public final b91<T1, T2, T3, T4, R> w;

        public LPt8Fixed(b91<T1, T2, T3, T4, R> b91Var) {
            this.w = b91Var;
        }

        @Override // defpackage.i91
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr2.length);
            }
            return this.w.a((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3]);
        }
    }

    public static final class MZ<T> implements m70<T> {
        public final m70<? super rp2<T>> w;

        public MZ(CY cy) {
            this.w = cy;
        }

        @Override // defpackage.m70
        public final void accept(T t) {
            if (t == null) {
                throw new NullPointerException("value is null");
            }
            this.w.accept(new rp2(t));
        }
    }

    public static final class NUlFixed<T1, T2, T3, T4, T5, R> implements i91<Object[], R> {
        public final d91<T1, T2, T3, T4, T5, R> w;

        public NUlFixed(d91<T1, T2, T3, T4, T5, R> d91Var) {
            this.w = d91Var;
        }

        @Override // defpackage.i91
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr2.length);
            }
            return this.w.a((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4]);
        }
    }

    public static final class PRnFixed<T, U> implements Callable<U>, i91<T, U> {
        public final U w;

        public PRnFixed(U u) {
            this.w = u;
        }

        @Override // defpackage.i91
        public final U apply(T t) {
            return this.w;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.w;
        }
    }

    public static final class QnHx<T> implements m70<T> {
        public final InterfaceC1443fH w;

        public QnHx(l83 l83Var) {
            this.w = l83Var;
        }

        @Override // defpackage.m70
        public final void accept(T t) {
            this.w.run();
        }
    }

    public static final class RBi<T> implements m70<Throwable> {
        public final m70<? super rp2<T>> w;

        public RBi(CY cy) {
            this.w = cy;
        }

        @Override // defpackage.m70
        public final void accept(Throwable th) {
            Throwable th2 = th;
            if (th2 == null) {
                throw new NullPointerException("error is null");
            }
            this.w.accept(new rp2(new gq2.CQf(th2)));
        }
    }

    public static final class T23 implements InterfaceC1443fH {
        @Override // defpackage.InterfaceC1443fH
        public final void run() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    public static final class Xn1 implements pa3<Object> {
        @Override // defpackage.pa3
        public final boolean test(Object obj) {
            return true;
        }
    }

    public static final class YKK<T, U> implements i91<T, U> {
        public final Class<U> w;

        public YKK(Class<U> cls) {
            this.w = cls;
        }

        @Override // defpackage.i91
        public final U apply(T t) {
            return this.w.cast(t);
        }
    }

    public static final class auxFixed<T, U> implements pa3<T> {
        public final Class<U> w;

        public auxFixed(Class<U> cls) {
            this.w = cls;
        }

        @Override // defpackage.pa3
        public final boolean test(T t) {
            return this.w.isInstance(t);
        }
    }

    public static final class byN implements m70<Object> {
        @Override // defpackage.m70
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    public static final class y<T> implements InterfaceC1443fH {
        public final m70<? super rp2<T>> a;

        public y(CY cy) {
            this.a = cy;
        }

        @Override // defpackage.InterfaceC1443fH
        public final void run() {
            this.a.accept(rp2.b);
        }
    }
}
