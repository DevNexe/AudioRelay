package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzgj;

/* JADX INFO: loaded from: classes3.dex */
public final class ss6 extends BroadcastReceiver implements Runnable {
    public final zzgj w;
    public final Handler x;

    public ss6(Handler handler, uy6 uy6Var) {
        this.x = handler;
        this.w = uy6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.x.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
