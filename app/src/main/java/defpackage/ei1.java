package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ei1 implements bu0<bi1, ai1, ci1> {
    public final Context a;
    public final sn4 b;
    public final j81<String, sd5> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ei1(Context context, sn4 sn4Var, j81<? super String, sd5> j81Var) {
        this.a = context;
        this.b = sn4Var;
        this.c = j81Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        ai1 ai1Var = (ai1) obj;
        boolean zA = ur1.a(ai1Var, ai1.QnHx.a);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        sn4 sn4Var = this.b;
        Context context = this.a;
        if (zA) {
            Object objA = sn4Var.a(context.getString(R.string.open_device_settings_error), un4.Short, z80Var);
            return objA == va0Var ? objA : sd5.a;
        }
        if (ur1.a(ai1Var, ai1.LPt8Fixed.a)) {
            Object objA2 = sn4Var.a(context.getString(R.string.usb_card_show_tethering_settings_error), un4.Short, z80Var);
            return objA2 == va0Var ? objA2 : sd5.a;
        }
        if (ur1.a(ai1Var, ai1.CQf.a)) {
            this.c.invoke("https://docs.audiorelay.net/usb");
        } else if (ur1.a(ai1Var, ai1.F1.a)) {
            qh0 qh0Var = rl0.a;
            Object objD0 = fp1.D0(n72.a, new di1(this, du0Var, null), z80Var);
            return objD0 == va0Var ? objD0 : sd5.a;
        }
        return sd5.a;
    }
}
