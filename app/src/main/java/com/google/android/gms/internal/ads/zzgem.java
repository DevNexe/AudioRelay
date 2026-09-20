package com.google.android.gms.internal.ads;

import defpackage.fc2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgem {
    public final Class a;
    public final Map b;
    public final Class c;

    @SafeVarargs
    public zzgem(Class cls, zzgen... zzgenVarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgen zzgenVar = zzgenVarArr[i];
            boolean zContainsKey = map.containsKey(zzgenVar.a);
            Class cls2 = zzgenVar.a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
            }
            map.put(cls2, zzgenVar);
        }
        this.c = zzgenVarArr[0].a;
        this.b = Collections.unmodifiableMap(map);
    }

    public zzgel zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgpx zzb(zzgnf zzgnfVar);

    public abstract String zzc();

    public abstract void zzd(zzgpx zzgpxVar);

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.c;
    }

    public final Class zzj() {
        return this.a;
    }

    public final Object zzk(zzgpx zzgpxVar, Class cls) {
        zzgen zzgenVar = (zzgen) this.b.get(cls);
        if (zzgenVar != null) {
            return zzgenVar.zza(zzgpxVar);
        }
        throw new IllegalArgumentException(fc2.a("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.b.keySet();
    }
}
