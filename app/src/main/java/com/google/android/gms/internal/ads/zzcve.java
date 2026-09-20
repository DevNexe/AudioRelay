package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcve implements zzbty {
    public final Context w;
    public final zzbbi x;
    public final PowerManager y;

    public zzcve(Context context, zzbbi zzbbiVar) {
        this.w = context;
        this.x = zzbbiVar;
        this.y = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcvh zzcvhVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbbl zzbblVar = zzcvhVar.zzf;
        if (zzbblVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbbi zzbbiVar = this.x;
            if (zzbbiVar.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbblVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbbiVar.zzb()).put("activeViewJSON", zzbbiVar.zzd()).put("timestamp", zzcvhVar.zzd).put("adFormat", zzbbiVar.zza()).put("hashCode", zzbbiVar.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcvhVar.zzb).put("isNative", zzbbiVar.zze()).put("isScreenOn", this.y.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzs().zza());
            Context context = this.w;
            jSONObjectPut.put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(context.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeK)).booleanValue()) {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbblVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzbblVar.zzc.top).put("bottom", zzbblVar.zzc.bottom).put("left", zzbblVar.zzc.left).put("right", zzbblVar.zzc.right)).put("adBox", new JSONObject().put("top", zzbblVar.zzd.top).put("bottom", zzbblVar.zzd.bottom).put("left", zzbblVar.zzd.left).put("right", zzbblVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbblVar.zze.top).put("bottom", zzbblVar.zze.bottom).put("left", zzbblVar.zze.left).put("right", zzbblVar.zze.right)).put("globalVisibleBoxVisible", zzbblVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzbblVar.zzg.top).put("bottom", zzbblVar.zzg.bottom).put("left", zzbblVar.zzg.left).put("right", zzbblVar.zzg.right)).put("localVisibleBoxVisible", zzbblVar.zzh).put("hitBox", new JSONObject().put("top", zzbblVar.zzi.top).put("bottom", zzbblVar.zzi.bottom).put("left", zzbblVar.zzi.left).put("right", zzbblVar.zzi.right)).put("screenDensity", context.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcvhVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbblVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcvhVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
