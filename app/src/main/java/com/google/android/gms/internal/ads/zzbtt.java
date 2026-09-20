package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtt implements zzbsk, zzbts {
    public final zzbts w;
    public final HashSet x = new HashSet();

    public zzbtt(zzbts zzbtsVar) {
        this.w = zzbtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsk, com.google.android.gms.internal.ads.zzbsv
    public final void zza(String str) {
        this.w.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk, com.google.android.gms.internal.ads.zzbsv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbsj.zzc(this, str, str2);
    }

    public final void zzc() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.x;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbpq) simpleEntry.getValue()).toString())));
            this.w.zzr((String) simpleEntry.getKey(), (zzbpq) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbsj.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk, com.google.android.gms.internal.ads.zzbsi
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbsj.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbsj.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzq(String str, zzbpq zzbpqVar) {
        this.w.zzq(str, zzbpqVar);
        this.x.add(new AbstractMap.SimpleEntry(str, zzbpqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzr(String str, zzbpq zzbpqVar) {
        this.w.zzr(str, zzbpqVar);
        this.x.remove(new AbstractMap.SimpleEntry(str, zzbpqVar));
    }
}
