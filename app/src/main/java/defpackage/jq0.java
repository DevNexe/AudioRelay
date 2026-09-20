package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jq0 implements rv1<gq0> {
    public static final jq0 a = new jq0();
    public static final ge3 b = new ge3("gq0", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        gq0.QnHx qnHx = gq0.x;
        String strQ = pf0Var.Q();
        try {
            return new gq0(ps0.g(strQ));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(fc2.a("Invalid ISO duration string format: '", strQ, "'."), e);
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        long j;
        long j2 = ((gq0) obj).w;
        gq0.QnHx qnHx = gq0.x;
        StringBuilder sb = new StringBuilder();
        if (j2 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (j2 < 0) {
            j = ((long) (((int) j2) & 1)) + ((-(j2 >> 1)) << 1);
            int i = iq0.a;
        } else {
            j = j2;
        }
        long jP = gq0.p(j, kq0.HOURS);
        int iP = gq0.n(j) ? 0 : (int) (gq0.p(j, kq0.MINUTES) % ((long) 60));
        int iP2 = gq0.n(j) ? 0 : (int) (gq0.p(j, kq0.SECONDS) % ((long) 60));
        int iL = gq0.l(j);
        if (gq0.n(j2)) {
            jP = 9999999999999L;
        }
        boolean z = jP != 0;
        boolean z2 = (iP2 == 0 && iL == 0) ? false : true;
        boolean z3 = iP != 0 || (z2 && z);
        if (z) {
            sb.append(jP);
            sb.append('H');
        }
        if (z3) {
            sb.append(iP);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            gq0.c(sb, iP2, iL, 9, "S", true);
        }
        ls0Var.r0(sb.toString());
    }
}
