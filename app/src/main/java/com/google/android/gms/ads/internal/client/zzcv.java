package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class zzcv implements MuteThisAdReason {
    public final String a;
    public final zzcu b;

    public zzcv(zzcu zzcuVar) {
        String strZze;
        this.b = zzcuVar;
        try {
            strZze = zzcuVar.zze();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
            strZze = null;
        }
        this.a = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final zzcu zza() {
        return this.b;
    }
}
