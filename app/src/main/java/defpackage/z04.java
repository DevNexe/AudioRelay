package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {114}, m = "invokeSuspend")
public final class z04 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ mz0 C;
    public final /* synthetic */ nr2 D;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nr2<T> w;

        public QnHx(nr2<T> nr2Var) {
            this.w = nr2Var;
        }

        @Override // defpackage.nz0
        public final Object f(T t, z80<? super sd5> z80Var) {
            ((dr2.QnHx) this.w).b(t);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z04(mz0 mz0Var, nr2 nr2Var, z80 z80Var) {
        super(2, z80Var);
        this.C = mz0Var;
        this.D = nr2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        z04 z04Var = new z04(this.C, this.D, z80Var);
        z04Var.B = obj;
        return z04Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ua0 ua0Var;
        Throwable th;
        dr2.QnHx qnHx;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        nr2 nr2Var = this.D;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var2 = (ua0) this.B;
            try {
                mz0 mz0Var = this.C;
                QnHx qnHx2 = new QnHx(nr2Var);
                this.B = ua0Var2;
                this.A = 1;
                if (mz0Var.a(qnHx2, this) == va0Var) {
                    return va0Var;
                }
                ua0Var = ua0Var2;
            } catch (Throwable th2) {
                ua0Var = ua0Var2;
                th = th2;
                if (!(th instanceof CancellationException)) {
                    qnHx = (dr2.QnHx) nr2Var;
                    if (!qnHx.e()) {
                        qnHx.w.b();
                    }
                } else if (!((dr2.QnHx) nr2Var).c(th)) {
                    ddf.j(ua0Var.g(), th);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ua0Var = (ua0) this.B;
            try {
                C0239D.H(obj);
            } catch (Throwable th3) {
                th = th3;
                if (!(th instanceof CancellationException)) {
                    qnHx = (dr2.QnHx) nr2Var;
                    if (!qnHx.e()) {
                        try {
                            qnHx.w.b();
                        } finally {
                            bm0.c(qnHx);
                        }
                    }
                } else if (!((dr2.QnHx) nr2Var).c(th)) {
                    ddf.j(ua0Var.g(), th);
                }
            }
        }
        dr2.QnHx qnHx3 = (dr2.QnHx) nr2Var;
        if (!qnHx3.e()) {
            try {
                qnHx3.w.b();
            } finally {
                bm0.c(qnHx3);
            }
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((z04) a(ua0Var, z80Var)).i(sd5.a);
    }
}
