package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zq2<T, U> extends Z<T, U> {
    public final i91<? super T, ? extends us2<? extends U>> x;
    public final int y;
    public final int z;

    public static final class CQf<T, U> extends AtomicInteger implements ht2<T>, vl0 {
        public uk4<T> A;
        public vl0 B;
        public volatile boolean C;
        public volatile boolean D;
        public volatile boolean E;
        public int F;
        public final ht2<? super U> w;
        public final i91<? super T, ? extends us2<? extends U>> x;
        public final QnHx<U> y;
        public final int z;

        public static final class QnHx<U> extends AtomicReference<vl0> implements ht2<U> {
            public final ht2<? super U> w;
            public final CQf<?, ?> x;

            public QnHx(eb4 eb4Var, CQf cQf) {
                this.w = eb4Var;
                this.x = cQf;
            }

            @Override // defpackage.ht2
            public final void b() {
                CQf<?, ?> cQf = this.x;
                cQf.C = false;
                cQf.d();
            }

            @Override // defpackage.ht2
            public final void c(vl0 vl0Var) {
                bm0.g(this, vl0Var);
            }

            @Override // defpackage.ht2
            public final void g(U u) {
                this.w.g(u);
            }

            @Override // defpackage.ht2
            public final void onError(Throwable th) {
                this.x.a();
                this.w.onError(th);
            }
        }

        public CQf(eb4 eb4Var, i91 i91Var, int i) {
            this.w = eb4Var;
            this.x = i91Var;
            this.z = i;
            this.y = new QnHx<>(eb4Var, this);
        }

        @Override // defpackage.vl0
        public final void a() {
            this.D = true;
            QnHx<U> qnHx = this.y;
            qnHx.getClass();
            bm0.c(qnHx);
            this.B.a();
            if (getAndIncrement() == 0) {
                this.A.clear();
            }
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.E) {
                return;
            }
            this.E = true;
            d();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.B, vl0Var)) {
                this.B = vl0Var;
                if (vl0Var instanceof kh3) {
                    kh3 kh3Var = (kh3) vl0Var;
                    int iL = kh3Var.l(3);
                    if (iL == 1) {
                        this.F = iL;
                        this.A = kh3Var;
                        this.E = true;
                        this.w.c(this);
                        d();
                        return;
                    }
                    if (iL == 2) {
                        this.F = iL;
                        this.A = kh3Var;
                        this.w.c(this);
                        return;
                    }
                }
                this.A = new jr4(this.z);
                this.w.c(this);
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.D) {
                if (!this.C) {
                    boolean z = this.E;
                    try {
                        T tPoll = this.A.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.D = true;
                            this.w.b();
                            return;
                        }
                        if (!z2) {
                            try {
                                us2<? extends U> us2VarApply = this.x.apply(tPoll);
                                mq2.b(us2VarApply, "The mapper returned a null ObservableSource");
                                us2<? extends U> us2Var = us2VarApply;
                                this.C = true;
                                us2Var.a(this.y);
                            } catch (Throwable th) {
                                XTd3.w(th);
                                a();
                                this.A.clear();
                                this.w.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        a();
                        this.A.clear();
                        this.w.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.A.clear();
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.D;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.E) {
                return;
            }
            if (this.F == 0) {
                this.A.offer(t);
            }
            d();
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.E) {
                m14.b(th);
                return;
            }
            this.E = true;
            a();
            this.w.onError(th);
        }
    }

    public static final class QnHx<T, R> extends AtomicInteger implements ht2<T>, vl0 {
        public final C0236QnHx<R> A;
        public final boolean B;
        public uk4<T> C;
        public vl0 D;
        public volatile boolean E;
        public volatile boolean F;
        public volatile boolean G;
        public int H;
        public final ht2<? super R> w;
        public final i91<? super T, ? extends us2<? extends R>> x;
        public final int y;
        public final s z = new s();

        /* JADX INFO: renamed from: zq2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0236QnHx<R> extends AtomicReference<vl0> implements ht2<R> {
            public final ht2<? super R> w;
            public final QnHx<?, R> x;

            public C0236QnHx(ht2<? super R> ht2Var, QnHx<?, R> qnHx) {
                this.w = ht2Var;
                this.x = qnHx;
            }

            @Override // defpackage.ht2
            public final void b() {
                QnHx<?, R> qnHx = this.x;
                qnHx.E = false;
                qnHx.d();
            }

            @Override // defpackage.ht2
            public final void c(vl0 vl0Var) {
                bm0.g(this, vl0Var);
            }

            @Override // defpackage.ht2
            public final void g(R r) {
                this.w.g(r);
            }

            @Override // defpackage.ht2
            public final void onError(Throwable th) {
                QnHx<?, R> qnHx = this.x;
                s sVar = qnHx.z;
                sVar.getClass();
                if (!uu0.a(sVar, th)) {
                    m14.b(th);
                    return;
                }
                if (!qnHx.B) {
                    qnHx.D.a();
                }
                qnHx.E = false;
                qnHx.d();
            }
        }

        public QnHx(ht2<? super R> ht2Var, i91<? super T, ? extends us2<? extends R>> i91Var, int i, boolean z) {
            this.w = ht2Var;
            this.x = i91Var;
            this.y = i;
            this.B = z;
            this.A = new C0236QnHx<>(ht2Var, this);
        }

        @Override // defpackage.vl0
        public final void a() {
            this.G = true;
            this.D.a();
            C0236QnHx<R> c0236QnHx = this.A;
            c0236QnHx.getClass();
            bm0.c(c0236QnHx);
        }

        @Override // defpackage.ht2
        public final void b() {
            this.F = true;
            d();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.D, vl0Var)) {
                this.D = vl0Var;
                if (vl0Var instanceof kh3) {
                    kh3 kh3Var = (kh3) vl0Var;
                    int iL = kh3Var.l(3);
                    if (iL == 1) {
                        this.H = iL;
                        this.C = kh3Var;
                        this.F = true;
                        this.w.c(this);
                        d();
                        return;
                    }
                    if (iL == 2) {
                        this.H = iL;
                        this.C = kh3Var;
                        this.w.c(this);
                        return;
                    }
                }
                this.C = new jr4(this.y);
                this.w.c(this);
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            ht2<? super R> ht2Var = this.w;
            uk4<T> uk4Var = this.C;
            s sVar = this.z;
            while (true) {
                if (!this.E) {
                    if (this.G) {
                        uk4Var.clear();
                        return;
                    }
                    if (!this.B && sVar.get() != null) {
                        uk4Var.clear();
                        this.G = true;
                        ht2Var.onError(uu0.b(sVar));
                        return;
                    }
                    boolean z = this.F;
                    try {
                        T tPoll = uk4Var.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.G = true;
                            sVar.getClass();
                            Throwable thB = uu0.b(sVar);
                            if (thB != null) {
                                ht2Var.onError(thB);
                                return;
                            } else {
                                ht2Var.b();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                us2<? extends R> us2VarApply = this.x.apply(tPoll);
                                mq2.b(us2VarApply, "The mapper returned a null ObservableSource");
                                us2<? extends R> us2Var = us2VarApply;
                                if (us2Var instanceof Callable) {
                                    try {
                                        A$Y4 a$y4 = (Object) ((Callable) us2Var).call();
                                        if (a$y4 != null && !this.G) {
                                            ht2Var.g(a$y4);
                                        }
                                    } catch (Throwable th) {
                                        XTd3.w(th);
                                        sVar.getClass();
                                        uu0.a(sVar, th);
                                    }
                                } else {
                                    this.E = true;
                                    us2Var.a(this.A);
                                }
                            } catch (Throwable th2) {
                                XTd3.w(th2);
                                this.G = true;
                                this.D.a();
                                uk4Var.clear();
                                sVar.getClass();
                                uu0.a(sVar, th2);
                                ht2Var.onError(uu0.b(sVar));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        XTd3.w(th3);
                        this.G = true;
                        this.D.a();
                        sVar.getClass();
                        uu0.a(sVar, th3);
                        ht2Var.onError(uu0.b(sVar));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.G;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.H == 0) {
                this.C.offer(t);
            }
            d();
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            s sVar = this.z;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
            } else {
                this.F = true;
                d();
            }
        }
    }

    public zq2(vq2 vq2Var, i91 i91Var, int i, int i2) {
        super(vq2Var);
        this.x = i91Var;
        this.z = i2;
        this.y = Math.max(8, i);
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super U> ht2Var) {
        us2<T> us2Var = this.w;
        i91<? super T, ? extends us2<? extends U>> i91Var = this.x;
        if (ns2.a(us2Var, ht2Var, i91Var)) {
            return;
        }
        int i = this.y;
        int i2 = this.z;
        if (i2 == 1) {
            us2Var.a(new CQf(new eb4(ht2Var), i91Var, i));
        } else {
            us2Var.a(new QnHx(ht2Var, i91Var, i, i2 == 3));
        }
    }
}
