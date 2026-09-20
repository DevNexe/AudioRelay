package defpackage;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class jt1 {
    public static final CQf Companion = new CQf();
    public final List<it1> a;

    public static final class CQf {
        public final rv1<jt1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<jt1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("jt1", qnHx, 1);
            u83Var.l("modes", false);
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
            boolean z = true;
            Object objJ = null;
            int i = 0;
            while (z) {
                int iP = g40VarB.p(u83Var);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        throw new UnknownFieldException(iP);
                    }
                    objJ = g40VarB.J(u83Var, 0, new p350(it1.QnHx.a, 0), objJ);
                    i |= 1;
                }
            }
            g40VarB.G(u83Var);
            return new jt1(i, (List) objJ);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            return new rv1[]{new p350(it1.QnHx.a, 0)};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            eu1VarB.k0(u83Var, 0, new p350(it1.QnHx.a, 0), ((jt1) obj).a);
            eu1VarB.k();
        }
    }

    public jt1(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            AY.P(i, 1, QnHx.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt1) && ur1.a(this.a, ((jt1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JsonBufferSizeModes(modes=" + this.a + ")";
    }
}
