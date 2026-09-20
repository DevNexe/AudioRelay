package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.f56;
import defpackage.g56;
import defpackage.hq2;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqb implements zzbpq {
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzdxo b;
    public final zzfhz c;
    public final zzbxu e;
    public final zzefz f;
    public com.google.android.gms.ads.internal.overlay.zzx g = null;
    public final zzcgs d = new zzcgs(null);

    public zzbqb(com.google.android.gms.ads.internal.zzb zzbVar, zzbxu zzbxuVar, zzefz zzefzVar, zzdxo zzdxoVar, zzfhz zzfhzVar) {
        this.a = zzbVar;
        this.e = zzbxuVar;
        this.f = zzefzVar;
        this.b = zzdxoVar;
        this.c = zzfhzVar;
    }

    public static Uri a(Context context, zzapb zzapbVar, Uri uri, View view, Activity activity) {
        if (zzapbVar == null) {
            return uri;
        }
        try {
            return zzapbVar.zze(uri) ? zzapbVar.zza(uri, context, view, activity) : uri;
        } catch (zzapc unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri b(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcgn.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    public final void c(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        boolean z3 = true;
        d(true);
        zzcmn zzcmnVar = (zzcmn) zzaVar;
        Context context = zzcmnVar.getContext();
        zzapb zzapbVarZzK = zzcmnVar.zzK();
        View viewZzH = zzcmnVar.zzH();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intentZzb = null;
        Uri uriBuild = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri uriB = b(a(context, zzapbVarZzK, Uri.parse(str2), viewZzH, null));
            boolean z4 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdC)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriB.getScheme())) {
                uriBuild = uriB.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriB.getScheme())) {
                uriBuild = uriB.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent intentZza = zzbqa.zza(uriB, context, zzapbVarZzK, viewZzH);
            Intent intentZza2 = zzbqa.zza(uriBuild, context, zzapbVarZzK, viewZzH);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, intentZza2);
            }
            ResolveInfo resolveInfoZzd = zzbqa.zzd(intentZza, arrayList, context, zzapbVarZzK, viewZzH);
            if (resolveInfoZzd != null) {
                intentZzb = zzbqa.zzb(intentZza, resolveInfoZzd, context, zzapbVarZzK, viewZzH);
            } else if (intentZza2 != null && (resolveInfoZzc = zzbqa.zzc(intentZza2, context, zzapbVarZzK, viewZzH)) != null) {
                intentZzb = zzbqa.zzb(intentZza, resolveInfoZzc, context, zzapbVarZzK, viewZzH);
                if (zzbqa.zzc(intentZzb, context, zzapbVarZzK, viewZzH) == null) {
                    if (arrayList.size() != 0) {
                        intentZzb = intentZza;
                    } else if (!z5) {
                        if (z4) {
                            intentZzb = zzbqa.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzapbVarZzK, viewZzH);
                        } else {
                            intentZzb = intentZza;
                        }
                    } else if (z4) {
                        intentZzb = zzbqa.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzapbVarZzK, viewZzH);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (arrayList.size() != 0) {
                intentZzb = intentZza;
            } else if (!z5 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (!it.hasNext()) {
                                i = i2;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentZzb = zzbqa.zzb(intentZza, resolveInfo, context, zzapbVarZzK, viewZzH);
                            }
                        }
                    } else if (z4) {
                        intentZzb = zzbqa.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzapbVarZzK, viewZzH);
                    } else {
                        intentZzb = intentZza;
                    }
                }
            } else if (z4) {
                intentZzb = zzbqa.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzapbVarZzK, viewZzH);
            } else {
                intentZzb = intentZza;
            }
        }
        if (!z || this.f == null || intentZzb == null || !e(zzaVar, zzcmnVar.getContext(), intentZzb.getData().toString(), str)) {
            try {
                ((zzcns) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intentZzb, this.g), z2);
            } catch (ActivityNotFoundException e) {
                zzcgn.zzj(e.getMessage());
            }
        }
    }

    public final void d(boolean z) {
        zzbxu zzbxuVar = this.e;
        if (zzbxuVar != null) {
            zzbxuVar.zza(z);
        }
    }

    public final boolean e(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zZzv = com.google.android.gms.ads.internal.zzt.zzp().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzq();
        zzbr zzbrVarZzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdxo zzdxoVar = this.b;
        if (zzdxoVar != null) {
            zzegh.zzc(context, zzdxoVar, this.c, this.f, str2, "offline_open");
        }
        zzcmn zzcmnVar = (zzcmn) zzaVar;
        boolean z = zzcmnVar.zzQ().zzi() && zzcmnVar.zzk() == null;
        zzefz zzefzVar = this.f;
        if (zZzv) {
            zzefzVar.zzh(this.d, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (new hq2(context).a() && zzbrVarZzw != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhf)).booleanValue()) {
                if (zzcmnVar.zzQ().zzi()) {
                    zzegh.zzh(zzcmnVar.zzk(), null, zzbrVarZzw, this.f, this.b, this.c, str2, str);
                } else {
                    ((zzcns) zzaVar).zzaG(zzbrVarZzw, this.f, this.b, this.c, str2, str, 14);
                }
                if (zzdxoVar != 0) {
                    zzegh.zzc(context, zzdxoVar, this.c, this.f, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        zzefzVar.zzc(str2);
        if (zzdxoVar != null) {
            HashMap map = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzq();
            if (!new hq2(context).a()) {
                map.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzbrVarZzw == null) {
                map.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhf)).booleanValue()) {
                    map.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    map.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzegh.zzd(context, this.b, this.c, this.f, str2, "dialog_not_shown", map);
        }
        return false;
    }

    public final void f(int i) {
        zzdxo zzdxoVar = this.b;
        if (zzdxoVar == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue()) {
            zzfhy zzfhyVarZzb = zzfhy.zzb("cct_action");
            zzfhyVarZzb.zza("cct_open_status", zzbjv.zza(i));
            this.c.zzb(zzfhyVarZzb);
        } else {
            zzdxn zzdxnVarZza = zzdxoVar.zza();
            zzdxnVarZza.zzb("action", "cct_action");
            zzdxnVarZza.zzb("cct_open_status", zzbjv.zza(i));
            zzdxnVarZza.zzg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0308  */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    @Override // com.google.android.gms.internal.ads.zzbpq
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        Intent uri;
        Object obj;
        zzcmn zzcmnVar = (zzcmn) zzaVar;
        String strZzc = zzceu.zzc((String) map.get("u"), zzcmnVar.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzcgn.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.a;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(strZzc);
            return;
        }
        zzfcs zzfcsVarZzF = zzcmnVar.zzF();
        zzfcv zzfcvVarZzR = zzcmnVar.zzR();
        boolean z2 = false;
        if (zzfcsVarZzF == null || zzfcvVarZzR == null) {
            str = "";
            z = false;
        } else {
            boolean z3 = zzfcsVarZzF.zzak;
            str = zzfcvVarZzR.zzb;
            z = z3;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzio)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcmnVar.zzaC()) {
                zzcgn.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                d(false);
                ((zzcns) zzaVar).zzaH(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            d(false);
            if (strZzc != null) {
                ((zzcns) zzaVar).zzaI(zzf(map), zzb(map), strZzc, z4);
                return;
            } else {
                ((zzcns) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        boolean z5 = z4;
        boolean zEqualsIgnoreCase = "chrome_custom_tab".equalsIgnoreCase(str2);
        zzefz zzefzVar = this.f;
        if (zEqualsIgnoreCase) {
            Context context = zzcmnVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdE)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdK)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdI)).booleanValue()) {
                        z2 = true;
                        break;
                    }
                    String str3 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdJ);
                    if (!str3.isEmpty() && context != null) {
                        String packageName = context.getPackageName();
                        Iterator it = zzfss.zzc(zzfrr.zzc(';')).zzd(str3).iterator();
                        while (it.hasNext()) {
                            if (((String) it.next()).equals(packageName)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
            }
            boolean zZzg = zzbjw.zzg(zzcmnVar.getContext());
            if (z2) {
                if (zZzg) {
                    d(true);
                    if (TextUtils.isEmpty(strZzc)) {
                        zzcgn.zzj("Cannot open browser with null or empty url");
                        f(7);
                        return;
                    }
                    Uri uriB = b(a(zzcmnVar.getContext(), zzcmnVar.zzK(), Uri.parse(strZzc), zzcmnVar.zzH(), zzcmnVar.zzk()));
                    if (z && zzefzVar != null && e(zzaVar, zzcmnVar.getContext(), uriB.toString(), str)) {
                        return;
                    }
                    this.g = new f56(this);
                    ((zzcns) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, uriB.toString(), null, null, null, null, null, null, new ObjectWrapper(this.g), true), z5);
                    return;
                }
                f(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            c(zzaVar, map, z, str, z5);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            c(zzaVar, map, z, str, z5);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgX)).booleanValue()) {
                d(true);
                String str4 = (String) map.get("p");
                if (str4 == null) {
                    zzcgn.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && zzefzVar != null && e(zzaVar, zzcmnVar.getContext(), str4, str)) {
                    return;
                }
                PackageManager packageManager = zzcmnVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcgn.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                if (launchIntentForPackage != null) {
                    ((zzcns) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.g), z5);
                    return;
                }
                return;
            }
            return;
        }
        d(true);
        String str5 = (String) map.get("intent_url");
        if (TextUtils.isEmpty(str5)) {
            uri = null;
        } else {
            try {
                uri = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e) {
                zzcgn.zzh("Error parsing the url: ".concat(String.valueOf(str5)), e);
                uri = null;
            }
        }
        if (uri == null || uri.getData() == null) {
            obj = "p";
        } else {
            Uri data = uri.getData();
            if (Uri.EMPTY.equals(data)) {
                obj = "p";
            } else {
                obj = "p";
                Uri uriB2 = b(a(zzcmnVar.getContext(), zzcmnVar.zzK(), data, zzcmnVar.zzH(), zzcmnVar.zzk()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriB2);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgY)).booleanValue()) {
                        uri.setDataAndType(uriB2, uri.getType());
                    } else {
                        uri.setData(uriB2);
                    }
                }
            }
        }
        boolean z6 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhj)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map2 = new HashMap();
        if (z6) {
            this.g = new g56(z5, zzaVar, map2, map);
            z5 = false;
        }
        if (uri != null) {
            if (!z || zzefzVar == null || !e(zzaVar, zzcmnVar.getContext(), uri.getData().toString(), str)) {
                ((zzcns) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(uri, this.g), z5);
                return;
            } else {
                if (z6) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbsi) zzaVar).zzd("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        if (!TextUtils.isEmpty(strZzc)) {
            strZzc = b(a(zzcmnVar.getContext(), zzcmnVar.zzK(), Uri.parse(strZzc), zzcmnVar.zzH(), zzcmnVar.zzk())).toString();
        }
        if (!z || zzefzVar == null || !e(zzaVar, zzcmnVar.getContext(), strZzc, str)) {
            ((zzcns) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), strZzc, (String) map.get("m"), (String) map.get(obj), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.g), z5);
        } else if (z6) {
            map2.put((String) map.get("event_id"), Boolean.TRUE);
            ((zzbsi) zzaVar).zzd("openIntentAsync", map2);
        }
    }
}
