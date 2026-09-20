package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class zzab {
    public boolean a = false;
    public float b = 1.0f;

    public static float zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0011 A[RETURN] */
    public final synchronized float zza() {
        float f;
        boolean z;
        synchronized (this) {
            f = this.b;
        }
        if (z) {
            return f;
        }
        return 1.0f;
        z = f >= 0.0f;
        if (z) {
            return f;
        }
        return 1.0f;
    }

    public final synchronized void zzc(boolean z) {
        this.a = z;
    }

    public final synchronized void zzd(float f) {
        this.b = f;
    }

    public final synchronized boolean zze() {
        return this.a;
    }
}
