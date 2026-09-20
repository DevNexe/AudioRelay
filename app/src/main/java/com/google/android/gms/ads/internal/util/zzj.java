package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkg;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {
    public boolean b;
    public zzfyx d;

    @GuardedBy("lock")
    public SharedPreferences f;

    @GuardedBy("lock")
    public SharedPreferences.Editor g;

    @GuardedBy("lock")
    public String i;

    @GuardedBy("lock")
    public String j;
    public final Object a = new Object();
    public final ArrayList c = new ArrayList();

    @GuardedBy("lock")
    public zzbcl e = null;

    @GuardedBy("lock")
    public boolean h = true;

    @GuardedBy("lock")
    public boolean k = true;

    @GuardedBy("lock")
    public String l = "-1";

    @GuardedBy("lock")
    public String m = "-1";

    @GuardedBy("lock")
    public String n = "-1";

    @GuardedBy("lock")
    public int o = -1;

    @GuardedBy("lock")
    public zzcfq p = new zzcfq("", 0);

    @GuardedBy("lock")
    public long q = 0;

    @GuardedBy("lock")
    public long r = 0;

    @GuardedBy("lock")
    public int s = -1;

    @GuardedBy("lock")
    public int t = 0;

    @GuardedBy("lock")
    public Set u = Collections.emptySet();

    @GuardedBy("lock")
    public JSONObject v = new JSONObject();

    @GuardedBy("lock")
    public boolean w = true;

    @GuardedBy("lock")
    public boolean x = true;

    @GuardedBy("lock")
    public String y = null;

    @GuardedBy("lock")
    public String z = "";

    @GuardedBy("lock")
    public boolean A = false;

    @GuardedBy("lock")
    public String B = "";

    @GuardedBy("lock")
    public int C = -1;

    @GuardedBy("lock")
    public int D = -1;

    @GuardedBy("lock")
    public long E = 0;

    public final void a() {
        zzfyx zzfyxVar = this.d;
        if (zzfyxVar == null || zzfyxVar.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzcgn.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzcgn.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzcgn.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzcgn.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void b() {
        zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
            a();
            synchronized (this.a) {
                if (this.B.equals(str)) {
                    return;
                }
                this.B = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
            a();
            synchronized (this.a) {
                if (this.A == z) {
                    return;
                }
                this.A = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        a();
        synchronized (this.a) {
            if (TextUtils.equals(this.y, str)) {
                return;
            }
            this.y = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j) {
        a();
        synchronized (this.a) {
            if (this.r == j) {
                return;
            }
            this.r = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        a();
        synchronized (this.a) {
            this.o = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.g.apply();
            }
            b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        byte b;
        a();
        synchronized (this.a) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.l = str2;
            } else if (b == 1) {
                this.m = str2;
            } else if (b != 2) {
                return;
            } else {
                this.n = str2;
            }
            if (this.g != null) {
                if (str2.equals("-1")) {
                    this.g.remove(str);
                } else {
                    this.g.putString(str, str2);
                }
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue()) {
            a();
            synchronized (this.a) {
                if (this.z.equals(str)) {
                    return;
                }
                this.z = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.g.apply();
                }
                b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        a();
        synchronized (this.a) {
            if (z == this.k) {
                return;
            }
            this.k = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z) {
        a();
        synchronized (this.a) {
            JSONArray jSONArrayOptJSONArray = this.v.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                    if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i;
                    break;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().b());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.v.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e) {
                zzcgn.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.v.toString());
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i) {
        a();
        synchronized (this.a) {
            if (this.s == i) {
                return;
            }
            this.s = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i) {
        a();
        synchronized (this.a) {
            if (this.D == i) {
                return;
            }
            this.D = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j) {
        a();
        synchronized (this.a) {
            if (this.E == j) {
                return;
            }
            this.E = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        a();
        synchronized (this.a) {
            z = this.A;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzar)).booleanValue()) {
            return false;
        }
        a();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        a();
        synchronized (this.a) {
            i = this.t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i;
        a();
        synchronized (this.a) {
            i = this.o;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        a();
        synchronized (this.a) {
            i = this.s;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        a();
        synchronized (this.a) {
            j = this.q;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        a();
        synchronized (this.a) {
            j = this.r;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        a();
        synchronized (this.a) {
            j = this.E;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbcl zzg() {
        if (!this.b) {
            return null;
        }
        if ((zzM() && zzN()) || !((Boolean) zzbkg.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.e == null) {
                this.e = new zzbcl();
            }
            this.e.zze();
            zzcgn.zzi("start fetching content...");
            return this.e;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcfq zzh() {
        zzcfq zzcfqVar;
        a();
        synchronized (this.a) {
            zzcfqVar = this.p;
        }
        return zzcfqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcfq zzi() {
        zzcfq zzcfqVar;
        synchronized (this.a) {
            zzcfqVar = this.p;
        }
        return zzcfqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        a();
        synchronized (this.a) {
            str = this.i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        a();
        synchronized (this.a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        a();
        synchronized (this.a) {
            str = this.B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        a();
        synchronized (this.a) {
            str = this.y;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        byte b;
        a();
        synchronized (this.a) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode != 83641339) {
                    if (iHashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("IABTCF_gdprApplies")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("IABTCF_PurposeConsents")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                return this.l;
            }
            if (b == 1) {
                return this.m;
            }
            if (b != 2) {
                return null;
            }
            return this.n;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        a();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        a();
        synchronized (this.a) {
            jSONObject = this.v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.a) {
            if (this.f != null) {
                return;
            }
            final String str = "admob";
            this.d = zzcha.zza.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    zzj zzjVar = this.zza;
                    Context context2 = this.zzb;
                    zzjVar.getClass();
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob", 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    synchronized (zzjVar.a) {
                        zzjVar.f = sharedPreferences;
                        zzjVar.g = editorEdit;
                        if (Build.VERSION.SDK_INT >= 23) {
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                        }
                        zzjVar.h = zzjVar.f.getBoolean("use_https", zzjVar.h);
                        zzjVar.w = zzjVar.f.getBoolean("content_url_opted_out", zzjVar.w);
                        zzjVar.i = zzjVar.f.getString("content_url_hashes", zzjVar.i);
                        zzjVar.k = zzjVar.f.getBoolean("gad_idless", zzjVar.k);
                        zzjVar.x = zzjVar.f.getBoolean("content_vertical_opted_out", zzjVar.x);
                        zzjVar.j = zzjVar.f.getString("content_vertical_hashes", zzjVar.j);
                        zzjVar.t = zzjVar.f.getInt("version_code", zzjVar.t);
                        zzjVar.p = new zzcfq(zzjVar.f.getString("app_settings_json", zzjVar.p.zzc()), zzjVar.f.getLong("app_settings_last_update_ms", zzjVar.p.zza()));
                        zzjVar.q = zzjVar.f.getLong("app_last_background_time_ms", zzjVar.q);
                        zzjVar.s = zzjVar.f.getInt("request_in_session_count", zzjVar.s);
                        zzjVar.r = zzjVar.f.getLong("first_ad_req_time_ms", zzjVar.r);
                        zzjVar.u = zzjVar.f.getStringSet("never_pool_slots", zzjVar.u);
                        zzjVar.y = zzjVar.f.getString("display_cutout", zzjVar.y);
                        zzjVar.C = zzjVar.f.getInt("app_measurement_npa", zzjVar.C);
                        zzjVar.D = zzjVar.f.getInt("sd_app_measure_npa", zzjVar.D);
                        zzjVar.E = zzjVar.f.getLong("sd_app_measure_npa_ts", zzjVar.E);
                        zzjVar.z = zzjVar.f.getString("inspector_info", zzjVar.z);
                        zzjVar.A = zzjVar.f.getBoolean("linked_device", zzjVar.A);
                        zzjVar.B = zzjVar.f.getString("linked_ad_unit", zzjVar.B);
                        zzjVar.l = zzjVar.f.getString("IABTCF_gdprApplies", zzjVar.l);
                        zzjVar.n = zzjVar.f.getString("IABTCF_PurposeConsents", zzjVar.n);
                        zzjVar.m = zzjVar.f.getString("IABTCF_TCString", zzjVar.m);
                        zzjVar.o = zzjVar.f.getInt("gad_has_consent_for_cookies", zzjVar.o);
                        try {
                            zzjVar.v = new JSONObject(zzjVar.f.getString("native_advanced_settings", "{}"));
                        } catch (JSONException e) {
                            zzcgn.zzk("Could not convert native advanced settings to json object", e);
                        }
                        zzjVar.b();
                    }
                }
            });
            this.b = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        a();
        synchronized (this.a) {
            this.v = new JSONObject();
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        a();
        synchronized (this.a) {
            if (this.q == j) {
                return;
            }
            this.q = j;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        a();
        synchronized (this.a) {
            long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
            if (str != null && !str.equals(this.p.zzc())) {
                this.p = new zzcfq(str, jB);
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.g.putLong("app_settings_last_update_ms", jB);
                    this.g.apply();
                }
                b();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.p.zzg(jB);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i) {
        a();
        synchronized (this.a) {
            if (this.t == i) {
                return;
            }
            this.t = i;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        a();
        synchronized (this.a) {
            if (str.equals(this.i)) {
                return;
            }
            this.i = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        a();
        synchronized (this.a) {
            if (this.w == z) {
                return;
            }
            this.w = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        a();
        synchronized (this.a) {
            if (str.equals(this.j)) {
                return;
            }
            this.j = str;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.g.apply();
            }
            b();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        a();
        synchronized (this.a) {
            if (this.x == z) {
                return;
            }
            this.x = z;
            SharedPreferences.Editor editor = this.g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.g.apply();
            }
            b();
        }
    }
}
