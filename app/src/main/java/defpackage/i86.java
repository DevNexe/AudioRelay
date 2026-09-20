package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import com.google.android.gms.internal.ads.zzcfw;

/* JADX INFO: loaded from: classes3.dex */
public final class i86 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ zzcfw a;

    public i86(zzcfw zzcfwVar) {
        this.a = zzcfwVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.m.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.m.set(false);
    }
}
