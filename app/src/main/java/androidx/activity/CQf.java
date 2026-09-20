package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes.dex */
public final class CQf implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ IntentSender.SendIntentException x;
    public final /* synthetic */ ComponentActivity.CQf y;

    public CQf(ComponentActivity.CQf cQf, int i, IntentSender.SendIntentException sendIntentException) {
        this.y = cQf;
        this.w = i;
        this.x = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.y.a(this.w, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.x));
    }
}
