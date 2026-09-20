package com.google.android.gms.internal.ads;

import defpackage.ug6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeem implements zzfhq {
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public final zzfhy y;

    public zzeem(Set set, zzfhy zzfhyVar) {
        this.y = zzfhyVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ug6 ug6Var = (ug6) it.next();
            this.w.put(ug6Var.a, "ttc");
            this.x.put(ug6Var.b, "ttc");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbF(zzfhj zzfhjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbG(zzfhj zzfhjVar, String str, Throwable th) {
        String strConcat = "task.".concat(String.valueOf(str));
        zzfhy zzfhyVar = this.y;
        zzfhyVar.zze(strConcat, "f.");
        HashMap map = this.x;
        if (map.containsKey(zzfhjVar)) {
            zzfhyVar.zze("label.".concat(String.valueOf((String) map.get(zzfhjVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzc(zzfhj zzfhjVar, String str) {
        String strConcat = "task.".concat(String.valueOf(str));
        zzfhy zzfhyVar = this.y;
        zzfhyVar.zzd(strConcat);
        HashMap map = this.w;
        if (map.containsKey(zzfhjVar)) {
            zzfhyVar.zzd("label.".concat(String.valueOf((String) map.get(zzfhjVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzd(zzfhj zzfhjVar, String str) {
        String strConcat = "task.".concat(String.valueOf(str));
        zzfhy zzfhyVar = this.y;
        zzfhyVar.zze(strConcat, "s.");
        HashMap map = this.x;
        if (map.containsKey(zzfhjVar)) {
            zzfhyVar.zze("label.".concat(String.valueOf((String) map.get(zzfhjVar))), "s.");
        }
    }
}
