package defpackage;

import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
public final class jm2 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ j81<fm2, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(il2 il2Var, String str, pg2 pg2Var, j81<? super fm2, sd5> j81Var, int i, int i2) {
            super(2);
            this.w = il2Var;
            this.x = str;
            this.y = pg2Var;
            this.z = j81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            jm2.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class F1 implements iu2 {
        public final OnBackPressedDispatcher w = new OnBackPressedDispatcher(null);
        public final /* synthetic */ d32 x;

        public F1(d32 d32Var) {
            this.x = d32Var;
        }

        @Override // defpackage.d32
        public final YKK c() {
            return this.x.c();
        }

        @Override // defpackage.iu2
        public final OnBackPressedDispatcher e() {
            return this.w;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<gl2, sd5> {
        public final /* synthetic */ iu2 w;
        public final /* synthetic */ j81<fm2, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(iu2 iu2Var, j81<? super fm2, sd5> j81Var) {
            super(1);
            this.w = iu2Var;
            this.x = j81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(gl2 gl2Var) {
            this.x.invoke(new im2(this.w, gl2Var));
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ il2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ j81<gl2, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(il2 il2Var, String str, pg2 pg2Var, j81<? super gl2, sd5> j81Var, int i) {
            super(2);
            this.w = il2Var;
            this.x = str;
            this.y = pg2Var;
            this.z = j81Var;
            this.A = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                il2 il2Var = this.w;
                String str = this.x;
                pg2 pg2Var = this.y;
                j81<gl2, sd5> j81Var = this.z;
                int i = this.A;
                ml2.b(il2Var, str, pg2Var, null, j81Var, g30Var2, (i & 112) | 8 | (i & 896), 8);
            }
            return sd5.a;
        }
    }

    public static final void a(il2 il2Var, String str, pg2 pg2Var, j81<? super fm2, sd5> j81Var, g30 g30Var, int i, int i2) {
        j30 j30VarQ = g30Var.q(1764521382);
        if ((i2 & 4) != 0) {
            pg2Var = pg2.QnHx.w;
        }
        e40.CQf cQf = e40.a;
        d32 d32Var = (d32) j30VarQ.E(Ll.d);
        iu2 iu2VarA = v42.a(j30VarQ);
        j30VarQ.e(511388516);
        boolean zI = j30VarQ.I(iu2VarA) | j30VarQ.I(j81Var);
        Object objB0 = j30VarQ.b0();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objB0 == c0132QnHx) {
            objB0 = new LPt8Fixed(iu2VarA, j81Var);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        j81 j81Var2 = (j81) objB0;
        j30VarQ.e(1157296644);
        boolean zI2 = j30VarQ.I(d32Var);
        Object objB1 = j30VarQ.b0();
        if (zI2 || objB1 == c0132QnHx) {
            objB1 = new F1(d32Var);
            j30VarQ.F0(objB1);
        }
        j30VarQ.R(false);
        q40.a(new ng3[]{v42.a.b((F1) objB1)}, X.m(j30VarQ, 1839290982, new QnHx(il2Var, str, pg2Var, j81Var2, i)), j30VarQ, 56);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(il2Var, str, pg2Var, j81Var, i, i2);
    }
}
