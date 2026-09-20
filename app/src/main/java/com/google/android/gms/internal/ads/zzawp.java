package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import defpackage.GM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawp extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzawp(zzass zzassVar, Throwable th, boolean z, int i) {
        super("Decoder init failed: [" + i + "], " + String.valueOf(zzassVar), th);
        this.zza = zzassVar.zzf;
        this.zzb = null;
        this.zzc = GM.a("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_", Math.abs(i));
    }

    public zzawp(zzass zzassVar, Throwable th, boolean z, String str) {
        super("Decoder init failed: " + str + ", " + String.valueOf(zzassVar), th);
        this.zza = zzassVar.zzf;
        this.zzb = str;
        String diagnosticInfo = null;
        if (zzban.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzc = diagnosticInfo;
    }
}
