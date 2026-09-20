package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.z50;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecd extends zzecf {
    public zzecd(Context context) {
        this.f = new zzcal(context, com.google.android.gms.ads.internal.zzt.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzecf, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    this.f.zzp().zzg(this.e, new zzece(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.a.zze(new zzecu(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "RemoteAdRequestClientTask.onConnected");
                    this.a.zze(new zzecu(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecf, com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        zzcgn.zze("Cannot connect to remote service, fallback to local instance.");
        this.a.zze(new zzecu(1));
    }
}
