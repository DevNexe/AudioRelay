package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class bo2 extends c70<yn2> {
    public static final String j = s52.e("NetworkStateTracker");
    public final ConnectivityManager g;
    public final CQf h;
    public final QnHx i;

    public class CQf extends ConnectivityManager.NetworkCallback {
        public CQf() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            s52.c().a(bo2.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            bo2 bo2Var = bo2.this;
            bo2Var.b(bo2Var.e());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            s52.c().a(bo2.j, "Network connection lost", new Throwable[0]);
            bo2 bo2Var = bo2.this;
            bo2Var.b(bo2Var.e());
        }
    }

    public class QnHx extends BroadcastReceiver {
        public QnHx() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            s52.c().a(bo2.j, "Network broadcast received", new Throwable[0]);
            bo2 bo2Var = bo2.this;
            bo2Var.b(bo2Var.e());
        }
    }

    public bo2(Context context, c15 c15Var) {
        super(context, c15Var);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.h = new CQf();
        } else {
            this.i = new QnHx();
        }
    }

    @Override // defpackage.c70
    public final yn2 a() {
        return e();
    }

    @Override // defpackage.c70
    public final void c() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = j;
        if (!z) {
            s52.c().a(str, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            s52.c().a(str, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            s52.c().b(str, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.c70
    public final void d() {
        boolean z = Build.VERSION.SDK_INT >= 24;
        String str = j;
        if (!z) {
            s52.c().a(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.i);
            return;
        }
        try {
            s52.c().a(str, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            s52.c().b(str, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public final yn2 e() {
        boolean z;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        if (Build.VERSION.SDK_INT < 23) {
            z = false;
        } else {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (SecurityException e) {
                s52.c().b(j, "Unable to validate active network", e);
            }
        }
        boolean zA = f60.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new yn2(z3, z, zA, z2);
    }
}
