package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgs;

/* JADX INFO: loaded from: classes.dex */
public final class zzby extends zzb {
    public final zzcgs b;
    public final String c;

    public zzby(Context context, String str, String str2) {
        this.b = new zzcgs(com.google.android.gms.ads.internal.zzt.zzq().zzc(context, str));
        this.c = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.b.zza(this.c);
    }
}
