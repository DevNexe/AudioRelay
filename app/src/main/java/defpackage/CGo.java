package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class CGo implements eo1<x8W, GKz7, MW> {
    public final P_xB a;
    public final vAt b;

    public CGo(P_xB p_xB, vAt vat) {
        this.a = p_xB;
        this.b = vat;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eo1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(go1 go1Var, x8W x8w, z80 z80Var) throws Throwable {
        B b;
        fo1 fo1Var;
        if (z80Var instanceof B) {
            b = (B) z80Var;
            int i = b.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                b.C = i - Integer.MIN_VALUE;
            } else {
                b = new B(this, z80Var);
            }
        } else {
            b = new B(this, z80Var);
        }
        Object objA = b.A;
        Object obj = va0.COROUTINE_SUSPENDED;
        int i2 = b.C;
        if (i2 == 0) {
            C0239D.H(objA);
            if (x8w instanceof x8W.NUlFixed) {
                go1Var.p("initialize", new nv(this, null));
            } else {
                if (!ur1.a(x8w, x8W.QnHx.a)) {
                    if (ur1.a(x8w, x8W.CQf.a)) {
                        b.C = 2;
                        if (go1Var.s(vd.w) == obj) {
                            return obj;
                        }
                        return sd5.a;
                    }
                    if (ur1.a(x8w, x8W.YKK.a)) {
                        a62.a.e("clicked_on_premium_from_backfill");
                        GKz7.QnHx qnHx = GKz7.QnHx.a;
                        b.C = 3;
                        if (go1Var.o(qnHx, b) == obj) {
                            return obj;
                        }
                        return sd5.a;
                    }
                    if (x8w instanceof x8W.LPt8Fixed) {
                        b.C = 4;
                        if (c(go1Var, (x8W.LPt8Fixed) x8w, b) == obj) {
                            return obj;
                        }
                        return sd5.a;
                    }
                    if (!ur1.a(x8w, x8W.F1.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.C = 5;
                    if (go1Var.s(cei.w) == obj) {
                        return obj;
                    }
                    return sd5.a;
                }
                b.z = go1Var;
                b.C = 1;
                objA = go1Var.a(roB.w);
                if (objA == obj) {
                    fo1Var = go1Var;
                    return obj;
                }
                fo1Var = go1Var;
                fo1Var.p("reload", new H2d((MW) objA, null));
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C0239D.H(objA);
                    return sd5.a;
                }
                if (i2 == 3) {
                    C0239D.H(objA);
                    return sd5.a;
                }
                if (i2 == 4) {
                    C0239D.H(objA);
                    return sd5.a;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objA);
                return sd5.a;
            }
            fo1 fo1Var2 = b.z;
            C0239D.H(objA);
            fo1Var = fo1Var2;
            fo1Var = go1Var;
            fo1Var.p("reload", new H2d((MW) objA, null));
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(go1 go1Var, x8W.LPt8Fixed lPt8, z80 z80Var) throws Throwable {
        x2v x2vVar;
        fo1 fo1Var;
        fo1 fo1Var2;
        if (z80Var instanceof x2v) {
            x2vVar = (x2v) z80Var;
            int i = x2vVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                x2vVar.C = i - Integer.MIN_VALUE;
            } else {
                x2vVar = new x2v(this, z80Var);
            }
        } else {
            x2vVar = new x2v(this, z80Var);
        }
        Object objR = x2vVar.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = x2vVar.C;
        if (i2 == 0) {
            C0239D.H(objR);
            rv2<V> rv2Var = lPt8.a;
            if (ur1.a(rv2Var, gp2.a)) {
                x2vVar.C = 1;
                if (go1Var.s(KHWf.w) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            if (rv2Var instanceof mq4) {
                UH$ uh$ = new UH$(lPt8, rv2Var);
                x2vVar.z = go1Var;
                x2vVar.C = 2;
                if (go1Var.s(uh$) == va0Var) {
                    fo1Var = go1Var;
                    return va0Var;
                }
                fo1Var = go1Var;
                x2vVar.z = fo1Var;
                x2vVar.C = 3;
                objR = fo1Var.r();
                fo1Var2 = fo1Var;
                if (objR == va0Var) {
                    return va0Var;
                }
            }
            return sd5.a;
        }
        if (i2 == 1) {
            C0239D.H(objR);
            return sd5.a;
        }
        if (i2 == 2) {
            fo1 fo1Var3 = x2vVar.z;
            C0239D.H(objR);
            fo1Var = fo1Var3;
            fo1Var = go1Var;
            x2vVar.z = fo1Var;
            x2vVar.C = 3;
            objR = fo1Var.r();
            fo1Var2 = fo1Var;
            if (objR == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fo1 fo1Var4 = x2vVar.z;
            C0239D.H(objR);
            fo1Var2 = fo1Var4;
        }
        if (((MW) objR).e) {
            fo1Var2.p("restore_loading_after_delay", new Uf$(null));
        }
        return sd5.a;
    }
}
