package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ys2<T, R> extends vq2<R> {
    public final vq2<T> w;
    public final i91<? super T, ? extends rl4<? extends R>> x;
    public final boolean y = false;

    public static final class QnHx<T, R> extends AtomicInteger implements ht2<T>, vl0 {
        public static final C0226QnHx<Object> E = new C0226QnHx<>(null);
        public vl0 B;
        public volatile boolean C;
        public volatile boolean D;
        public final ht2<? super R> w;
        public final i91<? super T, ? extends rl4<? extends R>> x;
        public final boolean y;
        public final s z = new s();
        public final AtomicReference<C0226QnHx<R>> A = new AtomicReference<>();

        /* JADX INFO: renamed from: ys2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0226QnHx<R> extends AtomicReference<vl0> implements ml4<R> {
            public final QnHx<?, R> w;
            public volatile R x;

            public C0226QnHx(QnHx<?, R> qnHx) {
                this.w = qnHx;
            }

            @Override // defpackage.ml4
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.ml4
            public final void onError(Throwable th) {
                boolean z;
                QnHx<?, R> qnHx = this.w;
                AtomicReference<C0226QnHx<R>> atomicReference = qnHx.A;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != this) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    s sVar = qnHx.z;
                    sVar.getClass();
                    if (uu0.a(sVar, th)) {
                        if (!qnHx.y) {
                            qnHx.B.a();
                            qnHx.d();
                        }
                        qnHx.f();
                        return;
                    }
                }
                m14.b(th);
            }

            @Override // defpackage.ml4
            public final void onSuccess(R r) {
                this.x = r;
                this.w.f();
            }
        }

        public QnHx(ht2<? super R> ht2Var, i91<? super T, ? extends rl4<? extends R>> i91Var, boolean z) {
            this.w = ht2Var;
            this.x = i91Var;
            this.y = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.D = true;
            this.B.a();
            d();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.C = true;
            f();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.B, vl0Var)) {
                this.B = vl0Var;
                this.w.c(this);
            }
        }

        public final void d() {
            AtomicReference<C0226QnHx<R>> atomicReference = this.A;
            C0226QnHx<Object> c0226QnHx = E;
            C0226QnHx<R> andSet = atomicReference.getAndSet((C0226QnHx<R>) c0226QnHx);
            if (andSet == null || andSet == c0226QnHx) {
                return;
            }
            bm0.c(andSet);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.D;
        }

        public final void f() {
            if (getAndIncrement() != 0) {
                return;
            }
            ht2<? super R> ht2Var = this.w;
            s sVar = this.z;
            AtomicReference<C0226QnHx<R>> atomicReference = this.A;
            int iAddAndGet = 1;
            while (!this.D) {
                if (sVar.get() != null && !this.y) {
                    ht2Var.onError(uu0.b(sVar));
                    return;
                }
                boolean z = this.C;
                C0226QnHx<R> c0226QnHx = atomicReference.get();
                boolean z2 = c0226QnHx == null;
                if (z && z2) {
                    Throwable thB = uu0.b(sVar);
                    if (thB != null) {
                        ht2Var.onError(thB);
                        return;
                    } else {
                        ht2Var.b();
                        return;
                    }
                }
                if (z2 || c0226QnHx.x == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0226QnHx, null) && atomicReference.get() == c0226QnHx) {
                    }
                    ht2Var.g(c0226QnHx.x);
                }
            }
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            boolean z;
            C0226QnHx<Object> c0226QnHx = E;
            AtomicReference<C0226QnHx<R>> atomicReference = this.A;
            C0226QnHx<R> c0226QnHx2 = atomicReference.get();
            if (c0226QnHx2 != null) {
                bm0.c(c0226QnHx2);
            }
            try {
                rl4<? extends R> rl4VarApply = this.x.apply(t);
                mq2.b(rl4VarApply, "The mapper returned a null SingleSource");
                rl4<? extends R> rl4Var = rl4VarApply;
                C0226QnHx<R> c0226QnHx3 = new C0226QnHx<>(this);
                do {
                    C0226QnHx<R> c0226QnHx4 = atomicReference.get();
                    if (c0226QnHx4 == c0226QnHx) {
                        return;
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(c0226QnHx4, c0226QnHx3)) {
                            z = true;
                            break;
                        } else if (atomicReference.get() != c0226QnHx4) {
                            z = false;
                            break;
                        }
                    }
                } while (!z);
                rl4Var.b(c0226QnHx3);
            } catch (Throwable th) {
                XTd3.w(th);
                this.B.a();
                atomicReference.getAndSet((C0226QnHx<R>) c0226QnHx);
                onError(th);
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            s sVar = this.z;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            if (!this.y) {
                d();
            }
            this.C = true;
            f();
        }
    }

    public ys2(ds2 ds2Var, D d) {
        this.w = ds2Var;
        this.x = d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        boolean z;
        rl4<? extends R> rl4Var;
        yr0 yr0Var = yr0.INSTANCE;
        us2 us2Var = this.w;
        boolean z2 = us2Var instanceof Callable;
        i91<? super T, ? extends rl4<? extends R>> i91Var = this.x;
        if (z2) {
            try {
                A$Y4 a$y4 = (Object) ((Callable) us2Var).call();
                if (a$y4 != null) {
                    rl4<? extends R> rl4VarApply = i91Var.apply(a$y4);
                    mq2.b(rl4VarApply, "The mapper returned a null SingleSource");
                    rl4Var = rl4VarApply;
                } else {
                    rl4Var = null;
                }
                if (rl4Var == null) {
                    ht2Var.c(yr0Var);
                    ht2Var.b();
                } else {
                    rl4Var.b(new xl4.QnHx(ht2Var));
                }
            } catch (Throwable th) {
                XTd3.w(th);
                ht2Var.c(yr0Var);
                ht2Var.onError(th);
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        us2Var.a(new QnHx(ht2Var, i91Var, this.y));
    }
}
