package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class hEb implements bu0<FEQ, IPxR, Bv> {
    public final Context a;
    public final sn4 b;

    public hEb(Context context, sn4 sn4Var) {
        this.a = context;
        this.b = sn4Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (!ur1.a((IPxR) obj, IPxR.QnHx.a)) {
            return sd5.a;
        }
        Object objA = this.b.a(this.a.getString(R.string.open_device_settings_error), un4.Short, z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
