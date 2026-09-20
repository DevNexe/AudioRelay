package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzu;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegp {
    public zzfcv c = null;
    public zzfcs d = null;
    public zzu e = null;
    public final Map b = DesugarCollections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public final void a(zzfcs zzfcsVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = zzfcsVar.zzx;
        Map map = this.b;
        if (map.containsKey(str)) {
            if (this.d == null) {
                this.d = zzfcsVar;
            }
            zzu zzuVar = (zzu) map.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfP)).booleanValue() && z) {
                this.e = zzuVar;
            }
        }
    }

    public final zzu zza() {
        return this.e;
    }

    public final zzdcr zzb() {
        return new zzdcr(this.d, "", this, this.c);
    }

    public final List zzc() {
        return this.a;
    }

    public final void zzd(zzfcs zzfcsVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfcsVar.zzx;
        Map map = this.b;
        if (map.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = zzfcsVar.zzw.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, zzfcsVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfO)).booleanValue()) {
            String str6 = zzfcsVar.zzG;
            String str7 = zzfcsVar.zzH;
            str = str6;
            str2 = str7;
            str3 = zzfcsVar.zzI;
            str4 = zzfcsVar.zzJ;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        zzu zzuVar = new zzu(zzfcsVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        this.a.add(zzuVar);
        map.put(str5, zzuVar);
    }

    public final void zze(zzfcs zzfcsVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(zzfcsVar, j, zzeVar, false);
    }

    public final void zzf(zzfcs zzfcsVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(zzfcsVar, j, null, true);
    }

    public final void zzg(zzfcv zzfcvVar) {
        this.c = zzfcvVar;
    }
}
