package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.r80;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeom implements zzeun {
    public final Context a;

    public zzeom(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcr)).booleanValue()) {
            return zzfyo.zzi(new zzeon(r80.a(this.a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfyo.zzi(null);
    }
}
