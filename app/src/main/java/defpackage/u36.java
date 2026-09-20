package defpackage;

import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzbdt;

/* JADX INFO: loaded from: classes3.dex */
public final class u36 implements QnHx.CQf {
    public final /* synthetic */ zzbdt a;

    public u36(zzbdt zzbdtVar) {
        this.a = zzbdtVar;
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        synchronized (this.a.c) {
            try {
                zzbdt zzbdtVar = this.a;
                zzbdtVar.f = null;
                if (zzbdtVar.d != null) {
                    zzbdtVar.d = null;
                }
                zzbdtVar.c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
