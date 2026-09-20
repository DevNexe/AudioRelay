package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ar2<T> extends qw {
    public final vq2<T> w;
    public final i91<? super T, ? extends tx> x;
    public final int y = 1;
    public final int z = 2;

    public static final class QnHx<T> extends AtomicInteger implements ht2<T>, vl0 {
        public final int B;
        public uk4<T> C;
        public vl0 D;
        public volatile boolean E;
        public volatile boolean F;
        public volatile boolean G;
        public final nx w;
        public final i91<? super T, ? extends tx> x;
        public final int y;
        public final s z = new s();
        public final C0037QnHx A = new C0037QnHx(this);

        /* JADX INFO: renamed from: ar2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0037QnHx extends AtomicReference<vl0> implements nx {
            public final QnHx<?> w;

            public C0037QnHx(QnHx<?> qnHx) {
                this.w = qnHx;
            }

            @Override // defpackage.nx
            public final void b() {
                QnHx<?> qnHx = this.w;
                qnHx.E = false;
                qnHx.d();
            }

            @Override // defpackage.nx
            public final void c(vl0 vl0Var) {
                bm0.g(this, vl0Var);
            }

            @Override // defpackage.nx
            public final void onError(Throwable th) {
                QnHx<?> qnHx = this.w;
                s sVar = qnHx.z;
                sVar.getClass();
                if (!uu0.a(sVar, th)) {
                    m14.b(th);
                    return;
                }
                if (qnHx.y != 1) {
                    qnHx.E = false;
                    qnHx.d();
                    return;
                }
                qnHx.G = true;
                qnHx.D.a();
                s sVar2 = qnHx.z;
                sVar2.getClass();
                Throwable thB = uu0.b(sVar2);
                if (thB != uu0.a) {
                    qnHx.w.onError(thB);
                }
                if (qnHx.getAndIncrement() == 0) {
                    qnHx.C.clear();
                }
            }
        }

        /* JADX WARN: Incorrect types in method signature: (Lnx;Li91<-TT;+Ltx;>;Ljava/lang/Object;I)V */
        public QnHx(nx nxVar, i91 i91Var, int i, int i2) {
            this.w = nxVar;
            this.x = i91Var;
            this.y = i;
            this.B = i2;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.G = true;
            this.D.a();
            C0037QnHx c0037QnHx = this.A;
            c0037QnHx.getClass();
            bm0.c(c0037QnHx);
            if (getAndIncrement() == 0) {
                this.C.clear();
            }
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
                        this.C = kh3Var;
                        this.F = true;
                        this.w.c(this);
                        d();
                        return;
                    }
                    if (iL == 2) {
                        this.C = kh3Var;
                        this.w.c(this);
                        return;
                    }
                }
                this.C = new jr4(this.B);
                this.w.c(this);
            }
        }

        public final void d() {
            tx txVar;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            s sVar = this.z;
            int i = this.y;
            while (!this.G) {
                if (!this.E) {
                    if (i == 2 && sVar.get() != null) {
                        this.G = true;
                        this.C.clear();
                        this.w.onError(uu0.b(sVar));
                        return;
                    }
                    boolean z2 = this.F;
                    try {
                        T tPoll = this.C.poll();
                        if (tPoll != null) {
                            tx txVarApply = this.x.apply(tPoll);
                            mq2.b(txVarApply, "The mapper returned a null CompletableSource");
                            txVar = txVarApply;
                            z = false;
                        } else {
                            txVar = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.G = true;
                            sVar.getClass();
                            Throwable thB = uu0.b(sVar);
                            if (thB != null) {
                                this.w.onError(thB);
                                return;
                            } else {
                                this.w.b();
                                return;
                            }
                        }
                        if (!z) {
                            this.E = true;
                            txVar.b(this.A);
                        }
                    } catch (Throwable th) {
                        XTd3.w(th);
                        this.G = true;
                        this.C.clear();
                        this.D.a();
                        sVar.getClass();
                        uu0.a(sVar, th);
                        this.w.onError(uu0.b(sVar));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.C.clear();
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.G;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (t != null) {
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
                return;
            }
            if (this.y != 1) {
                this.F = true;
                d();
                return;
            }
            this.G = true;
            C0037QnHx c0037QnHx = this.A;
            c0037QnHx.getClass();
            bm0.c(c0037QnHx);
            s sVar2 = this.z;
            sVar2.getClass();
            Throwable thB = uu0.b(sVar2);
            if (thB != uu0.a) {
                this.w.onError(thB);
            }
            if (getAndIncrement() == 0) {
                this.C.clear();
            }
        }
    }

    public ar2(vq2 vq2Var, i91 i91Var) {
        this.w = vq2Var;
        this.x = i91Var;
    }

    @Override // defpackage.qw
    public final void h(nx nxVar) {
        vq2<T> vq2Var = this.w;
        i91<? super T, ? extends tx> i91Var = this.x;
        if (ps0.r0(vq2Var, i91Var, nxVar)) {
            return;
        }
        vq2Var.a(new QnHx(nxVar, i91Var, this.y, this.z));
    }
}
