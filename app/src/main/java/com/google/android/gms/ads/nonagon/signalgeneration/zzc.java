package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzdxt;
import defpackage.t26;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public final zzdxt h;
    public ConcurrentHashMap i;

    @GuardedBy("this")
    public final ArrayDeque f = new ArrayDeque();

    @GuardedBy("this")
    public final ArrayDeque g = new ArrayDeque();
    public final int a = ((Integer) zzay.zzc().zzb(zzbiy.zzfY)).intValue();
    public final long b = ((Long) zzay.zzc().zzb(zzbiy.zzfZ)).longValue();
    public final boolean c = ((Boolean) zzay.zzc().zzb(zzbiy.zzge)).booleanValue();
    public final boolean d = ((Boolean) zzay.zzc().zzb(zzbiy.zzgc)).booleanValue();

    @GuardedBy("this")
    public final Map e = DesugarCollections.synchronizedMap(new t26(this));

    public zzc(zzdxt zzdxtVar) {
        this.h = zzdxtVar;
    }

    public final synchronized void a(final zzdxj zzdxjVar) {
        if (this.c) {
            final ArrayDeque arrayDequeClone = this.g.clone();
            this.g.clear();
            final ArrayDeque arrayDequeClone2 = this.f.clone();
            this.f.clear();
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc zzcVar = this.zza;
                    zzdxj zzdxjVar2 = zzdxjVar;
                    ArrayDeque arrayDeque = arrayDequeClone;
                    ArrayDeque arrayDeque2 = arrayDequeClone2;
                    zzcVar.b(zzdxjVar2, arrayDeque, "to");
                    zzcVar.b(zzdxjVar2, arrayDeque2, "of");
                }
            });
        }
    }

    public final void b(zzdxj zzdxjVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdxjVar.zza());
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.zze(this.i);
        }
    }

    public final synchronized void c() {
        long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jB - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    public final synchronized String zzb(String str, zzdxj zzdxjVar) {
        Pair pair = (Pair) this.e.get(str);
        zzdxjVar.zza().put("rid", str);
        if (pair == null) {
            zzdxjVar.zza().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.e.remove(str);
        zzdxjVar.zza().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, zzdxj zzdxjVar) {
        this.e.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()), str2));
        c();
        a(zzdxjVar);
    }

    public final synchronized void zzf(String str) {
        this.e.remove(str);
    }
}
