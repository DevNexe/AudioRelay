package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
@za4
public final class nt1 {
    public static final CQf Companion = new CQf();
    public final long a;
    public final long b;

    public static final class CQf {
        public final rv1<nt1> serializer() {
            return QnHx.a;
        }
    }

    public static final class QnHx implements y91<nt1> {
        public static final QnHx a;
        public static final /* synthetic */ u83 b;

        static {
            QnHx qnHx = new QnHx();
            a = qnHx;
            u83 u83Var = new u83("nt1", qnHx, 2);
            u83Var.l("minimum", false);
            u83Var.l("maximum", false);
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
            long jP0 = 0;
            long jP1 = 0;
            boolean z = true;
            int i = 0;
            while (z) {
                int iP = g40VarB.p(u83Var);
                if (iP == -1) {
                    z = false;
                } else if (iP == 0) {
                    jP0 = g40VarB.p0(u83Var, 0);
                    i |= 1;
                } else {
                    if (iP != 1) {
                        throw new UnknownFieldException(iP);
                    }
                    jP1 = g40VarB.p0(u83Var, 1);
                    i |= 2;
                }
            }
            g40VarB.G(u83Var);
            return new nt1(i, jP0, jP1);
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            p62 p62Var = p62.a;
            return new rv1[]{p62Var, p62Var};
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            nt1 nt1Var = (nt1) obj;
            u83 u83Var = b;
            eu1 eu1VarB = ls0Var.b(u83Var);
            eu1VarB.n(u83Var, 0, nt1Var.a);
            eu1VarB.n(u83Var, 1, nt1Var.b);
            eu1VarB.k();
        }
    }

    public nt1(int i, long j, long j2) {
        if (3 != (i & 3)) {
            AY.P(i, 3, QnHx.b);
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt1)) {
            return false;
        }
        nt1 nt1Var = (nt1) obj;
        return this.a == nt1Var.a && this.b == nt1Var.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonCustomBufferSize(minimum=");
        sb.append(this.a);
        sb.append(", maximum=");
        return hc2.a(sb, this.b, ")");
    }

    public nt1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
