package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzaw.zza().zzl(this, new zzbvc()).zze(intent);
        } catch (RemoteException e) {
            zzcgn.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
