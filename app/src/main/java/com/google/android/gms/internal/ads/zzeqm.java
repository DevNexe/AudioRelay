package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqm implements zzeun {
    public final zzfyy a;
    public final Context b;

    public zzeqm(zzfyy zzfyyVar, Context context) {
        this.a = zzfyyVar;
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iZzi;
                int streamMaxVolume;
                AudioManager audioManager = (AudioManager) this.zza.b.getSystemService("audio");
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzix)).booleanValue()) {
                    iZzi = com.google.android.gms.ads.internal.zzt.zzr().zzi(audioManager);
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                } else {
                    iZzi = -1;
                    streamMaxVolume = -1;
                }
                return new zzeqn(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iZzi, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzs().zza(), com.google.android.gms.ads.internal.zzt.zzs().zze());
            }
        });
    }
}
