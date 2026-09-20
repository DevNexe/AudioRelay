package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class Irw6 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ te3<sd5> a;

    /* JADX WARN: Multi-variable type inference failed */
    public Irw6(te3<? super sd5> te3Var) {
        this.a = te3Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        a62 a62Var = a62.a;
        fp1.B0(this.a, sd5.a);
    }
}
