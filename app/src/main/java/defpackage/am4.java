package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class am4<T, R> extends vk4<R> {
    public final rl4<? extends T>[] w;
    public final i91<? super Object[], ? extends R> x;

    public static final class CQf<T, R> extends AtomicInteger implements vl0 {
        public final ml4<? super R> w;
        public final i91<? super Object[], ? extends R> x;
        public final F1<T>[] y;
        public final Object[] z;

        public CQf(ml4<? super R> ml4Var, int i, i91<? super Object[], ? extends R> i91Var) {
            super(i);
            this.w = ml4Var;
            this.x = i91Var;
            F1<T>[] f1Arr = new F1[i];
            for (int i2 = 0; i2 < i; i2++) {
                f1Arr[i2] = new F1<>(this, i2);
            }
            this.y = f1Arr;
            this.z = new Object[i];
        }

        @Override // defpackage.vl0
        public final void a() {
            if (getAndSet(0) > 0) {
                for (F1<T> f1 : this.y) {
                    f1.getClass();
                    bm0.c(f1);
                }
            }
        }

        public final void b(int i, Throwable th) {
            if (getAndSet(0) <= 0) {
                m14.b(th);
                return;
            }
            F1<T>[] f1Arr = this.y;
            int length = f1Arr.length;
            for (int i2 = 0; i2 < i; i2++) {
                F1<T> f1 = f1Arr[i2];
                f1.getClass();
                bm0.c(f1);
            }
            while (true) {
                i++;
                if (i >= length) {
                    this.w.onError(th);
                    return;
                } else {
                    F1<T> f2 = f1Arr[i];
                    f2.getClass();
                    bm0.c(f2);
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return get() <= 0;
        }
    }

    public static final class F1<T> extends AtomicReference<vl0> implements ml4<T> {
        public final CQf<T, ?> w;
        public final int x;

        public F1(CQf<T, ?> cQf, int i) {
            this.w = cQf;
            this.x = i;
        }

        @Override // defpackage.ml4
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.ml4
        public final void onError(Throwable th) {
            this.w.b(this.x, th);
        }

        @Override // defpackage.ml4
        public final void onSuccess(T t) {
            CQf<T, ?> cQf = this.w;
            ml4<? super Object> ml4Var = cQf.w;
            int i = this.x;
            Object[] objArr = cQf.z;
            objArr[i] = t;
            if (cQf.decrementAndGet() == 0) {
                try {
                    Object objApply = cQf.x.apply(objArr);
                    mq2.b(objApply, "The zipper returned a null value");
                    ml4Var.onSuccess(objApply);
                } catch (Throwable th) {
                    XTd3.w(th);
                    ml4Var.onError(th);
                }
            }
        }
    }

    public final class QnHx implements i91<T, R> {
        public QnHx() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // defpackage.i91
        public final R apply(T t) {
            R rApply = am4.this.x.apply(new Object[]{t});
            mq2.b(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public am4(i91 i91Var, rl4[] rl4VarArr) {
        this.w = rl4VarArr;
        this.x = i91Var;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super R> ml4Var) {
        rl4<? extends T>[] rl4VarArr = this.w;
        int length = rl4VarArr.length;
        if (length == 1) {
            rl4VarArr[0].b(new kl4.QnHx(ml4Var, new QnHx()));
            return;
        }
        CQf cQf = new CQf(ml4Var, length, this.x);
        ml4Var.c(cQf);
        for (int i = 0; i < length && !cQf.e(); i++) {
            rl4<? extends T> rl4Var = rl4VarArr[i];
            if (rl4Var == null) {
                cQf.b(i, new NullPointerException("One of the sources is null"));
                return;
            }
            rl4Var.b(cQf.y[i]);
        }
    }
}
