package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.azefsw.audioconnect.R;
import j$.util.Optional;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w52 implements InterfaceC1443fH {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w52(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1443fH
    public final void run() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xT xTVar = ((x52) obj).a;
                if (xTVar.getLatency() != null) {
                    a62 a62Var = a62.a;
                } else {
                    a62 a62Var2 = a62.a;
                }
                xTVar.a();
                xTVar.c();
                xTVar.d();
                break;
            case 1:
                ((d63) obj).a.a(b63.F1.a);
                break;
            case 2:
                ((ap2) obj).b.b(new zt4.NUlFixed());
                break;
            case 3:
                ((ec4) obj).b.a(Optional.empty());
                break;
            case 4:
                ((n60) obj).c(null);
                break;
            case 5:
                a62 a62Var3 = a62.a;
                break;
            case 6:
                lKy3 lky3 = ((zqJF) obj).a;
                if (!lky3.n()) {
                    lky3.g(lky3.d(R.string.pref_enable_compression_key), true);
                    a62 a62Var4 = a62.a;
                    a62.a.g("activated_compression", null);
                }
                if (xv2.a(lky3.e().getInt("OPUS_BITRATE", 128000)).b) {
                    lky3.h(128000, "OPUS_BITRATE");
                    a62 a62Var5 = a62.a;
                    a62.a.g("restored_default_compression", null);
                }
                break;
            case 7:
                ((zb) ((v1) obj).e).a();
                break;
            case 8:
                ((fl3) obj).w = false;
                break;
            default:
                dr0 dr0Var = (dr0) obj;
                er0 er0Var = dr0Var.b;
                h22 h22Var = er0Var.b;
                Context context = dr0Var.a;
                String strA = h22Var.a(context);
                String strA2 = er0Var.a.a(context);
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", strA, null));
                intent.setFlags(268435456);
                if (!(strA2 == null || strA2.length() == 0)) {
                    intent.putExtra("android.intent.extra.SUBJECT", strA2);
                }
                context.startActivity(intent);
                break;
        }
    }
}
