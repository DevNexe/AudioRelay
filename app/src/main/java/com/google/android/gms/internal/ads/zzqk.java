package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes3.dex */
public class zzqk extends zzge {
    public final zzql zza;
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqk(Throwable th, zzql zzqlVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqlVar == null ? null : zzqlVar.zza)), th);
        String diagnosticInfo = null;
        this.zza = zzqlVar;
        if (zzel.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = diagnosticInfo;
    }
}
