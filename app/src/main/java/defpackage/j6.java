package defpackage;

import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public abstract class j6 {
    public static final CQf Companion = new CQf();
    public static final oz1<rv1<Object>> a = qLd.h(2, QnHx.w);

    public static final class CQf {
        public final rv1<j6> serializer() {
            return (rv1) j6.a.getValue();
        }
    }

    @za4
    public static final class F1 extends j6 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;

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
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerAction.RequestResendInput", qnHx, 3);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("inputUuid", false);
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
                        strA3 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else {
                        if (iP != 2) {
                            throw new UnknownFieldException(iP);
                        }
                        strA2 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    }
                }
                g40VarB.G(u83Var);
                return new F1(i, strA, strA3, strA2);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                F1 f1 = (F1) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, f1.b);
                eu1VarB.c0(u83Var, 1, f1.c);
                eu1VarB.c0(u83Var, 2, f1.d);
                eu1VarB.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, String str, String str2, String str3) {
            super(0);
            if (7 != (i & 7)) {
                AY.P(i, 7, QnHx.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof F1)) {
                return false;
            }
            F1 f1 = (F1) obj;
            return ur1.a(this.b, f1.b) && ur1.a(this.c, f1.c) && ur1.a(this.d, f1.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bl2.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestResendInput(connectionId=");
            sb.append(this.b);
            sb.append(", viewModelName=");
            sb.append(this.c);
            sb.append(", inputUuid=");
            return bl2.c(sb, this.d, ')');
        }
    }

    @za4
    public static final class LPt8Fixed extends j6 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;
        public final String d;

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
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerAction.RequestRestoreState", qnHx, 3);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
                u83Var.l("stateUuid", false);
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
                        strA3 = g40VarB.A(u83Var, 1);
                        i |= 2;
                    } else {
                        if (iP != 2) {
                            throw new UnknownFieldException(iP);
                        }
                        strA2 = g40VarB.A(u83Var, 2);
                        i |= 4;
                    }
                }
                g40VarB.G(u83Var);
                return new LPt8Fixed(i, strA, strA3, strA2);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                LPt8Fixed lPt8 = (LPt8Fixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, lPt8.b);
                eu1VarB.c0(u83Var, 1, lPt8.c);
                eu1VarB.c0(u83Var, 2, lPt8.d);
                eu1VarB.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, String str, String str2, String str3) {
            super(0);
            if (7 != (i & 7)) {
                AY.P(i, 7, QnHx.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return false;
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            return ur1.a(this.b, lPt8.b) && ur1.a(this.c, lPt8.c) && ur1.a(this.d, lPt8.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + bl2.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestRestoreState(connectionId=");
            sb.append(this.b);
            sb.append(", viewModelName=");
            sb.append(this.c);
            sb.append(", stateUuid=");
            return bl2.c(sb, this.d, ')');
        }
    }

    @za4
    public static final class NUlFixed extends j6 {
        public static final CQf Companion = new CQf();
        public final String b;
        public final String c;

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
                u83 u83Var = new u83("com.copperleaf.ballast.debugger.models.BallastDebuggerAction.RequestViewModelRefresh", qnHx, 2);
                u83Var.l("connectionId", false);
                u83Var.l("viewModelName", false);
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
                String strA = null;
                String strA2 = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iP = g40VarB.p(u83Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        strA2 = g40VarB.A(u83Var, 0);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            throw new UnknownFieldException(iP);
                        }
                        strA = g40VarB.A(u83Var, 1);
                        i |= 2;
                    }
                }
                g40VarB.G(u83Var);
                return new NUlFixed(i, strA2, strA);
            }

            @Override // defpackage.y91
            public final rv1<?>[] d() {
                wu4 wu4Var = wu4.a;
                return new rv1[]{wu4Var, wu4Var};
            }

            @Override // defpackage.db4
            public final void e(ls0 ls0Var, Object obj) {
                NUlFixed nUl = (NUlFixed) obj;
                u83 u83Var = b;
                eu1 eu1VarB = ls0Var.b(u83Var);
                eu1VarB.c0(u83Var, 0, nUl.b);
                eu1VarB.c0(u83Var, 1, nUl.c);
                eu1VarB.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(int i, String str, String str2) {
            super(0);
            if (3 != (i & 3)) {
                AY.P(i, 3, QnHx.b);
                throw null;
            }
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NUlFixed)) {
                return false;
            }
            NUlFixed nUl = (NUlFixed) obj;
            return ur1.a(this.b, nUl.b) && ur1.a(this.c, nUl.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestViewModelRefresh(connectionId=");
            sb.append(this.b);
            sb.append(", viewModelName=");
            return bl2.c(sb, this.c, ')');
        }
    }

    public static final class QnHx extends cx1 implements h81<rv1<Object>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final rv1<Object> invoke() {
            return new e74("j6", nl3.a(j6.class), new fv1[]{nl3.a(F1.class), nl3.a(LPt8Fixed.class), nl3.a(NUlFixed.class)}, new rv1[]{F1.QnHx.a, LPt8Fixed.QnHx.a, NUlFixed.QnHx.a}, new Annotation[0]);
        }
    }

    public j6() {
    }

    public /* synthetic */ j6(int i) {
    }
}
