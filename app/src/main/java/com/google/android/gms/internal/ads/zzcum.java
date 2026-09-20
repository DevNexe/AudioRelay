package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcum implements zzctu {
    public final zzeai a;

    public zzcum(zzeai zzeaiVar) {
        this.a = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.zzl(str.equals("true"));
    }
}
