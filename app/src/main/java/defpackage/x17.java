package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class x17 extends BroadcastReceiver {
    public final /* synthetic */ z17 a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final z17 z17Var = this.a;
        z17Var.b.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkg
            @Override // java.lang.Runnable
            public final void run() {
                z17Var.c();
            }
        });
    }
}
