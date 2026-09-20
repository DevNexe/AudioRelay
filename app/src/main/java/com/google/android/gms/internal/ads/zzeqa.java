package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqa implements zzeun {
    public final Executor a;
    public final zzcfw b;

    public zzeqa(zzfyy zzfyyVar, zzcfw zzcfwVar) {
        this.a = zzfyyVar;
        this.b = zzcfwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcj)).booleanValue() ? zzfyo.zzi(null) : zzfyo.zzm(this.b.zzj(), new zzfru() { // from class: com.google.android.gms.internal.ads.zzepy
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzeum() { // from class: com.google.android.gms.internal.ads.zzepz
                    @Override // com.google.android.gms.internal.ads.zzeum
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.a);
    }
}
