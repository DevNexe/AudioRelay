package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzbzy;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdii;
import com.google.android.gms.internal.ads.zzdtl;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzfdl;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyf;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfyy;
import defpackage.cd7;
import defpackage.lc7;
import defpackage.n05;
import defpackage.ta2;
import defpackage.vc7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends zzcfd {
    public static final ArrayList Y = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList Z = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList a0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList b0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    public final zzfyy B;
    public final ScheduledExecutorService C;
    public zzbzy D;
    public final zzc H;
    public final zzdxt I;
    public final zzfju J;
    public final zzcgt R;
    public String S;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public final ArrayList X;
    public final zzcok w;
    public Context x;
    public final zzapb y;
    public final zzfej z;
    public zzdxj A = null;
    public Point E = new Point();
    public Point F = new Point();
    public final Set G = Collections.newSetFromMap(new WeakHashMap());
    public final AtomicInteger Q = new AtomicInteger(0);
    public final boolean K = ((Boolean) zzay.zzc().zzb(zzbiy.zzgm)).booleanValue();
    public final boolean L = ((Boolean) zzay.zzc().zzb(zzbiy.zzgl)).booleanValue();
    public final boolean M = ((Boolean) zzay.zzc().zzb(zzbiy.zzgn)).booleanValue();
    public final boolean N = ((Boolean) zzay.zzc().zzb(zzbiy.zzgp)).booleanValue();
    public final String O = (String) zzay.zzc().zzb(zzbiy.zzgo);
    public final String P = (String) zzay.zzc().zzb(zzbiy.zzgq);
    public final String T = (String) zzay.zzc().zzb(zzbiy.zzgr);

    public zzaa(zzcok zzcokVar, Context context, zzapb zzapbVar, zzfej zzfejVar, zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, zzdxt zzdxtVar, zzfju zzfjuVar, zzcgt zzcgtVar) {
        ArrayList arrayListS0;
        this.w = zzcokVar;
        this.x = context;
        this.y = zzapbVar;
        this.z = zzfejVar;
        this.B = zzfyyVar;
        this.C = scheduledExecutorService;
        this.H = zzcokVar.zzm();
        this.I = zzdxtVar;
        this.J = zzfjuVar;
        this.R = zzcgtVar;
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzgs)).booleanValue()) {
            this.U = S0((String) zzay.zzc().zzb(zzbiy.zzgt));
            this.V = S0((String) zzay.zzc().zzb(zzbiy.zzgu));
            this.W = S0((String) zzay.zzc().zzb(zzbiy.zzgv));
            arrayListS0 = S0((String) zzay.zzc().zzb(zzbiy.zzgw));
        } else {
            this.U = Y;
            this.V = Z;
            this.W = a0;
            arrayListS0 = b0;
        }
        this.X = arrayListS0;
    }

    public static /* bridge */ /* synthetic */ void L0(final zzaa zzaaVar, final String str, final String str2, final zzdxj zzdxjVar) {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzfX)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzgd)).booleanValue()) {
                zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaa zzaaVar2 = this.zza;
                        zzaaVar2.H.zzd(str, str2, zzdxjVar);
                    }
                });
            } else {
                zzaaVar.H.zzd(str, str2, zzdxjVar);
            }
        }
    }

    public static boolean Q0(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (path.contains((String) it.next())) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (host.endsWith((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Uri R0(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    public static final ArrayList S0(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfsu.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfjc T0(zzfyx zzfyxVar, zzcfi zzcfiVar) {
        if (!zzfje.zza() || !((Boolean) zzbkh.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfjc zzfjcVarZzb = ((zzh) zzfyo.zzp(zzfyxVar)).zzb();
            zzfjcVarZzb.zzd(new ArrayList(Collections.singletonList(zzcfiVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcfiVar.zzd;
            zzfjcVarZzb.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzfjcVarZzb;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public final zzh M0(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        byte b;
        zzfdl zzfdlVar = new zzfdl();
        zzbiq zzbiqVar = zzbiy.zzgy;
        if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
            if ("REWARDED".equals(str2)) {
                zzfdlVar.zzo().zza(2);
            } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
                zzfdlVar.zzo().zza(3);
            }
        }
        zzg zzgVarZzn = this.w.zzn();
        zzdci zzdciVar = new zzdci();
        zzdciVar.zzc(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfdlVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfdlVar.zzE(zzlVar);
        if (zzqVar == null) {
            if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                switch (str2) {
                    case "NATIVE":
                        b = 3;
                        break;
                    case "REWARDED":
                        b = 1;
                        break;
                    case "REWARDED_INTERSTITIAL":
                        b = 2;
                        break;
                    case "BANNER":
                        b = 0;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
                } else if (b == 1 || b == 2) {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                } else {
                    zzqVar = b != 3 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzc();
                }
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq();
            }
        }
        zzfdlVar.zzr(zzqVar);
        zzfdlVar.zzx(true);
        zzdciVar.zzf(zzfdlVar.zzG());
        zzgVarZzn.zza(zzdciVar.zzg());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzgVarZzn.zzb(new zzae(zzacVar));
        new zzdii();
        zzh zzhVarZzc = zzgVarZzn.zzc();
        this.A = zzhVarZzc.zza();
        return zzhVarZzc;
    }

    public final zzfyx N0(final String str) {
        final zzdtl[] zzdtlVarArr = new zzdtl[1];
        zzfyx zzfyxVarZza = this.z.zza();
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws JSONException {
                zzaa zzaaVar = this.zza;
                zzdtl[] zzdtlVarArr2 = zzdtlVarArr;
                String str2 = str;
                zzdtl zzdtlVar = (zzdtl) obj;
                zzaaVar.getClass();
                zzdtlVarArr2[0] = zzdtlVar;
                Context context = zzaaVar.x;
                zzbzy zzbzyVar = zzaaVar.D;
                Map map = zzbzyVar.zzb;
                JSONObject jSONObjectZzd = zzbx.zzd(context, map, map, zzbzyVar.zza);
                JSONObject jSONObjectZzg = zzbx.zzg(zzaaVar.x, zzaaVar.D.zza);
                JSONObject jSONObjectZzf = zzbx.zzf(zzaaVar.D.zza);
                JSONObject jSONObjectZze = zzbx.zze(zzaaVar.x, zzaaVar.D.zza);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectZzd);
                jSONObject.put("ad_view_signal", jSONObjectZzg);
                jSONObject.put("scroll_view_signal", jSONObjectZzf);
                jSONObject.put("lock_screen_signal", jSONObjectZze);
                if (str2 == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
                    jSONObject.put("click_signal", zzbx.zzc(null, zzaaVar.x, zzaaVar.F, zzaaVar.E));
                }
                return zzdtlVar.zzd(str2, jSONObject);
            }
        };
        zzfyy zzfyyVar = this.B;
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZza, zzfxvVar, zzfyyVar);
        zzfyxVarZzn.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa zzaaVar = this.zza;
                zzdtl[] zzdtlVarArr2 = zzdtlVarArr;
                zzaaVar.getClass();
                zzdtl zzdtlVar = zzdtlVarArr2[0];
                if (zzdtlVar != null) {
                    zzaaVar.z.zzb(zzfyo.zzi(zzdtlVar));
                }
            }
        }, zzfyyVar);
        return zzfyo.zzf(zzfyo.zzm((zzfyf) zzfyo.zzo(zzfyf.zzv(zzfyxVarZzn), ((Integer) zzay.zzc().zzb(zzbiy.zzgC)).intValue(), TimeUnit.MILLISECONDS, this.C), new zzfru() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                ArrayList arrayList = zzaa.Y;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzfyyVar), Exception.class, new zzfru() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                ArrayList arrayList = zzaa.Y;
                zzcgn.zzh("", (Exception) obj);
                return null;
            }
        }, zzfyyVar);
    }

    public final void O0(List list, final IObjectWrapper iObjectWrapper, zzbzp zzbzpVar, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        zzfyx zzfyxVarZzn;
        Map map;
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzgB)).booleanValue()) {
            zzcgn.zzj("The updating URL feature is not enabled.");
            try {
                zzbzpVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcgn.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.V;
            arrayList2 = this.U;
            if (!zHasNext) {
                break;
            } else if (Q0((Uri) it.next(), arrayList2, arrayList)) {
                i++;
            }
        }
        if (i > 1) {
            zzcgn.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (Q0(uri, arrayList2, arrayList)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        zzaa zzaaVar = this.zza;
                        Uri uriZza = uri;
                        IObjectWrapper iObjectWrapper2 = iObjectWrapper;
                        zzaaVar.getClass();
                        try {
                            uriZza = zzaaVar.y.zza(uriZza, zzaaVar.x, (View) ObjectWrapper.M0(iObjectWrapper2), null);
                        } catch (zzapc e2) {
                            zzcgn.zzk("", e2);
                        }
                        if (uriZza.getQueryParameter("ms") != null) {
                            return uriZza;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                zzfyy zzfyyVar = this.B;
                zzfyx zzfyxVarZzb = zzfyyVar.zzb(callable);
                zzbzy zzbzyVar = this.D;
                if ((zzbzyVar == null || (map = zzbzyVar.zzb) == null || map.isEmpty()) ? false : true) {
                    zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzb, new zzfxv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfxv
                        public final zzfyx zza(Object obj) {
                            zzaa zzaaVar = this.zza;
                            return zzfyo.zzm(zzaaVar.N0("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfru() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfru
                                public final Object apply(Object obj2) {
                                    Uri uri2 = uri;
                                    String str = (String) obj2;
                                    ArrayList arrayList4 = zzaa.Y;
                                    return !TextUtils.isEmpty(str) ? zzaa.R0(uri2, "nas", str) : uri2;
                                }
                            }, zzaaVar.B);
                        }
                    }, zzfyyVar);
                } else {
                    zzcgn.zzi("Asset view map is empty.");
                    zzfyxVarZzn = zzfyxVarZzb;
                }
            } else {
                zzcgn.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzfyxVarZzn = zzfyo.zzi(uri);
            }
            arrayList3.add(zzfyxVarZzn);
        }
        zzfyo.zzr(zzfyo.zze(arrayList3), new cd7(this, zzbzpVar, z), this.w.zzA());
    }

    public final void P0(final List list, final IObjectWrapper iObjectWrapper, zzbzp zzbzpVar, boolean z) {
        Map map;
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzgB)).booleanValue()) {
            try {
                zzbzpVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcgn.zzh("", e);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzaa zzaaVar = this.zza;
                List<Uri> list2 = list;
                IObjectWrapper iObjectWrapper2 = iObjectWrapper;
                zzapb zzapbVar = zzaaVar.y;
                String strZzh = zzapbVar.zzc() != null ? zzapbVar.zzc().zzh(zzaaVar.x, (View) ObjectWrapper.M0(iObjectWrapper2), null) : "";
                if (TextUtils.isEmpty(strZzh)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list2) {
                    if (zzaa.Q0(uri, zzaaVar.W, zzaaVar.X)) {
                        arrayList.add(zzaa.R0(uri, "ms", strZzh));
                    } else {
                        zzcgn.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            }
        };
        zzfyy zzfyyVar = this.B;
        zzfyx zzfyxVarZzb = zzfyyVar.zzb(callable);
        zzbzy zzbzyVar = this.D;
        if ((zzbzyVar == null || (map = zzbzyVar.zzb) == null || map.isEmpty()) ? false : true) {
            zzfyxVarZzb = zzfyo.zzn(zzfyxVarZzb, new zzfxv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    final zzaa zzaaVar = this.zza;
                    final ArrayList arrayList = (ArrayList) obj;
                    return zzfyo.zzm(zzaaVar.N0("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfru() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                        @Override // com.google.android.gms.internal.ads.zzfru
                        public final Object apply(Object obj2) {
                            zzaa zzaaVar2 = zzaaVar;
                            List<Uri> list2 = arrayList;
                            String str = (String) obj2;
                            zzaaVar2.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : list2) {
                                if (!zzaa.Q0(uri, zzaaVar2.W, zzaaVar2.X) || TextUtils.isEmpty(str)) {
                                    arrayList2.add(uri);
                                } else {
                                    arrayList2.add(zzaa.R0(uri, "nas", str));
                                }
                            }
                            return arrayList2;
                        }
                    }, zzaaVar.B);
                }
            }, zzfyyVar);
        } else {
            zzcgn.zzi("Asset view map is empty.");
        }
        zzfyo.zzr(zzfyxVarZzb, new vc7(this, zzbzpVar, z), this.w.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, final zzcfi zzcfiVar, zzcfb zzcfbVar) {
        zzfyx zzfyxVarZzi;
        zzfyx zzfyxVarZzc;
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        this.x = context;
        zzfir zzfirVarZza = zzfiq.zza(context, 22);
        zzfirVarZza.zzf();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zziB)).booleanValue()) {
            zzfyy zzfyyVar = zzcha.zza;
            zzfyxVarZzi = zzfyyVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzaa zzaaVar = this.zza;
                    zzcfi zzcfiVar2 = zzcfiVar;
                    return zzaaVar.M0(zzaaVar.x, zzcfiVar2.zza, zzcfiVar2.zzb, zzcfiVar2.zzc, zzcfiVar2.zzd);
                }
            });
            zzfyxVarZzc = zzfyo.zzn(zzfyxVarZzi, new zzfxv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzfyyVar);
        } else {
            zzh zzhVarM0 = M0(this.x, zzcfiVar.zza, zzcfiVar.zzb, zzcfiVar.zzc, zzcfiVar.zzd);
            zzfyxVarZzi = zzfyo.zzi(zzhVarM0);
            zzfyxVarZzc = zzhVarM0.zzc();
        }
        zzfyo.zzr(zzfyxVarZzc, new lc7(this, zzfyxVarZzi, zzcfiVar, zzcfbVar, zzfirVarZza, com.google.android.gms.ads.internal.zzt.zzB().b()), this.w.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzf(zzbzy zzbzyVar) {
        this.D = zzbzyVar;
        this.z.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        O0(list, iObjectWrapper, zzbzpVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        P0(list, iObjectWrapper, zzbzpVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzhV)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zzhW)).booleanValue()) {
                zzfyo.zzr(((Boolean) zzay.zzc().zzb(zzbiy.zziB)).booleanValue() ? zzfyo.zzl(new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final zzfyx zza() {
                        zzaa zzaaVar = this.zza;
                        return zzaaVar.M0(zzaaVar.x, null, AdFormat.BANNER.name(), null, null).zzc();
                    }
                }, zzcha.zza) : M0(this.x, null, AdFormat.BANNER.name(), null, null).zzc(), new ta2(this, 9), this.w.zzA());
            }
            WebView webView = (WebView) ObjectWrapper.M0(iObjectWrapper);
            if (webView == null) {
                zzcgn.zzg("The webView cannot be null.");
                return;
            }
            Set set = this.G;
            if (set.contains(webView)) {
                zzcgn.zzi("This webview has already been registered.");
            } else {
                set.add(webView);
                webView.addJavascriptInterface(new n05(webView, this.y, this.I), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzgB)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.M0(iObjectWrapper);
            zzbzy zzbzyVar = this.D;
            this.E = zzbx.zza(motionEvent, zzbzyVar == null ? null : zzbzyVar.zza);
            if (motionEvent.getAction() == 0) {
                this.F = this.E;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.E;
            motionEventObtain.setLocation(point.x, point.y);
            this.y.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        O0(list, iObjectWrapper, zzbzpVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        P0(list, iObjectWrapper, zzbzpVar, false);
    }
}
