package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.gk6;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffm {
    public final HashMap a = new HashMap();

    public final zzffl zza(zzffc zzffcVar, Context context, zzfeu zzfeuVar, zzffs zzffsVar) {
        HashMap map = this.a;
        zzffl zzfflVar = (zzffl) map.get(zzffcVar);
        if (zzfflVar != null) {
            return zzfflVar;
        }
        gk6 gk6Var = new gk6(zzfff.zza(zzffcVar, context));
        zzffl zzfflVar2 = new zzffl(gk6Var, new zzffu(gk6Var, zzfeuVar, zzffsVar));
        map.put(zzffcVar, zzfflVar2);
        return zzfflVar2;
    }
}
