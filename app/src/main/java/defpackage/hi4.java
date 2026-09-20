package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class hi4 extends cx1 implements x81<g30, Integer, sd5> {
    public final /* synthetic */ wv w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi4(wv wvVar) {
        super(2);
        this.w = wvVar;
    }

    @Override // defpackage.x81
    public final sd5 invoke(g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 11) == 2 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2 pg2VarA = this.w.a(One.QnHx.o);
            j55.b(hH.x(R.string.pref_premium_button, g30Var2), pg2VarA, 0L, FWT.B(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, ((rc5) g30Var2.E(sc5.a)).m, g30Var2, 3072, 0, 32756);
        }
        return sd5.a;
    }
}
