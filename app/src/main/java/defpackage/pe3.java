package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pe3 {

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ wm<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(xm xmVar) {
            super(1);
            this.w = xmVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            sd5 sd5Var = sd5.a;
            this.w.x(sd5Var);
            return sd5Var;
        }
    }

    @if0(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    public static final class QnHx extends b90 {
        public h81 A;
        public /* synthetic */ Object B;
        public int C;
        public te3 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return pe3.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(te3<?> te3Var, h81<sd5> h81Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        try {
            if (i2 == 0) {
                C0239D.H(obj);
                if (!(qnHx.x.j(ms1.CQf.w) == te3Var)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                qnHx.z = te3Var;
                qnHx.A = h81Var;
                qnHx.C = 1;
                xm xmVar = new xm(1, ps0.L(qnHx));
                xmVar.r();
                te3Var.t(new CQf(xmVar));
                if (xmVar.p() == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h81Var = qnHx.A;
                C0239D.H(obj);
            }
            h81Var.invoke();
            return sd5.a;
        } catch (Throwable th) {
            h81Var.invoke();
            throw th;
        }
    }
}
