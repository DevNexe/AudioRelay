package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeai implements zzeaq, zzdzt {
    public final zzeap a;
    public final zzear b;
    public final zzdzu c;
    public final zzead d;
    public final zzdzs e;
    public final String f;
    public boolean m;
    public int n;
    public boolean o;
    public String i = "{}";
    public String j = "";
    public long k = Long.MAX_VALUE;
    public zzeae l = zzeae.NONE;
    public zzeah p = zzeah.UNKNOWN;
    public final HashMap h = new HashMap();
    public final String g = "afma-sdk-a-v21.2.0";

    public zzeai(zzeap zzeapVar, zzear zzearVar, zzdzu zzdzuVar, Context context, zzcgt zzcgtVar, zzead zzeadVar) {
        this.a = zzeapVar;
        this.b = zzearVar;
        this.c = zzdzuVar;
        this.e = new zzdzs(context);
        this.f = zzcgtVar.zza;
        this.d = zzeadVar;
        com.google.android.gms.ads.internal.zzt.zzt().zzg(this);
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.h.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdzw zzdzwVar : (List) entry.getValue()) {
                if (zzdzwVar.zzd()) {
                    jSONArray.put(zzdzwVar.zzc());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    public final void b() {
        this.o = true;
        this.d.zzc();
        this.a.zzg(this);
        this.b.zzc(this);
        this.c.zzc(this);
        String strZzo = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzo();
        synchronized (this) {
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(strZzo);
                d(jSONObject.optBoolean("isTestMode", false), false);
                c(zzeae.zza(jSONObject.optString("gesture", "NONE")), false);
                this.i = jSONObject.optString("networkExtras", "{}");
                this.k = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void c(zzeae zzeaeVar, boolean z) {
        if (this.l == zzeaeVar) {
            return;
        }
        if (zzm()) {
            e();
        }
        this.l = zzeaeVar;
        if (zzm()) {
            f();
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzp().zzh().zzG(zzc());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    public final synchronized void d(boolean z, boolean z2) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        if (z) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzt().zzl()) {
                f();
            } else if (!zzm()) {
                e();
            }
        } else if (!zzm()) {
            e();
        }
        if (z2) {
            com.google.android.gms.ads.internal.zzt.zzp().zzh().zzG(zzc());
        }
    }

    public final synchronized void e() {
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 1) {
            this.b.zza();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.zza();
        }
    }

    public final synchronized void f() {
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 1) {
            this.b.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.zzb();
        }
    }

    public final zzeae zza() {
        return this.l;
    }

    public final synchronized String zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && zzm()) {
            if (this.k < com.google.android.gms.ads.internal.zzt.zzB().b() / 1000) {
                this.i = "{}";
                this.k = Long.MAX_VALUE;
                return "";
            }
            if (this.i.equals("{}")) {
                return "";
            }
            return this.i;
        }
        return "";
    }

    public final synchronized String zzc() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.m);
            jSONObject.put("gesture", this.l);
            if (this.k > com.google.android.gms.ads.internal.zzt.zzB().b() / 1000) {
                jSONObject.put("networkExtras", this.i);
                jSONObject.put("networkExtrasExpirationSecs", this.k);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.g);
            jSONObject.put("internalSdkVersion", this.f);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.d.zza());
            if (this.k < com.google.android.gms.ads.internal.zzt.zzB().b() / 1000) {
                this.i = "{}";
            }
            jSONObject.put("networkExtras", this.i);
            jSONObject.put("adSlots", a());
            jSONObject.put("appInfo", this.e.zza());
            String strZzc = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(strZzc)) {
                jSONObject.put("cld", new JSONObject(strZzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhP)).booleanValue() && !TextUtils.isEmpty(this.j)) {
                zzcgn.zze("Policy violation data: " + this.j);
                jSONObject.put("policyViolations", new JSONObject(this.j));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
                jSONObject.put("openAction", this.p);
                jSONObject.put("gesture", this.l);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzs(e, "Inspector.toJson");
            zzcgn.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zze(String str, zzdzw zzdzwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue() && zzm()) {
            if (this.n >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhB)).intValue()) {
                zzcgn.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.h.containsKey(str)) {
                this.h.put(str, new ArrayList());
            }
            this.n++;
            ((List) this.h.get(str)).add(zzdzwVar);
        }
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzp().zzh().zzO()) {
                b();
                return;
            }
            String strZzo = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzo();
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                if (new JSONObject(strZzo).optBoolean("isTestMode", false)) {
                    b();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzeah zzeahVar) {
        if (!zzm()) {
            try {
                zzcyVar.zze(zzfem.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcgn.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue()) {
            this.p = zzeahVar;
            this.a.zzi(zzcyVar, new zzbpr(this));
            return;
        } else {
            try {
                zzcyVar.zze(zzfem.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzcgn.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzh(String str, long j) {
        this.i = str;
        this.k = j;
        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzG(zzc());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzi(boolean z) {
        if (this.o) {
            if (z) {
                if (!this.m) {
                    f();
                    return;
                }
            }
        } else if (z) {
            b();
            if (!this.m) {
                f();
                return;
            }
        }
        if (zzm()) {
            return;
        }
        e();
    }

    public final void zzj(zzeae zzeaeVar) {
        c(zzeaeVar, true);
    }

    public final synchronized void zzk(String str) {
        this.j = str;
    }

    public final void zzl(boolean z) {
        if (!this.o && z) {
            b();
        }
        d(z, true);
    }

    public final synchronized boolean zzm() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
            return this.m || com.google.android.gms.ads.internal.zzt.zzt().zzl();
        }
        return this.m;
    }

    public final synchronized boolean zzn() {
        return this.m;
    }
}
