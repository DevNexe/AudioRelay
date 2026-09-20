package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
public final class xi2 extends px4 implements x81<ua0, z80<Object>, Object> {
    public bj2 A;
    public Object B;
    public wi2 C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ int F;
    public final /* synthetic */ wi2 G;
    public final /* synthetic */ j81<z80<Object>, Object> H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Lwi2;Lj81<-Lz80<Ljava/lang/Object;>;+Ljava/lang/Object;>;Lz80<-Lxi2;>;)V */
    public xi2(int i, wi2 wi2Var, j81 j81Var, z80 z80Var) {
        super(2, z80Var);
        this.F = i;
        this.G = wi2Var;
        this.H = j81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        xi2 xi2Var = new xi2(this.F, this.G, this.H, z80Var);
        xi2Var.E = obj;
        return xi2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bj2, int] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        wi2 wi2Var;
        wi2.QnHx qnHx;
        boolean z;
        bj2 bj2Var;
        j81<z80<Object>, Object> j81Var;
        wi2.QnHx qnHx2;
        bj2 bj2Var2;
        wi2.QnHx qnHx3;
        wi2 wi2Var2;
        Throwable th;
        AtomicReference<wi2.QnHx> atomicReference;
        AtomicReference<wi2.QnHx> atomicReference2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r1 = this.D;
        try {
            try {
                if (r1 == 0) {
                    C0239D.H(obj);
                    wi2.QnHx qnHx4 = new wi2.QnHx(this.F, (ms1) ((ua0) this.E).g().j(ms1.CQf.w));
                    do {
                        wi2Var = this.G;
                        AtomicReference<wi2.QnHx> atomicReference3 = wi2Var.a;
                        qnHx = atomicReference3.get();
                        z = false;
                        if (qnHx != null) {
                            if (!(O.b(qnHx4.a, qnHx.a) >= 0)) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        do {
                            if (atomicReference3.compareAndSet(qnHx, qnHx4)) {
                                z = true;
                                break;
                            }
                        } while (atomicReference3.get() == qnHx);
                    } while (!z);
                    if (qnHx != null) {
                        qnHx.b.m(null);
                    }
                    this.E = qnHx4;
                    bj2Var = wi2Var.b;
                    this.A = bj2Var;
                    j81<z80<Object>, Object> j81Var2 = this.H;
                    this.B = j81Var2;
                    this.C = wi2Var;
                    this.D = 1;
                    if (bj2Var.b(null, this) == va0Var) {
                        return va0Var;
                    }
                    j81Var = j81Var2;
                    qnHx2 = qnHx4;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wi2Var2 = (wi2) this.B;
                        bj2Var2 = this.A;
                        qnHx3 = (wi2.QnHx) this.E;
                        try {
                            C0239D.H(obj);
                            atomicReference2 = wi2Var2.a;
                            while (!atomicReference2.compareAndSet(qnHx3, null) && atomicReference2.get() == qnHx3) {
                            }
                            bj2Var2.a(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = wi2Var2.a;
                            while (!atomicReference.compareAndSet(qnHx3, null)) {
                            }
                            throw th;
                        }
                    }
                    wi2 wi2Var3 = this.C;
                    j81Var = (j81) this.B;
                    bj2Var = this.A;
                    qnHx2 = (wi2.QnHx) this.E;
                    C0239D.H(obj);
                    wi2Var = wi2Var3;
                }
                this.E = qnHx2;
                this.A = bj2Var2;
                this.B = wi2Var;
                this.C = null;
                this.D = 2;
                Object objInvoke = j81Var.invoke(this);
                if (objInvoke == va0Var) {
                    return va0Var;
                }
                wi2Var2 = wi2Var;
                obj = objInvoke;
                qnHx3 = qnHx2;
                atomicReference2 = wi2Var2.a;
                while (!atomicReference2.compareAndSet(qnHx3, null)) {
                }
                bj2Var2.a(null);
                return obj;
            } catch (Throwable th3) {
                qnHx3 = qnHx2;
                wi2Var2 = wi2Var;
                th = th3;
                atomicReference = wi2Var2.a;
                while (!atomicReference.compareAndSet(qnHx3, null) && atomicReference.get() == qnHx3) {
                }
                throw th;
            }
            bj2Var2 = bj2Var;
        } catch (Throwable th4) {
            r1.a(null);
            throw th4;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<Object> z80Var) {
        return ((xi2) a(ua0Var, z80Var)).i(sd5.a);
    }
}
