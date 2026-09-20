package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.azefsw.audioconnect.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class p03 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ej1 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(ej1 ej1Var, String str, int i, int i2) {
            super(2);
            this.w = ej1Var;
            this.x = str;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            p03.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ x81<g30, Integer, sd5> w;
        public final /* synthetic */ int x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(x81<? super g30, ? super Integer, sd5> x81Var, int i, x81<? super g30, ? super Integer, sd5> x81Var2, boolean z, h81<sd5> h81Var) {
            super(3);
            this.w = x81Var;
            this.x = i;
            this.y = x81Var2;
            this.z = z;
            this.A = h81Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2;
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
                int i = this.x;
                this.w.invoke(g30Var3, Integer.valueOf((i >> 3) & 14));
                pq4.b(8, g30Var3, 6);
                this.y.invoke(g30Var3, Integer.valueOf((i >> 6) & 14));
                pq4.b(16, g30Var3, 6);
                g30Var3.e(-184232261);
                boolean z = this.z;
                if (z) {
                    j55.b(hH.x(R.string.permission_permanently_denied, g30Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var3.E(sc5.a)).j, g30Var3, 0, 0, 32766);
                    g30Var2 = g30Var3;
                    pq4.b(16, g30Var2, 6);
                } else {
                    g30Var2 = g30Var3;
                }
                g30Var2.G();
                pg2 pg2VarA = wvVar2.a(One.QnHx.o);
                g30Var2.e(1157296644);
                h81<sd5> h81Var = this.A;
                boolean zI = g30Var2.I(h81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new q03(h81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                si.b((h81) objF, pg2VarA, false, X.m(g30Var2, 649056147, new r03(z)), g30Var2, 805306368, 508);
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, boolean z, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = x81Var;
            this.y = x81Var2;
            this.z = z;
            this.A = h81Var;
            this.B = i;
            this.C = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            p03.b(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1, this.C);
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.compose.components.PermissionViewKt$PermissionView$1$1", f = "PermissionView.kt", l = {}, m = "invokeSuspend")
    public static final class NUlFixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public final /* synthetic */ h81<sd5> A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(h81<sd5> h81Var, z80<? super NUlFixed> z80Var) {
            super(2, z80Var);
            this.A = h81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new NUlFixed(this.A, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            this.A.invoke();
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((NUlFixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ej1 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ej1 ej1Var, int i) {
            super(2);
            this.w = ej1Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                rh1.a(this.w, null, null, 0L, g30Var2, (this.x & 14) | 48, 12);
            }
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements h81<sd5> {
        public final /* synthetic */ ri2<Boolean> A;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ Context x;
        public final /* synthetic */ l03 y;
        public final /* synthetic */ j81<Throwable, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(boolean z, Context context, hi2 hi2Var, j81 j81Var, ri2 ri2Var) {
            super(0);
            this.w = z;
            this.x = context;
            this.y = hi2Var;
            this.z = j81Var;
            this.A = ri2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.h81
        public final sd5 invoke() {
            if (this.w) {
                ComponentActivity componentActivityX = FWT.x(this.x);
                if (componentActivityX != null) {
                    xq0 xq0VarE = ac.e(componentActivityX);
                    if (xq0VarE instanceof xq0.CQf) {
                    } else {
                        if (!(xq0VarE instanceof xq0.QnHx)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.z.invoke((Throwable) ((xq0.QnHx) xq0VarE).a);
                    }
                }
            } else {
                this.y.b();
                this.A.setValue(Boolean.TRUE);
            }
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> A;
        public final /* synthetic */ j81<Throwable, sd5> B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ String x;
        public final /* synthetic */ x81<g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(pg2 pg2Var, String str, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, h81<sd5> h81Var, j81<? super Throwable, sd5> j81Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = str;
            this.y = x81Var;
            this.z = x81Var2;
            this.A = h81Var;
            this.B = j81Var;
            this.C = i;
            this.D = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            p03.c(this.w, this.x, this.y, this.z, this.A, this.B, g30Var, this.C | 1, this.D);
            return sd5.a;
        }
    }

    public static final void a(ej1 ej1Var, String str, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(377056965);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && j30VarQ.I(ej1Var)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && j30VarQ.I(str)) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            j30VarQ.t0();
            if ((i & 1) == 0 || j30VarQ.Y()) {
                if ((i2 & 1) != 0) {
                    ej1Var = ob.v();
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    str = hH.x(R.string.permission_required_title, j30VarQ);
                    i3 &= -113;
                }
            } else {
                j30VarQ.x();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            j30VarQ.S();
            e40.CQf cQf = e40.a;
            da.CQf cQf2 = One.QnHx.k;
            j30VarQ.e(693286680);
            pg2.QnHx qnHx = pg2.QnHx.w;
            rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx2 = a30.QnHx.b;
            sz szVarJ = S12N.j(qnHx);
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
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 0);
            j30VarQ.e(2058660585);
            j30VarQ.e(-678309503);
            q70.a(X.m(j30VarQ, 2138177324, new QnHx(ej1Var, i3)), j30VarQ, 6);
            hH.i(gm4.k(qnHx, 8), j30VarQ, 6);
            u15.a(str, 0, null, j30VarQ, ((i3 >> 3) & 14) | 48, 4);
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(ej1Var, str, i, i2);
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
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void b(pg2 pg2Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, boolean z, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        pg2 pg2Var3;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-374572238);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= j30VarQ.I(x81Var) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (j30VarQ.I(x81Var2)) {
                        i4 = 256;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (j30VarQ.c(z)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    if (j30VarQ.I(h81Var)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((46811 & i3) == 9362 || !j30VarQ.t()) {
                    if (i7 != 0) {
                        pg2Var3 = pg2.QnHx.w;
                    } else {
                        pg2Var3 = pg2Var2;
                    }
                    e40.CQf cQf = e40.a;
                    a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
                } else {
                    j30VarQ.x();
                    pg2Var3 = pg2Var2;
                }
                tk3VarU = j30VarQ.U();
                if (tk3VarU == null) {
                    return;
                }
                tk3VarU.d = new LPt8Fixed(pg2Var3, x81Var, x81Var2, z, h81Var, i, i2);
            }
            i3 |= 384;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.c(z)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf2 = e40.a;
                a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf3 = e40.a;
                a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var3, x81Var, x81Var2, z, h81Var, i, i2);
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.c(z)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((46811 & i3) == 9362) {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf4 = e40.a;
                a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
            } else {
                if (i7 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                e40.CQf cQf5 = e40.a;
                a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new LPt8Fixed(pg2Var3, x81Var, x81Var2, z, h81Var, i, i2);
        }
        i3 |= 384;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.c(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (j30VarQ.I(h81Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((46811 & i3) == 9362) {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf6 = e40.a;
            a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
        } else {
            if (i7 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            e40.CQf cQf7 = e40.a;
            a_.b(pg2Var3, 0L, 0.0f, null, 0.0f, X.m(j30VarQ, -1047221471, new F1(x81Var, i3, x81Var2, z, h81Var)), j30VarQ, (i3 & 14) | 196608, 30);
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(pg2Var3, x81Var, x81Var2, z, h81Var, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x0121  */
    /* JADX WARN: Code duplicated, block: B:86:0x0136  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0194  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(pg2 pg2Var, String str, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, h81<sd5> h81Var, j81<? super Throwable, sd5> j81Var, g30 g30Var, int i, int i2) {
        pg2 pg2Var2;
        int i3;
        x81<? super g30, ? super Integer, sd5> x81Var3;
        int i4;
        int i5;
        int i6;
        pg2 pg2Var3;
        x81<? super g30, ? super Integer, sd5> x81Var4;
        int i7;
        hi2 hi2VarB;
        Object objB0;
        g30.QnHx.C0132QnHx c0132QnHx;
        ri2 ri2Var;
        o03 o03VarA;
        boolean z;
        boolean zI;
        Object objB1;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(172109380);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 896) == 0) {
                x81Var3 = x81Var;
                i3 |= j30VarQ.I(x81Var3) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (j30VarQ.I(h81Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((458752 & i) == 0) {
                if (j30VarQ.I(j81Var)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((374491 & i3) == 74898 || !j30VarQ.t()) {
                if (i8 != 0) {
                    pg2Var3 = pg2.QnHx.w;
                } else {
                    pg2Var3 = pg2Var2;
                }
                if (i9 != 0) {
                    x81Var4 = d10.a;
                } else {
                    x81Var4 = x81Var3;
                }
                e40.CQf cQf = e40.a;
                i7 = i3 >> 3;
                hi2VarB = ko6.b(str, j30VarQ);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                c0132QnHx = g30.QnHx.a;
                if (objB0 == c0132QnHx) {
                    objB0 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2Var = (ri2) objB0;
                o03VarA = hi2VarB.a();
                if (ur1.a(o03VarA, o03.CQf.a)) {
                    j30VarQ.e(2116948113);
                    sd5 sd5Var = sd5.a;
                    j30VarQ.e(1157296644);
                    zI = j30VarQ.I(h81Var);
                    objB1 = j30VarQ.b0();
                    if (zI || objB1 == c0132QnHx) {
                        objB1 = new NUlFixed(h81Var, null);
                        j30VarQ.F0(objB1);
                    }
                    j30VarQ.R(false);
                    wq0.d(sd5Var, (x81) objB1, j30VarQ);
                    j30VarQ.R(false);
                } else if (o03VarA instanceof o03.QnHx) {
                    j30VarQ.e(2116948222);
                    if (((o03.QnHx) o03VarA).a && ((Boolean) ri2Var.getValue()).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b(pg2Var3, x81Var4, x81Var2, z, new YKK(z, (Context) j30VarQ.E(Ll.b), hi2VarB, j81Var, ri2Var), j30VarQ, (i3 & 14) | (i7 & 112) | (i7 & 896), 0);
                    j30VarQ.R(false);
                } else {
                    j30VarQ.e(2116949130);
                    j30VarQ.R(false);
                }
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var2;
                x81Var4 = x81Var3;
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new auxFixed(pg2Var3, str, x81Var4, x81Var2, h81Var, j81Var, i, i2);
        }
        i3 |= 384;
        x81Var3 = x81Var;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(x81Var2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (j30VarQ.I(h81Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (j30VarQ.I(j81Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((374491 & i3) == 74898) {
            if (i8 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i9 != 0) {
                x81Var4 = d10.a;
            } else {
                x81Var4 = x81Var3;
            }
            e40.CQf cQf2 = e40.a;
            i7 = i3 >> 3;
            hi2VarB = ko6.b(str, j30VarQ);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            o03VarA = hi2VarB.a();
            if (ur1.a(o03VarA, o03.CQf.a)) {
                j30VarQ.e(2116948113);
                sd5 sd5Var2 = sd5.a;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new NUlFixed(h81Var, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new NUlFixed(h81Var, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                wq0.d(sd5Var2, (x81) objB1, j30VarQ);
                j30VarQ.R(false);
            } else if (o03VarA instanceof o03.QnHx) {
                j30VarQ.e(2116948222);
                if (((o03.QnHx) o03VarA).a) {
                    z = false;
                } else {
                    z = false;
                }
                b(pg2Var3, x81Var4, x81Var2, z, new YKK(z, (Context) j30VarQ.E(Ll.b), hi2VarB, j81Var, ri2Var), j30VarQ, (i3 & 14) | (i7 & 112) | (i7 & 896), 0);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(2116949130);
                j30VarQ.R(false);
            }
        } else {
            if (i8 != 0) {
                pg2Var3 = pg2.QnHx.w;
            } else {
                pg2Var3 = pg2Var2;
            }
            if (i9 != 0) {
                x81Var4 = d10.a;
            } else {
                x81Var4 = x81Var3;
            }
            e40.CQf cQf3 = e40.a;
            i7 = i3 >> 3;
            hi2VarB = ko6.b(str, j30VarQ);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2Var = (ri2) objB0;
            o03VarA = hi2VarB.a();
            if (ur1.a(o03VarA, o03.CQf.a)) {
                j30VarQ.e(2116948113);
                sd5 sd5Var3 = sd5.a;
                j30VarQ.e(1157296644);
                zI = j30VarQ.I(h81Var);
                objB1 = j30VarQ.b0();
                if (zI) {
                    objB1 = new NUlFixed(h81Var, null);
                    j30VarQ.F0(objB1);
                } else {
                    objB1 = new NUlFixed(h81Var, null);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                wq0.d(sd5Var3, (x81) objB1, j30VarQ);
                j30VarQ.R(false);
            } else if (o03VarA instanceof o03.QnHx) {
                j30VarQ.e(2116948222);
                if (((o03.QnHx) o03VarA).a) {
                    z = false;
                } else {
                    z = false;
                }
                b(pg2Var3, x81Var4, x81Var2, z, new YKK(z, (Context) j30VarQ.E(Ll.b), hi2VarB, j81Var, ri2Var), j30VarQ, (i3 & 14) | (i7 & 112) | (i7 & 896), 0);
                j30VarQ.R(false);
            } else {
                j30VarQ.e(2116949130);
                j30VarQ.R(false);
            }
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new auxFixed(pg2Var3, str, x81Var4, x81Var2, h81Var, j81Var, i, i2);
    }
}
