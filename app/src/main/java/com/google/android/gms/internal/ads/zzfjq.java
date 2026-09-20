package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.ft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjq {
    public final zzejx a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final zzfdf f;
    public final zzfdg g;
    public final ft h;
    public final zzapb i;

    public zzfjq(zzejx zzejxVar, zzcgt zzcgtVar, String str, String str2, Context context, zzfdf zzfdfVar, zzfdg zzfdgVar, ft ftVar, zzapb zzapbVar) {
        this.a = zzejxVar;
        this.b = zzcgtVar.zza;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = zzfdfVar;
        this.g = zzfdgVar;
        this.h = ftVar;
        this.i = zzapbVar;
    }

    public static String a(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    public final List zzc(zzfde zzfdeVar, zzfcs zzfcsVar, List list) {
        return zzd(zzfdeVar, zzfcsVar, false, "", "", list);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[SYNTHETIC] */
    public final List zzd(zzfde zzfdeVar, zzfcs zzfcsVar, boolean z, String str, String str2, List list) {
        Uri.Builder builderBuildUpon;
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strA = a(a(a((String) it.next(), "@gw_adlocid@", zzfdeVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.b);
            if (zzfcsVar != null) {
                strA = zzceu.zzc(a(a(a(strA, "@gw_qdata@", zzfcsVar.zzz), "@gw_adnetid@", zzfcsVar.zzy), "@gw_allocid@", zzfcsVar.zzx), this.e, zzfcsVar.zzX);
            }
            String strA2 = a(a(a(strA, "@gw_adnetstatus@", this.a.zzf()), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z2 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcF)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (z2) {
                if (this.i.zzf(Uri.parse(strA2))) {
                    builderBuildUpon = Uri.parse(strA2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strA2 = builderBuildUpon.build().toString();
                }
            } else if (z3) {
                z3 = true;
                if (this.i.zzf(Uri.parse(strA2))) {
                    builderBuildUpon = Uri.parse(strA2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strA2 = builderBuildUpon.build().toString();
                }
            }
            arrayList.add(strA2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:13:0x0059->B:15:0x005f, LOOP_END] */
    public final List zze(zzfcs zzfcsVar, List list, zzcbq zzcbqVar) {
        zzfdf zzfdfVar;
        zzfsb zzfsbVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jB = this.h.b();
        try {
            String strZzc = zzcbqVar.zzc();
            String string = Integer.toString(zzcbqVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcG)).booleanValue()) {
                zzfdg zzfdgVar = this.g;
                if (zzfdgVar == null) {
                    zzfsbVarZzd = zzfsb.zzc();
                } else {
                    zzfdfVar = zzfdgVar.zza;
                }
                str = (String) zzfsbVarZzd.zza(new zzfru() { // from class: com.google.android.gms.internal.ads.zzfjo
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        String str3 = ((zzfdf) obj).zza;
                        if (TextUtils.isEmpty(str3)) {
                            return "";
                        }
                        return zzcgm.zzl() ? "fakeForAdDebugLog" : str3;
                    }
                }).zzb("");
                str2 = (String) zzfsbVarZzd.zza(new zzfru() { // from class: com.google.android.gms.internal.ads.zzfjp
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        String str3 = ((zzfdf) obj).zzb;
                        if (TextUtils.isEmpty(str3)) {
                            return "";
                        }
                        return zzcgm.zzl() ? "fakeForAdDebugLog" : str3;
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzceu.zzc(a(a(a(a(a(a((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jB)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.b), this.e, zzfcsVar.zzX));
                }
                return arrayList;
            }
            zzfdfVar = this.f;
            zzfsbVarZzd = zzfsb.zzd(zzfdfVar);
            str = (String) zzfsbVarZzd.zza(new zzfru() { // from class: com.google.android.gms.internal.ads.zzfjo
                @Override // com.google.android.gms.internal.ads.zzfru
                public final Object apply(Object obj) {
                    String str3 = ((zzfdf) obj).zza;
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    return zzcgm.zzl() ? "fakeForAdDebugLog" : str3;
                }
            }).zzb("");
            str2 = (String) zzfsbVarZzd.zza(new zzfru() { // from class: com.google.android.gms.internal.ads.zzfjp
                @Override // com.google.android.gms.internal.ads.zzfru
                public final Object apply(Object obj) {
                    String str3 = ((zzfdf) obj).zzb;
                    if (TextUtils.isEmpty(str3)) {
                        return "";
                    }
                    return zzcgm.zzl() ? "fakeForAdDebugLog" : str3;
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzceu.zzc(a(a(a(a(a(a((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jB)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.b), this.e, zzfcsVar.zzX));
            }
            return arrayList;
        } catch (RemoteException e) {
            zzcgn.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
