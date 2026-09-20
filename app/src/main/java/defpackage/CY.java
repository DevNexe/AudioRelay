package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CY implements m70 {
    public final /* synthetic */ int w;

    public /* synthetic */ CY(int i) {
        this.w = i;
    }

    @Override // defpackage.m70
    public final void accept(Object obj) throws IOException {
        switch (this.w) {
            case 0:
                a62 a62Var = a62.a;
                a62.a.g("ads_initialization_completed", null);
                break;
            case 1:
                a62 a62Var2 = a62.a;
                break;
            case 2:
                a62 a62Var3 = a62.a;
                ((cp1) obj).a();
                break;
            case 3:
                a62 a62Var4 = a62.a;
                a62.a.d((Throwable) obj, true);
                break;
            case 4:
                a62 a62Var5 = a62.a;
                break;
            case 5:
                a62 a62Var6 = a62.a;
                break;
            case 6:
                a62 a62Var7 = a62.a;
                a62Var7.e("failed_to_reconnect");
                a62Var7.b("Stopping reconnect attempts", (Throwable) obj);
                break;
            case 7:
                a62.a.c("Refreshing the audio output in " + ((bq3) obj).a + " ms...");
                break;
            case 8:
                int i = ek0.a;
                Log.d("DEV_PREMIUM", "Response " + ((dd3) obj));
                break;
            case 9:
                if (((dd3) obj).b != null) {
                    a62 a62Var8 = a62.a;
                    a62.a.g("is_premium_error", null);
                }
                break;
            case 10:
                a62 a62Var9 = a62.a;
                break;
            case 11:
                a62 a62Var10 = a62.a;
                a62.a.d((Throwable) obj, true);
                break;
            case 12:
                ((ServerSocket) obj).close();
                break;
            default:
                ((DatagramSocket) obj).close();
                break;
        }
    }
}
