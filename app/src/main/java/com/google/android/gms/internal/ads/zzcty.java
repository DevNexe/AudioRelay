package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcty implements zzctu {
    public final zzg a;

    public zzcty(zzg zzgVar) {
        this.a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctu
    public final void zza(Map map) {
        this.a.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
