package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ t95<ts0> w;
    public final /* synthetic */ is4<io> x;
    public final /* synthetic */ is4<io> y;
    public final /* synthetic */ String z = "Built-in";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(t95 t95Var, ri2 ri2Var, ri2 ri2Var2) {
        super(3);
        this.w = t95Var;
        this.x = ri2Var;
        this.y = ri2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        One one;
        pg2 pg2VarY = pg2Var;
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(-140634085);
        g30Var2.e(1157296644);
        t95<ts0> t95Var = this.w;
        boolean zI = g30Var2.I(t95Var);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (zI || objF == c0132QnHx) {
            objF = ps0.R(Boolean.FALSE);
            g30Var2.B(objF);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF;
        ts0 ts0VarB = t95Var.b();
        ts0 ts0VarD = t95Var.d();
        is4<io> is4Var = this.y;
        is4<io> is4Var2 = this.x;
        if (ts0VarB == ts0VarD && !t95Var.e()) {
            ri2Var.setValue(Boolean.FALSE);
        } else if (is4Var2.getValue() != null || is4Var.getValue() != null) {
            ri2Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) ri2Var.getValue()).booleanValue()) {
            if (t95Var.c().b(ts0.PreEnter, ts0.Visible)) {
                io value = is4Var2.getValue();
                if (value == null || (one = value.a) == null) {
                    io value2 = is4Var.getValue();
                    if (value2 != null) {
                        one = value2.a;
                    } else {
                        one = null;
                    }
                }
            } else {
                io value3 = is4Var.getValue();
                if (value3 == null || (one = value3.a) == null) {
                    io value4 = is4Var2.getValue();
                    if (value4 != null) {
                        one = value4.a;
                    } else {
                        one = null;
                    }
                }
            }
            ri2 ri2VarF0 = ps0.f0(one, g30Var2);
            qb5 qb5Var = mg5.h;
            g30Var2.e(-492369756);
            Object objF2 = g30Var2.f();
            String str = this.z;
            if (objF2 == c0132QnHx) {
                objF2 = str + " shrink/expand";
                g30Var2.B(objF2);
            }
            g30Var2.G();
            t95.QnHx qnHxA = da5.a(t95Var, qb5Var, (String) objF2, g30Var2);
            boolean z = true;
            g30Var2.r(-1553214637, Boolean.valueOf(t95Var.b() == t95Var.d()));
            int i = mp1.c;
            qb5 qb5Var2 = mg5.g;
            g30Var2.e(-492369756);
            Object objF3 = g30Var2.f();
            if (objF3 == c0132QnHx) {
                objF3 = str + " InterruptionHandlingOffset";
                g30Var2.B(objF3);
            }
            g30Var2.G();
            t95.QnHx qnHxA2 = da5.a(t95Var, qb5Var2, (String) objF3, g30Var2);
            g30Var2.F();
            is4<io> is4Var3 = this.x;
            is4<io> is4Var4 = this.y;
            g30Var2.e(1157296644);
            boolean zI2 = g30Var2.I(t95Var);
            Object objF4 = g30Var2.f();
            if (zI2 || objF4 == c0132QnHx) {
                objF4 = new nv0(qnHxA, qnHxA2, is4Var3, is4Var4, ri2VarF0);
                g30Var2.B(objF4);
            }
            g30Var2.G();
            nv0 nv0Var = (nv0) objF4;
            if (t95Var.b() == t95Var.d()) {
                nv0Var.B = null;
            } else if (nv0Var.B == null) {
                One one2 = (One) ri2VarF0.getValue();
                if (one2 == null) {
                    one2 = One.QnHx.a;
                }
                nv0Var.B = one2;
            }
            io value5 = is4Var2.getValue();
            if (!((value5 == null || value5.d) ? false : true)) {
                io value6 = is4Var.getValue();
                if (!((value6 == null || value6.d) ? false : true)) {
                    z = false;
                }
            }
            pg2 pg2VarL = pg2.QnHx.w;
            if (!z) {
                pg2VarL = fp1.L(pg2VarL);
            }
            pg2VarY = pg2VarY.y(pg2VarL).y(nv0Var);
        }
        g30Var2.G();
        return pg2VarY;
    }
}
