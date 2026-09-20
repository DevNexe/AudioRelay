package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class it1 {
    public static final CQf Companion = new CQf();
    public final ht1 a;
    public final nt1 b;

    public static final class CQf {
        public final rv1<it1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<it1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("it1", qnHx, 2);
            u83Var.l("mode", false);
            u83Var.l("size", false);
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
            boolean z = true;
            int i = 0;
            while (z) {
                int iP = g40VarB.p(u83Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    objJ2 = g40VarB.J(u83Var, 0, ht1.QnHx.a, objJ2);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        throw new UnknownFieldException(iP);
                    }
                    objJ = g40VarB.J(u83Var, 1, nt1.QnHx.a, objJ);
                    i |= 2;
                }
            }
            g40VarB.G(u83Var);
            return new it1(i, (ht1) objJ2, (nt1) objJ);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            return new rv1[]{ht1.QnHx.a, nt1.QnHx.a};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            it1 it1Var = (it1) obj;
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            eu1VarB.k0(u83Var, 0, ht1.QnHx.a, it1Var.a);
            eu1VarB.k0(u83Var, 1, nt1.QnHx.a, it1Var.b);
            eu1VarB.k();
        }
    }

    public it1(int i, ht1 ht1Var, nt1 nt1Var) {
        if (3 != (i & 3)) {
            AY.P(i, 3, QnHx.b);
            throw null;
        }
        this.a = ht1Var;
        this.b = nt1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        return this.a == it1Var.a && ur1.a(this.b, it1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsonBufferSizeModeToCustomBufferSize(mode=" + this.a + ", size=" + this.b + ")";
    }
}
