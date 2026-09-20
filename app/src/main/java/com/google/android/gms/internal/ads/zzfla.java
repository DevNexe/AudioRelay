package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzfla {
    public zzfly a;
    public long b;
    public int c;

    public zzfla() {
        zzb();
        this.a = new zzfly(null);
    }

    public final void a(zzfkd zzfkdVar, zzfkb zzfkbVar, JSONObject jSONObject) {
        String strZzh = zzfkdVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfle.zzh(jSONObject2, "environment", "app");
        zzfle.zzh(jSONObject2, "adSessionType", zzfkbVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfle.zzh(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfle.zzh(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfle.zzh(jSONObject3, "os", "Android");
        zzfle.zzh(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfle.zzh(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfle.zzh(jSONObject4, "partnerName", zzfkbVar.zze().zzb());
        zzfle.zzh(jSONObject4, "partnerVersion", zzfkbVar.zze().zzc());
        zzfle.zzh(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfle.zzh(jSONObject5, "libraryVersion", "1.3.31-google_20220407");
        zzfle.zzh(jSONObject5, "appId", zzfkr.zzb().zza().getApplicationContext().getPackageName());
        zzfle.zzh(jSONObject2, "app", jSONObject5);
        if (zzfkbVar.zzf() != null) {
            zzfle.zzh(jSONObject2, "contentUrl", zzfkbVar.zzf());
        }
        zzfle.zzh(jSONObject2, "customReferenceData", zzfkbVar.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfkbVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfkt.zza().zzg(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView zza() {
        return (WebView) this.a.get();
    }

    public final void zzb() {
        this.b = System.nanoTime();
        this.c = 1;
    }

    public void zzc() {
        this.a.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.b || this.c == 3) {
            return;
        }
        this.c = 3;
        zzfkt.zza().zzf(zza(), str);
    }

    public final void zze(String str, long j) {
        if (j >= this.b) {
            this.c = 2;
            zzfkt.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfkd zzfkdVar, zzfkb zzfkbVar) {
        a(zzfkdVar, zzfkbVar, null);
    }

    public final void zzh(float f) {
        zzfkt.zza().zze(zza(), f);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.a.get() != 0;
    }
}
