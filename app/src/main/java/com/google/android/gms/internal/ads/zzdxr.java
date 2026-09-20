package com.google.android.gms.internal.ads;

import defpackage.ft;
import defpackage.uf6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxr implements zzfhq {
    public final zzdxj x;
    public final ft y;
    public final HashMap w = new HashMap();
    public final HashMap z = new HashMap();

    public zzdxr(zzdxj zzdxjVar, Set set, ft ftVar) {
        this.x = zzdxjVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            uf6 uf6Var = (uf6) it.next();
            this.z.put(uf6Var.c, uf6Var);
        }
        this.y = ftVar;
    }

    public final void a(zzfhj zzfhjVar, boolean z) {
        HashMap map = this.z;
        zzfhj zzfhjVar2 = ((uf6) map.get(zzfhjVar)).b;
        String str = true != z ? "f." : "s.";
        HashMap map2 = this.w;
        if (map2.containsKey(zzfhjVar2)) {
            this.x.zza().put("label.".concat(((uf6) map.get(zzfhjVar)).a), str.concat(String.valueOf(Long.toString(this.y.c() - ((Long) map2.get(zzfhjVar2)).longValue()))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbF(zzfhj zzfhjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbG(zzfhj zzfhjVar, String str, Throwable th) {
        HashMap map = this.w;
        if (map.containsKey(zzfhjVar)) {
            this.x.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.y.c() - ((Long) map.get(zzfhjVar)).longValue()))));
        }
        if (this.z.containsKey(zzfhjVar)) {
            a(zzfhjVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzc(zzfhj zzfhjVar, String str) {
        this.w.put(zzfhjVar, Long.valueOf(this.y.c()));
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzd(zzfhj zzfhjVar, String str) {
        HashMap map = this.w;
        if (map.containsKey(zzfhjVar)) {
            this.x.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.y.c() - ((Long) map.get(zzfhjVar)).longValue()))));
        }
        if (this.z.containsKey(zzfhjVar)) {
            a(zzfhjVar, true);
        }
    }
}
