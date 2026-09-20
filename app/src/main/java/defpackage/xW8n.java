package defpackage;

import com.azefsw.audioconnect.R;
import com.facebook.ads.AdSettings;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xW8n implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xW8n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AdSettings.addTestDevice("bb9c150c-a087-473d-9c16-ea9f4374f7ee");
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
                break;
            case 1:
                ((h81) obj).invoke();
                break;
            case 2:
                a62 a62Var = a62.a;
                break;
            case 3:
                ((tp2) obj).b.b(new zt4.T23());
                break;
            case 4:
                lKy3 lky3 = ((ng) obj).a;
                if (lky3.l() == mg.Custom) {
                    lky3.t(mg.Low);
                    String strD = lky3.d(R.string.pref_custom_buffer_mode_key);
                    nt1 nt1Var = new nt1(0, 100);
                    ws1 ws1Var = (ws1) lky3.d.x;
                    lky3.i(strD, ws1Var.b(ib4.serializer(ws1Var.b, nl3.c(nt1.class)), nt1Var));
                    a62 a62Var2 = a62.a;
                    a62.a.g("removed_buffer_size_mode", null);
                }
                break;
            case 5:
                ((fP) obj).b.a(ro2.a);
                break;
            case 6:
                ((xe4) obj).a.stop();
                break;
            case 7:
                ((re4) obj).c.N0();
                break;
            default:
                ps psVar = (ps) obj;
                a62.a.c("Closing client " + psVar.d + "…");
                psVar.a.close();
                break;
        }
    }
}
