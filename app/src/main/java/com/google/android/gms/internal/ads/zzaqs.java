package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqs extends zzarm {
    public zzaqs(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "f39Hbu/3ZHOuknzzffAN3L/wmMd3z47Qz3PAKZYAx1YBPOpdL/44XYH2Sf+BtSh+", "LWwi57CIM0frlO/aZZoO3fCsCmO9IloxmiaKJl7K70k=", zzamhVar, i, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        if (this.w.zzq()) {
            b();
            return;
        }
        synchronized (this.z) {
            this.z.zzr((String) this.A.invoke(null, this.w.zzb()));
        }
    }

    public final void b() {
        AdvertisingIdClient advertisingIdClientZzh = this.w.zzh();
        if (advertisingIdClientZzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientZzh.getInfo();
            String strZzd = zzaqe.zzd(info.getId());
            if (strZzd != null) {
                synchronized (this.z) {
                    try {
                        this.z.zzr(strZzd);
                        this.z.zzq(info.isLimitAdTrackingEnabled());
                        this.z.zzaa(6);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarm, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final Void zzk() {
        zzaqb zzaqbVar = this.w;
        if (zzaqbVar.zzr()) {
            super.zzk();
            return null;
        }
        if (zzaqbVar.zzq()) {
            b();
        }
        return null;
    }
}
