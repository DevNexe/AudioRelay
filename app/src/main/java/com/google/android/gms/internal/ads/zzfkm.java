package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkm extends ContentObserver {
    public final Context a;
    public final AudioManager b;
    public float c;
    public final zzfku d;

    public zzfkm(Handler handler, Context context, zzfkk zzfkkVar, zzfku zzfkuVar, byte[] bArr) {
        super(handler);
        this.a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.d = zzfkuVar;
    }

    public final float a() {
        AudioManager audioManager = this.b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fA = a();
        if (fA != this.c) {
            this.c = fA;
            this.d.zzd(fA);
        }
    }

    public final void zza() {
        float fA = a();
        this.c = fA;
        this.d.zzd(fA);
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}
