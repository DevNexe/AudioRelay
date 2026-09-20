package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {95}, m = "invokeSuspend")
public final class y04 extends px4 implements x81<te3<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ us2<Object> C;

    public static final class CQf implements ht2<Object> {
        public final /* synthetic */ te3<Object> w;
        public final /* synthetic */ AtomicReference<vl0> x;

        public CQf(te3<Object> te3Var, AtomicReference<vl0> atomicReference) {
            this.w = te3Var;
            this.x = atomicReference;
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.a(null);
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            boolean z;
            while (true) {
                AtomicReference<vl0> atomicReference = this.x;
                if (atomicReference.compareAndSet(null, vl0Var)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return;
            }
            vl0Var.a();
        }

        @Override // defpackage.ht2
        public final void g(Object obj) {
            try {
                fp1.B0(this.w, obj);
            } catch (InterruptedException unused) {
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.a(th);
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ AtomicReference<vl0> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(AtomicReference<vl0> atomicReference) {
            super(0);
            this.w = atomicReference;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            vl0 andSet = this.w.getAndSet(yr0.INSTANCE);
            if (andSet != null) {
                andSet.a();
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y04(us2<Object> us2Var, z80<? super y04> z80Var) {
        super(2, z80Var);
        this.C = us2Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        y04 y04Var = new y04(this.C, z80Var);
        y04Var.B = obj;
        return y04Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            te3 te3Var = (te3) this.B;
            AtomicReference atomicReference = new AtomicReference();
            this.C.a(new CQf(te3Var, atomicReference));
            QnHx qnHx = new QnHx(atomicReference);
            this.A = 1;
            if (pe3.a(te3Var, qnHx, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(te3<Object> te3Var, z80<? super sd5> z80Var) {
        return ((y04) a(te3Var, z80Var)).i(sd5.a);
    }
}
