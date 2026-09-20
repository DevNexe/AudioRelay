package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepd implements zzeun {
    public final zzfyx a;
    public final Executor b;

    public zzepd(zzfyx zzfyxVar, Executor executor) {
        this.a = zzfyxVar;
        this.b = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzn(this.a, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzepc
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final String str = (String) obj;
                return zzfyo.zzi(new zzeum() { // from class: com.google.android.gms.internal.ads.zzepb
                    @Override // com.google.android.gms.internal.ads.zzeum
                    public final void zzf(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.b);
    }
}
