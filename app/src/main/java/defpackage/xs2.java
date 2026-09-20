package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class xs2<T> extends qw {
    public final vq2<T> w;
    public final i91<? super T, ? extends tx> x;
    public final boolean y = false;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public static final C0222QnHx D = new C0222QnHx(null);
        public volatile boolean B;
        public vl0 C;
        public final nx w;
        public final i91<? super T, ? extends tx> x;
        public final boolean y;
        public final s z = new s();
        public final AtomicReference<C0222QnHx> A = new AtomicReference<>();

        /* JADX INFO: renamed from: xs2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0222QnHx extends AtomicReference<vl0> implements nx {
            public final QnHx<?> w;

            public C0222QnHx(QnHx<?> qnHx) {
                this.w = qnHx;
            }

            @Override // defpackage.nx
            public final void b() {
                boolean z;
                QnHx<?> qnHx = this.w;
                AtomicReference<C0222QnHx> atomicReference = qnHx.A;
                while (true) {
                    if (atomicReference.compareAndSet(this, null)) {
                        z = true;
                        break;
                    } else if (atomicReference.get() != this) {
                        z = false;
                        break;
                    }
                }
                if (z && qnHx.B) {
                    s sVar = qnHx.z;
                    sVar.getClass();
                    Throwable thB = uu0.b(sVar);
                    if (thB == null) {
                        qnHx.w.b();
                    } else {
                        qnHx.w.onError(thB);
                    }
                }
            }

            @Override // defpackage.nx
            public final void c(vl0 vl0Var) {
                bm0.n(this, vl0Var);
            }

            @Override // defpackage.nx
            public final void onError(Throwable th) {
                boolean z;
                QnHx<?> qnHx = this.w;
                AtomicReference<C0222QnHx> atomicReference = qnHx.A;
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
                        if (qnHx.y) {
                            if (qnHx.B) {
                                s sVar2 = qnHx.z;
                                sVar2.getClass();
                                qnHx.w.onError(uu0.b(sVar2));
                                return;
                            }
                            return;
                        }
                        qnHx.a();
                        s sVar3 = qnHx.z;
                        sVar3.getClass();
                        Throwable thB = uu0.b(sVar3);
                        if (thB != uu0.a) {
                            qnHx.w.onError(thB);
                            return;
                        }
                        return;
                    }
                }
                m14.b(th);
            }
        }

        public QnHx(nx nxVar, i91<? super T, ? extends tx> i91Var, boolean z) {
            this.w = nxVar;
            this.x = i91Var;
            this.y = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.C.a();
            AtomicReference<C0222QnHx> atomicReference = this.A;
            C0222QnHx c0222QnHx = D;
            C0222QnHx andSet = atomicReference.getAndSet(c0222QnHx);
            if (andSet == null || andSet == c0222QnHx) {
                return;
            }
            bm0.c(andSet);
        }

        @Override // defpackage.ht2
        public final void b() {
            this.B = true;
            if (this.A.get() == null) {
                s sVar = this.z;
                sVar.getClass();
                Throwable thB = uu0.b(sVar);
                if (thB == null) {
                    this.w.b();
                } else {
                    this.w.onError(thB);
                }
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.C, vl0Var)) {
                this.C = vl0Var;
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.A.get() == D;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            C0222QnHx c0222QnHx;
            boolean z;
            try {
                tx txVarApply = this.x.apply(t);
                mq2.b(txVarApply, "The mapper returned a null CompletableSource");
                tx txVar = txVarApply;
                C0222QnHx c0222QnHx2 = new C0222QnHx(this);
                do {
                    AtomicReference<C0222QnHx> atomicReference = this.A;
                    c0222QnHx = atomicReference.get();
                    if (c0222QnHx == D) {
                        return;
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(c0222QnHx, c0222QnHx2)) {
                            z = true;
                            break;
                        } else if (atomicReference.get() != c0222QnHx) {
                            z = false;
                            break;
                        }
                    }
                } while (!z);
                if (c0222QnHx != null) {
                    bm0.c(c0222QnHx);
                }
                txVar.b(c0222QnHx2);
            } catch (Throwable th) {
                XTd3.w(th);
                this.C.a();
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
            if (this.y) {
                b();
                return;
            }
            AtomicReference<C0222QnHx> atomicReference = this.A;
            C0222QnHx c0222QnHx = D;
            C0222QnHx andSet = atomicReference.getAndSet(c0222QnHx);
            if (andSet != null && andSet != c0222QnHx) {
                bm0.c(andSet);
            }
            Throwable thB = uu0.b(sVar);
            if (thB != uu0.a) {
                this.w.onError(thB);
            }
        }
    }

    public xs2(vq2 vq2Var, i91 i91Var) {
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
        vq2Var.a(new QnHx(nxVar, i91Var, this.y));
    }
}
