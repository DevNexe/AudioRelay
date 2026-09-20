package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzequ implements zzeun {
    public final zzezo a;

    public zzequ(zzezo zzezoVar) {
        this.a = zzezoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        zzeum zzeumVar = null;
        zzezo zzezoVar = this.a;
        if (zzezoVar != null && zzezoVar.zza() != null && !zzezoVar.zza().isEmpty()) {
            zzeumVar = new zzeum() { // from class: com.google.android.gms.internal.ads.zzeqt
                @Override // com.google.android.gms.internal.ads.zzeum
                public final void zzf(Object obj) {
                    ((Bundle) obj).putString("key_schema", this.zza.a.zza());
                }
            };
        }
        return zzfyo.zzi(zzeumVar);
    }
}
