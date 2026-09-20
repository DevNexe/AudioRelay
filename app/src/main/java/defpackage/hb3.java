package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class hb3 implements bu0<za3, ya3, fb3> {
    public final ad3 a;
    public final Context b;
    public final sn4 c;
    public final md3 d;
    public final yf e;

    public hb3(yc3 yc3Var, Context context, sn4 sn4Var, md3 md3Var, yf yfVar) {
        this.a = yc3Var;
        this.b = context;
        this.c = sn4Var;
        this.d = md3Var;
        this.e = yfVar;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        ya3 ya3Var = (ya3) obj;
        if (ya3Var instanceof ya3.CQf) {
            fp1.k0(FWT.C(this.d), null, 0, new gb3((ya3.CQf) ya3Var, this, null), 3);
        } else {
            boolean zA = ur1.a(ya3Var, ya3.YKK.a);
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            sn4 sn4Var = this.c;
            Context context = this.b;
            if (zA) {
                Object objA = sn4Var.a(context.getString(R.string.premium_purchase_successful), un4.Short, z80Var);
                return objA == va0Var ? objA : sd5.a;
            }
            if (ya3Var instanceof ya3.LPt8Fixed) {
                String string = ((ya3.LPt8Fixed) ya3Var).a;
                if (string == null) {
                    string = context.getString(R.string.premium_purchase_error);
                }
                Object objA2 = sn4Var.a(string, un4.Short, z80Var);
                return objA2 == va0Var ? objA2 : sd5.a;
            }
            if (!ur1.a(ya3Var, ya3.F1.a)) {
                if (ur1.a(ya3Var, ya3.NUlFixed.a)) {
                    Object objA3 = sn4Var.a(context.getString(R.string.premium_purchase_restore_failed), un4.Short, z80Var);
                    return objA3 == va0Var ? objA3 : sd5.a;
                }
                if (ur1.a(ya3Var, ya3.QnHx.a)) {
                    this.e.a("https://play.google.com/store/account/subscriptions", "google_play_subscriptions");
                }
            }
        }
        return sd5.a;
    }
}
