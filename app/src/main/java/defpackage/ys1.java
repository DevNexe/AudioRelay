package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class ys1 {
    public static final CQf Companion = new CQf();
    public final at1 a;
    public final at1 b;
    public final at1 c;

    public static final class CQf {
        public final rv1<ys1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<ys1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("ys1", qnHx, 3);
            u83Var.l("mainBannerProvider", true);
            u83Var.l("adsFragmentProvider", true);
            u83Var.l("interstitialProvider", true);
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
            Object objO2 = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iP = g40VarB.p(u83Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    objO2 = g40VarB.o0(u83Var, 0, new qt0("at1", at1.values()), objO2);
                    i |= 1;
                } else if (iP == 1) {
                    objO0 = g40VarB.o0(u83Var, 1, new qt0("at1", at1.values()), objO0);
                    i |= 2;
                } else {
                    if (iP != 2) {
                        throw new UnknownFieldException(iP);
                    }
                    objO1 = g40VarB.o0(u83Var, 2, new qt0("at1", at1.values()), objO1);
                    i |= 4;
                }
            }
            g40VarB.G(u83Var);
            return new ys1(i, (at1) objO2, (at1) objO0, (at1) objO1);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            return new rv1[]{ii.b(new qt0("at1", at1.values())), ii.b(new qt0("at1", at1.values())), ii.b(new qt0("at1", at1.values()))};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            ys1 ys1Var = (ys1) obj;
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            boolean zM0 = eu1VarB.m0();
            at1 at1Var = ys1Var.a;
            if (zM0 || at1Var != null) {
                eu1VarB.B(u83Var, 0, new qt0("at1", at1.values()), at1Var);
            }
            boolean zM1 = eu1VarB.m0();
            at1 at1Var2 = ys1Var.b;
            if (zM1 || at1Var2 != null) {
                eu1VarB.B(u83Var, 1, new qt0("at1", at1.values()), at1Var2);
            }
            boolean zM2 = eu1VarB.m0();
            at1 at1Var3 = ys1Var.c;
            if (zM2 || at1Var3 != null) {
                eu1VarB.B(u83Var, 2, new qt0("at1", at1.values()), at1Var3);
            }
            eu1VarB.k();
        }
    }

    public ys1() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        return this.a == ys1Var.a && this.b == ys1Var.b && this.c == ys1Var.c;
    }

    public final int hashCode() {
        at1 at1Var = this.a;
        int iHashCode = (at1Var == null ? 0 : at1Var.hashCode()) * 31;
        at1 at1Var2 = this.b;
        int iHashCode2 = (iHashCode + (at1Var2 == null ? 0 : at1Var2.hashCode())) * 31;
        at1 at1Var3 = this.c;
        return iHashCode2 + (at1Var3 != null ? at1Var3.hashCode() : 0);
    }

    public final String toString() {
        return "JsonAdConfig(mainBannerProvider=" + this.a + ", adsFragmentProvider=" + this.b + ", interstitialProvider=" + this.c + ")";
    }

    public ys1(int i, at1 at1Var, at1 at1Var2, at1 at1Var3) {
        if ((i & 0) != 0) {
            AY.P(i, 0, QnHx.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = at1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = at1Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = at1Var3;
        }
    }
}
