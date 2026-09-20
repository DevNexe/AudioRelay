package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class nf5 implements rv1<mf5> {
    public static final nf5 a = new nf5();
    public static final ge3 b = FWT.p("UtcOffset", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        mf5.QnHx qnHx = mf5.Companion;
        String strQ = pf0Var.Q();
        qnHx.getClass();
        try {
            return new mf5(ZoneOffset.of(strQ));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r0(((mf5) obj).toString());
    }
}
