package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class zs1 {
    public static final CQf Companion = new CQf();
    public final String a;
    public final String b;

    public static final class CQf {
        public final rv1<zs1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<zs1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("zs1", qnHx, 2);
            u83Var.l("admob", false);
            u83Var.l("mopub", false);
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
            return new zs1(i, strA2, strA);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            wu4 wu4Var = wu4.a;
            return new rv1[]{wu4Var, wu4Var};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            zs1 zs1Var = (zs1) obj;
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            eu1VarB.c0(u83Var, 0, zs1Var.a);
            eu1VarB.c0(u83Var, 1, zs1Var.b);
            eu1VarB.k();
        }
    }

    public zs1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AY.P(i, 3, QnHx.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs1)) {
            return false;
        }
        zs1 zs1Var = (zs1) obj;
        return ur1.a(this.a, zs1Var.a) && ur1.a(this.b, zs1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsonAdKeywordsConfig(admob=" + this.a + ", mopub=" + this.b + ")";
    }
}
