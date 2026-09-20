package defpackage;

import android.annotation.SuppressLint;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class be0 implements eo1<cd0, bd0, dd0> {
    public final ce0 a;

    public be0(ce0 ce0Var) {
        this.a = ce0Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) throws Throwable {
        cd0 cd0Var = (cd0) obj;
        boolean z = cd0Var instanceof cd0.CQf;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        ce0 ce0Var = this.a;
        if (z) {
            ad0 ad0VarM = ce0Var.a.m();
            sd5 sd5VarS = go1Var.s(new vd0(new ce0.CQf(new x45(String.valueOf(ad0VarM.a), 0L, 6), new x45(String.valueOf(ad0VarM.b), 0L, 6))));
            if (sd5VarS != va0Var) {
                sd5VarS = sd5.a;
            }
            return sd5VarS == va0Var ? sd5VarS : sd5.a;
        }
        if (cd0Var instanceof cd0.QnHx) {
            Object objO = go1Var.o(bd0.QnHx.a, z80Var);
            return objO == va0Var ? objO : sd5.a;
        }
        if (cd0Var instanceof cd0.F1) {
            Object objB = b(go1Var, (cd0.F1) cd0Var, z80Var);
            return objB == va0Var ? objB : sd5.a;
        }
        if (!(cd0Var instanceof cd0.LPt8Fixed)) {
            throw new NoWhenBranchMatchedException();
        }
        ce0.CQf cQf = ((cd0.LPt8Fixed) cd0Var).a;
        ce0Var.getClass();
        sd5 sd5VarS2 = go1Var.s(new ae0(ce0.a(cQf)));
        if (sd5VarS2 != va0Var) {
            sd5VarS2 = sd5.a;
        }
        return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"CheckResult"})
    public final Object b(go1 go1Var, cd0.F1 f1, z80 z80Var) throws Throwable {
        wd0 wd0Var;
        be0 be0Var;
        fo1 fo1Var;
        xq0 xq0Var;
        if (z80Var instanceof wd0) {
            wd0Var = (wd0) z80Var;
            int i = wd0Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd0Var.E = i - Integer.MIN_VALUE;
            } else {
                wd0Var = new wd0(this, z80Var);
            }
        } else {
            wd0Var = new wd0(this, z80Var);
        }
        Object obj = wd0Var.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = wd0Var.E;
        if (i2 == 0) {
            C0239D.H(obj);
            ce0.CQf cQf = f1.a;
            this.a.getClass();
            xq0 xq0VarA = ce0.a(cQf);
            if (xq0VarA instanceof xq0.QnHx) {
                xd0 xd0Var = new xd0(xq0VarA);
                wd0Var.E = 1;
                if (go1Var.s(xd0Var) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            if (xq0VarA instanceof xq0.CQf) {
                wd0Var.z = this;
                wd0Var.A = go1Var;
                wd0Var.B = xq0VarA;
                wd0Var.E = 2;
                if (go1Var.s(yd0.w) == va0Var) {
                    return va0Var;
                }
                be0Var = this;
                fo1Var = go1Var;
                xq0Var = xq0VarA;
                fo1Var.p("save", new zd0(be0Var, xq0Var, null));
            }
        } else {
            if (i2 == 1) {
                C0239D.H(obj);
                return sd5.a;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xq0Var = wd0Var.B;
            fo1Var = wd0Var.A;
            be0Var = wd0Var.z;
            C0239D.H(obj);
            fo1Var.p("save", new zd0(be0Var, xq0Var, null));
        }
        return sd5.a;
    }
}
