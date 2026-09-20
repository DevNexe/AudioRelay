package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbbn;

/* JADX INFO: loaded from: classes.dex */
public final class aa7 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    ((zzs) obj).c = true;
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((zzs) obj).c = false;
                }
                break;
            default:
                int i2 = zzbbn.L;
                ((zzbbn) obj).c(3);
                break;
        }
    }

    public aa7(zzbbn zzbbnVar) {
        this.b = zzbbnVar;
    }
}
