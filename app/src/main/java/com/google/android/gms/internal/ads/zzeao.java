package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzeao implements Runnable {
    public final /* synthetic */ zzeap zza;

    public /* synthetic */ zzeao(zzeap zzeapVar) {
        this.zza = zzeapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeap zzeapVar = this.zza;
        zzeapVar.z.zzb("window.inspectorInfo", zzeapVar.y.zzd().toString());
    }
}
