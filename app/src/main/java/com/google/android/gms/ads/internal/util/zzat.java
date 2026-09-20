package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzcx;

/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzcx {
    public final /* synthetic */ Context w;
    public final /* synthetic */ zzaw x;

    public zzat(zzaw zzawVar, Context context) {
        this.x = zzawVar;
        this.w = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        String str = zzeVar.zzb;
        this.x.getClass();
        zzaw.a(str, this.w, true, true);
    }
}
