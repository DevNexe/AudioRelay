package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class fb1 implements ga3 {
    public final gb1 a;
    public final long b;

    public fb1(gb1 gb1Var, long j) {
        this.a = gb1Var;
        this.b = j;
    }

    @Override // defpackage.ga3
    public final long a(qp1 qp1Var, long j) {
        int iOrdinal = this.a.ordinal();
        long j2 = this.b;
        int i = qp1Var.b;
        int i2 = qp1Var.a;
        if (iOrdinal == 0) {
            return C0239D.d(i2 + ((int) (j2 >> 32)), mp1.a(j2) + i);
        }
        if (iOrdinal == 1) {
            return C0239D.d((i2 + ((int) (j2 >> 32))) - ((int) (j >> 32)), mp1.a(j2) + i);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = mp1.c;
        return C0239D.d((i2 + ((int) (j2 >> 32))) - (((int) (j >> 32)) / 2), mp1.a(j2) + i);
    }
}
