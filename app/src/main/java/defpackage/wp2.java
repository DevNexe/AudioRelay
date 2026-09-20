package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class wp2 extends zp2 {
    public CharSequence b;

    @Override // defpackage.zp2
    public final void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // defpackage.zp2
    public final void b(eq2 eq2Var) {
        new Notification.BigTextStyle(eq2Var.a).setBigContentTitle(null).bigText(this.b);
    }

    @Override // defpackage.zp2
    public final String c() {
        return "wp2";
    }
}
