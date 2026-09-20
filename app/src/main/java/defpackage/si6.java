package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class si6 extends BroadcastReceiver {
    public final r27 a;
    public boolean b;
    public boolean c;

    public si6(r27 r27Var) {
        this.a = r27Var;
    }

    public final void a() {
        r27 r27Var = this.a;
        r27Var.d();
        r27Var.zzaz().e();
        r27Var.zzaz().e();
        if (this.b) {
            r27Var.zzay().n.b("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                r27Var.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                r27Var.zzay().f.c(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r27 r27Var = this.a;
        r27Var.d();
        String action = intent.getAction();
        r27Var.zzay().n.c(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            r27Var.zzay().i.c(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        oi6 oi6Var = r27Var.b;
        r27.E(oi6Var);
        boolean zD = oi6Var.d();
        if (this.c != zD) {
            this.c = zD;
            r27Var.zzaz().m(new qi6(this, zD));
        }
    }
}
