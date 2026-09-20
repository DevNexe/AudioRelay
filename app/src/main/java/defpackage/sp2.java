package defpackage;

import android.content.Context;
import android.content.Intent;
import com.azefsw.audioconnect.player.ui.service.PlayerService;

/* JADX INFO: loaded from: classes.dex */
public final class sp2 extends cx1 implements x81<Context, Intent, sd5> {
    public final /* synthetic */ tp2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp2(tp2 tp2Var) {
        super(2);
        this.w = tp2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("PLAY_PAUSE");
        if (stringExtra != null) {
            int iHashCode = stringExtra.hashCode();
            tp2 tp2Var = this.w;
            if (iHashCode != 2555906) {
                if (iHashCode == 79219778 && stringExtra.equals("START")) {
                    tp2Var.getClass();
                    a62.a.e("called_start_from_notification");
                    String strA = tp2Var.c.b.a();
                    if (strA != null) {
                        boolean z = PlayerService.A;
                        PlayerService.QnHx.a(tp2Var.a, strA);
                    }
                }
            } else if (stringExtra.equals("STOP")) {
                tp2Var.getClass();
                a62.a.e("called_stop_from_notification");
                new fx(new xW8n(tp2Var, 3)).i(j54.c).g();
            }
        }
        return sd5.a;
    }
}
