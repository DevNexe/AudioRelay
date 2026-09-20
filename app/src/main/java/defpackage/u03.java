package defpackage;

import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;

/* JADX INFO: loaded from: classes.dex */
public final class u03 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ hi2 w;
        public final /* synthetic */ YKK.CQf x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(hi2 hi2Var, YKK.CQf cQf, int i, int i2) {
            super(2);
            this.w = hi2Var;
            this.x = cQf;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            u03.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ YKK w;
        public final /* synthetic */ auxFixed x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(YKK ykk, auxFixed auxVar) {
            super(1);
            this.w = ykk;
            this.x = auxVar;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            YKK ykk = this.w;
            auxFixed auxVar = this.x;
            ykk.a(auxVar);
            return new t03(ykk, auxVar);
        }
    }

    public static final void a(final hi2 hi2Var, final YKK.CQf cQf, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(hi2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(cQf) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                cQf = YKK.CQf.ON_RESUME;
            }
            e40.CQf cQf2 = e40.a;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(hi2Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new auxFixed() { // from class: s03
                    @Override // androidx.lifecycle.auxFixed
                    public final void h(d32 d32Var, YKK.CQf cQf3) {
                        if (cQf3 == cQf) {
                            hi2 hi2Var2 = hi2Var;
                            if (ur1.a(hi2Var2.a(), o03.CQf.a)) {
                                return;
                            }
                            hi2Var2.d.setValue(hi2Var2.c());
                        }
                    }
                };
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            auxFixed auxVar = (auxFixed) objB0;
            YKK ykkC = ((d32) j30VarQ.E(Ll.d)).c();
            wq0.b(ykkC, auxVar, new QnHx(ykkC, auxVar), j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(hi2Var, cQf, i, i2);
    }
}
