package defpackage;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public abstract class b7 {
    public static final CQf Companion = new CQf();
    public static final oz1<rv1<Object>> a = qLd.h(2, QnHx.w);

    public static final class CQf {
        public final rv1<b7> serializer() {
            return (rv1) b7.a.getValue();
        }
    }

    public static final class QnHx extends cx1 implements h81<rv1<Object>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final rv1<Object> invoke() {
            return new e74("b7", nl3.a(b7.class), new fv1[]{nl3.a(F1.class), nl3.a(LPt8Fixed.class), nl3.a(NUlFixed.class), nl3.a(YKK.class), nl3.a(auxFixed.class), nl3.a(T23.class), nl3.a(byN.class), nl3.a(EQ.class), nl3.a(FJCM.class), nl3.a(PRnFixed.class), nl3.a(y.class), nl3.a(RBi.class), nl3.a(MZ.class), nl3.a(LPt6Fixed.class), nl3.a(Xn1.class), nl3.a(ta.class), nl3.a(LPt9Fixed.class), nl3.a(lPt3Fixed.class), nl3.a(ck32.class), nl3.a(SjP.class), nl3.a(Aa.class), nl3.a(WE.class), nl3.a(ct.class), nl3.a(qc.class), nl3.a(Z.class)}, new rv1[]{F1.QnHx.a, LPt8Fixed.QnHx.a, NUlFixed.QnHx.a, YKK.QnHx.a, auxFixed.QnHx.a, T23.QnHx.a, byN.QnHx.a, EQ.QnHx.a, FJCM.QnHx.a, PRnFixed.QnHx.a, y.QnHx.a, RBi.QnHx.a, MZ.QnHx.a, LPt6Fixed.QnHx.a, Xn1.QnHx.a, ta.QnHx.a, LPt9Fixed.QnHx.a, lPt3Fixed.QnHx.a, ck32.QnHx.a, SjP.QnHx.a, Aa.QnHx.a, WE.QnHx.a, ct.QnHx.a, qc.QnHx.a, Z.QnHx.a}, new Annotation[0]);
        }
    }

    @za4
    public static final class Xn1 extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;

        public static final class CQf {
            public final rv1<Xn1> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<Xn1> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.RefreshViewModelComplete", qnHx, 4);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", true);
                u83Var.l("timestamp", true);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objO0 = null;
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        objO0 = g40VarB.o0(u83Var, 2, wu4.a, objO0);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    }
                }
                g40VarB.G(u83Var);
                return new Xn1(i, strA, strA2, (String) objO0, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, ii.b(wu4Var), t42.a};
            }

            /* JADX WARN: Code duplicated, block: B:15:0x003f  */
            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                boolean z;
                Xn1 xn1 = (Xn1) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, xn1.b);
                eu1VarB.c0(u83Var, 1, xn1.c);
                boolean zM0 = eu1VarB.m0();
                Object obj2 = xn1.d;
                if (zM0 || obj2 != null) {
                    eu1VarB.B(u83Var, 2, wu4.a, obj2);
                }
                boolean zM1 = eu1VarB.m0();
                s42 s42Var = xn1.e;
                if (!zM1) {
                    s42.QnHx qnHx = s42.Companion;
                    z = ur1.a(s42Var, Th.q()) ? false : true;
                }
                if (z) {
                    eu1VarB.k0(u83Var, 3, t42.a, s42Var);
                }
                eu1VarB.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Xn1(int i, String str, String str2, String str3, s42 s42Var) {
            super(0);
            if (3 != (i & 3)) {
                AY.P(i, 3, QnHx.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) != 0) {
                this.e = s42Var;
            } else {
                s42.QnHx qnHx = s42.Companion;
                this.e = Th.q();
            }
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }
    }

    @za4
    public static final class ta extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;

        public static final class CQf {
            public final rv1<ta> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<ta> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.RefreshViewModelStart", qnHx, 4);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", true);
                u83Var.l("timestamp", true);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objO0 = null;
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        objO0 = g40VarB.o0(u83Var, 2, wu4.a, objO0);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    }
                }
                g40VarB.G(u83Var);
                return new ta(i, strA, strA2, (String) objO0, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, ii.b(wu4Var), t42.a};
            }

            /* JADX WARN: Code duplicated, block: B:15:0x003f  */
            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                boolean z;
                ta taVar = (ta) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, taVar.b);
                eu1VarB.c0(u83Var, 1, taVar.c);
                boolean zM0 = eu1VarB.m0();
                Object obj2 = taVar.d;
                if (zM0 || obj2 != null) {
                    eu1VarB.B(u83Var, 2, wu4.a, obj2);
                }
                boolean zM1 = eu1VarB.m0();
                s42 s42Var = taVar.e;
                if (!zM1) {
                    s42.QnHx qnHx = s42.Companion;
                    z = ur1.a(s42Var, Th.q()) ? false : true;
                }
                if (z) {
                    eu1VarB.k0(u83Var, 3, t42.a, s42Var);
                }
                eu1VarB.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ta(int i, String str, String str2, String str3, s42 s42Var) {
            super(0);
            if (3 != (i & 3)) {
                AY.P(i, 3, QnHx.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) != 0) {
                this.e = s42Var;
            } else {
                s42.QnHx qnHx = s42.Companion;
                this.e = Th.q();
            }
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }
    }

    public b7() {
    }

    public /* synthetic */ b7(int i) {
    }

    public abstract s42 a();

    public abstract String b();

    @za4
    public static final class byN extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final s42 f;

        public static final class CQf {
            public final rv1<byN> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<byN> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.Heartbeat", qnHx, 5);
                u83Var.l("connectionId", false);
                u83Var.l("connectionBallastVersion", false);
                u83Var.l("viewModelName", true);
                u83Var.l("uuid", true);
                u83Var.l("timestamp", true);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objO0 = null;
                Object objO1 = null;
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        objO0 = g40VarB.o0(u83Var, 2, wu4.a, objO0);
                        i |= 4;
                    } else if (iP == 3) {
                        objO1 = g40VarB.o0(u83Var, 3, wu4.a, objO1);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 4, t42.a, objJ);
                        i |= 16;
                    }
                }
                g40VarB.G(u83Var);
                return new byN(i, strA, strA2, (String) objO0, (String) objO1, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, ii.b(wu4Var), ii.b(wu4Var), t42.a};
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0055  */
            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                boolean z;
                byN byn = (byN) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, byn.b);
                eu1VarB.c0(u83Var, 1, byn.c);
                boolean zM0 = eu1VarB.m0();
                Object obj2 = byn.d;
                if (zM0 || obj2 != null) {
                    eu1VarB.B(u83Var, 2, wu4.a, obj2);
                }
                boolean zM1 = eu1VarB.m0();
                Object obj3 = byn.e;
                if (zM1 || obj3 != null) {
                    eu1VarB.B(u83Var, 3, wu4.a, obj3);
                }
                boolean zM2 = eu1VarB.m0();
                s42 s42Var = byn.f;
                if (!zM2) {
                    s42.QnHx qnHx = s42.Companion;
                    z = ur1.a(s42Var, Th.q()) ? false : true;
                }
                if (z) {
                    eu1VarB.k0(u83Var, 4, t42.a, s42Var);
                }
                eu1VarB.k();
            }
        }

        public byN(String str, String str2) {
            this.b = str;
            this.c = str2;
            s42.QnHx qnHx = s42.Companion;
            this.f = Th.q();
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.f;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public byN(int i, String str, String str2, String str3, String str4, s42 s42Var) {
            super(0);
            if (3 == (i & 3)) {
                this.b = str;
                this.c = str2;
                if ((i & 4) == 0) {
                    this.d = null;
                } else {
                    this.d = str3;
                }
                if ((i & 8) == 0) {
                    this.e = null;
                } else {
                    this.e = str4;
                }
                if ((i & 16) != 0) {
                    this.f = s42Var;
                    return;
                } else {
                    s42.QnHx qnHx = s42.Companion;
                    this.f = Th.q();
                    return;
                }
            }
            AY.P(i, 3, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class YKK extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;

        public static final class CQf {
            public final rv1<YKK> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<YKK> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventProcessingStarted", qnHx, 4);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    }
                }
                g40VarB.G(u83Var);
                return new YKK(i, strA, strA2, strA3, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                YKK ykk = (YKK) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, ykk.b);
                eu1VarB.c0(u83Var, 1, ykk.c);
                eu1VarB.c0(u83Var, 2, ykk.d);
                eu1VarB.k0(u83Var, 3, t42.a, ykk.e);
                eu1VarB.k();
            }
        }

        public YKK(String str, String str2, String str3, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i, String str, String str2, String str3, s42 s42Var) {
            super(0);
            if (15 == (i & 15)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                return;
            }
            AY.P(i, 15, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class auxFixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;

        public static final class CQf {
            public final rv1<auxFixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<auxFixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventProcessingStopped", qnHx, 4);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    }
                }
                g40VarB.G(u83Var);
                return new auxFixed(i, strA, strA2, strA3, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                auxFixed auxVar = (auxFixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, auxVar.b);
                eu1VarB.c0(u83Var, 1, auxVar.c);
                eu1VarB.c0(u83Var, 2, auxVar.d);
                eu1VarB.k0(u83Var, 3, t42.a, auxVar.e);
                eu1VarB.k();
            }
        }

        public auxFixed(String str, String str2, String str3, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(int i, String str, String str2, String str3, s42 s42Var) {
            super(0);
            if (15 == (i & 15)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                return;
            }
            AY.P(i, 15, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class qc extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;

        public static final class CQf {
            public final rv1<qc> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<qc> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.ViewModelCleared", qnHx, 4);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else {
                        if (iP != 3) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    }
                }
                g40VarB.G(u83Var);
                return new qc(i, strA, strA2, strA3, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                qc qcVar = (qc) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, qcVar.b);
                eu1VarB.c0(u83Var, 1, qcVar.c);
                eu1VarB.c0(u83Var, 2, qcVar.d);
                eu1VarB.k0(u83Var, 3, t42.a, qcVar.e);
                eu1VarB.k();
            }
        }

        public qc(String str, String str2, String str3, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qc(int i, String str, String str2, String str3, s42 s42Var) {
            super(0);
            if (15 == (i & 15)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                return;
            }
            AY.P(i, 15, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class SjP extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;

        public static final class CQf {
            public final rv1<SjP> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<SjP> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.SideJobQueued", qnHx, 5);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l(SubscriberAttributeKt.JSON_NAME_KEY, false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else if (iP == 3) {
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            throw new UnknownFieldException(iP);
                        }
                        strA4 = g40VarB.A(u83Var, 4);
                        i |= 16;
                    }
                }
                g40VarB.G(u83Var);
                return new SjP(i, strA, strA2, strA3, strA4, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                SjP sjP = (SjP) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, sjP.b);
                eu1VarB.c0(u83Var, 1, sjP.c);
                eu1VarB.c0(u83Var, 2, sjP.d);
                eu1VarB.k0(u83Var, 3, t42.a, sjP.e);
                eu1VarB.c0(u83Var, 4, sjP.f);
                eu1VarB.k();
            }
        }

        public SjP(String str, String str2, String str3, String str4, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SjP(int i, String str, String str2, String str3, String str4, s42 s42Var) {
            super(0);
            if (31 == (i & 31)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                return;
            }
            AY.P(i, 31, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class Z extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final s42 f;

        public static final class CQf {
            public final rv1<Z> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<Z> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.ViewModelStarted", qnHx, 5);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("viewModelType", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else if (iP == 3) {
                        strA4 = g40VarB.A(u83Var, 3);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            throw new UnknownFieldException(iP);
                        }
                        objJ = g40VarB.J(u83Var, 4, t42.a, objJ);
                        i |= 16;
                    }
                }
                g40VarB.G(u83Var);
                return new Z(i, strA, strA2, strA3, strA4, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, wu4Var, t42.a};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                Z z = (Z) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, z.b);
                eu1VarB.c0(u83Var, 1, z.c);
                eu1VarB.c0(u83Var, 2, z.d);
                eu1VarB.c0(u83Var, 3, z.e);
                eu1VarB.k0(u83Var, 4, t42.a, z.f);
                eu1VarB.k();
            }
        }

        public Z(String str, String str2, String str3, String str4, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = s42Var;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.f;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Z(int i, String str, String str2, String str3, String str4, s42 s42Var) {
            super(0);
            if (31 == (i & 31)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
                this.f = s42Var;
                return;
            }
            AY.P(i, 31, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class ct extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;

        public static final class CQf {
            public final rv1<ct> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<ct> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.UnhandledError", qnHx, 5);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("stacktrace", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else if (iP == 1) {
                        strA2 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else if (iP == 2) {
                        strA3 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    } else if (iP == 3) {
                        objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                        i |= 8;
                    } else {
                        if (iP != 4) {
                            throw new UnknownFieldException(iP);
                        }
                        strA4 = g40VarB.A(u83Var, 4);
                        i |= 16;
                    }
                }
                g40VarB.G(u83Var);
                return new ct(i, strA, strA2, strA3, strA4, (s42) objJ);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                ct ctVar = (ct) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, ctVar.b);
                eu1VarB.c0(u83Var, 1, ctVar.c);
                eu1VarB.c0(u83Var, 2, ctVar.d);
                eu1VarB.k0(u83Var, 3, t42.a, ctVar.e);
                eu1VarB.c0(u83Var, 4, ctVar.f);
                eu1VarB.k();
            }
        }

        public ct(String str, String str2, String str3, String str4, s42 s42Var) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ct(int i, String str, String str2, String str3, String str4, s42 s42Var) {
            super(0);
            if (31 == (i & 31)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                return;
            }
            AY.P(i, 31, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class Aa extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final gk4.QnHx g;

        public static final class CQf {
            public final rv1<Aa> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<Aa> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.SideJobStarted", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l(SubscriberAttributeKt.JSON_NAME_KEY, false);
                u83Var.l("restartState", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                Object objJ2 = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            strA4 = g40VarB.A(u83Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            objJ2 = g40VarB.J(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), objJ2);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new Aa(i, strA, strA2, strA3, (s42) objJ, strA4, (gk4.QnHx) objJ2);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values())};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                Aa aa = (Aa) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, aa.b);
                eu1VarB.c0(u83Var, 1, aa.c);
                eu1VarB.c0(u83Var, 2, aa.d);
                eu1VarB.k0(u83Var, 3, t42.a, aa.e);
                eu1VarB.c0(u83Var, 4, aa.f);
                eu1VarB.k0(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), aa.g);
                eu1VarB.k();
            }
        }

        public Aa(String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = qnHx;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Aa(int i, String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = qnHx;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class EQ extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<EQ> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<EQ> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputAccepted", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new EQ(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                EQ eq = (EQ) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, eq.b);
                eu1VarB.c0(u83Var, 1, eq.c);
                eu1VarB.c0(u83Var, 2, eq.d);
                eu1VarB.k0(u83Var, 3, t42.a, eq.e);
                eu1VarB.c0(u83Var, 4, eq.f);
                eu1VarB.c0(u83Var, 5, eq.g);
                eu1VarB.k();
            }
        }

        public EQ(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class F1 extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<F1> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<F1> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventEmitted", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("eventType", false);
                u83Var.l("eventToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new F1(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                F1 f1 = (F1) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, f1.b);
                eu1VarB.c0(u83Var, 1, f1.c);
                eu1VarB.c0(u83Var, 2, f1.d);
                eu1VarB.k0(u83Var, 3, t42.a, f1.e);
                eu1VarB.c0(u83Var, 4, f1.f);
                eu1VarB.c0(u83Var, 5, f1.g);
                eu1VarB.k();
            }
        }

        public F1(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class FJCM extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<FJCM> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<FJCM> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputCancelled", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new FJCM(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                FJCM fjcm = (FJCM) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, fjcm.b);
                eu1VarB.c0(u83Var, 1, fjcm.c);
                eu1VarB.c0(u83Var, 2, fjcm.d);
                eu1VarB.k0(u83Var, 3, t42.a, fjcm.e);
                eu1VarB.c0(u83Var, 4, fjcm.f);
                eu1VarB.c0(u83Var, 5, fjcm.g);
                eu1VarB.k();
            }
        }

        public FJCM(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FJCM(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class LPt6Fixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<LPt6Fixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<LPt6Fixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputRejected", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new LPt6Fixed(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                LPt6Fixed lPt6 = (LPt6Fixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, lPt6.b);
                eu1VarB.c0(u83Var, 1, lPt6.c);
                eu1VarB.c0(u83Var, 2, lPt6.d);
                eu1VarB.k0(u83Var, 3, t42.a, lPt6.e);
                eu1VarB.c0(u83Var, 4, lPt6.f);
                eu1VarB.c0(u83Var, 5, lPt6.g);
                eu1VarB.k();
            }
        }

        public LPt6Fixed(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt6Fixed(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class LPt8Fixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<LPt8Fixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<LPt8Fixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventHandledSuccessfully", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("eventType", false);
                u83Var.l("eventToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new LPt8Fixed(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                LPt8Fixed lPt8 = (LPt8Fixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, lPt8.b);
                eu1VarB.c0(u83Var, 1, lPt8.c);
                eu1VarB.c0(u83Var, 2, lPt8.d);
                eu1VarB.k0(u83Var, 3, t42.a, lPt8.e);
                eu1VarB.c0(u83Var, 4, lPt8.f);
                eu1VarB.c0(u83Var, 5, lPt8.g);
                eu1VarB.k();
            }
        }

        public LPt8Fixed(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class LPt9Fixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final gk4.QnHx g;

        public static final class CQf {
            public final rv1<LPt9Fixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<LPt9Fixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.SideJobCancelled", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l(SubscriberAttributeKt.JSON_NAME_KEY, false);
                u83Var.l("restartState", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                Object objJ2 = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            strA4 = g40VarB.A(u83Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            objJ2 = g40VarB.J(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), objJ2);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new LPt9Fixed(i, strA, strA2, strA3, (s42) objJ, strA4, (gk4.QnHx) objJ2);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values())};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                LPt9Fixed lPt9 = (LPt9Fixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, lPt9.b);
                eu1VarB.c0(u83Var, 1, lPt9.c);
                eu1VarB.c0(u83Var, 2, lPt9.d);
                eu1VarB.k0(u83Var, 3, t42.a, lPt9.e);
                eu1VarB.c0(u83Var, 4, lPt9.f);
                eu1VarB.k0(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), lPt9.g);
                eu1VarB.k();
            }
        }

        public LPt9Fixed(String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = qnHx;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt9Fixed(int i, String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = qnHx;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class MZ extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<MZ> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<MZ> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputQueued", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new MZ(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                MZ mz = (MZ) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, mz.b);
                eu1VarB.c0(u83Var, 1, mz.c);
                eu1VarB.c0(u83Var, 2, mz.d);
                eu1VarB.k0(u83Var, 3, t42.a, mz.e);
                eu1VarB.c0(u83Var, 4, mz.f);
                eu1VarB.c0(u83Var, 5, mz.g);
                eu1VarB.k();
            }
        }

        public MZ(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MZ(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class PRnFixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<PRnFixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<PRnFixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputDropped", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new PRnFixed(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                PRnFixed pRn = (PRnFixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, pRn.b);
                eu1VarB.c0(u83Var, 1, pRn.c);
                eu1VarB.c0(u83Var, 2, pRn.d);
                eu1VarB.k0(u83Var, 3, t42.a, pRn.e);
                eu1VarB.c0(u83Var, 4, pRn.f);
                eu1VarB.c0(u83Var, 5, pRn.g);
                eu1VarB.k();
            }
        }

        public PRnFixed(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PRnFixed(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class T23 extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<T23> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<T23> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventQueued", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("eventType", false);
                u83Var.l("eventToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new T23(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                T23 t23 = (T23) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, t23.b);
                eu1VarB.c0(u83Var, 1, t23.c);
                eu1VarB.c0(u83Var, 2, t23.d);
                eu1VarB.k0(u83Var, 3, t42.a, t23.e);
                eu1VarB.c0(u83Var, 4, t23.f);
                eu1VarB.c0(u83Var, 5, t23.g);
                eu1VarB.k();
            }
        }

        public T23(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public T23(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class WE extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<WE> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<WE> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.StateChanged", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("stateType", false);
                u83Var.l("stateToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new WE(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                WE we = (WE) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, we.b);
                eu1VarB.c0(u83Var, 1, we.c);
                eu1VarB.c0(u83Var, 2, we.d);
                eu1VarB.k0(u83Var, 3, t42.a, we.e);
                eu1VarB.c0(u83Var, 4, we.f);
                eu1VarB.c0(u83Var, 5, we.g);
                eu1VarB.k();
            }
        }

        public WE(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WE(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class lPt3Fixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final gk4.QnHx g;

        public static final class CQf {
            public final rv1<lPt3Fixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<lPt3Fixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.SideJobCompleted", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l(SubscriberAttributeKt.JSON_NAME_KEY, false);
                u83Var.l("restartState", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                Object objJ2 = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            strA4 = g40VarB.A(u83Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            objJ2 = g40VarB.J(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), objJ2);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new lPt3Fixed(i, strA, strA2, strA3, (s42) objJ, strA4, (gk4.QnHx) objJ2);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values())};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                lPt3Fixed lpt3 = (lPt3Fixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, lpt3.b);
                eu1VarB.c0(u83Var, 1, lpt3.c);
                eu1VarB.c0(u83Var, 2, lpt3.d);
                eu1VarB.k0(u83Var, 3, t42.a, lpt3.e);
                eu1VarB.c0(u83Var, 4, lpt3.f);
                eu1VarB.k0(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), lpt3.g);
                eu1VarB.k();
            }
        }

        public lPt3Fixed(String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = qnHx;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lPt3Fixed(int i, String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = qnHx;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class y extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;

        public static final class CQf {
            public final rv1<y> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<y> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputHandledSuccessfully", qnHx, 6);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new y(i, strA, strA2, strA3, (s42) objJ, strA4, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                y yVar = (y) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, yVar.b);
                eu1VarB.c0(u83Var, 1, yVar.c);
                eu1VarB.c0(u83Var, 2, yVar.d);
                eu1VarB.k0(u83Var, 3, t42.a, yVar.e);
                eu1VarB.c0(u83Var, 4, yVar.f);
                eu1VarB.c0(u83Var, 5, yVar.g);
                eu1VarB.k();
            }
        }

        public y(String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5) {
            super(0);
            if (63 == (i & 63)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                return;
            }
            AY.P(i, 63, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class NUlFixed extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;
        public final String h;

        public static final class CQf {
            public final rv1<NUlFixed> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<NUlFixed> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.EventHandlerError", qnHx, 7);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("eventType", false);
                u83Var.l("eventToStringValue", false);
                u83Var.l("stacktrace", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                String strA6 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        case 6:
                            i |= 64;
                            strA6 = g40VarB.A(u83Var, 6);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new NUlFixed(i, strA, strA2, strA3, (s42) objJ, strA4, strA5, strA6);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                NUlFixed nUl = (NUlFixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, nUl.b);
                eu1VarB.c0(u83Var, 1, nUl.c);
                eu1VarB.c0(u83Var, 2, nUl.d);
                eu1VarB.k0(u83Var, 3, t42.a, nUl.e);
                eu1VarB.c0(u83Var, 4, nUl.f);
                eu1VarB.c0(u83Var, 5, nUl.g);
                eu1VarB.c0(u83Var, 6, nUl.h);
                eu1VarB.k();
            }
        }

        public NUlFixed(String str, String str2, String str3, s42 s42Var, String str4, String str5, String str6) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5, String str6) {
            super(0);
            if (127 == (i & 127)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                this.h = str6;
                return;
            }
            AY.P(i, 127, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class RBi extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final String g;
        public final String h;

        public static final class CQf {
            public final rv1<RBi> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<RBi> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.InputHandlerError", qnHx, 7);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l("inputType", false);
                u83Var.l("inputToStringValue", false);
                u83Var.l("stacktrace", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                String strA6 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ = g40VarB.J(u83Var, 3, t42.a, objJ);
                            i |= 8;
                            break;
                        case 4:
                            i |= 16;
                            strA4 = g40VarB.A(u83Var, 4);
                            break;
                        case 5:
                            i |= 32;
                            strA5 = g40VarB.A(u83Var, 5);
                            break;
                        case 6:
                            i |= 64;
                            strA6 = g40VarB.A(u83Var, 6);
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new RBi(i, strA, strA2, strA3, (s42) objJ, strA4, strA5, strA6);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                RBi rBi = (RBi) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, rBi.b);
                eu1VarB.c0(u83Var, 1, rBi.c);
                eu1VarB.c0(u83Var, 2, rBi.d);
                eu1VarB.k0(u83Var, 3, t42.a, rBi.e);
                eu1VarB.c0(u83Var, 4, rBi.f);
                eu1VarB.c0(u83Var, 5, rBi.g);
                eu1VarB.c0(u83Var, 6, rBi.h);
                eu1VarB.k();
            }
        }

        public RBi(String str, String str2, String str3, s42 s42Var, String str4, String str5, String str6) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = str5;
            this.h = str6;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RBi(int i, String str, String str2, String str3, s42 s42Var, String str4, String str5, String str6) {
            super(0);
            if (127 == (i & 127)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = str5;
                this.h = str6;
                return;
            }
            AY.P(i, 127, QnHx.b);
            throw null;
        }
    }

    @za4
    public static final class ck32 extends b7 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;
        public final s42 e;
        public final String f;
        public final gk4.QnHx g;
        public final String h;

        public static final class CQf {
            public final rv1<ck32> serializer() {
                return QnHx.a;
            }
        }

        public static final class QnHx implements y91<ck32> {
            public static final QnHx a;
            public static final /* synthetic */ u83 b;

            static {
                QnHx qnHx = new QnHx();
                a = qnHx;
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerEvent.SideJobError", qnHx, 7);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("uuid", false);
                u83Var.l("timestamp", false);
                u83Var.l(SubscriberAttributeKt.JSON_NAME_KEY, false);
                u83Var.l("restartState", false);
                u83Var.l("stacktrace", false);
                b = u83Var;
            }

            @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
            public final pa4 a() {
                return b;
            }

            @Override // defpackage.y91
            public final void b() {
            }

            @Override // defpackage.zj0
            public final Object c(pf0 pf0Var) {
                u83 u83Var = b;
                g40 g40VarB = pf0Var.b(u83Var);
                g40VarB.b0();
                Object objJ = null;
                Object objJ2 = null;
                String strA = null;
                String strA2 = null;
                String strA3 = null;
                String strA4 = null;
                String strA5 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    switch (iP) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            strA = g40VarB.A(u83Var, 0);
                            i |= 1;
                            break;
                        case 1:
                            strA2 = g40VarB.A(u83Var, 1);
                            i |= 2;
                            break;
                        case 2:
                            strA3 = g40VarB.A(u83Var, 2);
                            i |= 4;
                            break;
                        case 3:
                            objJ2 = g40VarB.J(u83Var, 3, t42.a, objJ2);
                            i |= 8;
                            break;
                        case 4:
                            strA4 = g40VarB.A(u83Var, 4);
                            i |= 16;
                            break;
                        case 5:
                            objJ = g40VarB.J(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), objJ);
                            i |= 32;
                            break;
                        case 6:
                            strA5 = g40VarB.A(u83Var, 6);
                            i |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iP);
                    }
                }
                g40VarB.G(u83Var);
                return new ck32(i, strA, strA2, strA3, (s42) objJ2, strA4, (gk4.QnHx) objJ, strA5);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var, t42.a, wu4Var, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                ck32 ck32Var = (ck32) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, ck32Var.b);
                eu1VarB.c0(u83Var, 1, ck32Var.c);
                eu1VarB.c0(u83Var, 2, ck32Var.d);
                eu1VarB.k0(u83Var, 3, t42.a, ck32Var.e);
                eu1VarB.c0(u83Var, 4, ck32Var.f);
                eu1VarB.k0(u83Var, 5, new qt0("com.copperleaf.ballast.SideJobScope.RestartState", gk4.QnHx.values()), ck32Var.g);
                eu1VarB.c0(u83Var, 6, ck32Var.h);
                eu1VarB.k();
            }
        }

        public ck32(String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = s42Var;
            this.f = str4;
            this.g = qnHx;
            this.h = str5;
        }

        @Override // defpackage.b7
        public final s42 a() {
            return this.e;
        }

        @Override // defpackage.b7
        public final String b() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ck32(int i, String str, String str2, String str3, s42 s42Var, String str4, gk4.QnHx qnHx, String str5) {
            super(0);
            if (127 == (i & 127)) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = s42Var;
                this.f = str4;
                this.g = qnHx;
                this.h = str5;
                return;
            }
            AY.P(i, 127, QnHx.b);
            throw null;
        }
    }
}
