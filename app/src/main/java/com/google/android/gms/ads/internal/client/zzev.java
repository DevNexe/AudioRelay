package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzev implements Runnable {
    public final /* synthetic */ zzccq zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzccq zzccqVar = this.zza;
        if (zzccqVar != null) {
            try {
                zzccqVar.zze(1);
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
