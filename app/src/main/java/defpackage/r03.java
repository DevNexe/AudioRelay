package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class r03 extends cx1 implements y81<wu3, g30, Integer, sd5> {
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r03(boolean z) {
        super(3);
        this.w = z;
    }

    @Override // defpackage.y81
    public final sd5 invoke(wu3 wu3Var, g30 g30Var, Integer num) {
        g30 g30Var2 = g30Var;
        if ((num.intValue() & 81) == 16 && g30Var2.t()) {
            g30Var2.x();
        } else {
            e40.CQf cQf = e40.a;
            j55.b(hH.x(this.w ? R.string.permission_allow_open_settings_button : R.string.permission_allow_button, g30Var2).toUpperCase(Locale.ROOT), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, g30Var2, 0, 0, 65534);
        }
        return sd5.a;
    }
}
