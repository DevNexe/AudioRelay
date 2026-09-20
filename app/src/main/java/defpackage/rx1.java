package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements eo1<kx1, jx1, lx1> {
    public final by1 a;

    public rx1(by1 by1Var) {
        this.a = by1Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) throws Throwable {
        kx1 kx1Var = (kx1) obj;
        boolean z = kx1Var instanceof kx1.CQf;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (z) {
            sd5 sd5VarS = go1Var.s(new qx1(this));
            return sd5VarS == va0Var ? sd5VarS : sd5.a;
        }
        if (!(kx1Var instanceof kx1.QnHx)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objB = b(go1Var, (kx1.QnHx) kx1Var, z80Var);
        return objB == va0Var ? objB : sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(go1 go1Var, kx1.QnHx qnHx, z80 z80Var) throws Throwable {
        ox1 ox1Var;
        String str;
        rx1 rx1Var;
        fo1 fo1Var;
        if (z80Var instanceof ox1) {
            ox1Var = (ox1) z80Var;
            int i = ox1Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox1Var.E = i - Integer.MIN_VALUE;
            } else {
                ox1Var = new ox1(this, z80Var);
            }
        } else {
            ox1Var = new ox1(this, z80Var);
        }
        Object obj = ox1Var.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = ox1Var.E;
        if (i2 != 0) {
            if (i2 == 1) {
                qnHx = ox1Var.B;
                fo1 fo1Var2 = ox1Var.A;
                rx1Var = ox1Var.z;
                C0239D.H(obj);
                fo1Var = fo1Var2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        zx1 zx1Var = qnHx.a;
        if (ur1.a(zx1Var, zx1.CQf.a)) {
            str = "system";
        } else {
            if (!(zx1Var instanceof zx1.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((zx1.QnHx) zx1Var).a.a;
        }
        a62 a62Var = a62.a;
        a62Var.h("settings", "changed_language", str);
        a62Var.j("language_setting", str);
        px1 px1Var = new px1(qnHx);
        ox1Var.z = this;
        ox1Var.A = go1Var;
        ox1Var.B = qnHx;
        ox1Var.E = 1;
        if (go1Var.s(px1Var) == va0Var) {
            return va0Var;
        }
        rx1Var = this;
        fo1Var = go1Var;
        rx1Var.a.b(qnHx.a);
        jx1.QnHx qnHx2 = jx1.QnHx.a;
        ox1Var.z = null;
        ox1Var.A = null;
        ox1Var.B = null;
        ox1Var.E = 2;
        if (fo1Var.o(qnHx2, ox1Var) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }
}
