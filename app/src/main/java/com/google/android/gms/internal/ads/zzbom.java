package com.google.android.gms.internal.ads;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbom implements zzbpq {
    public final zzbon a;

    public zzbom(zzbon zzbonVar) {
        this.a = zzbonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(MediationMetaData.KEY_NAME);
        if (str == null) {
            zzcgn.zzj("App event with no name parameter.");
        } else {
            this.a.zzbD(str, (String) map.get("info"));
        }
    }
}
