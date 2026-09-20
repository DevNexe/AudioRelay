package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.azefsw.audioconnect.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yg4 implements bu0<tg4, sg4, vg4> {
    public final eu4 a;
    public final fh1 b;
    public final af5 c;
    public final Context d;
    public final bm2 e;
    public final sn4 f;
    public final j81<String, sd5> g;

    /* JADX WARN: Multi-variable type inference failed */
    public yg4(eu4 eu4Var, fh1 fh1Var, af5 af5Var, Context context, bm2 bm2Var, sn4 sn4Var, j81<? super String, sd5> j81Var) {
        this.a = eu4Var;
        this.b = fh1Var;
        this.c = af5Var;
        this.d = context;
        this.e = bm2Var;
        this.f = sn4Var;
        this.g = j81Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        sg4 sg4Var = (sg4) obj;
        boolean zA = ur1.a(sg4Var, sg4.CQf.a);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        bm2 bm2Var = this.e;
        if (zA) {
            Object objB = bm2Var.b(ou3.T23.e, null, z80Var);
            return objB == va0Var ? objB : sd5.a;
        }
        if (ur1.a(sg4Var, sg4.F1.a)) {
            Object objB2 = bm2Var.b(ou3.EQ.e, null, z80Var);
            return objB2 == va0Var ? objB2 : sd5.a;
        }
        if (ur1.a(sg4Var, sg4.LPt8Fixed.a)) {
            Object objB3 = bm2Var.b(ou3.FJCM.e, null, z80Var);
            return objB3 == va0Var ? objB3 : sd5.a;
        }
        if (ur1.a(sg4Var, sg4.NUlFixed.a)) {
            Object objB4 = bm2Var.b(ou3.PRnFixed.e, null, z80Var);
            return objB4 == va0Var ? objB4 : sd5.a;
        }
        boolean zA2 = ur1.a(sg4Var, sg4.T23.a);
        Context context = this.d;
        if (zA2) {
            a62.a.e("clicked_on_server_setup");
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.addFlags(524288);
                intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.setup_card_download_link_intent_subject));
                intent.putExtra("android.intent.extra.TEXT", "https://audiorelay.net");
                Intent intentCreateChooser = Intent.createChooser(intent, String.format(context.getString(R.string.setup_card_download_link_share_title), Arrays.copyOf(new Object[]{"https://audiorelay.net"}, 1)));
                Object obj2 = r80.a;
                r80.QnHx.b(context, intentCreateChooser, null);
            } catch (ActivityNotFoundException e) {
                a62 a62Var = a62.a;
                a62.a.d(e, true);
                a62Var.h("settings", "failed_to_share_download_link", e.getMessage());
            }
        } else {
            if (ur1.a(sg4Var, sg4.EQ.a)) {
                Object objA = this.f.a(context.getString(R.string.require_restart_warning), un4.Short, z80Var);
                if (objA != va0Var) {
                    objA = sd5.a;
                }
                return objA == va0Var ? objA : sd5.a;
            }
            boolean zA3 = ur1.a(sg4Var, sg4.QnHx.a);
            af5 af5Var = this.c;
            if (zA3) {
                a62 a62Var2 = a62.a;
                a62.a.g("clicked_on_contact", null);
                qw qwVarB = af5Var.b();
                rb1 rb1VarA = Po.a();
                qwVarB.getClass();
                Object objB5 = JUCk.b(new ox(new mx(qwVarB, rb1VarA).c(new J(this, 16))), z80Var);
                if (objB5 != va0Var) {
                    objB5 = sd5.a;
                }
                return objB5 == va0Var ? objB5 : sd5.a;
            }
            if (ur1.a(sg4Var, sg4.auxFixed.a)) {
                a62 a62Var3 = a62.a;
                a62.a.g("clicked_on_share_app", null);
                fx fxVarA = af5Var.a(context.getString(R.string.app_name));
                rb1 rb1VarA2 = Po.a();
                fxVarA.getClass();
                Object objB6 = JUCk.b(new ox(new mx(fxVarA, rb1VarA2).c(new rq1(this, 18))), z80Var);
                if (objB6 != va0Var) {
                    objB6 = sd5.a;
                }
                return objB6 == va0Var ? objB6 : sd5.a;
            }
            if (ur1.a(sg4Var, sg4.byN.a)) {
                a62 a62Var4 = a62.a;
                a62.a.g("clicked_on_play_store", null);
                Object objB7 = JUCk.b(new ox(this.a.a(context.getPackageName()).c(new jG$(12))), z80Var);
                if (objB7 != va0Var) {
                    objB7 = sd5.a;
                }
                return objB7 == va0Var ? objB7 : sd5.a;
            }
            if (!(sg4Var instanceof sg4.YKK)) {
                throw new NoWhenBranchMatchedException();
            }
            this.g.invoke(((sg4.YKK) sg4Var).a);
        }
        return sd5.a;
    }
}
