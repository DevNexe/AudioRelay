package defpackage;

import io.ktor.utils.io.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class xnX3 implements m70, ba, i91 {
    public static ej1 x;
    public static ej1 y;
    public static final xnX3 w = new xnX3();
    public static final xnX3 z = new xnX3();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(o75 o75Var, y81 y81Var, Throwable th, z80 z80Var) throws Throwable {
        uz0 uz0Var;
        if (z80Var instanceof uz0) {
            uz0Var = (uz0) z80Var;
            int i = uz0Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                uz0Var.B = i - Integer.MIN_VALUE;
            } else {
                uz0Var = new uz0(z80Var);
            }
        } else {
            uz0Var = new uz0(z80Var);
        }
        Object obj = uz0Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = uz0Var.B;
        try {
            if (i2 == 0) {
                C0239D.H(obj);
                uz0Var.z = th;
                uz0Var.B = 1;
                if (y81Var.invoke(o75Var, th, uz0Var) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = uz0Var.z;
                C0239D.H(obj);
            }
            return sd5.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                Th.a(th2, th);
            }
            throw th2;
        }
    }

    public static final pg2 b(pg2 pg2Var, x45 x45Var, g30 g30Var) {
        g30Var.e(-1014047083);
        e40.CQf cQf = e40.a;
        g30Var.e(1157296644);
        boolean zI = g30Var.I(x45Var);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new v25(x45Var);
            g30Var.B(objF);
        }
        g30Var.G();
        mg3<bw1> mg3Var = cw1.a;
        pg2 pg2VarA = wo1.a(pg2Var, new bw1(null, (j81) objF));
        g30Var.G();
        return pg2VarA;
    }

    public static final xo c(ua0 ua0Var, la0 la0Var, boolean z2, x81 x81Var) {
        QnHx qnHx = new QnHx(z2, oq2.c, 8);
        qr4 qr4VarK0 = fp1.k0(ua0Var, la0Var, 0, new za0(true, qnHx, x81Var, (oa0) ua0Var.g().j(oa0.x), null), 2);
        qr4VarK0.r0(new ya0(qnHx));
        return new xo(qr4VarK0, qnHx);
    }

    @Override // defpackage.m70
    public void accept(Object obj) {
        a62 a62Var = a62.a;
        a62.a.d((Throwable) obj, true);
    }

    @Override // defpackage.ba
    public Object apply(Object obj, Object obj2) {
        return new uy2(obj, obj2);
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        bt1 bt1Var = (bt1) obj;
        String str = bt1Var.e;
        if (str == null) {
            str = "";
        }
        String str2 = bt1Var.g;
        return new w1L(bt1Var.b, bt1Var.d, str, str2 != null ? str2 : "");
    }
}
