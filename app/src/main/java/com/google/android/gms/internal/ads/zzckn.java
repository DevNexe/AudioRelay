package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import defpackage.a42;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzckn implements zzbpq {
    public boolean a;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                i = zzcgg.zzw(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcgn.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    public static void b(zzcik zzcikVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcikVar.zzA(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcgn.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcikVar.zzz(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcikVar.zzx(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcikVar.zzy(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcikVar.zzC(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        zzciw zzciwVar = (zzciw) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzcgn.zzj("Action missing from video GMSG.");
            return;
        }
        if (zzcgn.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcgn.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzcgn.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzciwVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzcgn.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzcgn.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzciwVar.zzD(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                zzcgn.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                zzcgn.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzciwVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, com.google.android.gms.ads.internal.util.zzch.zza(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzciwVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcil zzcilVarZzbp = zzciwVar.zzbp();
        if (zzcilVarZzbp == null) {
            zzcgn.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = "new".equals(str);
        boolean zEquals2 = "position".equals(str);
        if (zEquals || zEquals2) {
            Context context = zzciwVar.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            zzbiq zzbiqVar = zzbiy.zzcV;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                iMin = iA3 == -1 ? zzciwVar.zzj() : Math.min(iA3, zzciwVar.zzj());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbA = a42.a("Calculate width with original width ", iA3, ", videoHost.getVideoBoundingWidth() ", zzciwVar.zzj(), ", x ");
                    sbA.append(iA);
                    sbA.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbA.toString());
                }
                iMin = Math.min(iA3, zzciwVar.zzj() - iA);
            }
            int i2 = iMin;
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? zzciwVar.zzi() : Math.min(iA4, zzciwVar.zzi());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbA2 = a42.a("Calculate height with original height ", iA4, ", videoHost.getVideoBoundingHeight() ", zzciwVar.zzi(), ", y ");
                    sbA2.append(iA2);
                    sbA2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbA2.toString());
                }
                iMin2 = Math.min(iA4, zzciwVar.zzi() - iA2);
            }
            int i3 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcilVarZzbp.zza() != null) {
                zzcilVarZzbp.zzb(iA, iA2, i2, i3);
                return;
            }
            zzcilVarZzbp.zzc(iA, iA2, i2, i3, i, z, new zzciv((String) map.get("flags")));
            zzcik zzcikVarZza = zzcilVarZzbp.zza();
            if (zzcikVarZza != null) {
                b(zzcikVarZza, map);
                return;
            }
            return;
        }
        zzcnj zzcnjVarZzs = zzciwVar.zzs();
        if (zzcnjVarZzs != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    zzcgn.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcnjVarZzs.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    zzcgn.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                zzcnjVarZzs.zzu();
                return;
            }
        }
        zzcik zzcikVarZza2 = zzcilVarZzbp.zza();
        if (zzcikVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzciwVar.zzd("onVideoEvent", map5);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzciwVar.getContext();
            int iA5 = a(context2, map, "x", 0);
            int iA6 = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, iA6, 0);
            zzcikVarZza2.zzw(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                zzcgn.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcikVarZza2.zzv((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                zzcgn.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzcikVarZza2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzcikVarZza2.zzq();
            return;
        }
        if ("loadControl".equals(str)) {
            b(zzcikVarZza2, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcikVarZza2.zzr();
                return;
            } else {
                zzcikVarZza2.zzH();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzcikVarZza2.zzt();
            return;
        }
        if ("play".equals(str)) {
            zzcikVarZza2.zzu();
            return;
        }
        if ("show".equals(str)) {
            zzcikVarZza2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            Integer numValueOf = null;
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    zzcgn.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        strArr2[i4] = jSONArray.getString(i4);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    zzcgn.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzciwVar.zzC(numValueOf.intValue());
            }
            zzcikVarZza2.zzD(str8, strArr);
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzciwVar.getContext();
            zzcikVarZza2.zzG(a(context3, map, "dx", 0), a(context3, map, "dy", 0));
            if (this.a) {
                return;
            }
            zzciwVar.zzw();
            this.a = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzcikVarZza2.zzm();
                return;
            } else {
                zzcgn.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            zzcgn.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcikVarZza2.zzF(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            zzcgn.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
