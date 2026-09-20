package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcon {
    public final zzcgt a;
    public final Context b;
    public final WeakReference c;

    public /* synthetic */ zzcon(zzcol zzcolVar) {
        this.a = zzcolVar.a;
        this.b = zzcolVar.b;
        this.c = zzcolVar.c;
    }

    public final zzapb zzb() {
        return new zzapb(new com.google.android.gms.ads.internal.zzi(this.b, this.a));
    }
}
