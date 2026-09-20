package defpackage;

import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
public final class yh2 extends cx1 implements h81<WifiManager.MulticastLock> {
    public final /* synthetic */ zh2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh2(zh2 zh2Var) {
        super(0);
        this.w = zh2Var;
    }

    @Override // defpackage.h81
    public final WifiManager.MulticastLock invoke() {
        return ((WifiManager) this.w.a.getApplicationContext().getSystemService("wifi")).createMulticastLock("SERVER_SEARCH");
    }
}
