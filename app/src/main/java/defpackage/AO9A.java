package defpackage;

import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class AO9A implements eo1<VV4, c8e, tg> {
    public final I8O a;
    public final ef4 b;
    public final rc4 c;

    public AO9A(I8O i8o, ef4 ef4Var, rc4 rc4Var) {
        this.a = i8o;
        this.b = ef4Var;
        this.c = rc4Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) throws Throwable {
        VV4 vv4 = (VV4) obj;
        if (vv4 instanceof VV4.NUlFixed) {
            go1Var.p("initialize", new vK(this, null));
        } else {
            boolean z = vv4 instanceof VV4.RBi;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (z) {
                sd5 sd5VarS = go1Var.s(new yd(vv4));
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            if (vv4 instanceof VV4.PRnFixed) {
                Object objD = d(go1Var, (VV4.PRnFixed) vv4, z80Var);
                return objD == va0Var ? objD : sd5.a;
            }
            if (vv4 instanceof VV4.MZ) {
                sd5 sd5VarS2 = go1Var.s(new BRFY(vv4));
                return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
            }
            if (ur1.a(vv4, VV4.F1.a)) {
                lKy3 lky3 = this.a.a;
                lky3.g(lky3.d(R.string.pref_show_setup_card_key), false);
                go1Var.q();
            } else {
                if (ur1.a(vv4, VV4.FJCM.a)) {
                    Object objE = e(go1Var, z80Var);
                    return objE == va0Var ? objE : sd5.a;
                }
                if (vv4 instanceof VV4.y) {
                    Object objF = f(go1Var, ((VV4.y) vv4).a, z80Var);
                    return objF == va0Var ? objF : sd5.a;
                }
                if (vv4 instanceof VV4.LPt6Fixed) {
                    Object objG = g(go1Var, (VV4.LPt6Fixed) vv4, z80Var);
                    return objG == va0Var ? objG : sd5.a;
                }
                if (vv4 instanceof VV4.QnHx) {
                    Object objB = b(go1Var, z80Var);
                    return objB == va0Var ? objB : sd5.a;
                }
                if (ur1.a(vv4, VV4.CQf.a)) {
                    sd5 sd5VarS3 = go1Var.s(re.w);
                    return sd5VarS3 == va0Var ? sd5VarS3 : sd5.a;
                }
                if (vv4 instanceof VV4.auxFixed) {
                    ((VV4.auxFixed) vv4).getClass();
                    Object objC = c(go1Var, z80Var);
                    return objC == va0Var ? objC : sd5.a;
                }
                if (!(vv4 instanceof VV4.EQ)) {
                    if (ur1.a(vv4, VV4.byN.a)) {
                        sd5 sd5VarS4 = go1Var.s(KO4.w);
                        return sd5VarS4 == va0Var ? sd5VarS4 : sd5.a;
                    }
                    if (ur1.a(vv4, VV4.YKK.a)) {
                        Object objO = go1Var.o(c8e.F1.a, z80Var);
                        return objO == va0Var ? objO : sd5.a;
                    }
                    if (ur1.a(vv4, VV4.T23.a)) {
                        sd5 sd5VarS5 = go1Var.s(PE.w);
                        if (sd5VarS5 != va0Var) {
                            sd5VarS5 = sd5.a;
                        }
                        return sd5VarS5 == va0Var ? sd5VarS5 : sd5.a;
                    }
                    if (!(vv4 instanceof VV4.LPt8Fixed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th = ((VV4.LPt8Fixed) vv4).a;
                    a62.a.h("server", "failed_open_settings", th.getMessage());
                    a62.a.d(th, true);
                    Object objO2 = go1Var.o(c8e.LPt8Fixed.a, z80Var);
                    if (objO2 != va0Var) {
                        objO2 = sd5.a;
                    }
                    return objO2 == va0Var ? objO2 : sd5.a;
                }
                VV4.LPt6Fixed lPt6 = new VV4.LPt6Fixed(new Qx0$.CQf(((VV4.EQ) vv4).a));
                go1Var.p(lPt6.toString(), new pU(lPt6, null));
            }
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(go1 go1Var, z80 z80Var) throws Throwable {
        kj kjVar;
        fo1 fo1Var;
        if (z80Var instanceof kj) {
            kjVar = (kj) z80Var;
            int i = kjVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                kjVar.C = i - Integer.MIN_VALUE;
            } else {
                kjVar = new kj(this, z80Var);
            }
        } else {
            kjVar = new kj(this, z80Var);
        }
        Object obj = kjVar.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = kjVar.C;
        if (i2 != 0) {
            if (i2 == 1) {
                fo1 fo1Var2 = kjVar.z;
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
        kjVar.z = go1Var;
        kjVar.C = 1;
        if (go1Var.s(Xvf.w) == va0Var) {
            fo1Var = go1Var;
            return va0Var;
        }
        fo1Var = go1Var;
        c8e.QnHx qnHx = c8e.QnHx.a;
        kjVar.z = null;
        kjVar.C = 2;
        if (fo1Var.o(qnHx, kjVar) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(go1 go1Var, z80 z80Var) throws Throwable {
        ka kaVar;
        fo1 fo1Var;
        wb4 wb4Var;
        if (z80Var instanceof ka) {
            kaVar = (ka) z80Var;
            int i = kaVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                kaVar.D = i - Integer.MIN_VALUE;
            } else {
                kaVar = new ka(this, z80Var);
            }
        } else {
            kaVar = new ka(this, z80Var);
        }
        Object obj = kaVar.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = kaVar.D;
        if (i2 != 0) {
            if (i2 == 1) {
                wb4Var = kaVar.A;
                fo1Var = kaVar.z;
                C0239D.H(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        kaVar.z = go1Var;
        kaVar.A = null;
        kaVar.D = 1;
        if (go1Var.s(Gv.w) == va0Var) {
            return va0Var;
        }
        fo1Var = go1Var;
        wb4Var = null;
        c8e.NUlFixed nUl = new c8e.NUlFixed(wb4Var);
        kaVar.z = null;
        kaVar.A = null;
        kaVar.D = 2;
        if (fo1Var.o(nUl, kaVar) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(go1 go1Var, VV4.PRnFixed pRn, z80 z80Var) throws Throwable {
        i4au i4auVar;
        fo1 fo1Var;
        if (z80Var instanceof i4au) {
            i4auVar = (i4au) z80Var;
            int i = i4auVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                i4auVar.D = i - Integer.MIN_VALUE;
            } else {
                i4auVar = new i4au(this, z80Var);
            }
        } else {
            i4auVar = new i4au(this, z80Var);
        }
        Object objB = i4auVar.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = i4auVar.D;
        if (i2 != 0) {
            if (i2 == 1) {
                pRn = i4auVar.A;
                fo1 fo1Var2 = i4auVar.z;
                C0239D.H(objB);
                fo1Var = fo1Var2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(objB);
            }
            return sd5.a;
        }
        C0239D.H(objB);
        EFt eFt = new EFt(pRn);
        i4auVar.z = go1Var;
        i4auVar.A = pRn;
        i4auVar.D = 1;
        objB = go1Var.b(eFt);
        if (objB == va0Var) {
            fo1Var = go1Var;
            return va0Var;
        }
        fo1Var = go1Var;
        TJon tJon = ((tg) objB).d;
        if (tJon == null) {
            return sd5.a;
        }
        if (!pRn.a) {
            return sd5.a;
        }
        c8e.NUlFixed nUl = new c8e.NUlFixed(tJon.a);
        i4auVar.z = null;
        i4auVar.A = null;
        i4auVar.D = 2;
        if (fo1Var.o(nUl, i4auVar) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(go1 go1Var, z80 z80Var) throws Throwable {
        GvC gvC;
        fo1 fo1Var;
        fo1 fo1Var2;
        c8e.QnHx qnHx;
        if (z80Var instanceof GvC) {
            gvC = (GvC) z80Var;
            int i = gvC.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gvC.C = i - Integer.MIN_VALUE;
            } else {
                gvC = new GvC(this, z80Var);
            }
        } else {
            gvC = new GvC(this, z80Var);
        }
        Object objR = gvC.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = gvC.C;
        if (i2 != 0) {
            if (i2 == 1) {
                fo1 fo1Var3 = gvC.z;
                C0239D.H(objR);
                fo1Var = fo1Var3;
            } else if (i2 == 2) {
                fo1 fo1Var4 = gvC.z;
                C0239D.H(objR);
                fo1Var2 = fo1Var4;
                fo1Var2 = fo1Var;
                qnHx = c8e.QnHx.a;
                gvC.z = null;
                gvC.C = 3;
                if (fo1Var2.o(qnHx, gvC) == va0Var) {
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
        gvC.z = go1Var;
        gvC.C = 1;
        objR = go1Var.r();
        if (objR == va0Var) {
            fo1Var = go1Var;
            return va0Var;
        }
        fo1Var = go1Var;
        TJon tJon = ((tg) objR).d;
        if (!(tJon != null && tJon.d)) {
            fo1Var.q();
            return sd5.a;
        }
        gvC.z = fo1Var;
        gvC.C = 2;
        if (fo1Var.s(Hy.w) == va0Var) {
            fo1Var2 = fo1Var;
            return va0Var;
        }
        fo1Var2 = fo1Var;
        qnHx = c8e.QnHx.a;
        gvC.z = null;
        gvC.C = 3;
        if (fo1Var2.o(qnHx, gvC) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(go1 go1Var, wb4 wb4Var, z80 z80Var) throws Throwable {
        xUJ xuj;
        fo1 fo1Var;
        fo1 fo1Var2;
        ffo ffoVar;
        Fch fch;
        fo1 fo1Var3;
        c8e.QnHx qnHx;
        c8e.NUlFixed nUl;
        if (z80Var instanceof xUJ) {
            xuj = (xUJ) z80Var;
            int i = xuj.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                xuj.E = i - Integer.MIN_VALUE;
            } else {
                xuj = new xUJ(this, z80Var);
            }
        } else {
            xuj = new xUJ(this, z80Var);
        }
        Object objR = xuj.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = xuj.E;
        boolean z = true;
        if (i2 == 0) {
            C0239D.H(objR);
            xuj.z = go1Var;
            xuj.A = wb4Var;
            xuj.E = 1;
            objR = go1Var.r();
            if (objR == va0Var) {
                fo1Var = go1Var;
                return va0Var;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            C0239D.H(objR);
                            return sd5.a;
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(objR);
                        return sd5.a;
                    }
                    ffoVar = xuj.B;
                    wb4Var = xuj.A;
                    fo1 fo1Var4 = xuj.z;
                    C0239D.H(objR);
                    fo1Var3 = fo1Var4;
                    fo1Var3 = fo1Var2;
                    if (ffoVar.a) {
                        nUl = new c8e.NUlFixed(wb4Var);
                        xuj.z = null;
                        xuj.A = null;
                        xuj.B = null;
                        xuj.E = 4;
                        if (fo1Var3.o(nUl, xuj) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                    if (!ffoVar.b && ffoVar.c) {
                        z = false;
                    }
                    if (z) {
                        qnHx = c8e.QnHx.a;
                        xuj.z = null;
                        xuj.A = null;
                        xuj.B = null;
                        xuj.E = 5;
                        if (fo1Var3.o(qnHx, xuj) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                    return sd5.a;
                }
                ffoVar = xuj.B;
                wb4Var = xuj.A;
                fo1 fo1Var5 = xuj.z;
                C0239D.H(objR);
                fo1Var2 = fo1Var5;
                if (((tg) objR).d != null) {
                    a62.a.l("Requested a capture while another one is in progress");
                    fo1Var2.q();
                } else {
                    fch = new Fch(wb4Var);
                    xuj.z = fo1Var2;
                    xuj.A = wb4Var;
                    xuj.B = ffoVar;
                    xuj.E = 3;
                    if (fo1Var2.s(fch) == va0Var) {
                        fo1Var3 = fo1Var2;
                        return va0Var;
                    }
                    fo1Var3 = fo1Var2;
                    if (ffoVar.a) {
                        nUl = new c8e.NUlFixed(wb4Var);
                        xuj.z = null;
                        xuj.A = null;
                        xuj.B = null;
                        xuj.E = 4;
                        if (fo1Var3.o(nUl, xuj) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                    if (!ffoVar.b) {
                        z = false;
                    }
                    if (z) {
                        qnHx = c8e.QnHx.a;
                        xuj.z = null;
                        xuj.A = null;
                        xuj.B = null;
                        xuj.E = 5;
                        if (fo1Var3.o(qnHx, xuj) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                }
                return sd5.a;
            }
            wb4Var = xuj.A;
            fo1 fo1Var6 = xuj.z;
            C0239D.H(objR);
            fo1Var = fo1Var6;
        }
        fo1Var = go1Var;
        ffo ffoVar2 = ((tg) objR).c;
        if (ffoVar2 == null) {
            throw new IllegalStateException("Can't request a capture without knowing about the permission status".toString());
        }
        xuj.z = fo1Var;
        xuj.A = wb4Var;
        xuj.B = ffoVar2;
        xuj.E = 2;
        Object objR2 = fo1Var.r();
        if (objR2 == va0Var) {
            return va0Var;
        }
        fo1Var2 = fo1Var;
        ffoVar = ffoVar2;
        objR = objR2;
        if (((tg) objR).d != null) {
            a62.a.l("Requested a capture while another one is in progress");
            fo1Var2.q();
        } else {
            fch = new Fch(wb4Var);
            xuj.z = fo1Var2;
            xuj.A = wb4Var;
            xuj.B = ffoVar;
            xuj.E = 3;
            if (fo1Var2.s(fch) == va0Var) {
                fo1Var3 = fo1Var2;
                return va0Var;
            }
            fo1Var3 = fo1Var2;
            if (ffoVar.a) {
                nUl = new c8e.NUlFixed(wb4Var);
                xuj.z = null;
                xuj.A = null;
                xuj.B = null;
                xuj.E = 4;
                if (fo1Var3.o(nUl, xuj) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
            if (!ffoVar.b) {
                z = false;
            }
            if (z) {
                qnHx = c8e.QnHx.a;
                xuj.z = null;
                xuj.A = null;
                xuj.B = null;
                xuj.E = 5;
                if (fo1Var3.o(qnHx, xuj) == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            }
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(go1 go1Var, VV4.LPt6Fixed lPt6, z80 z80Var) throws Throwable {
        Im im;
        AO9A ao9a;
        wb4 wb4Var;
        AO9A ao9a2;
        VV4.LPt6Fixed lPt7;
        if (z80Var instanceof Im) {
            im = (Im) z80Var;
            int i = im.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                im.D = i - Integer.MIN_VALUE;
            } else {
                im = new Im(this, z80Var);
            }
        } else {
            im = new Im(this, z80Var);
        }
        Object obj = im.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = im.D;
        if (i2 != 0) {
            if (i2 == 1) {
                lPt6 = im.A;
                ao9a = im.z;
                C0239D.H(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lPt7 = im.A;
                ao9a2 = im.z;
                C0239D.H(obj);
            }
            AO9A ao9a3 = ao9a2;
            lPt6 = lPt7;
            ao9a = ao9a3;
            ao9a.c.b(lPt6.a);
            return sd5.a;
        }
        C0239D.H(obj);
        im.z = this;
        im.A = lPt6;
        im.D = 1;
        if (go1Var.s(xIO.w) == va0Var) {
            return va0Var;
        }
        ao9a = this;
        a62 a62Var = a62.a;
        a62Var.e("called_start_as_server");
        vb4 vb4Var = lPt6.a;
        if (vb4Var instanceof Qx0$) {
            Qx0$ qx0$ = (Qx0$) vb4Var;
            if (qx0$ instanceof Qx0$.CQf) {
                wb4Var = wb4.Playback;
            } else {
                if (!ur1.a(qx0$, Qx0$.QnHx.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wb4Var = wb4.Microphone;
            }
            a62Var.j("server_capture_type", wb4Var.name());
            if (lPt6.a instanceof Qx0$.CQf) {
                qh0 qh0Var = rl0.a;
                j72 j72Var = n72.a;
                sjLP sjlp = new sjLP(ao9a, lPt6, null);
                im.z = ao9a;
                im.A = lPt6;
                im.D = 2;
                if (fp1.D0(j72Var, sjlp, im) == va0Var) {
                    return va0Var;
                }
                VV4.LPt6Fixed lPt8 = lPt6;
                ao9a2 = ao9a;
                lPt7 = lPt8;
                AO9A ao9a4 = ao9a2;
                lPt6 = lPt7;
                ao9a = ao9a4;
            }
        }
        ao9a.c.b(lPt6.a);
        return sd5.a;
    }
}
