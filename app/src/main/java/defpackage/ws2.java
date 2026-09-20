package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ws2<T, R> extends Z<T, R> {
    public final i91<? super T, ? extends us2<? extends R>> x;
    public final int y;
    public final boolean z;

    public static final class CQf<T, R> extends AtomicInteger implements ht2<T>, vl0 {
        public static final QnHx<Object, Object> G;
        public volatile boolean B;
        public volatile boolean C;
        public vl0 D;
        public volatile long F;
        public final ht2<? super R> w;
        public final i91<? super T, ? extends us2<? extends R>> x;
        public final int y;
        public final boolean z;
        public final AtomicReference<QnHx<T, R>> E = new AtomicReference<>();
        public final s A = new s();

        static {
            QnHx<Object, Object> qnHx = new QnHx<>(null, -1L, 1);
            G = qnHx;
            bm0.c(qnHx);
        }

        public CQf(ht2<? super R> ht2Var, i91<? super T, ? extends us2<? extends R>> i91Var, int i, boolean z) {
            this.w = ht2Var;
            this.x = i91Var;
            this.y = i;
            this.z = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.C) {
                return;
            }
            this.C = true;
            this.D.a();
            d();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.B) {
                return;
            }
            this.B = true;
            f();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.D, vl0Var)) {
                this.D = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
            QnHx<T, R> andSet;
            AtomicReference<QnHx<T, R>> atomicReference = this.E;
            QnHx<T, R> qnHx = atomicReference.get();
            QnHx<Object, Object> qnHx2 = G;
            if (qnHx == qnHx2 || (andSet = atomicReference.getAndSet((QnHx<T, R>) qnHx2)) == qnHx2 || andSet == null) {
                return;
            }
            bm0.c(andSet);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.C;
        }

        /* JADX WARN: Code duplicated, block: B:115:0x0120 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:122:0x000f A[SYNTHETIC] */
        public final void f() {
            uk4<R> uk4Var;
            A$Y4 a$y4Poll;
            if (getAndIncrement() != 0) {
                return;
            }
            ht2<? super R> ht2Var = this.w;
            AtomicReference<QnHx<T, R>> atomicReference = this.E;
            boolean z = this.z;
            int iAddAndGet = 1;
            while (!this.C) {
                if (this.B) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (z2) {
                            Throwable th = this.A.get();
                            if (th != null) {
                                ht2Var.onError(th);
                                return;
                            } else {
                                ht2Var.b();
                                return;
                            }
                        }
                    } else if (this.A.get() != null) {
                        s sVar = this.A;
                        sVar.getClass();
                        ht2Var.onError(uu0.b(sVar));
                        return;
                    } else if (z2) {
                        ht2Var.b();
                        return;
                    }
                }
                QnHx<T, R> qnHx = atomicReference.get();
                if (qnHx != null && (uk4Var = qnHx.z) != null) {
                    if (qnHx.A) {
                        boolean zIsEmpty = uk4Var.isEmpty();
                        if (z) {
                            if (zIsEmpty) {
                                while (!atomicReference.compareAndSet(qnHx, null) && atomicReference.get() == qnHx) {
                                }
                            }
                        } else if (this.A.get() != null) {
                            s sVar2 = this.A;
                            sVar2.getClass();
                            ht2Var.onError(uu0.b(sVar2));
                            return;
                        } else if (zIsEmpty) {
                            while (!atomicReference.compareAndSet(qnHx, null) && atomicReference.get() == qnHx) {
                            }
                        }
                    }
                    boolean z3 = false;
                    while (!this.C) {
                        if (qnHx == atomicReference.get()) {
                            if (!z && this.A.get() != null) {
                                s sVar3 = this.A;
                                sVar3.getClass();
                                ht2Var.onError(uu0.b(sVar3));
                                return;
                            }
                            boolean z4 = qnHx.A;
                            try {
                                a$y4Poll = uk4Var.poll();
                            } catch (Throwable th2) {
                                XTd3.w(th2);
                                s sVar4 = this.A;
                                sVar4.getClass();
                                uu0.a(sVar4, th2);
                                while (!atomicReference.compareAndSet(qnHx, null) && atomicReference.get() == qnHx) {
                                }
                                if (z) {
                                    bm0.c(qnHx);
                                } else {
                                    d();
                                    this.D.a();
                                    this.B = true;
                                }
                                a$y4Poll = null;
                                z3 = true;
                            }
                            boolean z5 = a$y4Poll == null;
                            if (z4 && z5) {
                                while (!atomicReference.compareAndSet(qnHx, null) && atomicReference.get() == qnHx) {
                                }
                            } else if (!z5) {
                                ht2Var.g(a$y4Poll);
                            }
                            if (z3) {
                                continue;
                            }
                        }
                        z3 = true;
                        if (z3) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            boolean z;
            long j = this.F + 1;
            this.F = j;
            QnHx<T, R> qnHx = this.E.get();
            if (qnHx != null) {
                bm0.c(qnHx);
            }
            try {
                us2<? extends R> us2VarApply = this.x.apply(t);
                mq2.b(us2VarApply, "The ObservableSource returned is null");
                us2<? extends R> us2Var = us2VarApply;
                QnHx<T, R> qnHx2 = new QnHx<>(this, j, this.y);
                do {
                    QnHx<T, R> qnHx3 = this.E.get();
                    if (qnHx3 == G) {
                        return;
                    }
                    AtomicReference<QnHx<T, R>> atomicReference = this.E;
                    while (true) {
                        if (atomicReference.compareAndSet(qnHx3, qnHx2)) {
                            z = true;
                            break;
                        } else if (atomicReference.get() != qnHx3) {
                            z = false;
                            break;
                        }
                    }
                } while (!z);
                us2Var.a(qnHx2);
            } catch (Throwable th) {
                XTd3.w(th);
                this.D.a();
                onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (!this.B) {
                s sVar = this.A;
                sVar.getClass();
                if (uu0.a(sVar, th)) {
                    if (!this.z) {
                        d();
                    }
                    this.B = true;
                    f();
                    return;
                }
            }
            m14.b(th);
        }
    }

    public static final class QnHx<T, R> extends AtomicReference<vl0> implements ht2<R> {
        public volatile boolean A;
        public final CQf<T, R> w;
        public final long x;
        public final int y;
        public volatile uk4<R> z;

        public QnHx(CQf<T, R> cQf, long j, int i) {
            this.w = cQf;
            this.x = j;
            this.y = i;
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.x == this.w.F) {
                this.A = true;
                this.w.f();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                if (vl0Var instanceof kh3) {
                    kh3 kh3Var = (kh3) vl0Var;
                    int iL = kh3Var.l(7);
                    if (iL == 1) {
                        this.z = kh3Var;
                        this.A = true;
                        this.w.f();
                        return;
                    } else if (iL == 2) {
                        this.z = kh3Var;
                        return;
                    }
                }
                this.z = new jr4(this.y);
            }
        }

        @Override // defpackage.ht2
        public final void g(R r) {
            if (this.x == this.w.F) {
                if (r != null) {
                    this.z.offer(r);
                }
                this.w.f();
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            CQf<T, R> cQf = this.w;
            cQf.getClass();
            if (this.x == cQf.F) {
                s sVar = cQf.A;
                sVar.getClass();
                if (uu0.a(sVar, th)) {
                    if (!cQf.z) {
                        cQf.D.a();
                        cQf.B = true;
                    }
                    this.A = true;
                    cQf.f();
                    return;
                }
            }
            m14.b(th);
        }
    }

    public ws2(us2 us2Var, i91 i91Var, int i) {
        super(us2Var);
        this.x = i91Var;
        this.y = i;
        this.z = false;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        us2<T> us2Var = this.w;
        i91<? super T, ? extends us2<? extends R>> i91Var = this.x;
        if (ns2.a(us2Var, ht2Var, i91Var)) {
            return;
        }
        us2Var.a(new CQf(ht2Var, i91Var, this.y, this.z));
    }
}
