package defpackage;

import j$.time.OffsetDateTime;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;

/* JADX INFO: loaded from: classes3.dex */
public final class gp1 implements rv1<ep1> {
    public static final gp1 a = new gp1();
    public static final ge3 b = FWT.p("Instant", ee3.byN.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        ep1.QnHx qnHx = ep1.Companion;
        String strQ = pf0Var.Q();
        qnHx.getClass();
        try {
            int iE = mv4.E(strQ, 'T', 0, true, 2);
            if (iE != -1) {
                int length = strQ.length() - 1;
                if (length < 0) {
                    length = -1;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    char cCharAt = strQ.charAt(length);
                    if (cCharAt == '+' || cCharAt == '-') {
                        break;
                    }
                    if (i < 0) {
                        length = -1;
                        break;
                    }
                    length = i;
                }
                if (length >= iE && mv4.E(strQ, ':', length, false, 4) == -1) {
                    strQ = strQ + ":00";
                }
            }
            return new ep1(OffsetDateTime.parse(strQ).toInstant());
        } catch (DateTimeParseException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r0(((ep1) obj).toString());
    }
}
