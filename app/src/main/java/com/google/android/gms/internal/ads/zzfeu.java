package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfeu {
    public zzffp a = null;

    public final void zza() {
        zzffp zzffpVar = this.a;
        if (zzffpVar != null) {
            zzffu zzffuVar = zzffpVar.zza;
            synchronized (zzffuVar) {
                zzffuVar.e = 1;
                zzffuVar.a();
            }
        }
    }

    public final void zzb(zzffp zzffpVar) {
        this.a = zzffpVar;
    }
}
