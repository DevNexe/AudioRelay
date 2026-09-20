package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx implements Runnable {
    public final /* synthetic */ zzen w;

    public QnHx(zzen zzenVar) {
        this.w = zzenVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar = this.w.w.w;
        if (zzbfVar != null) {
            try {
                zzbfVar.zze(1);
            } catch (RemoteException e) {
                zzcgn.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
