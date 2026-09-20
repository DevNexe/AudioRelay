package com.google.android.gms.internal.ads;

import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzekn implements zzegm {

    @GuardedBy("this")
    public final HashMap a = new HashMap();
    public final zzdvj b;

    public zzekn(zzdvj zzdvjVar) {
        this.b = zzdvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    public final zzegn zza(String str, JSONObject jSONObject) {
        zzegn zzegnVar;
        synchronized (this) {
            zzegnVar = (zzegn) this.a.get(str);
            if (zzegnVar == null) {
                zzegnVar = new zzegn(this.b.zzc(str, jSONObject), new zzeih(), str);
                this.a.put(str, zzegnVar);
            }
        }
        return zzegnVar;
    }
}
