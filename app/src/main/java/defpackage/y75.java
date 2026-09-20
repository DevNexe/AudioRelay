package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import kotlinx.datetime.IllegalTimeZoneException;

/* JADX INFO: loaded from: classes3.dex */
public final class y75 implements rv1<x75> {
    public static final y75 a = new y75();
    public static final ge3 b = FWT.p("TimeZone", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) throws Exception {
        x75.QnHx qnHx = x75.Companion;
        String strQ = pf0Var.Q();
        qnHx.getClass();
        try {
            return x75.QnHx.a(ZoneId.of(strQ));
        } catch (Exception e) {
            if (e instanceof DateTimeException) {
                throw new IllegalTimeZoneException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r0(((x75) obj).a.getId());
    }
}
