package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbo;
import defpackage.oa1;
import defpackage.sd6;
import defpackage.so5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcdj implements zzcdo {
    public static final List l = Collections.synchronizedList(new ArrayList());
    public static final /* synthetic */ int zzb = 0;

    @GuardedBy("lock")
    public final zzgsi a;

    @GuardedBy("lock")
    public final LinkedHashMap b;
    public final Context e;
    public boolean f;
    public final zzcdl g;

    @GuardedBy("lock")
    public final ArrayList c = new ArrayList();

    @GuardedBy("lock")
    public final ArrayList d = new ArrayList();
    public final Object h = new Object();
    public final HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public zzcdj(Context context, zzcgt zzcgtVar, zzcdl zzcdlVar, String str, zzcdk zzcdkVar, byte[] bArr) {
        if (zzcdlVar == null) {
            throw new NullPointerException("SafeBrowsing config is not present.");
        }
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.g = zzcdlVar;
        Iterator it = zzcdlVar.zze.iterator();
        while (it.hasNext()) {
            this.i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzgsi zzgsiVarZza = zzgtn.zza();
        zzgsiVarZza.zzn(9);
        zzgsiVarZza.zzj(str);
        zzgsiVarZza.zzh(str);
        zzgsj zzgsjVarZza = zzgsk.zza();
        String str2 = this.g.zza;
        if (str2 != null) {
            zzgsjVarZza.zza(str2);
        }
        zzgsiVarZza.zzg((zzgsk) zzgsjVarZza.zzal());
        zzgti zzgtiVarZza = zzgtj.zza();
        zzgtiVarZza.zzc(so5.a(this.e).c());
        String str3 = zzcgtVar.zza;
        if (str3 != null) {
            zzgtiVarZza.zza(str3);
        }
        oa1 oa1Var = oa1.b;
        Context context2 = this.e;
        oa1Var.getClass();
        long jA = oa1.a(context2);
        if (jA > 0) {
            zzgtiVarZza.zzb(jA);
        }
        zzgsiVarZza.zzf((zzgtj) zzgtiVarZza.zzal());
        this.a = zzgsiVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final zzcdl zza() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final void zzd(String str, Map map, int i) {
        synchronized (this.h) {
            if (i == 3) {
                this.k = true;
            }
            if (this.b.containsKey(str)) {
                if (i == 3) {
                    ((zzgtg) this.b.get(str)).zze(zzgtf.zza(3));
                }
                return;
            }
            zzgtg zzgtgVarZzc = zzgth.zzc();
            int iZza = zzgtf.zza(i);
            if (iZza != 0) {
                zzgtgVarZzc.zze(iZza);
            }
            zzgtgVarZzc.zzb(this.b.size());
            zzgtgVarZzc.zzd(str);
            zzgsr zzgsrVarZza = zzgsu.zza();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzgsp zzgspVarZza = zzgsq.zza();
                        zzgspVarZza.zza(zzgnf.zzx(str2));
                        zzgspVarZza.zzb(zzgnf.zzx(str3));
                        zzgsrVarZza.zza((zzgsq) zzgspVarZza.zzal());
                    }
                }
            }
            zzgtgVarZzc.zzc((zzgsu) zzgsrVarZza.zzal());
            this.b.put(str, zzgtgVarZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final void zze() {
        synchronized (this.h) {
            this.b.keySet();
            zzfyx zzfyxVarZzi = zzfyo.zzi(Collections.emptyMap());
            zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzcdg
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    zzgtg zzgtgVar;
                    zzfyx zzfyxVarZzm;
                    zzcdj zzcdjVar = this.zza;
                    Map map = (Map) obj;
                    zzcdjVar.getClass();
                    if (map != null) {
                        try {
                            for (String str : map.keySet()) {
                                JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                                if (jSONArrayOptJSONArray != null) {
                                    synchronized (zzcdjVar.h) {
                                        int length = jSONArrayOptJSONArray.length();
                                        synchronized (zzcdjVar.h) {
                                            try {
                                                zzgtgVar = (zzgtg) zzcdjVar.b.get(str);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (zzgtgVar == null) {
                                            zzcdn.zza("Cannot find the corresponding resource object for " + str);
                                        } else {
                                            for (int i = 0; i < length; i++) {
                                                zzgtgVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                            }
                                            zzcdjVar.f = (length > 0) | zzcdjVar.f;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            if (((Boolean) zzbkv.zzb.zze()).booleanValue()) {
                                zzcgn.zzf("Failed to get SafeBrowsing metadata", e);
                            }
                            return zzfyo.zzh(new Exception("Safebrowsing report transmission failed."));
                        }
                    }
                    if (zzcdjVar.f) {
                        synchronized (zzcdjVar.h) {
                            zzcdjVar.a.zzn(10);
                        }
                    }
                    boolean z = zzcdjVar.f;
                    if (!(z && zzcdjVar.g.zzg) && (!(zzcdjVar.k && zzcdjVar.g.zzf) && (z || !zzcdjVar.g.zzd))) {
                        return zzfyo.zzi(null);
                    }
                    synchronized (zzcdjVar.h) {
                        Iterator it = zzcdjVar.b.values().iterator();
                        while (it.hasNext()) {
                            zzcdjVar.a.zzc((zzgth) ((zzgtg) it.next()).zzal());
                        }
                        zzcdjVar.a.zza(zzcdjVar.c);
                        zzcdjVar.a.zzb(zzcdjVar.d);
                        if (zzcdn.zzb()) {
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzcdjVar.a.zzl() + "\n  clickUrl: " + zzcdjVar.a.zzk() + "\n  resources: \n");
                            for (zzgth zzgthVar : zzcdjVar.a.zzm()) {
                                sb.append("    [");
                                sb.append(zzgthVar.zza());
                                sb.append("] ");
                                sb.append(zzgthVar.zze());
                            }
                            zzcdn.zza(sb.toString());
                        }
                        zzfyx zzfyxVarZzb = new zzbo(zzcdjVar.e).zzb(1, zzcdjVar.g.zzb, null, ((zzgtn) zzcdjVar.a.zzal()).zzaw());
                        if (zzcdn.zzb()) {
                            zzfyxVarZzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcde
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzcdn.zza("Pinged SB successfully.");
                                }
                            }, zzcha.zza);
                        }
                        zzfyxVarZzm = zzfyo.zzm(zzfyxVarZzb, new zzfru() { // from class: com.google.android.gms.internal.ads.zzcdf
                            @Override // com.google.android.gms.internal.ads.zzfru
                            public final Object apply(Object obj2) {
                                List list = zzcdj.l;
                                return null;
                            }
                        }, zzcha.zzf);
                    }
                    return zzfyxVarZzm;
                }
            };
            zzfyy zzfyyVar = zzcha.zzf;
            zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzi, zzfxvVar, zzfyyVar);
            zzfyx zzfyxVarZzo = zzfyo.zzo(zzfyxVarZzn, 10L, TimeUnit.SECONDS, zzcha.zzd);
            zzfyo.zzr(zzfyxVarZzn, new sd6(7, zzfyxVarZzo), zzfyyVar);
            l.add(zzfyxVarZzo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.g.zzc && !this.j) {
            com.google.android.gms.ads.internal.zzt.zzq();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        zzcgn.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzcgn.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        zzcgn.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzcdn.zza("Failed to capture the webview bitmap.");
            } else {
                this.j = true;
                com.google.android.gms.ads.internal.util.zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcdj zzcdjVar = this.zza;
                        Bitmap bitmap2 = bitmap;
                        zzcdjVar.getClass();
                        zzgnc zzgncVarZzt = zzgnf.zzt();
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 0, zzgncVarZzt);
                        synchronized (zzcdjVar.h) {
                            zzgsi zzgsiVar = zzcdjVar.a;
                            zzgsz zzgszVarZza = zzgtb.zza();
                            zzgszVarZza.zza(zzgncVarZzt.zzb());
                            zzgszVarZza.zzb("image/png");
                            zzgszVarZza.zzc(2);
                            zzgsiVar.zzi((zzgtb) zzgszVarZza.zzal());
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final void zzh(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    this.a.zzd();
                } else {
                    this.a.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    public final boolean zzi() {
        return this.g.zzc && !this.j;
    }
}
