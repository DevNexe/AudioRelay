package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
final class zzen extends zzbk {
    public final /* synthetic */ zzeo w;

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) {
        zzh(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i) {
        zzcgn.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgg.zza.post(new QnHx(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() {
        return false;
    }
}
