package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.gs5;
import defpackage.gt5;
import defpackage.h06;
import defpackage.ju5;
import defpackage.jy5;
import defpackage.oz5;
import defpackage.sv5;
import defpackage.ux5;
import defpackage.xw5;
import defpackage.yz5;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzau {
    public final zzk a;
    public final zzi b;
    public final zzek c;
    public final zzbnz d;
    public final zzbyx e;
    public final zzboa f;
    public zzcaf g;

    public zzau(zzk zzkVar, zzi zziVar, zzek zzekVar, zzbnz zzbnzVar, zzccv zzccvVar, zzbyx zzbyxVar, zzboa zzboaVar) {
        this.a = zzkVar;
        this.b = zziVar;
        this.c = zzekVar;
        this.d = zzbnzVar;
        this.e = zzbyxVar;
        this.f = zzboaVar;
    }

    public static /* bridge */ /* synthetic */ void a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, zzbvf zzbvfVar) {
        return (zzbo) new jy5(this, context, str, zzbvfVar).d(context, false);
    }

    public final zzbs zzd(Context context, zzq zzqVar, String str, zzbvf zzbvfVar) {
        return (zzbs) new xw5(this, context, zzqVar, str, zzbvfVar).d(context, false);
    }

    public final zzbs zze(Context context, zzq zzqVar, String str, zzbvf zzbvfVar) {
        return (zzbs) new ux5(this, context, zzqVar, str, zzbvfVar).d(context, false);
    }

    public final zzbme zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbme) new oz5(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zzbmk zzh(View view, HashMap map, HashMap map2) {
        return (zzbmk) new yz5(this, view, map, map2).d(view.getContext(), false);
    }

    public final zzbqp zzk(Context context, zzbvf zzbvfVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbqp) new sv5(context, zzbvfVar, onH5AdsEventListener).d(context, false);
    }

    public final zzbyq zzl(Context context, zzbvf zzbvfVar) {
        return (zzbyq) new ju5(context, zzbvfVar).d(context, false);
    }

    public final zzbza zzn(Activity activity) {
        gs5 gs5Var = new gs5(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzcgn.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbza) gs5Var.d(activity, booleanExtra);
    }

    public final zzccj zzp(Context context, String str, zzbvf zzbvfVar) {
        return (zzccj) new h06(context, str, zzbvfVar).d(context, false);
    }

    public final zzcfe zzq(Context context, zzbvf zzbvfVar) {
        return (zzcfe) new gt5(context, zzbvfVar).d(context, false);
    }
}
