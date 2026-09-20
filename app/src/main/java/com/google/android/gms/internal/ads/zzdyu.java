package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xf6;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyu extends zzbqo {
    public final zzdyx w;
    public final zzdys x;
    public final HashMap y = new HashMap();

    public zzdyu(zzdyx zzdyxVar, zzdys zzdysVar) {
        this.w = zzdyxVar;
        this.x = zzdysVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    public static com.google.android.gms.ads.internal.client.zzl L0(Map map) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case "isTestDevice":
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzg(0);
                            break;
                        } else {
                            zzmVar.zzg(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzh(0);
                            break;
                        } else {
                            zzmVar.zzh(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zzmVar.zzf(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zzmVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            zzcgn.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzl zzlVarZza = zzmVar.zza();
        Bundle bundle2 = zzlVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzlVarZza.zzc;
            zzlVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzl(zzlVarZza.zza, zzlVarZza.zzb, bundle2, zzlVarZza.zzd, zzlVarZza.zze, zzlVarZza.zzf, zzlVarZza.zzg, zzlVarZza.zzh, zzlVarZza.zzi, zzlVarZza.zzj, zzlVarZza.zzk, zzlVarZza.zzl, zzlVarZza.zzm, zzlVarZza.zzn, zzlVarZza.zzo, zzlVarZza.zzp, zzlVarZza.zzq, zzlVarZza.zzr, zzlVarZza.zzs, zzlVarZza.zzt, zzlVarZza.zzu, zzlVarZza.zzv, zzlVarZza.zzw, zzlVarZza.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zze() {
        this.y.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf(String str) {
        byte b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhZ)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzq();
            Map mapZzL = com.google.android.gms.ads.internal.util.zzs.zzL(uri);
            String str2 = (String) mapZzL.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzcgn.zze("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            byte b2 = -1;
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b = 1;
            } else {
                b = -1;
            }
            HashMap map = this.y;
            zzdys zzdysVar = this.x;
            if (b == 0) {
                map.clear();
                zzdysVar.zza();
                return;
            }
            if (b == 1) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((xf6) it.next()).zza();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzL.get("obj_id");
            try {
                str3.getClass();
                long j = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            b2 = 2;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            b2 = 5;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            b2 = 4;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            b2 = 0;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            b2 = 1;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            b2 = 6;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            b2 = 3;
                        }
                        break;
                }
                zzdyx zzdyxVar = this.w;
                switch (b2) {
                    case 0:
                        if (map.size() < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzia)).intValue()) {
                            Long lValueOf = Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                String str4 = (String) mapZzL.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdyo zzdyoVarZzb = zzdyxVar.zzb();
                                    zzdyoVarZzb.zzb(j);
                                    zzdyoVarZzb.zza(str4);
                                    map.put(lValueOf, zzdyoVarZzb.zzc().zza());
                                    zzdysVar.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + j + " with ad unit " + str4);
                                } else {
                                    zzcgn.zzj("Could not create H5 ad, missing ad unit id");
                                    zzdysVar.zzi(j);
                                }
                            } else {
                                zzcgn.zze("Could not create H5 ad, object ID already exists");
                                zzdysVar.zzi(j);
                            }
                        } else {
                            zzcgn.zzj("Could not create H5 ad, too many existing objects");
                            zzdysVar.zzi(j);
                        }
                        break;
                    case 1:
                        xf6 xf6Var = (xf6) map.get(Long.valueOf(j));
                        if (xf6Var != null) {
                            xf6Var.zzb(L0(mapZzL));
                        } else {
                            zzcgn.zze("Could not load H5 ad, object ID does not exist");
                            zzdysVar.zzf(j);
                        }
                        break;
                    case 2:
                        xf6 xf6Var2 = (xf6) map.get(Long.valueOf(j));
                        if (xf6Var2 != null) {
                            xf6Var2.zzc();
                        } else {
                            zzcgn.zze("Could not show H5 ad, object ID does not exist");
                            zzdysVar.zzf(j);
                        }
                        break;
                    case 3:
                        if (map.size() < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzia)).intValue()) {
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzL.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdyo zzdyoVarZzb2 = zzdyxVar.zzb();
                                    zzdyoVarZzb2.zzb(j);
                                    zzdyoVarZzb2.zza(str5);
                                    map.put(lValueOf2, zzdyoVarZzb2.zzc().zzb());
                                    zzdysVar.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + j + " with ad unit " + str5);
                                } else {
                                    zzcgn.zzj("Could not create H5 ad, missing ad unit id");
                                    zzdysVar.zzi(j);
                                }
                            } else {
                                zzcgn.zze("Could not create H5 ad, object ID already exists");
                                zzdysVar.zzi(j);
                            }
                        } else {
                            zzcgn.zzj("Could not create H5 ad, too many existing objects");
                            zzdysVar.zzi(j);
                        }
                        break;
                    case 4:
                        xf6 xf6Var3 = (xf6) map.get(Long.valueOf(j));
                        if (xf6Var3 != null) {
                            xf6Var3.zzb(L0(mapZzL));
                        } else {
                            zzcgn.zze("Could not load H5 ad, object ID does not exist");
                            zzdysVar.zzq(j);
                        }
                        break;
                    case 5:
                        xf6 xf6Var4 = (xf6) map.get(Long.valueOf(j));
                        if (xf6Var4 != null) {
                            xf6Var4.zzc();
                        } else {
                            zzcgn.zze("Could not show H5 ad, object ID does not exist");
                            zzdysVar.zzq(j);
                        }
                        break;
                    case 6:
                        Long lValueOf3 = Long.valueOf(j);
                        xf6 xf6Var5 = (xf6) map.get(lValueOf3);
                        if (xf6Var5 != null) {
                            xf6Var5.zza();
                            map.remove(lValueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + j);
                        } else {
                            zzcgn.zze("Could not dispose H5 ad, object ID does not exist");
                        }
                        break;
                    default:
                        zzcgn.zze("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                zzcgn.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
