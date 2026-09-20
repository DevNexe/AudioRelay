package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.azefsw.audioconnect.R;
import com.azefsw.audioconnect.player.ui.service.PlayerService;
import com.azefsw.audioconnect.ui.startup.internals.Android8FixCallbacks;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() throws IOException {
        h81<sd5> h81Var;
        switch (this.a) {
            case 0:
                ve.QnHx qnHx = (ve.QnHx) this.b;
                h1 h1Var = (h1) this.c;
                qnHx.b.close();
                h1Var.getClass();
                a62 a62Var = a62.a;
                h1Var.d.a = null;
                h1Var.e.a = null;
                return;
            case 1:
                ((PlayerService) this.b).x.a.a((String) this.c);
                return;
            case 2:
                p33 p33Var = (p33) this.b;
                l33 l33Var = (l33) this.c;
                synchronized (p33Var) {
                    p33Var.d = wu.S0(p33Var.d, l33Var);
                    sd5 sd5Var = sd5.a;
                }
                return;
            case 3:
                gk1 gk1Var = (gk1) this.b;
                Android8FixCallbacks android8FixCallbacks = (Android8FixCallbacks) this.c;
                a62.a.c("Postponed " + gk1Var.a + " called");
                yt0 yt0Var = (yt0) android8FixCallbacks.w.get(gk1Var);
                if (yt0Var == null || (h81Var = yt0Var.a) == null) {
                    return;
                }
                h81Var.invoke();
                return;
            case 4:
                bf5 bf5Var = (bf5) this.b;
                String str = (String) this.c;
                Context context = bf5Var.a;
                String strA = rz.a(rz.a(context.getString(R.string.share_app_body), System.getProperty("line.separator")), "https://play.google.com/store/apps/details?id=".concat(context.getPackageName()));
                String string = context.getString(R.string.share_app_intent_title);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", str);
                intent.putExtra("android.intent.extra.TEXT", strA);
                Intent intentCreateChooser = Intent.createChooser(intent, string);
                intentCreateChooser.setFlags(268435456);
                context.startActivity(intentCreateChooser);
                return;
            default:
                gu4 gu4Var = (gu4) this.b;
                String str2 = (String) this.c;
                gu4Var.getClass();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str2));
                intent2.setFlags(268435456);
                gu4Var.a.startActivity(intent2);
                return;
        }
    }
}
