package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import defpackage.g96;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcja implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager a;
    public final g96 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f = 1.0f;

    public zzcja(Context context, g96 g96Var) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = g96Var;
    }

    public final void a() {
        boolean z = this.d;
        g96 g96Var = this.b;
        AudioManager audioManager = this.a;
        if (!z || this.e || this.f <= 0.0f) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                g96Var.zzn();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        g96Var.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.c = i > 0;
        this.b.zzn();
    }

    public final float zza() {
        float f = this.e ? 0.0f : this.f;
        if (this.c) {
            return f;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.d = true;
        a();
    }

    public final void zzc() {
        this.d = false;
        a();
    }

    public final void zzd(boolean z) {
        this.e = z;
        a();
    }

    public final void zze(float f) {
        this.f = f;
        a();
    }
}
