package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ag {
    public static final f34 a = NRt.b(new p92(new QnHx()), new q92(new CQf()));

    public static final class CQf extends cx1 implements j81<Map<String, ? extends Object>, yf> {
        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final yf invoke(Map<String, ? extends Object> map) {
            Object obj = map.get("URL");
            return new yf(ps0.R(obj instanceof String ? (String) obj : null));
        }
    }

    @if0(c = "com.azefsw.audioconnect.compose.components.browser.BrowserViewKt$BrowserView$1", f = "BrowserView.kt", l = {32}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ yf B;
        public final /* synthetic */ qe5 C;

        public static final class QnHx implements nz0<String> {
            public final /* synthetic */ qe5 w;
            public final /* synthetic */ yf x;

            public QnHx(qe5 qe5Var, yf yfVar) {
                this.w = qe5Var;
                this.x = yfVar;
            }

            @Override // defpackage.nz0
            public final Object f(String str, z80 z80Var) {
                Object qnHx;
                String str2 = str;
                try {
                    this.w.a(str2);
                    qnHx = sd5.a;
                } catch (Throwable th) {
                    qnHx = new fq3.QnHx(th);
                }
                Throwable thA = fq3.a(qnHx);
                if (thA != null) {
                    a62 a62Var = a62.a;
                    a62.a.d(thA, true);
                    this.x.b.setValue(str2);
                }
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(yf yfVar, qe5 qe5Var, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.B = yfVar;
            this.C = qe5Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new F1(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            Object obj2 = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                yf yfVar = this.B;
                nj4 nj4Var = yfVar.a;
                QnHx qnHx = new QnHx(this.C, yfVar);
                this.A = 1;
                q01 q01Var = new q01(qnHx);
                nj4Var.getClass();
                Object objN = nj4.n(nj4Var, q01Var, this);
                if (objN != obj2) {
                    objN = sd5.a;
                }
                if (objN == obj2) {
                    return obj2;
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
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ yf w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(yf yfVar) {
            super(0);
            this.w = yfVar;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.b.setValue(null);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ yf w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(yf yfVar, int i) {
            super(2);
            this.w = yfVar;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            ag.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, yf, Map<String, ? extends Object>> {
        public QnHx() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Map<String, ? extends Object> invoke(g34 g34Var, yf yfVar) {
            return Collections.singletonMap("URL", (String) yfVar.b.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yf yfVar, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-782681660);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(yfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            wq0.d(yfVar, new F1(yfVar, (qe5) j30VarQ.E(r40.n), null), j30VarQ);
            String str = (String) yfVar.b.getValue();
            if (str != null) {
                String strV = iv4.v(str, "mailto:", "");
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(yfVar);
                Object objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new LPt8Fixed(yfVar);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                gw.a(strV, (h81) objB0, j30VarQ, 0);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(yfVar, i);
    }

    public static final yf b(g30 g30Var) {
        g30Var.e(-911990255);
        e40.CQf cQf = e40.a;
        yf yfVar = (yf) g7.f(new Object[0], a, null, bg.w, g30Var, 4);
        g30Var.G();
        return yfVar;
    }
}
