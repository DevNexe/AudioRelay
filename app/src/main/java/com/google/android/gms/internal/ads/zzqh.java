package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqh {
    public final zzql zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    public zzqh(zzql zzqlVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface) {
        this.zza = zzqlVar;
        this.zzb = mediaFormat;
        this.zzc = zzafVar;
        this.zzd = surface;
    }

    public static zzqh zza(zzql zzqlVar, MediaFormat mediaFormat, zzaf zzafVar, MediaCrypto mediaCrypto) {
        return new zzqh(zzqlVar, mediaFormat, zzafVar, null);
    }

    public static zzqh zzb(zzql zzqlVar, MediaFormat mediaFormat, zzaf zzafVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqh(zzqlVar, mediaFormat, zzafVar, surface);
    }
}
