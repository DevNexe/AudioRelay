package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzech extends zzecf {
    public zzech(Context context) {
        this.f = new zzcal(context, com.google.android.gms.ads.internal.zzt.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzecf, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    this.f.zzp().zzf(this.e, new zzece(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.zze(new zzecu(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "RemoteSignalsClientTask.onConnected");
                    this.a.zze(new zzecu(1));
                }
            }
        }
    }
}
