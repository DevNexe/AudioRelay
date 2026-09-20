package defpackage;

import com.azefsw.audioconnect.R;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class qf2 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ re2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(re2 re2Var) {
        super(2);
        this.w = re2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) != 2 || !g30Var2.t()) {
            e40.CQf cQf = e40.a;
            j55.b(hH.x(R.string.server_microphone_settings_mode_title, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, XTd3.d(((rc5) g30Var2.E(sc5.a)).j), g30Var2, 0, 0, 32766);
            pq4.c(8, g30Var2, 6);
            for (qe2 qe2Var : this.w.a) {
                if (qe2Var.d) {
                    j55.b(hH.x(qe2Var.b, g30Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).j, g30Var2, 0, 0, 32766);
                    pq4.c(4, g30Var2, 6);
                    q70.a(X.m(g30Var2, 814214527, new pf2(qe2Var)), g30Var2, 6);
                    e40.CQf cQf2 = e40.a;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        g30Var2.x();
        return sd5.a;
    }
}
