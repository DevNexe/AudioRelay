package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.zzapf;

/* JADX INFO: loaded from: classes3.dex */
public final class hz5 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzapf a;

    public hz5(zzapf zzapfVar) {
        this.a = zzapfVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzapf.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzapf.class) {
            this.a.a = null;
        }
    }
}
