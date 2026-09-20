package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class uc3 implements eo1<za3, ya3, fb3> {
    public final ad3 a;
    public final fm3 b;
    public final long c;

    public uc3(yc3 yc3Var, fm3 fm3Var) {
        long j = vc3.a;
        this.a = yc3Var;
        this.b = fm3Var;
        this.c = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(uc3 uc3Var, boolean z, boolean z2, z80 z80Var) throws Throwable {
        gc3 gc3Var;
        uc3Var.getClass();
        if (z80Var instanceof gc3) {
            gc3Var = (gc3) z80Var;
            int i = gc3Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                gc3Var.D = i - Integer.MIN_VALUE;
            } else {
                gc3Var = new gc3(uc3Var, z80Var);
            }
        } else {
            gc3Var = new gc3(uc3Var, z80Var);
        }
        Object objR = gc3Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = gc3Var.D;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = gc3Var.A;
                uc3Var = gc3Var.z;
                C0239D.H(objR);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objR);
            }
            return objR;
        }
        C0239D.H(objR);
        if (z) {
            gc3Var.z = uc3Var;
            gc3Var.A = z2;
            gc3Var.D = 1;
            if (S12N.f(uc3Var.c, gc3Var) == va0Var) {
                return va0Var;
            }
        }
        hc3 hc3Var = new hc3(uc3Var, z2, null);
        gc3Var.z = null;
        gc3Var.D = 2;
        objR = fp1.R(hc3Var, gc3Var);
        if (objR == va0Var) {
            return va0Var;
        }
        return objR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(uc3 uc3Var, z80 z80Var) throws Throwable {
        ic3 ic3Var;
        uc3Var.getClass();
        if (z80Var instanceof ic3) {
            ic3Var = (ic3) z80Var;
            int i = ic3Var.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic3Var.B = i - Integer.MIN_VALUE;
            } else {
                ic3Var = new ic3(uc3Var, z80Var);
            }
        } else {
            ic3Var = new ic3(uc3Var, z80Var);
        }
        Object objC = ic3Var.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = ic3Var.B;
        if (i2 == 0) {
            C0239D.H(objC);
            vk4<String> vk4VarA = uc3Var.b.a();
            ic3Var.B = 1;
            objC = JUCk.c(vk4VarA, ic3Var);
            if (objC == va0Var) {
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objC);
        }
        CharSequence charSequence = (CharSequence) objC;
        if (iv4.s(charSequence)) {
            return null;
        }
        return charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eo1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object a(go1 go1Var, za3 za3Var, z80 z80Var) throws Throwable {
        tb3 tb3Var;
        fo1 fo1Var;
        ya3.F1 f1;
        fo1 fo1Var2;
        ya3.LPt8Fixed lPt8;
        fo1 fo1Var3;
        if (z80Var instanceof tb3) {
            tb3Var = (tb3) z80Var;
            int i = tb3Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                tb3Var.D = i - Integer.MIN_VALUE;
            } else {
                tb3Var = new tb3(this, z80Var);
            }
        } else {
            tb3Var = new tb3(this, z80Var);
        }
        Object obj = tb3Var.B;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        switch (tb3Var.D) {
            case 0:
                C0239D.H(obj);
                if (za3Var instanceof za3.QnHx) {
                    go1Var.p("initialize", new mb3(this, null));
                } else {
                    if (za3Var instanceof za3.CQf) {
                        j81 ub3Var = new ub3(za3Var);
                        tb3Var.D = 1;
                        if (go1Var.s(ub3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (za3Var instanceof za3.F1) {
                        a62.a.c("Loaded plans: " + ((za3.F1) za3Var).a);
                        a62.a.g("plans_loaded", null);
                        j81 vb3Var = new vb3(za3Var);
                        tb3Var.D = 2;
                        if (go1Var.s(vb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (za3Var instanceof za3.NUlFixed) {
                        a62 a62Var = a62.a;
                        a62Var.a("Failed to load plans: " + ((za3.NUlFixed) za3Var).a);
                        a62Var.f("plans_failed", new wb3(za3Var));
                        j81 xb3Var = new xb3(za3Var);
                        tb3Var.D = 3;
                        if (go1Var.s(xb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (za3Var instanceof za3.LPt8Fixed) {
                        j81 yb3Var = new yb3(za3Var);
                        tb3Var.D = 4;
                        if (go1Var.s(yb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (ur1.a(za3Var, za3.T23.a)) {
                        tb3Var.z = go1Var;
                        tb3Var.D = 5;
                        if (go1Var.s(zb3.w) == obj2) {
                            fo1Var = go1Var;
                            return obj2;
                        }
                        fo1Var = go1Var;
                        f1 = ya3.F1.a;
                        tb3Var.z = null;
                        tb3Var.D = 6;
                        if (fo1Var.o(f1, tb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (za3Var instanceof za3.byN) {
                        tb3Var.z = go1Var;
                        tb3Var.A = za3Var;
                        tb3Var.D = 7;
                        if (go1Var.s(ac3.w) == obj2) {
                            fo1Var2 = go1Var;
                            return obj2;
                        }
                        fo1Var2 = go1Var;
                        lPt8 = new ya3.LPt8Fixed(((za3.byN) za3Var).a);
                        tb3Var.z = null;
                        tb3Var.A = null;
                        tb3Var.D = 8;
                        if (fo1Var2.o(lPt8, tb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    if (!ur1.a(za3Var, za3.EQ.a)) {
                        if (za3Var instanceof za3.FJCM) {
                            tb3Var.D = 10;
                            if (f(go1Var, (za3.FJCM) za3Var, tb3Var) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (ur1.a(za3Var, za3.PRnFixed.a)) {
                            tb3Var.D = 11;
                            if (g(go1Var, tb3Var) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (za3Var instanceof za3.MZ) {
                            a62.a.f("selected_plan", new pb3(za3Var));
                            j81 qb3Var = new qb3(za3Var);
                            tb3Var.D = 12;
                            if (go1Var.s(qb3Var) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (za3Var instanceof za3.YKK) {
                            tb3Var.D = 13;
                            if (e(go1Var, (za3.YKK) za3Var, tb3Var) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (ur1.a(za3Var, za3.y.a)) {
                            tb3Var.D = 14;
                            if (h(go1Var, tb3Var) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (ur1.a(za3Var, za3.LPt6Fixed.a)) {
                            tb3Var.D = 15;
                            if (go1Var.s(rb3.w) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (ur1.a(za3Var, za3.RBi.a)) {
                            tb3Var.D = 16;
                            if (go1Var.s(sb3.w) == obj2) {
                                return obj2;
                            }
                            return sd5.a;
                        }
                        if (!ur1.a(za3Var, za3.auxFixed.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a62 a62Var2 = a62.a;
                        a62.a.g("open_play_store_subscriptions", null);
                        ya3.QnHx qnHx = ya3.QnHx.a;
                        tb3Var.D = 17;
                        if (go1Var.o(qnHx, tb3Var) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    }
                    tb3Var.z = go1Var;
                    tb3Var.D = 9;
                    if (go1Var.s(ob3.w) == obj2) {
                        fo1Var3 = go1Var;
                        return obj2;
                    }
                    fo1Var3 = go1Var;
                    za3.FJCM fjcm = new za3.FJCM(false);
                    fo1Var3.p(fjcm.toString(), new nb3(fjcm, null));
                }
                return sd5.a;
            case 1:
                C0239D.H(obj);
                return sd5.a;
            case 2:
                C0239D.H(obj);
                return sd5.a;
            case 3:
                C0239D.H(obj);
                return sd5.a;
            case 4:
                C0239D.H(obj);
                return sd5.a;
            case 5:
                fo1 fo1Var4 = tb3Var.z;
                C0239D.H(obj);
                fo1Var = fo1Var4;
                fo1Var = go1Var;
                f1 = ya3.F1.a;
                tb3Var.z = null;
                tb3Var.D = 6;
                if (fo1Var.o(f1, tb3Var) == obj2) {
                    return obj2;
                }
                return sd5.a;
            case 6:
                C0239D.H(obj);
                return sd5.a;
            case 7:
                za3Var = tb3Var.A;
                fo1 fo1Var5 = tb3Var.z;
                C0239D.H(obj);
                fo1Var2 = fo1Var5;
                fo1Var2 = go1Var;
                lPt8 = new ya3.LPt8Fixed(((za3.byN) za3Var).a);
                tb3Var.z = null;
                tb3Var.A = null;
                tb3Var.D = 8;
                if (fo1Var2.o(lPt8, tb3Var) == obj2) {
                    return obj2;
                }
                return sd5.a;
            case 8:
                C0239D.H(obj);
                return sd5.a;
            case 9:
                fo1 fo1Var6 = tb3Var.z;
                C0239D.H(obj);
                fo1Var3 = fo1Var6;
                fo1Var3 = go1Var;
                za3.FJCM fjcm2 = new za3.FJCM(false);
                fo1Var3.p(fjcm2.toString(), new nb3(fjcm2, null));
                return sd5.a;
            case 10:
                C0239D.H(obj);
                return sd5.a;
            case 11:
                C0239D.H(obj);
                return sd5.a;
            case 12:
                C0239D.H(obj);
                return sd5.a;
            case 13:
                C0239D.H(obj);
                return sd5.a;
            case 14:
                C0239D.H(obj);
                return sd5.a;
            case 15:
                C0239D.H(obj);
                return sd5.a;
            case 16:
                C0239D.H(obj);
                return sd5.a;
            case 17:
                C0239D.H(obj);
                return sd5.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(go1 go1Var, za3.YKK ykk, z80 z80Var) throws Throwable {
        jc3 jc3Var;
        fo1 fo1Var;
        fo1 fo1Var2;
        za3.YKK ykk2;
        eb3 eb3Var;
        ya3.CQf cQf;
        if (z80Var instanceof jc3) {
            jc3Var = (jc3) z80Var;
            int i = jc3Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc3Var.D = i - Integer.MIN_VALUE;
            } else {
                jc3Var = new jc3(this, z80Var);
            }
        } else {
            jc3Var = new jc3(this, z80Var);
        }
        Object objR = jc3Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = jc3Var.D;
        if (i2 != 0) {
            if (i2 == 1) {
                ykk = jc3Var.A;
                fo1 fo1Var3 = jc3Var.z;
                C0239D.H(objR);
                fo1Var = fo1Var3;
            } else if (i2 == 2) {
                ykk2 = jc3Var.A;
                fo1 fo1Var4 = jc3Var.z;
                C0239D.H(objR);
                fo1Var2 = fo1Var4;
                eb3Var = ykk2.a;
                if (eb3Var instanceof eb3.CQf) {
                    cQf = new ya3.CQf(((eb3.CQf) eb3Var).a, null);
                } else {
                    if (eb3Var instanceof eb3.QnHx) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eb3.QnHx qnHx = (eb3.QnHx) eb3Var;
                    cQf = new ya3.CQf(qnHx.a, qnHx.b);
                }
                jc3Var.z = null;
                jc3Var.A = null;
                jc3Var.D = 3;
                if (fo1Var2.o(cQf, jc3Var) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objR);
            }
            return sd5.a;
        }
        C0239D.H(objR);
        a62.a.f("purchase", new kc3(ykk));
        jc3Var.z = go1Var;
        jc3Var.A = ykk;
        jc3Var.D = 1;
        objR = go1Var.r();
        if (objR == va0Var) {
            fo1Var = go1Var;
            return va0Var;
        }
        fo1Var = go1Var;
        if (((fb3) objR).a) {
            a62 a62Var = a62.a;
            a62.a.g("purchase_already_in_progress", null);
            fo1Var.q();
            return sd5.a;
        }
        jc3Var.z = fo1Var;
        jc3Var.A = ykk;
        jc3Var.D = 2;
        if (fo1Var.s(lc3.w) == va0Var) {
            return va0Var;
        }
        za3.YKK ykk3 = ykk;
        fo1Var2 = fo1Var;
        ykk2 = ykk3;
        eb3Var = ykk2.a;
        if (eb3Var instanceof eb3.CQf) {
            cQf = new ya3.CQf(((eb3.CQf) eb3Var).a, null);
        } else {
            if (eb3Var instanceof eb3.QnHx) {
                throw new NoWhenBranchMatchedException();
            }
            eb3.QnHx qnHx2 = (eb3.QnHx) eb3Var;
            cQf = new ya3.CQf(qnHx2.a, qnHx2.b);
        }
        jc3Var.z = null;
        jc3Var.A = null;
        jc3Var.D = 3;
        if (fo1Var2.o(cQf, jc3Var) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(go1 go1Var, za3.FJCM fjcm, z80 z80Var) throws Throwable {
        mc3 mc3Var;
        uc3 uc3Var;
        fo1 fo1Var;
        if (z80Var instanceof mc3) {
            mc3Var = (mc3) z80Var;
            int i = mc3Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                mc3Var.E = i - Integer.MIN_VALUE;
            } else {
                mc3Var = new mc3(this, z80Var);
            }
        } else {
            mc3Var = new mc3(this, z80Var);
        }
        Object obj = mc3Var.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = mc3Var.E;
        if (i2 == 0) {
            C0239D.H(obj);
            mc3Var.z = this;
            mc3Var.A = go1Var;
            mc3Var.B = fjcm;
            mc3Var.E = 1;
            if (go1Var.s(nc3.w) == va0Var) {
                return va0Var;
            }
            uc3Var = this;
            fo1Var = go1Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fjcm = mc3Var.B;
            fo1 fo1Var2 = mc3Var.A;
            uc3Var = mc3Var.z;
            C0239D.H(obj);
            fo1Var = fo1Var2;
        }
        fo1Var.p("reload_plans", new oc3(uc3Var, fjcm, null));
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(go1 go1Var, z80 z80Var) throws Throwable {
        qc3 qc3Var;
        fo1 fo1Var;
        if (z80Var instanceof qc3) {
            qc3Var = (qc3) z80Var;
            int i = qc3Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc3Var.C = i - Integer.MIN_VALUE;
            } else {
                qc3Var = new qc3(this, z80Var);
            }
        } else {
            qc3Var = new qc3(this, z80Var);
        }
        Object objR = qc3Var.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qc3Var.C;
        if (i2 == 0) {
            C0239D.H(objR);
            qc3Var.z = go1Var;
            qc3Var.C = 1;
            objR = go1Var.r();
            if (objR == va0Var) {
                fo1Var = go1Var;
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fo1 fo1Var2 = qc3Var.z;
            C0239D.H(objR);
            fo1Var = fo1Var2;
        }
        fo1Var = go1Var;
        if (((fb3) objR).e) {
            za3.FJCM fjcm = new za3.FJCM(true);
            fo1Var.p(fjcm.toString(), new pc3(fjcm, null));
        } else {
            fo1Var.q();
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(go1 go1Var, z80 z80Var) throws Throwable {
        rc3 rc3Var;
        uc3 uc3Var;
        fo1 fo1Var;
        fo1 fo1Var2;
        qa qaVar;
        sd5 sd5VarS;
        fo1 fo1Var3;
        ya3.NUlFixed nUl;
        if (z80Var instanceof rc3) {
            rc3Var = (rc3) z80Var;
            int i = rc3Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc3Var.D = i - Integer.MIN_VALUE;
            } else {
                rc3Var = new rc3(this, z80Var);
            }
        } else {
            rc3Var = new rc3(this, z80Var);
        }
        Object objC = rc3Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = rc3Var.D;
        if (i2 != 0) {
            if (i2 == 1) {
                fo1 fo1Var4 = (fo1) rc3Var.A;
                uc3Var = (uc3) rc3Var.z;
                C0239D.H(objC);
                fo1Var = fo1Var4;
            } else if (i2 == 2) {
                fo1 fo1Var5 = (fo1) rc3Var.z;
                C0239D.H(objC);
                fo1Var2 = fo1Var5;
                fo1 fo1Var6 = fo1Var2;
                qaVar = (qa) objC;
                rc3Var.z = fo1Var6;
                rc3Var.A = qaVar;
                rc3Var.D = 3;
                sd5VarS = fo1Var6.s(tc3.w);
                fo1Var3 = fo1Var6;
                if (sd5VarS == va0Var) {
                    return va0Var;
                }
                if (ur1.a(qaVar, qa.QnHx.a)) {
                    throw new IllegalStateException("unexpected cancellation result".toString());
                }
                if (!(qaVar instanceof qa.CQf)) {
                    ur1.a(qaVar, qa.F1.a);
                    return sd5.a;
                }
                nUl = ya3.NUlFixed.a;
                rc3Var.z = null;
                rc3Var.A = null;
                rc3Var.D = 4;
                if (fo1Var3.o(nUl, rc3Var) == va0Var) {
                    return va0Var;
                }
            } else if (i2 == 3) {
                qaVar = (qa) rc3Var.A;
                fo1 fo1Var7 = (fo1) rc3Var.z;
                C0239D.H(objC);
                fo1Var3 = fo1Var7;
                if (ur1.a(qaVar, qa.QnHx.a)) {
                    throw new IllegalStateException("unexpected cancellation result".toString());
                }
                if (!(qaVar instanceof qa.CQf)) {
                    ur1.a(qaVar, qa.F1.a);
                    return sd5.a;
                }
                nUl = ya3.NUlFixed.a;
                rc3Var.z = null;
                rc3Var.A = null;
                rc3Var.D = 4;
                if (fo1Var3.o(nUl, rc3Var) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objC);
            }
            return sd5.a;
        }
        C0239D.H(objC);
        a62 a62Var = a62.a;
        a62.a.g("restore_purchases", null);
        rc3Var.z = this;
        rc3Var.A = go1Var;
        rc3Var.D = 1;
        if (go1Var.s(sc3.w) == va0Var) {
            return va0Var;
        }
        uc3Var = this;
        fo1Var = go1Var;
        vk4<qa> vk4VarF = uc3Var.a.f();
        rc3Var.z = fo1Var;
        rc3Var.A = null;
        rc3Var.D = 2;
        objC = JUCk.c(vk4VarF, rc3Var);
        fo1Var2 = fo1Var;
        if (objC == va0Var) {
            return va0Var;
        }
        fo1 fo1Var8 = fo1Var2;
        qaVar = (qa) objC;
        rc3Var.z = fo1Var8;
        rc3Var.A = qaVar;
        rc3Var.D = 3;
        sd5VarS = fo1Var8.s(tc3.w);
        fo1Var3 = fo1Var8;
        if (sd5VarS == va0Var) {
            return va0Var;
        }
        if (ur1.a(qaVar, qa.QnHx.a)) {
            throw new IllegalStateException("unexpected cancellation result".toString());
        }
        if (!(qaVar instanceof qa.CQf)) {
            ur1.a(qaVar, qa.F1.a);
            return sd5.a;
        }
        nUl = ya3.NUlFixed.a;
        rc3Var.z = null;
        rc3Var.A = null;
        rc3Var.D = 4;
        if (fo1Var3.o(nUl, rc3Var) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }
}
