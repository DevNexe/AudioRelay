package defpackage;

import j$.time.LocalDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class t42 implements rv1<s42> {
    public static final t42 a = new t42();
    public static final ge3 b = FWT.p("LocalDateTime", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        s42.QnHx qnHx = s42.Companion;
        String strQ = pf0Var.Q();
        qnHx.getClass();
        try {
            return new s42(LocalDateTime.parse(strQ));
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r0(((s42) obj).toString());
    }
}
