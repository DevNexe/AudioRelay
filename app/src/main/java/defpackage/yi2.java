package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.QnHx;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
public final class yi2 extends px4 implements x81<ua0, z80<Object>, Object> {
    public bj2 A;
    public Object B;
    public Object C;
    public zi2 D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vi2 G;
    public final /* synthetic */ zi2 H;
    public final /* synthetic */ x81<Object, z80<Object>, Object> I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yi2(vi2 vi2Var, zi2 zi2Var, x81<Object, ? super z80<Object>, ? extends Object> x81Var, Object obj, z80<? super yi2> z80Var) {
        super(2, z80Var);
        this.G = vi2Var;
        this.H = zi2Var;
        this.I = x81Var;
        this.J = obj;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        yi2 yi2Var = new yi2(this.G, this.H, this.I, this.J, z80Var);
        yi2Var.F = obj;
        return yi2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bj2, int] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        zi2 zi2Var;
        zi2.QnHx qnHx;
        boolean z;
        Object obj2;
        zi2.QnHx qnHx2;
        bj2 bj2Var;
        x81<Object, z80<Object>, Object> x81Var;
        zi2.QnHx qnHx3;
        zi2 zi2Var2;
        Throwable th;
        AtomicReference<zi2.QnHx> atomicReference;
        AtomicReference<zi2.QnHx> atomicReference2;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ?? r1 = this.E;
        try {
            try {
                if (r1 == 0) {
                    C0239D.H(obj);
                    zi2.QnHx qnHx4 = new zi2.QnHx(this.G, (ms1) ((ua0) this.F).g().j(ms1.CQf.w));
                    do {
                        zi2Var = this.H;
                        AtomicReference<zi2.QnHx> atomicReference3 = zi2Var.a;
                        qnHx = atomicReference3.get();
                        z = false;
                        if (qnHx != null) {
                            if (!(qnHx4.a.compareTo(qnHx.a) >= 0)) {
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
                    this.F = qnHx4;
                    QnHx qnHx5 = zi2Var.b;
                    this.A = qnHx5;
                    x81<Object, z80<Object>, Object> x81Var2 = this.I;
                    this.B = x81Var2;
                    Object obj3 = this.J;
                    this.C = obj3;
                    this.D = zi2Var;
                    this.E = 1;
                    if (qnHx5.b(null, this) == va0Var) {
                        return va0Var;
                    }
                    obj2 = obj3;
                    qnHx2 = qnHx4;
                    bj2Var = qnHx5;
                    x81Var = x81Var2;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zi2Var2 = (zi2) this.B;
                        bj2Var = this.A;
                        qnHx3 = (zi2.QnHx) this.F;
                        try {
                            C0239D.H(obj);
                            atomicReference2 = zi2Var2.a;
                            while (!atomicReference2.compareAndSet(qnHx3, null) && atomicReference2.get() == qnHx3) {
                            }
                            bj2Var.a(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = zi2Var2.a;
                            while (!atomicReference.compareAndSet(qnHx3, null)) {
                            }
                            throw th;
                        }
                    }
                    zi2 zi2Var3 = this.D;
                    obj2 = this.C;
                    x81Var = (x81) this.B;
                    bj2 bj2Var2 = this.A;
                    qnHx2 = (zi2.QnHx) this.F;
                    C0239D.H(obj);
                    zi2Var = zi2Var3;
                    bj2Var = bj2Var2;
                }
                this.F = qnHx2;
                this.A = bj2Var;
                this.B = zi2Var;
                this.C = null;
                this.D = null;
                this.E = 2;
                Object objInvoke = x81Var.invoke(obj2, this);
                if (objInvoke == va0Var) {
                    return va0Var;
                }
                zi2Var2 = zi2Var;
                obj = objInvoke;
                qnHx3 = qnHx2;
                atomicReference2 = zi2Var2.a;
                while (!atomicReference2.compareAndSet(qnHx3, null)) {
                }
                bj2Var.a(null);
                return obj;
            } catch (Throwable th3) {
                qnHx3 = qnHx2;
                zi2Var2 = zi2Var;
                th = th3;
                atomicReference = zi2Var2.a;
                while (!atomicReference.compareAndSet(qnHx3, null) && atomicReference.get() == qnHx3) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r1.a(null);
            throw th4;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<Object> z80Var) {
        return ((yi2) a(ua0Var, z80Var)).i(sd5.a);
    }
}
