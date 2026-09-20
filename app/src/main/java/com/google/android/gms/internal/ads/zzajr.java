package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.ox5;
import defpackage.px5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajr {
    public final ox5 a;

    public zzajr(Handler handler) {
        this.a = new ox5(handler);
    }

    public final void zza(zzaka zzakaVar, zzakj zzakjVar) {
        zzakaVar.zzm("post-error");
        this.a.w.post(new px5(zzakaVar, zzakg.zza(zzakjVar), null, 0));
    }

    public final void zzb(zzaka zzakaVar, zzakg zzakgVar, Runnable runnable) {
        zzakaVar.zzq();
        zzakaVar.zzm("post-response");
        this.a.w.post(new px5(zzakaVar, zzakgVar, runnable, 0));
    }
}
