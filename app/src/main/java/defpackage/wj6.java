package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzflz;

/* JADX INFO: loaded from: classes3.dex */
public final class wj6 extends zzflz {
    public final /* synthetic */ int w;
    public final /* synthetic */ IInterface x;
    public final /* synthetic */ zzarw y;

    public /* synthetic */ wj6(zzarw zzarwVar, IInterface iInterface, int i) {
        this.w = i;
        this.y = zzarwVar;
        this.x = iInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final void zzv() {
        int i = this.w;
        IInterface iInterface = this.x;
        zzarw zzarwVar = this.y;
        switch (i) {
            case 0:
                if (((zzfcj) zzarwVar).C != null) {
                    try {
                        ((zzdb) iInterface).zze();
                    } catch (RemoteException e) {
                        zzcgn.zzl("#007 Could not call remote method.", e);
                    }
                }
                break;
            default:
                if (((zzfcp) zzarwVar).z != null) {
                    try {
                        ((zzbw) iInterface).zze();
                    } catch (RemoteException e2) {
                        zzcgn.zzl("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                break;
        }
    }
}
