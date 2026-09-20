package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.z50;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecl extends zzecf {
    public String g;
    public int h = 1;

    public zzecl(Context context) {
        this.f = new zzcal(context, com.google.android.gms.ads.internal.zzt.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzecf, com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    try {
                        int i = this.h;
                        if (i == 2) {
                            this.f.zzp().zze(this.e, new zzece(this));
                        } else if (i == 3) {
                            this.f.zzp().zzh(this.g, new zzece(this));
                        } else {
                            this.a.zze(new zzecu(1));
                        }
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.a.zze(new zzecu(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
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

    public final zzfyx zzb(zzcba zzcbaVar) {
        synchronized (this.b) {
            int i = this.h;
            if (i != 1 && i != 2) {
                return zzfyo.zzh(new zzecu(2));
            }
            if (this.c) {
                return this.a;
            }
            this.h = 2;
            this.c = true;
            this.e = zzcbaVar;
            this.f.checkAvailabilityAndConnect();
            this.a.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeck
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a();
                }
            }, zzcha.zzf);
            return this.a;
        }
    }

    public final zzfyx zzc(String str) {
        synchronized (this.b) {
            int i = this.h;
            if (i != 1 && i != 3) {
                return zzfyo.zzh(new zzecu(2));
            }
            if (this.c) {
                return this.a;
            }
            this.h = 3;
            this.c = true;
            this.g = str;
            this.f.checkAvailabilityAndConnect();
            this.a.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a();
                }
            }, zzcha.zzf);
            return this.a;
        }
    }
}
