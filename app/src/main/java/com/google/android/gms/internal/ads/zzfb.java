package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfb implements zzeu {
    public final Context a;
    public final zzfd b;

    public zzfb(Context context) {
        zzfd zzfdVar = new zzfd();
        this.a = context.getApplicationContext();
        this.b = zzfdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    public final /* bridge */ /* synthetic */ zzev zza() {
        return new zzfc(this.a, this.b.zza());
    }
}
