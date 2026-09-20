package defpackage;

import android.media.AudioManager;
import com.azefsw.audioconnect.R;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesConfiguration;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l83 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l83(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).shutdown();
                return;
            case 1:
                lKy3 lky3 = ((C0w) this.b).b;
                lky3.g(lky3.d(R.string.pref_audio_output_dismissed_shortcut_key), true);
                return;
            case 2:
                lKy3 lky4 = ((y40) this.b).a;
                if (lky4.n()) {
                    return;
                }
                lky4.g(lky4.d(R.string.pref_enable_compression_key), true);
                a62 a62Var = a62.a;
                a62.a.g("enable_compression_again", null);
                return;
            case 3:
                yr3 yr3Var = (yr3) this.b;
                Purchases.Companion companion = Purchases.Companion;
                companion.configure(new PurchasesConfiguration.Builder(yr3Var.a, "goog_jjVWFZqACmsZBXhMlwQKKVDxGMo").build());
                lKy3 lky5 = yr3Var.c;
                if (!((Boolean) lky5.g.getValue()).booleanValue()) {
                    a62 a62Var2 = a62.a;
                    a62.a.g("sync_revenuecat", null);
                    companion.getSharedInstance().syncPurchases();
                    lky5.g.setValue(Boolean.TRUE);
                }
                ListenerConversionsKt.getCustomerInfoWith(companion.getSharedInstance(), CacheFetchPolicy.CACHED_OR_FETCHED, new rr3(yr3Var), new sr3(yr3Var));
                return;
            case 4:
                zb zbVar = (zb) ((v1) this.b).e;
                synchronized (zbVar) {
                    a62 a62Var3 = a62.a;
                    AudioManager audioManager = (AudioManager) r80.c(zbVar.a, AudioManager.class);
                    if (audioManager != null) {
                        audioManager.setMode(3);
                        audioManager.startBluetoothSco();
                        sd5 sd5Var = sd5.a;
                    }
                    break;
                }
                return;
            case 5:
                sAn san = (sAn) this.b;
                san.b = rz4.a(san.b, vz4.F1.a);
                rz4 rz4Var = san.b;
                uz4 uz4Var = san.a;
                uz4Var.getClass();
                uz4Var.a(rz4Var.a, rz4Var.b);
                return;
            default:
                vl0 vl0Var = (vl0) ((jl3) this.b).w;
                if (vl0Var != null) {
                    vl0Var.a();
                    return;
                }
                return;
        }
    }
}
