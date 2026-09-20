package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzciq {
    public long b;
    public final long a = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzB)).longValue());
    public boolean c = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcib zzcibVar) {
        if (zzcibVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.c || Math.abs(timestamp - this.b) >= this.a) {
            this.c = false;
            this.b = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcip
                @Override // java.lang.Runnable
                public final void run() {
                    zzcibVar.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.c = true;
    }
}
