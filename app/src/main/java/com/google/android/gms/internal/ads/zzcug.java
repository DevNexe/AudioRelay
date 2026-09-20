package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcug implements zzctu {
    public final zzfcr a;

    public zzcug(zzfcr zzfcrVar) {
        this.a = zzfcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.a.zzb(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
