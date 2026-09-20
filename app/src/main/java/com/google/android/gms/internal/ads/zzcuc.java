package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcuc implements zzctu {
    public final zzeai a;

    public zzcuc(zzeai zzeaiVar) {
        this.a = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhP)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.zzk(str);
        }
    }
}
