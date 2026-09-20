package com.google.android.gms.internal.ads;

import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjl {
    public final HashMap a = new HashMap();
    public final zzbjn b;

    public zzbjl(zzbjn zzbjnVar) {
        this.b = zzbjnVar;
    }

    public final zzbjn zza() {
        return this.b;
    }

    public final void zzb(String str, zzbjk zzbjkVar) {
        this.a.put(str, zzbjkVar);
    }

    public final void zzc(String str, String str2, long j) {
        HashMap map = this.a;
        zzbjk zzbjkVar = (zzbjk) map.get(str2);
        String[] strArr = {str};
        if (zzbjkVar != null) {
            this.b.zze(zzbjkVar, j, strArr);
        }
        map.put(str, new zzbjk(j, null, null));
    }
}
