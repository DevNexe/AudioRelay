package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class oi6 extends g27 {
    public oi6(r27 r27Var) {
        super(r27Var);
    }

    @Override // defpackage.dv6
    public final boolean d() {
        f();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.g27
    public final void h() {
    }
}
