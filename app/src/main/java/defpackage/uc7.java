package defpackage;

import android.util.Log;
import com.google.android.gms.internal.measurement.LPt8Fixed;
import com.google.android.gms.internal.measurement.LPt9Fixed;
import com.google.android.gms.internal.measurement.NUlFixed;
import com.google.android.gms.internal.measurement.T23;
import com.google.android.gms.internal.measurement.Xn1;
import com.google.android.gms.internal.measurement.YKK;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uc7 extends fd7 {
    public final LPt8Fixed g;
    public final /* synthetic */ fs5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc7(fs5 fs5Var, String str, int i, LPt8Fixed lPt8) {
        super(str, i);
        this.h = fs5Var;
        this.g = lPt8;
    }

    @Override // defpackage.fd7
    public final int a() {
        return this.g.s();
    }

    @Override // defpackage.fd7
    public final boolean b() {
        return this.g.E();
    }

    @Override // defpackage.fd7
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0280  */
    /* JADX WARN: Code duplicated, block: B:104:0x0289  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:128:0x030d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0317  */
    /* JADX WARN: Code duplicated, block: B:133:0x031b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0321  */
    /* JADX WARN: Code duplicated, block: B:136:0x0331  */
    /* JADX WARN: Code duplicated, block: B:138:0x0337  */
    /* JADX WARN: Code duplicated, block: B:140:0x033f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0349  */
    /* JADX WARN: Code duplicated, block: B:148:0x035b  */
    /* JADX WARN: Code duplicated, block: B:154:0x039a A[EDGE_INSN: B:154:0x039a->B:157:0x03d1 BREAK  A[LOOP:1: B:60:0x017e->B:65:0x01a8]] */
    /* JADX WARN: Code duplicated, block: B:155:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x034b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8 A[LOOP:1: B:60:0x017e->B:65:0x01a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:83:0x020a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0260  */
    public final boolean g(Long l, Long l2, Xn1 xn1, long j, xz5 xz5Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        Bt7j bt7j;
        Iterator it2;
        Iterator it3;
        Boolean bool;
        NUlFixed nUl;
        boolean z2;
        String strV;
        Object orDefault;
        String str;
        YKK ykkT;
        Boolean boolD;
        Boolean boolD2;
        Boolean boolD3;
        LPt9Fixed lPt9;
        Long lValueOf;
        Double dValueOf;
        NUlFixed nUl2;
        Boolean boolD4;
        o67.a();
        fs5 fs5Var = this.h;
        vv5 vv5Var = fs5Var.a.g;
        jg6 jg6Var = lg6.X;
        String str2 = this.a;
        boolean zN = vv5Var.n(str2, jg6Var);
        LPt8Fixed lPt8 = this.g;
        long j2 = lPt8.D() ? xz5Var.e : j;
        dq6 dq6Var = fs5Var.a;
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        boolean zIsLoggable = Log.isLoggable(bi6Var.q(), 2);
        int i = this.b;
        if (zIsLoggable) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.n.e("Evaluating filter. audience, filter, event", Integer.valueOf(i), lPt8.F() ? Integer.valueOf(lPt8.s()) : null, dq6Var.m.d(lPt8.x()));
            bi6 bi6Var3 = dq6Var.i;
            dq6.h(bi6Var3);
            b37 b37Var = fs5Var.b.g;
            r27.E(b37Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (lPt8.F()) {
                b37.p(sb, 0, "filter_id", Integer.valueOf(lPt8.s()));
            }
            b37.p(sb, 0, "event_name", b37Var.a.m.d(lPt8.x()));
            String strN = b37.n(lPt8.B(), lPt8.C(), lPt8.D());
            if (!strN.isEmpty()) {
                b37.p(sb, 0, "filter_type", strN);
            }
            if (lPt8.E()) {
                b37.q(sb, 1, "event_count_filter", lPt8.w());
            }
            if (lPt8.r() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = lPt8.y().iterator();
                while (it4.hasNext()) {
                    b37Var.l(sb, 2, (NUlFixed) it4.next());
                }
            }
            b37.m(1, sb);
            sb.append("}\n}\n");
            bi6Var3.n.c(sb.toString(), "Filter definition");
        }
        if (!lPt8.F() || lPt8.s() > 256) {
            bi6 bi6Var4 = dq6Var.i;
            dq6.h(bi6Var4);
            bi6Var4.i.d(bi6.n(str2), "Invalid event filter ID. appId, id", String.valueOf(lPt8.F() ? Integer.valueOf(lPt8.s()) : null));
            return false;
        }
        boolean z3 = lPt8.B() || lPt8.C() || lPt8.D();
        if (z && !z3) {
            bi6 bi6Var5 = dq6Var.i;
            dq6.h(bi6Var5);
            bi6Var5.n.d(Integer.valueOf(i), "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", lPt8.F() ? Integer.valueOf(lPt8.s()) : null);
            return true;
        }
        String strY = xn1.y();
        if (!lPt8.E()) {
            hashSet = new HashSet();
            it = lPt8.y().iterator();
            while (true) {
                if (it.hasNext()) {
                    bt7j = new Bt7j();
                    it2 = xn1.z().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = lPt8.y().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                nUl = (NUlFixed) it3.next();
                                if (nUl.y()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strV = nUl.v();
                                if (strV.isEmpty()) {
                                    bi6 bi6Var6 = dq6Var.i;
                                    dq6.h(bi6Var6);
                                    bi6Var6.i.c(dq6Var.m.d(strY), "Event has empty param name. event");
                                } else {
                                    orDefault = bt7j.getOrDefault(strV, null);
                                    if (orDefault instanceof Long) {
                                        if (nUl.z()) {
                                            boolD3 = fd7.d(new BigDecimal(((Long) orDefault).longValue()), nUl.t(), 0.0d);
                                            if (boolD3 == null) {
                                                if (boolD3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            bi6 bi6Var7 = dq6Var.i;
                                            dq6.h(bi6Var7);
                                            bi6Var7.i.d(dq6Var.m.d(strY), "No number filter for long param. event, param", dq6Var.m.e(strV));
                                        }
                                    } else if (orDefault instanceof Double) {
                                        if (nUl.z()) {
                                            double dDoubleValue = ((Double) orDefault).doubleValue();
                                            boolD2 = fd7.d(new BigDecimal(dDoubleValue), nUl.t(), Math.ulp(dDoubleValue));
                                            if (boolD2 == null) {
                                                if (boolD2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        } else {
                                            bi6 bi6Var8 = dq6Var.i;
                                            dq6.h(bi6Var8);
                                            bi6Var8.i.d(dq6Var.m.d(strY), "No number filter for double param. event, param", dq6Var.m.e(strV));
                                        }
                                    } else if (orDefault instanceof String) {
                                        if (nUl.B()) {
                                            T23 t23U = nUl.u();
                                            bi6 bi6Var9 = dq6Var.i;
                                            dq6.h(bi6Var9);
                                            boolD = fd7.e((String) orDefault, t23U, bi6Var9);
                                        } else if (nUl.z()) {
                                            str = (String) orDefault;
                                            if (b37.F(str)) {
                                                ykkT = nUl.t();
                                                if (b37.F(str)) {
                                                    boolD = fd7.d(new BigDecimal(str), ykkT, 0.0d);
                                                } else {
                                                    boolD = null;
                                                }
                                            } else {
                                                bi6 bi6Var10 = dq6Var.i;
                                                dq6.h(bi6Var10);
                                                bi6Var10.i.d(dq6Var.m.d(strY), "Invalid param value for number filter. event, param", dq6Var.m.e(strV));
                                            }
                                        } else {
                                            bi6 bi6Var11 = dq6Var.i;
                                            dq6.h(bi6Var11);
                                            bi6Var11.i.d(dq6Var.m.d(strY), "No filter for String param. event, param", dq6Var.m.e(strV));
                                        }
                                        if (boolD == null) {
                                            if (boolD.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (orDefault == null) {
                                            bi6 bi6Var12 = dq6Var.i;
                                            dq6.h(bi6Var12);
                                            bi6Var12.n.d(dq6Var.m.d(strY), "Missing param for filter. event, param", dq6Var.m.e(strV));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        bi6 bi6Var13 = dq6Var.i;
                                        dq6.h(bi6Var13);
                                        bi6Var13.i.d(dq6Var.m.d(strY), "Unknown param type. event, param", dq6Var.m.e(strV));
                                    }
                                }
                            }
                        } else {
                            lPt9 = (LPt9Fixed) it2.next();
                            if (!hashSet.contains(lPt9.x())) {
                                if (lPt9.M()) {
                                    String strX = lPt9.x();
                                    if (lPt9.M()) {
                                        lValueOf = Long.valueOf(lPt9.u());
                                    } else {
                                        lValueOf = null;
                                    }
                                    bt7j.put(strX, lValueOf);
                                } else if (lPt9.K()) {
                                    String strX2 = lPt9.x();
                                    if (lPt9.K()) {
                                        dValueOf = Double.valueOf(lPt9.r());
                                    } else {
                                        dValueOf = null;
                                    }
                                    bt7j.put(strX2, dValueOf);
                                } else if (lPt9.O()) {
                                    bt7j.put(lPt9.x(), lPt9.y());
                                } else {
                                    bi6 bi6Var14 = dq6Var.i;
                                    dq6.h(bi6Var14);
                                    bi6Var14.i.d(dq6Var.m.d(strY), "Unknown value for param. event, param", dq6Var.m.e(lPt9.x()));
                                }
                            }
                        }
                    }
                } else {
                    nUl2 = (NUlFixed) it.next();
                    if (nUl2.v().isEmpty()) {
                        bi6 bi6Var15 = dq6Var.i;
                        dq6.h(bi6Var15);
                        bi6Var15.i.c(dq6Var.m.d(strY), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(nUl2.v());
                    }
                }
                bool = null;
                break;
            }
        }
        try {
            boolD4 = fd7.d(new BigDecimal(j2), lPt8.w(), 0.0d);
        } catch (NumberFormatException unused) {
            boolD4 = null;
        }
        if (boolD4 == null) {
            bool = null;
            break;
        }
        if (boolD4.booleanValue()) {
            hashSet = new HashSet();
            it = lPt8.y().iterator();
            while (true) {
                if (it.hasNext()) {
                    bt7j = new Bt7j();
                    it2 = xn1.z().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = lPt8.y().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                nUl = (NUlFixed) it3.next();
                                if (nUl.y() || !nUl.x()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                strV = nUl.v();
                                if (strV.isEmpty()) {
                                    bi6 bi6Var16 = dq6Var.i;
                                    dq6.h(bi6Var16);
                                    bi6Var16.i.c(dq6Var.m.d(strY), "Event has empty param name. event");
                                } else {
                                    orDefault = bt7j.getOrDefault(strV, null);
                                    if (orDefault instanceof Long) {
                                        if (nUl.z()) {
                                            bi6 bi6Var17 = dq6Var.i;
                                            dq6.h(bi6Var17);
                                            bi6Var17.i.d(dq6Var.m.d(strY), "No number filter for long param. event, param", dq6Var.m.e(strV));
                                        } else {
                                            try {
                                                boolD3 = fd7.d(new BigDecimal(((Long) orDefault).longValue()), nUl.t(), 0.0d);
                                            } catch (NumberFormatException unused2) {
                                                boolD3 = null;
                                            }
                                            if (boolD3 == null) {
                                                if (boolD3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (orDefault instanceof Double) {
                                        if (nUl.z()) {
                                            bi6 bi6Var18 = dq6Var.i;
                                            dq6.h(bi6Var18);
                                            bi6Var18.i.d(dq6Var.m.d(strY), "No number filter for double param. event, param", dq6Var.m.e(strV));
                                        } else {
                                            double dDoubleValue2 = ((Double) orDefault).doubleValue();
                                            try {
                                                boolD2 = fd7.d(new BigDecimal(dDoubleValue2), nUl.t(), Math.ulp(dDoubleValue2));
                                            } catch (NumberFormatException unused3) {
                                                boolD2 = null;
                                            }
                                            if (boolD2 == null) {
                                                if (boolD2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (orDefault instanceof String) {
                                        if (nUl.B()) {
                                            T23 t23U2 = nUl.u();
                                            bi6 bi6Var19 = dq6Var.i;
                                            dq6.h(bi6Var19);
                                            boolD = fd7.e((String) orDefault, t23U2, bi6Var19);
                                        } else if (nUl.z()) {
                                            str = (String) orDefault;
                                            if (b37.F(str)) {
                                                ykkT = nUl.t();
                                                if (b37.F(str)) {
                                                    boolD = null;
                                                } else {
                                                    try {
                                                        boolD = fd7.d(new BigDecimal(str), ykkT, 0.0d);
                                                    } catch (NumberFormatException unused4) {
                                                        boolD = null;
                                                    }
                                                }
                                            } else {
                                                bi6 bi6Var110 = dq6Var.i;
                                                dq6.h(bi6Var110);
                                                bi6Var110.i.d(dq6Var.m.d(strY), "Invalid param value for number filter. event, param", dq6Var.m.e(strV));
                                            }
                                        } else {
                                            bi6 bi6Var111 = dq6Var.i;
                                            dq6.h(bi6Var111);
                                            bi6Var111.i.d(dq6Var.m.d(strY), "No filter for String param. event, param", dq6Var.m.e(strV));
                                        }
                                        if (boolD == null) {
                                            if (boolD.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (orDefault == null) {
                                            bi6 bi6Var112 = dq6Var.i;
                                            dq6.h(bi6Var112);
                                            bi6Var112.n.d(dq6Var.m.d(strY), "Missing param for filter. event, param", dq6Var.m.e(strV));
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        bi6 bi6Var113 = dq6Var.i;
                                        dq6.h(bi6Var113);
                                        bi6Var113.i.d(dq6Var.m.d(strY), "Unknown param type. event, param", dq6Var.m.e(strV));
                                    }
                                }
                            }
                        } else {
                            lPt9 = (LPt9Fixed) it2.next();
                            if (!hashSet.contains(lPt9.x())) {
                                if (lPt9.M()) {
                                    String strX3 = lPt9.x();
                                    if (lPt9.M()) {
                                        lValueOf = Long.valueOf(lPt9.u());
                                    } else {
                                        lValueOf = null;
                                    }
                                    bt7j.put(strX3, lValueOf);
                                } else if (lPt9.K()) {
                                    String strX4 = lPt9.x();
                                    if (lPt9.K()) {
                                        dValueOf = Double.valueOf(lPt9.r());
                                    } else {
                                        dValueOf = null;
                                    }
                                    bt7j.put(strX4, dValueOf);
                                } else if (lPt9.O()) {
                                    bt7j.put(lPt9.x(), lPt9.y());
                                } else {
                                    bi6 bi6Var114 = dq6Var.i;
                                    dq6.h(bi6Var114);
                                    bi6Var114.i.d(dq6Var.m.d(strY), "Unknown value for param. event, param", dq6Var.m.e(lPt9.x()));
                                }
                            }
                        }
                    }
                } else {
                    nUl2 = (NUlFixed) it.next();
                    if (nUl2.v().isEmpty()) {
                        bi6 bi6Var115 = dq6Var.i;
                        dq6.h(bi6Var115);
                        bi6Var115.i.c(dq6Var.m.d(strY), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(nUl2.v());
                    }
                }
                bool = null;
                break;
            }
        }
        bool = Boolean.FALSE;
        bi6 bi6Var20 = dq6Var.i;
        dq6.h(bi6Var20);
        bi6Var20.n.c(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !xn1.K()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(xn1.u());
        if (lPt8.C()) {
            if (zN && lPt8.E()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zN && lPt8.E()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }
}
