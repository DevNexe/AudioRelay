package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<VV4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(j81<? super VV4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(VV4.YKK.a);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Iyje.LPt8Fixed w;
        public final /* synthetic */ j81<VV4, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(Iyje.LPt8Fixed lPt8, j81<? super VV4, sd5> j81Var, int i) {
            super(2);
            this.w = lPt8;
            this.x = j81Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                Iyje.LPt8Fixed lPt8 = this.w;
                wb4 wb4Var = lPt8.c;
                String upperCase = hH.x(R.string.permission_allow_button, g30Var2).toUpperCase(Locale.ROOT);
                g30Var2.e(1157296644);
                j81<VV4, sd5> j81Var = this.x;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objF == c0132QnHx) {
                    objF = new v0(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                h81 h81Var = (h81) objF;
                g30Var2.e(511388516);
                boolean zI2 = g30Var2.I(j81Var) | g30Var2.I(lPt8);
                Object objF2 = g30Var2.f();
                if (zI2 || objF2 == c0132QnHx) {
                    objF2 = new w0(j81Var, lPt8);
                    g30Var2.B(objF2);
                }
                g30Var2.G();
                t0.b(wb4Var, upperCase, null, h81Var, (h81) objF2, g30Var2, 0, 4);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ Iyje.LPt8Fixed w;
        public final /* synthetic */ j81<VV4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(Iyje.LPt8Fixed lPt8, j81<? super VV4, sd5> j81Var, int i) {
            super(2);
            this.w = lPt8;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            t0.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ String B;
        public final /* synthetic */ wb4 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ h81<sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(wb4 wb4Var, String str, h81<sd5> h81Var, int i, h81<sd5> h81Var2, String str2) {
            super(3);
            this.w = wb4Var;
            this.x = str;
            this.y = h81Var;
            this.z = i;
            this.A = h81Var2;
            this.B = str2;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            String strX;
            float f;
            pg2.QnHx qnHx;
            g30 g30Var2;
            int i;
            wv wvVar2 = wvVar;
            g30 g30Var3 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var3.I(wvVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var3.t()) {
                g30Var3.x();
            } else {
                e40.CQf cQf = e40.a;
                Uff4.a(R.string.permission_required_title, null, g30Var3, 0, 2);
                pg2.QnHx qnHx2 = pg2.QnHx.w;
                float f2 = 16;
                hH.i(gm4.g(qnHx2, f2), g30Var3, 6);
                int iOrdinal = this.w.ordinal();
                if (iOrdinal == 0) {
                    g30Var3.e(552942908);
                    strX = hH.x(R.string.server_mic_permission_description, g30Var3);
                    g30Var3.G();
                } else {
                    if (iOrdinal != 1) {
                        g30Var3.e(552939400);
                        g30Var3.G();
                        throw new NoWhenBranchMatchedException();
                    }
                    g30Var3.e(552943041);
                    strX = hH.x(R.string.server_mic_permission_playback_capture_description, g30Var3);
                    g30Var3.G();
                }
                j55.b(strX, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var3, 0, 0, 65534);
                g30Var3.e(552943186);
                String str = this.x;
                int i2 = this.z;
                if (str == null) {
                    g30Var2 = g30Var3;
                    i = i2;
                    f = f2;
                    qnHx = qnHx2;
                } else {
                    hH.i(gm4.g(qnHx2, f2), g30Var3, 6);
                    f = f2;
                    qnHx = qnHx2;
                    g30Var2 = g30Var3;
                    i = i2;
                    j55.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, (i2 >> 6) & 14, 0, 65534);
                    sd5 sd5Var = sd5.a;
                }
                g30Var2.G();
                pg2.QnHx qnHx3 = qnHx;
                g30 g30Var4 = g30Var2;
                hH.i(gm4.g(qnHx3, f), g30Var4, 6);
                int i3 = i;
                si.a(this.y, gm4.f(wvVar2.a(One.QnHx.o)), false, null, null, null, null, null, null, X.m(g30Var4, -583934118, new y0(this.B, i3)), g30Var4, ((i3 >> 12) & 14) | 805306368, 508);
                hH.i(gm4.k(qnHx3, 24), g30Var4, 6);
                si.c(this.A, gm4.a, false, null, h00.a, g30Var4, ((i3 >> 9) & 14) | 805306416, 508);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ j81<VV4, sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super VV4, sd5> j81Var) {
            super(0);
            this.w = j81Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.invoke(VV4.CQf.a);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ wb4 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ String y;
        public final /* synthetic */ h81<sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(wb4 wb4Var, String str, String str2, h81<sd5> h81Var, h81<sd5> h81Var2, int i, int i2) {
            super(2);
            this.w = wb4Var;
            this.x = str;
            this.y = str2;
            this.z = h81Var;
            this.A = h81Var2;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            t0.b(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    public static final void a(Iyje.LPt8Fixed lPt8, j81<? super VV4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-372282995);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(lPt8) ? 4 : 2) | i;
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
            if (lPt8.b) {
                j30VarQ.e(-79739873);
                wb4 wb4Var = lPt8.c;
                String strX = hH.x(R.string.permission_allow_open_settings_button, j30VarQ);
                String strX2 = hH.x(R.string.permission_permanently_denied, j30VarQ);
                j30VarQ.e(1157296644);
                boolean zI = j30VarQ.I(j81Var);
                Object objB0 = j30VarQ.b0();
                g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
                if (zI || objB0 == c0132QnHx) {
                    objB0 = new QnHx(j81Var);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                h81 h81Var = (h81) objB0;
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(j81Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new CQf(j81Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                b(wb4Var, strX, strX2, h81Var, (h81) objB1, j30VarQ, 0, 0);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(-79739399);
                w22.c(100L, X.m(j30VarQ, -2118262670, new F1(lPt8, j81Var, i2)), j30VarQ, 54);
                j30VarQ.R(false);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(lPt8, j81Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:76:0x018e  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void b(wb4 wb4Var, String str, String str2, h81<sd5> h81Var, h81<sd5> h81Var2, g30 g30Var, int i, int i2) {
        int i3;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        String str4;
        pg2.QnHx qnHx;
        rb2 rb2VarA;
        ij0 ij0Var;
        jy1 jy1Var;
        ti5 ti5Var;
        yy1.QnHx qnHx2;
        sz szVarJ;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(583503537);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(wb4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(str) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    str3 = str2;
                    if (j30VarQ.I(str3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (j30VarQ.I(h81Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((46811 & i3) == 9362 || !j30VarQ.t()) {
                    if (i4 != 0) {
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    e40.CQf cQf = e40.a;
                    qnHx = pg2.QnHx.w;
                    pg2 pg2VarX = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                    j30VarQ.e(-483455358);
                    rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                    j30VarQ.e(-1323940314);
                    ij0Var = (ij0) j30VarQ.E(r40.e);
                    jy1Var = (jy1) j30VarQ.E(r40.k);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx2 = a30.QnHx.b;
                    szVarJ = S12N.j(pg2VarX);
                    if (!(j30VarQ.a instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx2);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                    a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
                    O.g(j30VarQ, false, false, true, false);
                    j30VarQ.R(false);
                } else {
                    j30VarQ.x();
                    str4 = str3;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new YKK(wb4Var, str, str4, h81Var, h81Var2, i, i2);
            }
            i3 |= 384;
            str3 = str2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(h81Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                e40.CQf cQf2 = e40.a;
                qnHx = pg2.QnHx.w;
                pg2 pg2VarX2 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                j30VarQ.e(-483455358);
                rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarX2);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            } else {
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                e40.CQf cQf3 = e40.a;
                qnHx = pg2.QnHx.w;
                pg2 pg2VarX3 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                j30VarQ.e(-483455358);
                rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarX3);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wb4Var, str, str4, h81Var, h81Var2, i, i2);
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                str3 = str2;
                if (j30VarQ.I(str3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(h81Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((46811 & i3) == 9362) {
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                e40.CQf cQf4 = e40.a;
                qnHx = pg2.QnHx.w;
                pg2 pg2VarX4 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                j30VarQ.e(-483455358);
                rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarX4);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            } else {
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                e40.CQf cQf5 = e40.a;
                qnHx = pg2.QnHx.w;
                pg2 pg2VarX5 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
                j30VarQ.e(-483455358);
                rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
                j30VarQ.e(-1323940314);
                ij0Var = (ij0) j30VarQ.E(r40.e);
                jy1Var = (jy1) j30VarQ.E(r40.k);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx2 = a30.QnHx.b;
                szVarJ = S12N.j(pg2VarX5);
                if (!(j30VarQ.a instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx2);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
                a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
                O.g(j30VarQ, false, false, true, false);
                j30VarQ.R(false);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new YKK(wb4Var, str, str4, h81Var, h81Var2, i, i2);
        }
        i3 |= 384;
        str3 = str2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(h81Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (j30VarQ.I(h81Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((46811 & i3) == 9362) {
            if (i4 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            e40.CQf cQf6 = e40.a;
            qnHx = pg2.QnHx.w;
            pg2 pg2VarX6 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
            j30VarQ.e(-483455358);
            rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarX6);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        } else {
            if (i4 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            e40.CQf cQf7 = e40.a;
            qnHx = pg2.QnHx.w;
            pg2 pg2VarX7 = ob.x(qnHx, ob.w(0, j30VarQ, 1));
            j30VarQ.e(-483455358);
            rb2VarA = tv.a(CZ9P.c, One.QnHx.m, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx2 = a30.QnHx.b;
            szVarJ = S12N.j(pg2VarX7);
            if (!(j30VarQ.a instanceof jE)) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx2);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, rb2VarA, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, -1163856341);
            a_.b(ps0.T(qnHx, 16), 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -202743958, new NUlFixed(wb4Var, str4, h81Var2, i3, h81Var, str)), j30VarQ, 196614, 30);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(wb4Var, str, str4, h81Var, h81Var2, i, i2);
    }
}
