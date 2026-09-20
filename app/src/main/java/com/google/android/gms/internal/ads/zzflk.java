package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflk {
    public JSONObject a;
    public final zzflt b;

    public zzflk(zzflt zzfltVar) {
        this.b = zzfltVar;
    }

    public final JSONObject zza() {
        return this.a;
    }

    public final void zzb() {
        this.b.zzb(new zzflu(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.zzb(new zzflv(this, hashSet, jSONObject, j, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.b.zzb(new zzflw(this, hashSet, jSONObject, j, null));
    }

    public final void zze(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
