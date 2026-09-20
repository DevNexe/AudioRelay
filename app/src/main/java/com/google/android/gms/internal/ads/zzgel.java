package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgel {
    public final Class a;

    public zzgel(Class cls) {
        this.a = cls;
    }

    public abstract zzgpx zza(zzgpx zzgpxVar);

    public abstract zzgpx zzb(zzgnf zzgnfVar);

    public Map zzc() {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgpx zzgpxVar);

    public final Class zzg() {
        return this.a;
    }
}
