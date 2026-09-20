package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ul5 {

    @if0(c = "io.ktor.websocket.WebSocketSessionKt", f = "WebSocketSession.kt", l = {112, 113}, m = "close")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public tl5 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return ul5.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(tl5 tl5Var, lt ltVar, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    tl5Var = qnHx.z;
                    C0239D.H(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            p61.CQf cQf = new p61.CQf(ltVar);
            qnHx.z = tl5Var;
            qnHx.B = 1;
            if (tl5Var.i0(cQf, qnHx) == va0Var) {
                return va0Var;
            }
            qnHx.z = null;
            qnHx.B = 2;
            if (tl5Var.I(qnHx) == va0Var) {
                return va0Var;
            }
        } catch (Throwable unused) {
        }
        return sd5.a;
    }
}
