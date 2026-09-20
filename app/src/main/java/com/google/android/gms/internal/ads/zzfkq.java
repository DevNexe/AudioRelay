package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkq {
    public final zzflx a;
    public final String b;
    public final zzfkf c;
    public final String d = "Ad overlay";

    public zzfkq(View view, zzfkf zzfkfVar, String str) {
        this.a = new zzflx(view);
        this.b = view.getClass().getCanonicalName();
        this.c = zzfkfVar;
    }

    public final zzfkf zza() {
        return this.c;
    }

    public final zzflx zzb() {
        return this.a;
    }

    public final String zzc() {
        return this.d;
    }

    public final String zzd() {
        return this.b;
    }
}
