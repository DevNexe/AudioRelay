package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class cd3 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ bd3 x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(pg2 pg2Var, bd3 bd3Var, int i, int i2) {
            super(2);
            this.w = pg2Var;
            this.x = bd3Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            cd3.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;
        public final /* synthetic */ bd3 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(pg2 pg2Var, int i, bd3 bd3Var) {
            super(2);
            this.w = pg2Var;
            this.x = i;
            this.y = bd3Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2;
            g30 g30Var3 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var3.t()) {
                g30Var3.x();
            } else {
                e40.CQf cQf = e40.a;
                da.CQf cQf2 = One.QnHx.k;
                int i = (this.x & 14) | 384;
                g30Var3.e(693286680);
                rb2 rb2VarA = uu3.a(CZ9P.a, cQf2, g30Var3);
                g30Var3.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var3.E(r40.e);
                jy1 jy1Var = (jy1) g30Var3.E(r40.k);
                ti5 ti5Var = (ti5) g30Var3.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx = a30.QnHx.b;
                sz szVarJ = S12N.j(this.w);
                int i2 = ((((i << 3) & 112) << 9) & 7168) | 6;
                if (!(g30Var3.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var3.s();
                if (g30Var3.m()) {
                    g30Var3.l(qnHx);
                } else {
                    g30Var3.A();
                }
                g30Var3.u();
                hH.u(g30Var3, rb2VarA, a30.QnHx.e);
                hH.u(g30Var3, ij0Var, a30.QnHx.d);
                hH.u(g30Var3, jy1Var, a30.QnHx.f);
                szVarJ.invoke(bl2.b(g30Var3, ti5Var, a30.QnHx.g, g30Var3), g30Var3, Integer.valueOf((i2 >> 3) & 112));
                g30Var3.e(2058660585);
                g30Var3.e(-678309503);
                if (((i2 >> 9) & 14 & 11) == 2 && g30Var3.t()) {
                    g30Var3.x();
                } else {
                    if (((((i >> 6) & 112) | 6) & 81) == 16 && g30Var3.t()) {
                        g30Var3.x();
                    } else {
                        g30Var3.e(-190486071);
                        if (this.y == bd3.Full) {
                            qu4.QnHx qnHx2 = qu4.a;
                            Context context = kd.w;
                            if (context == null) {
                                ur1.e("context");
                                throw null;
                            }
                            qu4.a.getClass();
                            j55.b(iZUl.b(qu4.QnHx.b, context, R.string.premium_feature_locked).toUpperCase(Locale.ROOT), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var3.E(sc5.a)).j, g30Var3, 0, 0, 32766);
                            g30Var2 = g30Var3;
                            pq4.a(8, g30Var2, 6);
                        } else {
                            g30Var2 = g30Var3;
                        }
                        g30Var2.G();
                        ej1 ej1VarD = qe0.y;
                        if (ej1VarD == null) {
                            ej1.QnHx qnHx3 = new ej1.QnHx("Outlined.Star");
                            int i3 = sg5.a;
                            jq4 jq4Var = new jq4(yu.b);
                            le3 le3Var = new le3();
                            le3Var.i(12.0f, 17.27f);
                            le3Var.g(18.18f, 21.0f);
                            le3Var.h(-1.64f, -7.03f);
                            le3Var.g(22.0f, 9.24f);
                            le3Var.h(-7.19f, -0.61f);
                            le3Var.g(12.0f, 2.0f);
                            le3Var.g(9.19f, 8.63f);
                            le3Var.g(2.0f, 9.24f);
                            le3Var.h(5.46f, 4.73f);
                            le3Var.g(5.82f, 21.0f);
                            le3Var.g(12.0f, 17.27f);
                            le3Var.b();
                            qnHx3.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, jq4Var, null, "", le3Var.a);
                            ej1VarD = qnHx3.d();
                            qe0.y = ej1VarD;
                        }
                        qu4.QnHx qnHx4 = qu4.a;
                        Context context2 = kd.w;
                        if (context2 == null) {
                            ur1.e("context");
                            throw null;
                        }
                        qu4.a.getClass();
                        rh1.a(ej1VarD, iZUl.b(qu4.QnHx.b, context2, R.string.accessibility_feature_requires_premium), null, 0L, g30Var2, 0, 12);
                    }
                    ex0.d(g30Var2);
                }
                g30Var2 = g30Var3;
                ex0.d(g30Var2);
            }
            return sd5.a;
        }
    }

    public static final void a(pg2 pg2Var, bd3 bd3Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-155896750);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(bd3Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                pg2Var = pg2.QnHx.w;
            }
            e40.CQf cQf = e40.a;
            q40.a(new ng3[]{r70.a.b(new yu(((rv) j30VarQ.E(sv.a)).g()))}, X.m(j30VarQ, 1176406290, new QnHx(pg2Var, i3, bd3Var)), j30VarQ, 56);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, bd3Var, i, i2);
    }
}
