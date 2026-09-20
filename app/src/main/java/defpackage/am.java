package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class am<T> extends qo<T> {
    public final x81<te3<? super T>, z80<? super sd5>, Object> A;

    @if0(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public final /* synthetic */ am<T> B;
        public int C;
        public te3 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(am<T> amVar, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.B = amVar;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.h(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public am(x81<? super te3<? super T>, ? super z80<? super sd5>, ? extends Object> x81Var, la0 la0Var, int i, lg lgVar) {
        super(x81Var, la0Var, i, lgVar);
        this.A = x81Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.oo
    public final Object h(te3<? super T> te3Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            qnHx.z = te3Var;
            qnHx.C = 1;
            Object objInvoke = this.z.invoke(te3Var, qnHx);
            if (objInvoke != va0Var) {
                objInvoke = sd5.a;
            }
            if (objInvoke == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            te3Var = qnHx.z;
            C0239D.H(obj);
        }
        if (te3Var.Q()) {
            return sd5.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // defpackage.oo
    public final oo<T> i(la0 la0Var, int i, lg lgVar) {
        return new am(this.A, la0Var, i, lgVar);
    }
}
