package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class gx3 implements eo1<ev3, dv3, fv3> {
    public final rc4 a;
    public final d7G b;
    public final B8C c;
    public final pb d;
    public final qb e;
    public final in2 f;
    public final ef4 g;
    public final B8C h;
    public final ic4 i;
    public final ot4 j;
    public final EHX k;
    public final se2 l;
    public final uz4 m;
    public final yk5 n;
    public final gf2 o;
    public final ie2 p;
    public final ld4 q;
    public final wc3 r;

    public gx3(rc4 rc4Var, d7G d7g, B8C b8c, pb pbVar, qb qbVar, in2 in2Var, ef4 ef4Var, B8C b8c2, ic4 ic4Var, ot4 ot4Var, EHX ehx, se2 se2Var, uz4 uz4Var, yk5 yk5Var, gf2 gf2Var, ie2 ie2Var, ld4 ld4Var, wc3 wc3Var) {
        this.a = rc4Var;
        this.b = d7g;
        this.c = b8c;
        this.d = pbVar;
        this.e = qbVar;
        this.f = in2Var;
        this.g = ef4Var;
        this.h = b8c2;
        this.i = ic4Var;
        this.j = ot4Var;
        this.k = ehx;
        this.l = se2Var;
        this.m = uz4Var;
        this.n = yk5Var;
        this.o = gf2Var;
        this.p = ie2Var;
        this.q = ld4Var;
        this.r = wc3Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) {
        String str;
        String str2;
        ev3 ev3Var = (ev3) obj;
        if (ev3Var instanceof ev3.FJCM) {
            go1Var.p("initialize", new ow3(this, null));
        } else {
            boolean z = ev3Var instanceof ev3.lPt3Fixed;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            if (z) {
                sd5 sd5VarS = go1Var.s(new tw3(ev3Var));
                return sd5VarS == va0Var ? sd5VarS : sd5.a;
            }
            if (ev3Var instanceof ev3.CQf) {
                sd5 sd5VarS2 = go1Var.s(new uw3(this, ev3Var));
                return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
            }
            if (ev3Var instanceof ev3.F1) {
                sd5 sd5VarS3 = go1Var.s(new vw3(ev3Var));
                return sd5VarS3 == va0Var ? sd5VarS3 : sd5.a;
            }
            if (ev3Var instanceof ev3.YKK) {
                sd5 sd5VarS4 = go1Var.s(new ww3(ev3Var));
                return sd5VarS4 == va0Var ? sd5VarS4 : sd5.a;
            }
            if (ev3Var instanceof ev3.y) {
                sd5 sd5VarS5 = go1Var.s(new xw3(ev3Var));
                return sd5VarS5 == va0Var ? sd5VarS5 : sd5.a;
            }
            if (ev3Var instanceof ev3.RBi) {
                sd5 sd5VarS6 = go1Var.s(new yw3(ev3Var));
                return sd5VarS6 == va0Var ? sd5VarS6 : sd5.a;
            }
            if (ev3Var instanceof ev3.MZ) {
                sd5 sd5VarS7 = go1Var.s(new zw3(ev3Var));
                return sd5VarS7 == va0Var ? sd5VarS7 : sd5.a;
            }
            if (ev3Var instanceof ev3.LPt6Fixed) {
                sd5 sd5VarS8 = go1Var.s(new pw3(ev3Var));
                return sd5VarS8 == va0Var ? sd5VarS8 : sd5.a;
            }
            if (ev3Var instanceof ev3.LPt9Fixed) {
                sd5 sd5VarS9 = go1Var.s(new qw3(ev3Var));
                return sd5VarS9 == va0Var ? sd5VarS9 : sd5.a;
            }
            if (ev3Var instanceof ev3.qc) {
                sd5 sd5VarS10 = go1Var.s(new rw3(ev3Var));
                return sd5VarS10 == va0Var ? sd5VarS10 : sd5.a;
            }
            if (ev3Var instanceof ev3.PRnFixed) {
                sd5 sd5VarS11 = go1Var.s(new sw3(ev3Var));
                return sd5VarS11 == va0Var ? sd5VarS11 : sd5.a;
            }
            boolean zA = ur1.a(ev3Var, ev3.QnHx.a);
            pb pbVar = this.d;
            if (zA) {
                a62.a.h("server", "change_bluetooth_sco", "activate");
                pbVar.b.n.setValue(Boolean.TRUE);
                sd5 sd5VarS12 = go1Var.s(hv3.w);
                if (sd5VarS12 != va0Var) {
                    sd5VarS12 = sd5.a;
                }
                return sd5VarS12 == va0Var ? sd5VarS12 : sd5.a;
            }
            if (ev3Var instanceof ev3.LPt8Fixed) {
                ev3.LPt8Fixed lPt8 = (ev3.LPt8Fixed) ev3Var;
                a62.a.f("toggled_mic_effect", new iv3(lPt8));
                int i = lPt8.a;
                ie2 ie2Var = this.p;
                ie2Var.getClass();
                int iH = O.h(i);
                boolean z2 = lPt8.b;
                lKy3 lky3 = ie2Var.a;
                if (iH == 0) {
                    lky3.q.setValue(Boolean.valueOf(z2));
                } else if (iH == 1) {
                    lky3.p.setValue(Boolean.valueOf(z2));
                } else {
                    if (iH != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lky3.o.setValue(Boolean.valueOf(z2));
                }
                go1Var.q();
            } else {
                if (ev3Var instanceof ev3.NUlFixed) {
                    ev3.NUlFixed nUl = (ev3.NUlFixed) ev3Var;
                    a62.a.f("changed_mic_mic_mode", new jv3(nUl));
                    this.l.a.r.setValue(Integer.valueOf(nUl.a.a));
                    sd5 sd5VarS13 = go1Var.s(kv3.w);
                    if (sd5VarS13 != va0Var) {
                        sd5VarS13 = sd5.a;
                    }
                    return sd5VarS13 == va0Var ? sd5VarS13 : sd5.a;
                }
                if (ur1.a(ev3Var, ev3.auxFixed.a)) {
                    a62.a.h("server", "change_bluetooth_sco", "deactivate");
                    pbVar.b.n.setValue(Boolean.FALSE);
                    pbVar.c.a();
                    sd5 sd5VarS14 = go1Var.s(ov3.w);
                    if (sd5VarS14 != va0Var) {
                        sd5VarS14 = sd5.a;
                    }
                    return sd5VarS14 == va0Var ? sd5VarS14 : sd5.a;
                }
                if (ur1.a(ev3Var, ev3.T23.a)) {
                    a62.a.e("hide_bluetooth_mic_settings");
                    sd5 sd5VarS15 = go1Var.s(pv3.w);
                    if (sd5VarS15 != va0Var) {
                        sd5VarS15 = sd5.a;
                    }
                    return sd5VarS15 == va0Var ? sd5VarS15 : sd5.a;
                }
                if (ur1.a(ev3Var, ev3.byN.a)) {
                    a62.a.e("dismissed_mic_modes");
                    sd5 sd5VarS16 = go1Var.s(qv3.w);
                    if (sd5VarS16 != va0Var) {
                        sd5VarS16 = sd5.a;
                    }
                    return sd5VarS16 == va0Var ? sd5VarS16 : sd5.a;
                }
                if (ev3Var instanceof ev3.EQ) {
                    ev3.EQ eq = (ev3.EQ) ev3Var;
                    a62.a.h("server", "failed_open_settings", eq.a.getMessage());
                    a62.a.d(eq.a, true);
                    Object objO = go1Var.o(dv3.CQf.a, z80Var);
                    if (objO != va0Var) {
                        objO = sd5.a;
                    }
                    return objO == va0Var ? objO : sd5.a;
                }
                if (ev3Var instanceof ev3.Xn1) {
                    int iH2 = O.h(((ev3.Xn1) ev3Var).a);
                    if (iH2 == 0) {
                        str2 = "clicked_on_premium_from_server";
                    } else {
                        if (iH2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "clicked_on_premium_from_noise_suppression";
                    }
                    a62 a62Var = a62.a;
                    a62.a.g(str2, null);
                    Object objO2 = go1Var.o(dv3.QnHx.a, z80Var);
                    if (objO2 != va0Var) {
                        objO2 = sd5.a;
                    }
                    return objO2 == va0Var ? objO2 : sd5.a;
                }
                if (ur1.a(ev3Var, ev3.ta.a)) {
                    this.e.b.g(sd5.a);
                    go1Var.q();
                } else {
                    boolean z3 = ev3Var instanceof ev3.ck32;
                    yk5 yk5Var = this.n;
                    if (z3) {
                        ev3.ck32 ck32Var = (ev3.ck32) ev3Var;
                        a62.a.f("changed_volume_gain", new ax3(ck32Var));
                        yk5Var.a.a.h(ck32Var.a);
                        go1Var.q();
                    } else if (ev3Var instanceof ev3.SjP) {
                        zk5.QnHx qnHx = ((ev3.SjP) ev3Var).a;
                        cl5 cl5Var = yk5Var.a;
                        cl5Var.getClass();
                        if (ur1.a(qnHx, zk5.QnHx.C0234QnHx.a)) {
                            str = "capture_gain_volume";
                        } else {
                            if (!ur1.a(qnHx, zk5.QnHx.CQf.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "normalize_volume";
                        }
                        cl5Var.a.f("capture_volume_shaper_strategy", str);
                        go1Var.q();
                    } else {
                        if (ur1.a(ev3Var, ev3.Aa.a)) {
                            a62.a.e("show_bluetooth_mic_settings");
                            sd5 sd5VarS17 = go1Var.s(bx3.w);
                            if (sd5VarS17 != va0Var) {
                                sd5VarS17 = sd5.a;
                            }
                            return sd5VarS17 == va0Var ? sd5VarS17 : sd5.a;
                        }
                        if (ur1.a(ev3Var, ev3.WE.a)) {
                            a62.a.e("clicked_mic_modes");
                            sd5 sd5VarS18 = go1Var.s(cx3.w);
                            if (sd5VarS18 != va0Var) {
                                sd5VarS18 = sd5.a;
                            }
                            return sd5VarS18 == va0Var ? sd5VarS18 : sd5.a;
                        }
                        if (ur1.a(ev3Var, ev3.ct.a)) {
                            a62.a.e("called_stop_as_server");
                            go1Var.p("stop_server", new dx3(this, null));
                            return sd5.a;
                        }
                        if (ev3Var instanceof ev3.Z) {
                            ev3.Z z4 = (ev3.Z) ev3Var;
                            a62.a.f("toggled_noise_removal", new ex3(z4));
                            this.o.a.d("mic_noise_removal_enabled", z4.a);
                            go1Var.q();
                        } else {
                            if (!(ev3Var instanceof ev3.Com1Fixed)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ev3.Com1Fixed com1 = (ev3.Com1Fixed) ev3Var;
                            a62.a.f("toggled_volume_boost", new fx3(com1));
                            yk5Var.a.a.d("volume_shaper_enabled", com1.a);
                            go1Var.q();
                        }
                    }
                }
            }
        }
        return sd5.a;
    }
}
