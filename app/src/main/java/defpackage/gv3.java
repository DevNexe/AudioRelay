package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class gv3 implements bu0<ev3, dv3, fv3> {
    public final Context a;
    public final sn4 b;
    public final bm2 c;

    public gv3(Context context, sn4 sn4Var, bm2 bm2Var) {
        this.a = context;
        this.b = sn4Var;
        this.c = bm2Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        dv3 dv3Var = (dv3) obj;
        boolean zA = ur1.a(dv3Var, dv3.QnHx.a);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (zA) {
            Object objB = this.c.b(ou3.FJCM.e, null, z80Var);
            return objB == va0Var ? objB : sd5.a;
        }
        if (!ur1.a(dv3Var, dv3.CQf.a)) {
            return sd5.a;
        }
        Object objA = this.b.a(this.a.getString(R.string.open_device_settings_error), un4.Short, z80Var);
        return objA == va0Var ? objA : sd5.a;
    }
}
