package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcld extends zzckz {
    public zzcld(zzciw zzciwVar) {
        super(zzciwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzckz
    public final boolean zzq(String str) {
        String strZze = zzcgg.zze(str);
        zzciw zzciwVar = (zzciw) this.y.get();
        if (zzciwVar != null && strZze != null) {
            zzciwVar.zzv(strZze, this);
        }
        zzcgn.zzj("VideoStreamNoopCache is doing nothing.");
        zzc(str, strZze, "noop", "Noop cache is a noop.");
        return false;
    }
}
