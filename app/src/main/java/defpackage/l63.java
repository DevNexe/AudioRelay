package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class l63 implements bu0<g63, f63, h63> {
    public final Context a;
    public final vq1 b;
    public final bm2 c;
    public final sn4 d;

    public l63(Context context, vq1 vq1Var, bm2 bm2Var, sn4 sn4Var) {
        this.a = context;
        this.b = vq1Var;
        this.c = bm2Var;
        this.d = sn4Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        String string;
        f63 f63Var = (f63) obj;
        boolean z = f63Var instanceof f63.LPt8Fixed;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (z) {
            qh0 qh0Var = rl0.a;
            Object objD0 = fp1.D0(n72.a, new j63(this, f63Var, null), z80Var);
            return objD0 == va0Var ? objD0 : sd5.a;
        }
        if (f63Var instanceof f63.F1) {
            qh0 qh0Var2 = rl0.a;
            Object objD1 = fp1.D0(n72.a, new k63(this, f63Var, null), z80Var);
            return objD1 == va0Var ? objD1 : sd5.a;
        }
        boolean zA = ur1.a(f63Var, f63.QnHx.a);
        sn4 sn4Var = this.d;
        Context context = this.a;
        if (zA) {
            Object objA = sn4Var.a(context.getString(R.string.main_audio_focus_request_failed_error), un4.Short, z80Var);
            return objA == va0Var ? objA : sd5.a;
        }
        if (!(f63Var instanceof f63.CQf)) {
            return sd5.a;
        }
        Throwable th = ((f63.CQf) f63Var).a;
        if (th instanceof cf5) {
            string = th.getMessage();
        } else {
            string = th instanceof cc4 ? context.getString(R.string.main_cant_connect_server_error) : context.getString(R.string.main_generic_player_error);
        }
        Object objA2 = sn4Var.a(string, un4.Short, z80Var);
        return objA2 == va0Var ? objA2 : sd5.a;
    }
}
