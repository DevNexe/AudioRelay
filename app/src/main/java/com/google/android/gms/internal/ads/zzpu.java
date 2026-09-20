package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;
import defpackage.i97;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpu implements zzqi {
    public final zzps a;
    public final zzpt b;

    public zzpu(int i, boolean z) {
        zzps zzpsVar = new zzps(i);
        zzpt zzptVar = new zzpt(i);
        this.a = zzpsVar;
        this.b = zzptVar;
    }

    public final i97 zzc(zzqh zzqhVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = zzqhVar.zza.zza;
        i97 i97Var = null;
        try {
            int i = zzel.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                i97 i97Var2 = new i97(mediaCodecCreateByCodecName, new HandlerThread(i97.b(this.a.zza, "ExoPlayer:MediaCodecAsyncAdapter:")), new HandlerThread(i97.b(this.b.zza, "ExoPlayer:MediaCodecQueueingThread:")));
                try {
                    Trace.endSection();
                    i97.a(i97Var2, zzqhVar.zzb, zzqhVar.zzd);
                    return i97Var2;
                } catch (Exception e) {
                    e = e;
                    i97Var = i97Var2;
                    if (i97Var != null) {
                        i97Var.zzl();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }
}
