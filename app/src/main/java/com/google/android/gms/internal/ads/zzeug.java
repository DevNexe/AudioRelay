package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeug implements zzeun {
    public final boolean a;

    public zzeug(zzfan zzfanVar) {
        this.a = zzfanVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzi(this.a ? new zzeum() { // from class: com.google.android.gms.internal.ads.zzeuf
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
