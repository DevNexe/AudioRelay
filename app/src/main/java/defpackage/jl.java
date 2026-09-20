package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class jl {

    public static final class CQf extends cx1 implements j81<Integer, Integer> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class F1 extends cx1 implements y81<lcO, g30, Integer, sd5> {
        public final /* synthetic */ fb3 w;
        public final /* synthetic */ j81<za3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(fb3 fb3Var, j81<? super za3, sd5> j81Var, int i) {
            super(3);
            this.w = fb3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(lcO lco, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            e40.CQf cQf = e40.a;
            jl.d(new c30(wo1.a, new rC(hH.w(0.0f, null, 7), null)), X.m(g30Var2, 1019244958, new ml(this.w, this.x, this.y)), g30Var2, 48);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ fb3 w;
        public final /* synthetic */ j81<za3, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(fb3 fb3Var, j81<? super za3, sd5> j81Var, int i) {
            super(2);
            this.w = fb3Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            jl.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<wu3, g30, Integer, sd5> {
        public final /* synthetic */ String w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(String str, int i) {
            super(3);
            this.w = str;
            this.x = i;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                j55.b(this.w, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, this.x & 14, 0, 65534);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<Integer, Integer> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ String w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ pg2 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(String str, h81<sd5> h81Var, pg2 pg2Var, int i, int i2) {
            super(2);
            this.w = str;
            this.x = h81Var;
            this.y = pg2Var;
            this.z = i;
            this.A = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            jl.b(this.w, this.x, this.y, g30Var, this.z | 1, this.A);
            return sd5.a;
        }
    }

    public static final void a(fb3 fb3Var, j81<? super za3, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1281120486);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(fb3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a62 a62Var = a62.a;
            StringBuilder sb = new StringBuilder("Call to action: ");
            xa3 xa3Var = fb3Var.l;
            sb.append(xa3Var);
            a62Var.c(sb.toString());
            CO.c(!ur1.a(xa3Var, xa3.CQf.a), null, us0.b(null, 3).b(us0.e(QnHx.w)), us0.c().b(us0.f(CQf.w)), null, X.m(j30VarQ, -1048171710, new F1(fb3Var, j81Var, i2)), j30VarQ, 200064, 18);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(fb3Var, j81Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, h81<sd5> h81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        pg2 pg2Var2;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-1566166668);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(h81Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.I(pg2Var)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !j30VarQ.t()) {
                    if (i4 != 0) {
                        pg2Var2 = pg2.QnHx.w;
                    } else {
                        pg2Var2 = pg2Var;
                    }
                    e40.CQf cQf = e40.a;
                    sz szVarM = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
                    int i6 = i3 >> 3;
                    ti.c((i6 & 14) | 3072 | (i6 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM, false);
                } else {
                    j30VarQ.x();
                    pg2Var2 = pg2Var;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(str, h81Var, pg2Var2, i, i2);
            }
            i3 |= 384;
            if ((i3 & 731) == 146) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf2 = e40.a;
                sz szVarM2 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
                int i7 = i3 >> 3;
                ti.c((i7 & 14) | 3072 | (i7 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM2, false);
            } else {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf3 = e40.a;
                sz szVarM3 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
                int i8 = i3 >> 3;
                ti.c((i8 & 14) | 3072 | (i8 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM3, false);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(str, h81Var, pg2Var2, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.I(pg2Var)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf4 = e40.a;
                sz szVarM4 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
                int i9 = i3 >> 3;
                ti.c((i9 & 14) | 3072 | (i9 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM4, false);
            } else {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf5 = e40.a;
                sz szVarM5 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
                int i10 = i3 >> 3;
                ti.c((i10 & 14) | 3072 | (i10 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM5, false);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(str, h81Var, pg2Var2, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf6 = e40.a;
            sz szVarM6 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
            int i11 = i3 >> 3;
            ti.c((i11 & 14) | 3072 | (i11 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM6, false);
        } else {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf7 = e40.a;
            sz szVarM7 = X.m(j30VarQ, -1282383797, new NUlFixed(str, i3));
            int i12 = i3 >> 3;
            ti.c((i12 & 14) | 3072 | (i12 & 112), 4, j30VarQ, pg2Var2, h81Var, szVarM7, false);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(str, h81Var, pg2Var2, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void c(xa3.QnHx qnHx, j81 j81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        boolean zI;
        Object objB0;
        pg2 pg2Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(2131727057);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(qnHx) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 896) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.premium_switch_plan_action, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(j81Var) | j30VarQ.I(qnHx);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new pl(j81Var, qnHx);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                b(strX, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
                pg2Var3 = pg2Var2;
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new ql(qnHx, j81Var, pg2Var3, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf2 = e40.a;
            String strX2 = hH.x(R.string.premium_switch_plan_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(qnHx);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new pl(j81Var, qnHx);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new pl(j81Var, qnHx);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX2, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        } else {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf3 = e40.a;
            String strX3 = hH.x(R.string.premium_switch_plan_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(qnHx);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new pl(j81Var, qnHx);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new pl(j81Var, qnHx);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX3, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ql(qnHx, j81Var, pg2Var3, i, i2);
    }

    public static final void d(pg2 pg2Var, y81 y81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(301967905);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.c(pg2Var, null, null, X.m(j30VarQ, -810145603, new rl(y81Var, i2)), j30VarQ, (i2 & 14) | 3072, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new sl(pg2Var, y81Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void e(ab3 ab3Var, j81 j81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        boolean zI;
        Object objB0;
        pg2 pg2Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1504733977);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(ab3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 896) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.premium_inapp_action, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(j81Var) | j30VarQ.I(ab3Var);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new tl(j81Var, ab3Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                b(strX, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
                pg2Var3 = pg2Var2;
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new ul(ab3Var, j81Var, pg2Var3, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf2 = e40.a;
            String strX2 = hH.x(R.string.premium_inapp_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(ab3Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new tl(j81Var, ab3Var);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new tl(j81Var, ab3Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX2, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        } else {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf3 = e40.a;
            String strX3 = hH.x(R.string.premium_inapp_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(ab3Var);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new tl(j81Var, ab3Var);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new tl(j81Var, ab3Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX3, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ul(ab3Var, j81Var, pg2Var3, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void f(xa3.LPt8Fixed lPt8, j81 j81Var, pg2 pg2Var, g30 g30Var, int i, int i2) {
        int i3;
        pg2 pg2Var2;
        boolean zI;
        Object objB0;
        pg2 pg2Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(1062692519);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(lPt8) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 896) == 0) {
                i3 |= j30VarQ.I(pg2Var) ? 256 : 128;
            }
            if ((i3 & 731) == 146 || !j30VarQ.t()) {
                if (i4 != 0) {
                    pg2Var2 = pg2.QnHx.w;
                } else {
                    pg2Var2 = pg2Var;
                }
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.premium_subscription_action, j30VarQ);
                j30VarQ.e(511388516);
                zI = j30VarQ.I(j81Var) | j30VarQ.I(lPt8);
                objB0 = j30VarQ.b0();
                if (zI || objB0 == g30.QnHx.a) {
                    objB0 = new vl(j81Var, lPt8);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                b(strX, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
                pg2Var3 = pg2Var2;
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new wl(lPt8, j81Var, pg2Var3, i, i2);
        }
        i3 |= 384;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf2 = e40.a;
            String strX2 = hH.x(R.string.premium_subscription_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(lPt8);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new vl(j81Var, lPt8);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new vl(j81Var, lPt8);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX2, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        } else {
            if (i4 != 0) {
                pg2Var2 = pg2.QnHx.w;
            } else {
                pg2Var2 = pg2Var;
            }
            e40.CQf cQf3 = e40.a;
            String strX3 = hH.x(R.string.premium_subscription_action, j30VarQ);
            j30VarQ.e(511388516);
            zI = j30VarQ.I(j81Var) | j30VarQ.I(lPt8);
            objB0 = j30VarQ.b0();
            if (zI) {
                objB0 = new vl(j81Var, lPt8);
                j30VarQ.F0(objB0);
            } else {
                objB0 = new vl(j81Var, lPt8);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            b(strX3, (h81) objB0, pg2Var2, j30VarQ, i3 & 896, 0);
            pg2Var3 = pg2Var2;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new wl(lPt8, j81Var, pg2Var3, i, i2);
    }
}
