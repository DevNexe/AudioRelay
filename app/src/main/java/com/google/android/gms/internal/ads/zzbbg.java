package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import defpackage.i36;
import defpackage.j36;
import defpackage.k36;
import defpackage.ta7;
import defpackage.tb7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbg {
    public final Handler a;
    public final zzbbh b;

    public zzbbg(Handler handler, zzbbh zzbbhVar) {
        handler.getClass();
        this.a = handler;
        this.b = zzbbhVar;
    }

    public final void zzb(String str, long j, long j2) {
        this.a.post(new tb7(this, str));
    }

    public final void zzc(zzaum zzaumVar) {
        this.a.post(new i36(zzaumVar, 1));
    }

    public final void zzd(int i, long j) {
        this.a.post(new j36(this, i, j));
    }

    public final void zze(zzaum zzaumVar) {
        this.a.post(new i36(zzaumVar, 0));
    }

    public final void zzf(zzass zzassVar) {
        this.a.post(new ta7(this, zzassVar, 5));
    }

    public final void zzg(Surface surface) {
        this.a.post(new ta7(this, surface, 6));
    }

    public final void zzh(int i, int i2, int i3, float f) {
        this.a.post(new k36(this, i, i2, i3, f));
    }
}
