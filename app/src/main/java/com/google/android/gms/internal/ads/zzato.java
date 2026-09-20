package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.dz5;
import defpackage.iq5;
import defpackage.pz5;
import defpackage.ta7;
import defpackage.tb7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzato {
    public final Handler a;
    public final zzatp b;

    public zzato(Handler handler, zzatp zzatpVar) {
        handler.getClass();
        this.a = handler;
        this.b = zzatpVar;
    }

    public final void zzb(int i) {
        this.a.post(new dz5(this));
    }

    public final void zzc(int i, long j, long j2) {
        this.a.post(new pz5(this));
    }

    public final void zzd(String str, long j, long j2) {
        this.a.post(new ta7(this, str));
    }

    public final void zze(zzaum zzaumVar) {
        this.a.post(new ta7(this, zzaumVar, 4));
    }

    public final void zzf(zzaum zzaumVar) {
        this.a.post(new tb7(this, zzaumVar, 2));
    }

    public final void zzg(zzass zzassVar) {
        this.a.post(new iq5(1, this, zzassVar));
    }
}
