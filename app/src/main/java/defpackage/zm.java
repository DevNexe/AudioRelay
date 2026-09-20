package defpackage;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class zm<T> implements z80<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(zm.class, Object.class, AdOperationMetric.INIT_STATE);
    public static final /* synthetic */ AtomicReferenceFieldUpdater x = AtomicReferenceFieldUpdater.newUpdater(zm.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    public final class QnHx implements j81<Throwable, sd5> {
        public final ms1 w;
        public am0 x;

        public QnHx(ms1 ms1Var) {
            this.w = ms1Var;
            am0 am0VarA = ms1.QnHx.a(ms1Var, true, this, 2);
            if (ms1Var.c()) {
                this.x = am0VarA;
            }
        }

        public final void a() {
            am0 am0Var = this.x;
            if (am0Var != null) {
                this.x = null;
                am0Var.a();
            }
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Throwable th2 = th;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zm.w;
            zm<T> zmVar = zm.this;
            zmVar.getClass();
            do {
                atomicReferenceFieldUpdater = zm.x;
                if (atomicReferenceFieldUpdater.compareAndSet(zmVar, this, null)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(zmVar) == this);
            a();
            if (th2 != null) {
                zm.a(zmVar, this.w, th2);
            }
            return sd5.a;
        }
    }

    public static final void a(zm zmVar, ms1 ms1Var, Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = zmVar.state;
            if (!(obj instanceof z80)) {
                return;
            }
            la0 context = ((z80) obj).getContext();
            int i = ms1.j;
            if (context.j(ms1.CQf.w) != ms1Var) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(zmVar, obj, null)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(zmVar) != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        }
        ((z80) obj).x(new fq3.QnHx(th));
    }

    public final void b(Throwable th) {
        x(new fq3.QnHx(th));
        QnHx qnHx = (QnHx) x.getAndSet(this, null);
        if (qnHx != null) {
            qnHx.a();
        }
    }

    public final Object d(z80<? super T> z80Var) {
        boolean z;
        QnHx qnHx;
        boolean z2;
        while (true) {
            Object obj = this.state;
            boolean z3 = true;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, z80Var)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    ms1 ms1Var = (ms1) z80Var.getContext().j(ms1.CQf.w);
                    QnHx qnHx2 = (QnHx) this.jobCancellationHandler;
                    if ((qnHx2 != null ? qnHx2.w : null) != ms1Var) {
                        if (ms1Var == null) {
                            QnHx qnHx3 = (QnHx) x.getAndSet(this, null);
                            if (qnHx3 != null) {
                                qnHx3.a();
                            }
                        } else {
                            QnHx qnHx4 = new QnHx(ms1Var);
                            do {
                                Object obj2 = this.jobCancellationHandler;
                                qnHx = (QnHx) obj2;
                                if (qnHx != null && qnHx.w == ms1Var) {
                                    qnHx4.a();
                                } else {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = x;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, qnHx4)) {
                                            z2 = true;
                                            break;
                                        }
                                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                }
                            } while (!z2);
                            if (qnHx != null) {
                                qnHx.a();
                            }
                        }
                    }
                    return va0.COROUTINE_SUSPENDED;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = w;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        z3 = false;
                        break;
                    }
                }
                if (z3) {
                    if (obj instanceof Throwable) {
                        throw ((Throwable) obj);
                    }
                    return obj;
                }
            }
        }
    }

    @Override // defpackage.z80
    public final la0 getContext() {
        la0 context;
        Object obj = this.state;
        z80 z80Var = obj instanceof z80 ? (z80) obj : null;
        return (z80Var == null || (context = z80Var.getContext()) == null) ? xr0.w : context;
    }

    @Override // defpackage.z80
    public final void x(Object obj) {
        Object obj2;
        Object objA;
        boolean z;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                objA = fq3.a(obj);
                if (objA == null) {
                    C0239D.H(obj);
                    objA = obj;
                }
            } else if (!(obj2 instanceof z80)) {
                return;
            } else {
                objA = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objA)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (obj2 instanceof z80) {
            ((z80) obj2).x(obj);
        }
    }
}
