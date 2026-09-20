package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxz extends zzbya implements zzbpq {
    public final zzcmn c;
    public final Context d;
    public final WindowManager e;
    public final zzbii f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public zzbxz(zzcmn zzcmnVar, Context context, zzbii zzbiiVar) {
        super(zzcmnVar, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = zzcmnVar;
        this.d = context;
        this.f = zzbiiVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics = this.g;
        this.i = zzcgg.zzu(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = zzcgg.zzu(displayMetrics2, displayMetrics2.heightPixels);
        zzcmn zzcmnVar = this.c;
        Activity activityZzk = zzcmnVar.zzk();
        if (activityZzk == null || activityZzk.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        } else {
            com.google.android.gms.ads.internal.zzt.zzq();
            int[] iArrZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activityZzk);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.l = zzcgg.zzu(this.g, iArrZzN[0]);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.m = zzcgg.zzu(this.g, iArrZzN[1]);
        }
        if (zzcmnVar.zzQ().zzi()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            zzcmnVar.measure(0, 0);
        }
        zzi(this.i, this.j, this.l, this.m, this.h, this.k);
        zzbxy zzbxyVar = new zzbxy();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbii zzbiiVar = this.f;
        zzbxyVar.zze(zzbiiVar.zza(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbxyVar.zzc(zzbiiVar.zza(intent2));
        zzbxyVar.zza(zzbiiVar.zzb());
        zzbxyVar.zzd(zzbiiVar.zzc());
        zzbxyVar.zzb(true);
        boolean z = zzbxyVar.a;
        boolean z2 = zzbxyVar.b;
        boolean z3 = zzbxyVar.c;
        boolean z4 = zzbxyVar.d;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", zzbxyVar.e);
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        zzcmnVar.zze("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcmnVar.getLocationOnScreen(iArr);
        zzcgg zzcggVarZzb = com.google.android.gms.ads.internal.client.zzaw.zzb();
        int i = iArr[0];
        Context context = this.d;
        zzb(zzcggVarZzb.zzb(context, i), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, iArr[1]));
        if (zzcgn.zzm(2)) {
            zzcgn.zzi("Dispatching Ready Event.");
        }
        zzh(zzcmnVar.zzp().zza);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[PHI: r4
  0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.d;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzq();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzO((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzcmn zzcmnVar = this.c;
        if (zzcmnVar.zzQ() == null || !zzcmnVar.zzQ().zzi()) {
            int width = zzcmnVar.getWidth();
            int height = zzcmnVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzP)).booleanValue()) {
                if (width == 0) {
                    width = zzcmnVar.zzQ() != null ? zzcmnVar.zzQ().zzb : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (zzcmnVar.zzQ() != null) {
                    i4 = zzcmnVar.zzQ().zza;
                }
            } else {
                i4 = height;
            }
            this.n = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, width);
            this.o = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(context, i4);
        }
        zzf(i, i2 - i3, this.n, this.o);
        zzcmnVar.zzP().zzA(i, i2);
    }
}
