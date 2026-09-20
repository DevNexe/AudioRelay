package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcko implements zzbpq {
    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzciw zzciwVar = (zzciw) obj;
        zzcnj zzcnjVarZzs = zzciwVar.zzs();
        if (zzcnjVarZzs == null) {
            try {
                zzcnj zzcnjVar = new zzcnj(zzciwVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzciwVar.zzE(zzcnjVar);
                zzcnjVarZzs = zzcnjVar;
            } catch (NullPointerException e) {
                e = e;
                zzcgn.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzcgn.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        if (i < 0 || i > 3) {
            i = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcgn.zzm(3)) {
            zzcgn.zze("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i + " , aspectRatio : " + str);
        }
        zzcnjVarZzs.zzc(f2, f, i, zEquals, f3);
    }
}
