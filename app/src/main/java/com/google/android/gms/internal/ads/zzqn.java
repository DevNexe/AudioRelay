package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqn extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzql zzc;
    public final String zzd;
    public final zzqn zze;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzqn(zzaf zzafVar, Throwable th, boolean z, int i) {
        String strValueOf = String.valueOf(zzafVar);
        this("Decoder init failed: [" + i + "], " + strValueOf, th, zzafVar.zzm, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    public zzqn(zzaf zzafVar, Throwable th, boolean z, zzql zzqlVar) {
        this("Decoder init failed: " + zzqlVar.zza + ", " + String.valueOf(zzafVar), th, zzafVar.zzm, zzqlVar, (zzel.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    public zzqn(String str, Throwable th, String str2, zzql zzqlVar, String str3, zzqn zzqnVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqlVar;
        this.zzd = str3;
        this.zze = zzqnVar;
    }
}
