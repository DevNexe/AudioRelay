package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjx {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final ScheduledExecutorService c;

    public zzbjx(Context context, ScheduledExecutorService scheduledExecutorService, zzbjz zzbjzVar, zzfjc zzfjcVar, byte[] bArr) {
        this.c = scheduledExecutorService;
    }

    public final zzfyx zza() {
        return (zzfyf) zzfyo.zzo(zzfyf.zzv(zzfyo.zzi(null)), ((Long) zzbkn.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.c);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.b.getEventTime()) {
                return;
            }
            this.b = MotionEvent.obtain(motionEvent);
        }
    }
}
