package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends cx1 implements y81<pg2, g30, Integer, pg2> {
    public final /* synthetic */ ci2 w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(ci2 ci2Var, boolean z) {
        super(3);
        this.w = ci2Var;
        this.x = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(ci2 ci2Var, ri2 ri2Var, z80 z80Var) throws Throwable {
        od1 od1Var;
        hd1 hd1Var;
        if (z80Var instanceof od1) {
            od1Var = (od1) z80Var;
            int i = od1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                od1Var.C = i - Integer.MIN_VALUE;
            } else {
                od1Var = new od1(z80Var);
            }
        } else {
            od1Var = new od1(z80Var);
        }
        Object obj = od1Var.B;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = od1Var.C;
        if (i2 == 0) {
            C0239D.H(obj);
            if (((hd1) ri2Var.getValue()) == null) {
                hd1 hd1Var2 = new hd1();
                od1Var.z = ri2Var;
                od1Var.A = hd1Var2;
                od1Var.C = 1;
                if (ci2Var.c(hd1Var2, od1Var) == obj2) {
                    return obj2;
                }
                hd1Var = hd1Var2;
            }
            return sd5.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hd1Var = od1Var.A;
        ri2Var = od1Var.z;
        C0239D.H(obj);
        ri2Var.setValue(hd1Var);
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(ci2 ci2Var, ri2 ri2Var, z80 z80Var) throws Throwable {
        pd1 pd1Var;
        if (z80Var instanceof pd1) {
            pd1Var = (pd1) z80Var;
            int i = pd1Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                pd1Var.B = i - Integer.MIN_VALUE;
            } else {
                pd1Var = new pd1(z80Var);
            }
        } else {
            pd1Var = new pd1(z80Var);
        }
        Object obj = pd1Var.A;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = pd1Var.B;
        if (i2 == 0) {
            C0239D.H(obj);
            hd1 hd1Var = (hd1) ri2Var.getValue();
            if (hd1Var != null) {
                vp1 id1Var = new id1(hd1Var);
                pd1Var.z = ri2Var;
                pd1Var.B = 1;
                if (ci2Var.c(id1Var, pd1Var) == obj2) {
                    return obj2;
                }
            }
            return sd5.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri2Var = pd1Var.z;
        C0239D.H(obj);
        ri2Var.setValue(null);
        return sd5.a;
    }

    @Override // defpackage.y81
    public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        num.intValue();
        g30Var2.e(1294013553);
        g30Var2.e(773894976);
        g30Var2.e(-492369756);
        Object objF = g30Var2.f();
        g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
        if (objF == c0132QnHx) {
            s40 s40Var = new s40(wq0.i(g30Var2));
            g30Var2.B(s40Var);
            objF = s40Var;
        }
        g30Var2.G();
        ua0 ua0Var = ((s40) objF).w;
        g30Var2.G();
        g30Var2.e(-492369756);
        Object objF2 = g30Var2.f();
        if (objF2 == c0132QnHx) {
            objF2 = ps0.R(null);
            g30Var2.B(objF2);
        }
        g30Var2.G();
        ri2 ri2Var = (ri2) objF2;
        ci2 ci2Var = this.w;
        wq0.a(ci2Var, new ld1(ri2Var, ci2Var), g30Var2);
        boolean z = this.x;
        wq0.d(Boolean.valueOf(z), new md1(ci2Var, ri2Var, null, z), g30Var2);
        pg2 pg2VarA = pg2.QnHx.w;
        if (z) {
            pg2VarA = tx4.a(pg2VarA, ci2Var, new nd1(ci2Var, ri2Var, null, ua0Var));
        }
        g30Var2.G();
        return pg2VarA;
    }
}
