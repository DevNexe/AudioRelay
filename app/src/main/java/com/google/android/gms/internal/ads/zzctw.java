package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzctw implements zzctu {
    public final zzg a;

    public zzctw(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        this.a.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
