package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqa;
import com.google.android.gms.internal.ads.zzfqb;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzfqo;
import com.google.android.gms.internal.ads.zzfqp;
import com.google.android.gms.internal.ads.zzfrj;
import defpackage.pq2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    public pq2 f;
    public zzcmn c = null;
    public boolean e = false;
    public String a = null;
    public zzfqa d = null;
    public String b = null;

    public final void a(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzcha.zze.execute(new zzu(this, "onError", map));
        }
    }

    public final zzfqp b() {
        zzfqo zzfqoVarZzc = zzfqp.zzc();
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zziM)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                zzfqoVarZzc.zzb(str);
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfqoVarZzc.zza(this.b);
        }
        return zzfqoVarZzc.zzc();
    }

    public final synchronized void zza(zzcmn zzcmnVar, Context context) {
        this.c = zzcmnVar;
        if (!zzk(context)) {
            a("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zzcha.zze.execute(new zzu(this, "on_play_store_bind", map));
    }

    public final void zzb() {
        zzfqa zzfqaVar;
        if (!this.e || (zzfqaVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfqaVar.zza(b(), this.f);
            zzcha.zze.execute(new zzu(this, "onLMDOverlayCollapse", new HashMap()));
        }
    }

    public final void zzc() {
        zzfqa zzfqaVar;
        if (!this.e || (zzfqaVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfpy zzfpyVarZzc = zzfpz.zzc();
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zziM)).booleanValue() || TextUtils.isEmpty(this.b)) {
            String str = this.a;
            if (str != null) {
                zzfpyVarZzc.zzb(str);
            } else {
                a("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfpyVarZzc.zza(this.b);
        }
        zzfqaVar.zzb(zzfpyVarZzc.zzc(), this.f);
    }

    public final void zzg() {
        zzfqa zzfqaVar;
        if (!this.e || (zzfqaVar = this.d) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfqaVar.zzc(b(), this.f);
            zzcha.zze.execute(new zzu(this, "onLMDOverlayExpand", new HashMap()));
        }
    }

    public final void zzj(zzcmn zzcmnVar, zzfqk zzfqkVar) {
        if (zzcmnVar == null) {
            a("adWebview missing", "onLMDShow");
            return;
        }
        this.c = zzcmnVar;
        if (!this.e && !zzk(zzcmnVar.getContext())) {
            a("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzay.zzc().zzb(zzbiy.zziM)).booleanValue()) {
            this.b = zzfqkVar.zzg();
        }
        if (this.f == null) {
            this.f = new pq2(this);
        }
        zzfqa zzfqaVar = this.d;
        if (zzfqaVar != null) {
            zzfqaVar.zzd(zzfqkVar, this.f);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfrj.zza(context)) {
            return false;
        }
        try {
            this.d = zzfqb.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.d == null) {
            this.e = false;
            return false;
        }
        if (this.f == null) {
            this.f = new pq2(this);
        }
        this.e = true;
        return true;
    }
}
