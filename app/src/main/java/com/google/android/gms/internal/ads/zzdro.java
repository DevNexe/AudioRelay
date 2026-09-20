package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdro {
    public final Context a;
    public final zzdqx b;
    public final zzapb c;
    public final zzcgt d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbel f;
    public final Executor g;
    public final zzblo h;
    public final zzdsg i;
    public final zzduw j;
    public final ScheduledExecutorService k;
    public final zzdtr l;
    public final zzdxo m;
    public final zzfhz n;
    public final zzfju o;
    public final zzefz p;

    public zzdro(Context context, zzdqx zzdqxVar, zzapb zzapbVar, zzcgt zzcgtVar, com.google.android.gms.ads.internal.zza zzaVar, zzbel zzbelVar, Executor executor, zzfdn zzfdnVar, zzdsg zzdsgVar, zzduw zzduwVar, ScheduledExecutorService scheduledExecutorService, zzdxo zzdxoVar, zzfhz zzfhzVar, zzfju zzfjuVar, zzefz zzefzVar, zzdtr zzdtrVar) {
        this.a = context;
        this.b = zzdqxVar;
        this.c = zzapbVar;
        this.d = zzcgtVar;
        this.e = zzaVar;
        this.f = zzbelVar;
        this.g = executor;
        this.h = zzfdnVar.zzi;
        this.i = zzdsgVar;
        this.j = zzduwVar;
        this.k = scheduledExecutorService;
        this.m = zzdxoVar;
        this.n = zzfhzVar;
        this.o = zzfjuVar;
        this.p = zzefzVar;
        this.l = zzdtrVar;
    }

    public static Integer d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final com.google.android.gms.ads.internal.client.zzef e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzef(strOptString, strOptString2);
    }

    public static final com.google.android.gms.ads.internal.client.zzef zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return e(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfuv.zzo();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfuv.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzef zzefVarE = e(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzefVarE != null) {
                arrayList.add(zzefVarE);
            }
        }
        return zzfuv.zzm(arrayList);
    }

    public final zzfyx a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfyo.zzi(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzfyo.zzi(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfyo.zzi(new zzblm(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        zzfyx zzfyxVarZzm = zzfyo.zzm(this.b.zzb(strOptString, dOptDouble, zOptBoolean), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdrm
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str = strOptString;
                return new zzblm(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.g);
        return jSONObject.optBoolean("require") ? zzfyo.zzn(zzfyxVarZzm, new zzdrj(zzfyxVarZzm), zzcha.zzf) : zzfyo.zzg(zzfyxVarZzm, Exception.class, new zzdrl(null), zzcha.zzf);
    }

    public final zzfyx b(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfyo.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(a(jSONArray.optJSONObject(i), z));
        }
        return zzfyo.zzm(zzfyo.zze(arrayList), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdrk
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzblm zzblmVar : (List) obj) {
                    if (zzblmVar != null) {
                        arrayList2.add(zzblmVar);
                    }
                }
                return arrayList2;
            }
        }, this.g);
    }

    public final zzfyx c(JSONObject jSONObject, zzfcs zzfcsVar, zzfcv zzfcvVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString("html");
        int i = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            final zzfyx zzfyxVarZzb = this.i.zzb(strOptString, strOptString2, zzfcsVar, zzfcvVar, zzqVar);
            return zzfyo.zzn(zzfyxVarZzb, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrn
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) throws zzeka {
                    zzfyx zzfyxVar = zzfyxVarZzb;
                    zzcmn zzcmnVar = (zzcmn) obj;
                    if (zzcmnVar == null || zzcmnVar.zzs() == null) {
                        throw new zzeka(1, "Retrieve video view in html5 ad response failed.");
                    }
                    return zzfyxVar;
                }
            }, zzcha.zzf);
        }
        i = iOptInt;
        zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.a, new AdSize(i, iOptInt2));
        final zzfyx zzfyxVarZzb2 = this.i.zzb(strOptString, strOptString2, zzfcsVar, zzfcvVar, zzqVar);
        return zzfyo.zzn(zzfyxVarZzb2, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrn
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws zzeka {
                zzfyx zzfyxVar = zzfyxVarZzb2;
                zzcmn zzcmnVar = (zzcmn) obj;
                if (zzcmnVar == null || zzcmnVar.zzs() == null) {
                    throw new zzeka(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfyxVar;
            }
        }, zzcha.zzf);
    }

    public final zzfyx zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzfyo.zzi(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        zzfyx zzfyxVarZzm = zzfyo.zzm(b(jSONArrayOptJSONArray, false, true), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzdro zzdroVar = this.zza;
                JSONObject jSONObject2 = jSONObjectOptJSONObject;
                List list = (List) obj;
                zzdroVar.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject2.optString("text");
                Integer numD = zzdro.d("bg_color", jSONObject2);
                Integer numD2 = zzdro.d("text_color", jSONObject2);
                int iOptInt = jSONObject2.optInt("text_size", -1);
                boolean zOptBoolean = jSONObject2.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject2.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
                return new zzblj(strOptString, list, numD, numD2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject2.optInt("presentation_ms", 4000) + iOptInt2, zzdroVar.h.zze, zOptBoolean);
            }
        }, this.g);
        return jSONObjectOptJSONObject.optBoolean("require") ? zzfyo.zzn(zzfyxVarZzm, new zzdrj(zzfyxVarZzm), zzcha.zzf) : zzfyo.zzg(zzfyxVarZzm, Exception.class, new zzdrl(null), zzcha.zzf);
    }

    public final zzfyx zze(JSONObject jSONObject, String str) {
        return a(jSONObject.optJSONObject(str), this.h.zzb);
    }

    public final zzfyx zzf(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        zzblo zzbloVar = this.h;
        return b(jSONArrayOptJSONArray, zzbloVar.zzb, zzbloVar.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    public final zzfyx zzg(JSONObject jSONObject, String str, final zzfcs zzfcsVar, final zzfcv zzfcvVar) {
        final com.google.android.gms.ads.internal.client.zzq zzqVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzie)).booleanValue()) {
            return zzfyo.zzi(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfyo.zzi(null);
        }
        int i = 0;
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzfyo.zzi(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        int iOptInt = jSONObjectOptJSONObject.optInt("width", 0);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            if (TextUtils.isEmpty(strOptString2)) {
                return zzfyo.zzi(null);
            }
            final zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrg
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    zzdro zzdroVar = this.zza;
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzqVar;
                    zzfcs zzfcsVar2 = zzfcsVar;
                    zzfcv zzfcvVar2 = zzfcvVar;
                    String str2 = strOptString;
                    String str3 = strOptString2;
                    zzcmn zzcmnVarZza = zzdroVar.j.zza(zzqVar2, zzfcsVar2, zzfcvVar2);
                    final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                    zzdto zzdtoVarZzb = zzdroVar.l.zzb();
                    zzcmnVarZza.zzP().zzL(zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(zzdroVar.a, null, null), null, null, zzdroVar.p, zzdroVar.o, zzdroVar.m, zzdroVar.n, null, zzdtoVarZzb, null);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcQ)).booleanValue()) {
                        zzcmnVarZza.zzaf("/getNativeAdViewSignals", zzbpp.zzs);
                    }
                    zzcmnVarZza.zzaf("/getNativeClickMeta", zzbpp.zzt);
                    zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdri
                        @Override // com.google.android.gms.internal.ads.zzcny
                        public final void zza(boolean z) {
                            zzche zzcheVar = zzcheVarZza;
                            if (z) {
                                zzcheVar.zzb();
                            } else {
                                zzcheVar.zze(new zzeka(1, "Image Web View failed to load."));
                            }
                        }
                    });
                    zzcmnVarZza.zzad(str2, str3, null);
                    return zzcheVarZza;
                }
            }, zzcha.zze);
            return zzfyo.zzn(zzfyxVarZzn, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrh
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) throws zzeka {
                    zzfyx zzfyxVar = zzfyxVarZzn;
                    if (((zzcmn) obj) != null) {
                        return zzfyxVar;
                    }
                    throw new zzeka(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcha.zzf);
        }
        i = iOptInt;
        zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.a, new AdSize(i, iOptInt2));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzfyo.zzi(null);
        }
        final zzfyx zzfyxVarZzn2 = zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrg
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzdro zzdroVar = this.zza;
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzqVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                zzfcv zzfcvVar2 = zzfcvVar;
                String str2 = strOptString;
                String str3 = strOptString2;
                zzcmn zzcmnVarZza = zzdroVar.j.zza(zzqVar2, zzfcsVar2, zzfcvVar2);
                final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                zzdto zzdtoVarZzb = zzdroVar.l.zzb();
                zzcmnVarZza.zzP().zzL(zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(zzdroVar.a, null, null), null, null, zzdroVar.p, zzdroVar.o, zzdroVar.m, zzdroVar.n, null, zzdtoVarZzb, null);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcQ)).booleanValue()) {
                    zzcmnVarZza.zzaf("/getNativeAdViewSignals", zzbpp.zzs);
                }
                zzcmnVarZza.zzaf("/getNativeClickMeta", zzbpp.zzt);
                zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdri
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzche zzcheVar = zzcheVarZza;
                        if (z) {
                            zzcheVar.zzb();
                        } else {
                            zzcheVar.zze(new zzeka(1, "Image Web View failed to load."));
                        }
                    }
                });
                zzcmnVarZza.zzad(str2, str3, null);
                return zzcheVarZza;
            }
        }, zzcha.zze);
        return zzfyo.zzn(zzfyxVarZzn2, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrh
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws zzeka {
                zzfyx zzfyxVar = zzfyxVarZzn2;
                if (((zzcmn) obj) != null) {
                    return zzfyxVar;
                }
                throw new zzeka(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcha.zzf);
    }

    public final zzfyx zzh(JSONObject jSONObject, zzfcs zzfcsVar, zzfcv zzfcvVar) {
        zzfyx zzfyxVarZza;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (jSONObjectZzg != null) {
            return c(jSONObjectZzg, zzfcsVar, zzfcvVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzfyo.zzi(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzid)).booleanValue() && jSONObjectOptJSONObject.has("html");
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                zzfyxVarZza = this.i.zza(jSONObjectOptJSONObject);
            }
            return zzfyo.zzg(zzfyo.zzo(zzfyxVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcR)).intValue(), TimeUnit.SECONDS, this.k), Exception.class, new zzdrl(null), zzcha.zzf);
        }
        if (!z) {
            zzcgn.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzfyo.zzi(null);
        }
        zzfyxVarZza = c(jSONObjectOptJSONObject, zzfcsVar, zzfcvVar);
        return zzfyo.zzg(zzfyo.zzo(zzfyxVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcR)).intValue(), TimeUnit.SECONDS, this.k), Exception.class, new zzdrl(null), zzcha.zzf);
    }
}
