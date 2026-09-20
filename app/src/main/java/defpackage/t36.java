package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class t36 implements QnHx.InterfaceC0075QnHx {
    public final /* synthetic */ zzbdt a;

    public t36(zzbdt zzbdtVar) {
        this.a = zzbdtVar;
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.a.c) {
            try {
                zzbdt zzbdtVar = this.a;
                zzbdw zzbdwVar = zzbdtVar.d;
                if (zzbdwVar != null) {
                    zzbdtVar.f = zzbdwVar.zzq();
                }
            } catch (DeadObjectException e) {
                zzcgn.zzh("Unable to obtain a cache service instance.", e);
                zzbdt.a(this.a);
            }
            this.a.c.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        synchronized (this.a.c) {
            zzbdt zzbdtVar = this.a;
            zzbdtVar.f = null;
            zzbdtVar.c.notifyAll();
        }
    }
}
