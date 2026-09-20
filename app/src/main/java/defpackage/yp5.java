package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class yp5 extends BroadcastReceiver {
    public Context a;
    public final cq4 b;

    public yp5(cq4 cq4Var) {
        this.b = cq4Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((jr5) this.b.y).getClass();
            throw null;
        }
    }
}
