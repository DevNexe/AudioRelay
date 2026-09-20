package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b11<T, R> extends a11<R> {
    public final boolean A = false;
    public final sg3<? extends T>[] x;
    public final i91<? super Object[], ? extends R> y;
    public final int z;

    public static final class CQf<T> extends AtomicReference<mw4> implements v11<T> {
        public int A;
        public final QnHx<T, ?> w;
        public final int x;
        public final int y;
        public final int z;

        public CQf(QnHx<T, ?> qnHx, int i, int i2) {
            this.w = qnHx;
            this.x = i;
            this.y = i2;
            this.z = i2 - (i2 >> 2);
        }

        public final void a() {
            int i = this.A + 1;
            if (i != this.z) {
                this.A = i;
            } else {
                this.A = 0;
                get().a(i);
            }
        }

        @Override // defpackage.gw4
        public final void b() {
            this.w.i(this.x);
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            long j = this.y;
            if (qw4.g(this, mw4Var)) {
                mw4Var.a(j);
            }
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            boolean z;
            QnHx<T, ?> qnHx = this.w;
            int i = this.x;
            synchronized (qnHx) {
                try {
                    Object[] objArr = qnHx.A;
                    int i2 = qnHx.D;
                    if (objArr[i] == null) {
                        i2++;
                        qnHx.D = i2;
                    }
                    objArr[i] = t;
                    if (objArr.length == i2) {
                        qnHx.z.a(qnHx.y[i], objArr.clone());
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                qnHx.y[i].a();
            } else {
                qnHx.h();
            }
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            QnHx<T, ?> qnHx = this.w;
            int i = this.x;
            if (!uu0.a(qnHx.I, th)) {
                m14.b(th);
            } else {
                if (qnHx.B) {
                    qnHx.i(i);
                    return;
                }
                qnHx.e();
                qnHx.H = true;
                qnHx.h();
            }
        }
    }

    public final class F1 implements i91<T, R> {
        public F1() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // defpackage.i91
        public final R apply(T t) {
            return b11.this.y.apply(new Object[]{t});
        }
    }

    public static final class QnHx<T, R> extends e9<R> {
        public final Object[] A;
        public final boolean B;
        public boolean C;
        public int D;
        public int E;
        public volatile boolean F;
        public final AtomicLong G;
        public volatile boolean H;
        public final AtomicReference<Throwable> I;
        public final gw4<? super R> w;
        public final i91<? super Object[], ? extends R> x;
        public final CQf<T>[] y;
        public final jr4<Object> z;

        public QnHx(gw4<? super R> gw4Var, i91<? super Object[], ? extends R> i91Var, int i, int i2, boolean z) {
            this.w = gw4Var;
            this.x = i91Var;
            CQf<T>[] cQfArr = new CQf[i];
            for (int i3 = 0; i3 < i; i3++) {
                cQfArr[i3] = new CQf<>(this, i3, i2);
            }
            this.y = cQfArr;
            this.A = new Object[i];
            this.z = new jr4<>(i2);
            this.G = new AtomicLong();
            this.I = new AtomicReference<>();
            this.B = z;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (qw4.l(j)) {
                ps0.h(this.G, j);
                h();
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            this.F = true;
            e();
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.z.clear();
        }

        public final void e() {
            for (CQf<T> cQf : this.y) {
                cQf.getClass();
                qw4.c(cQf);
            }
        }

        public final boolean f(boolean z, boolean z2, gw4<?> gw4Var, jr4<?> jr4Var) {
            if (this.F) {
                e();
                jr4Var.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.B) {
                if (!z2) {
                    return false;
                }
                e();
                Throwable thB = uu0.b(this.I);
                if (thB == null || thB == uu0.a) {
                    gw4Var.b();
                } else {
                    gw4Var.onError(thB);
                }
                return true;
            }
            Throwable thB2 = uu0.b(this.I);
            if (thB2 != null && thB2 != uu0.a) {
                e();
                jr4Var.clear();
                gw4Var.onError(thB2);
                return true;
            }
            if (!z2) {
                return false;
            }
            e();
            gw4Var.b();
            return true;
        }

        public final void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            if (this.C) {
                gw4<? super R> gw4Var = this.w;
                jr4<Object> jr4Var = this.z;
                while (!this.F) {
                    Throwable th = this.I.get();
                    if (th != null) {
                        jr4Var.clear();
                        gw4Var.onError(th);
                        return;
                    }
                    boolean z = this.H;
                    boolean zIsEmpty = jr4Var.isEmpty();
                    if (!zIsEmpty) {
                        gw4Var.g(null);
                    }
                    if (z && zIsEmpty) {
                        gw4Var.b();
                        return;
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                jr4Var.clear();
                return;
            }
            gw4<? super R> gw4Var2 = this.w;
            jr4<?> jr4Var2 = this.z;
            int iAddAndGet2 = 1;
            do {
                long j = this.G.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.H;
                    Object objPoll = jr4Var2.poll();
                    boolean z3 = objPoll == null;
                    if (f(z2, z3, gw4Var2, jr4Var2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        R rApply = this.x.apply((Object[]) jr4Var2.poll());
                        mq2.b(rApply, "The combiner returned a null value");
                        gw4Var2.g(rApply);
                        ((CQf) objPoll).a();
                        j2++;
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        e();
                        uu0.a(this.I, th2);
                        gw4Var2.onError(uu0.b(this.I));
                        return;
                    }
                }
                if (j2 == j && f(this.H, jr4Var2.isEmpty(), gw4Var2, jr4Var2)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.G.addAndGet(-j2);
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
            } while (iAddAndGet2 != 0);
        }

        public final void i(int i) {
            int i2;
            synchronized (this) {
                Object[] objArr = this.A;
                if (objArr[i] != null && (i2 = this.E + 1) != objArr.length) {
                    this.E = i2;
                } else {
                    this.H = true;
                    h();
                }
            }
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.z.isEmpty();
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.C = i2 != 0;
            return i2;
        }

        @Override // defpackage.uk4
        public final R poll() {
            jr4<Object> jr4Var = this.z;
            Object objPoll = jr4Var.poll();
            if (objPoll == null) {
                return null;
            }
            R rApply = this.x.apply((Object[]) jr4Var.poll());
            mq2.b(rApply, "The combiner returned a null value");
            ((CQf) objPoll).a();
            return rApply;
        }
    }

    public b11(sg3[] sg3VarArr, m91.CQf cQf, int i) {
        this.x = sg3VarArr;
        this.y = cQf;
        this.z = i;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super R> gw4Var) {
        sg3<? extends T>[] sg3VarArr = this.x;
        js0 js0Var = js0.INSTANCE;
        if (sg3VarArr == null) {
            try {
                throw null;
            } catch (Throwable th) {
                XTd3.w(th);
                gw4Var.d(js0Var);
                gw4Var.onError(th);
                return;
            }
        }
        int length = sg3VarArr.length;
        if (length == 0) {
            gw4Var.d(js0Var);
            gw4Var.b();
            return;
        }
        if (length == 1) {
            sg3VarArr[0].a(new i11.CQf(gw4Var, new F1()));
            return;
        }
        QnHx qnHx = new QnHx(gw4Var, this.y, length, this.z, this.A);
        gw4Var.d(qnHx);
        CQf<T>[] cQfArr = qnHx.y;
        for (int i = 0; i < length && !qnHx.H && !qnHx.F; i++) {
            sg3VarArr[i].a(cQfArr[i]);
        }
    }
}
