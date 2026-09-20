package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import kotlinx.datetime.IllegalTimeZoneException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class my0 implements rv1<ly0> {
    public static final my0 a = new my0();
    public static final ge3 b = FWT.p("FixedOffsetTimeZone", ee3.byN.a);

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
            x75 x75VarA = x75.QnHx.a(ZoneId.of(strQ));
            if (x75VarA instanceof ly0) {
                return (ly0) x75VarA;
            }
            throw new SerializationException("Timezone identifier '" + x75VarA + "' does not correspond to a fixed-offset timezone");
        } catch (Exception e) {
            if (e instanceof DateTimeException) {
                throw new IllegalTimeZoneException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r0(((ly0) obj).a.getId());
    }
}
