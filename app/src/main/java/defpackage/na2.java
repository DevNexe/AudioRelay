package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class na2 {

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = z;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            na2.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final void a(boolean z, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        rv rvVar;
        j30 j30VarQ = g30Var.q(-1384870321);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1833605860);
            if (!z) {
                long j = Zr_O.i;
                long j2 = Zr_O.l;
                rvVar = sv.c(j, j2, j, j2, Zr_O.d, yu.d, Zr_O.c, Zr_O.a, Zr_O.b, 2432);
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                long j3 = Zr_O.i;
                long j4 = Zr_O.l;
                long j5 = yu.d;
                long j6 = Zr_O.e;
                long j7 = Zr_O.a;
                long j8 = Zr_O.c;
                jt4 jt4Var = sv.a;
                rvVar = new rv(j3, j4, j3, j4, j7, j7, j8, j5, j5, j6, j6, yu.b, false);
            }
            j30VarQ.R(false);
            pa2.a(rvVar, null, null, x81Var, j30VarQ, (i2 << 6) & 7168, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(z, x81Var, i);
    }
}
