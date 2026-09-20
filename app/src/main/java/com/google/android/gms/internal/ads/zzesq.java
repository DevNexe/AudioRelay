package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesq implements zzeun {
    public final zzfyy a;
    public final zzfdn b;
    public final PackageInfo c;
    public final zzg d;

    public zzesq(zzfyy zzfyyVar, zzfdn zzfdnVar, PackageInfo packageInfo, zzg zzgVar) {
        this.a = zzfyyVar;
        this.b = zzfdnVar;
        this.c = packageInfo;
        this.d = zzgVar;
    }

    public static /* synthetic */ zzesr zzc(final zzesq zzesqVar) {
        final ArrayList arrayList = zzesqVar.b.zzg;
        if (arrayList == null) {
            return new zzesr() { // from class: com.google.android.gms.internal.ads.zzesm
                @Override // com.google.android.gms.internal.ads.zzeum
                public final void zzf(Object obj) {
                }
            };
        }
        return arrayList.isEmpty() ? new zzesr() { // from class: com.google.android.gms.internal.ads.zzesn
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzesr() { // from class: com.google.android.gms.internal.ads.zzeso
            /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                String str;
                JSONArray jSONArrayOptJSONArray;
                String str2;
                zzesq zzesqVar2 = this.zza;
                ArrayList<String> arrayList2 = arrayList;
                Bundle bundle = (Bundle) obj;
                zzesqVar2.getClass();
                bundle.putInt("native_version", 3);
                bundle.putStringArrayList("native_templates", arrayList2);
                zzfdn zzfdnVar = zzesqVar2.b;
                bundle.putStringArrayList("native_custom_templates", zzfdnVar.zzh);
                String str3 = "landscape";
                if (zzfdnVar.zzi.zza > 3) {
                    bundle.putBoolean("enable_native_media_orientation", true);
                    int i = zzfdnVar.zzi.zzh;
                    if (i == 1) {
                        str2 = "any";
                    } else if (i == 2) {
                        str2 = "landscape";
                    } else if (i != 3) {
                        str2 = i != 4 ? "unknown" : "square";
                    } else {
                        str2 = "portrait";
                    }
                    if (!"unknown".equals(str2)) {
                        bundle.putString("native_media_orientation", str2);
                    }
                }
                int i2 = zzfdnVar.zzi.zzc;
                if (i2 == 0) {
                    str3 = "any";
                } else if (i2 == 1) {
                    str3 = "portrait";
                } else if (i2 != 2) {
                    str3 = "unknown";
                }
                if (!"unknown".equals(str3)) {
                    bundle.putString("native_image_orientation", str3);
                }
                bundle.putBoolean("native_multiple_images", zzfdnVar.zzi.zzd);
                bundle.putBoolean("use_custom_mute", zzfdnVar.zzi.zzg);
                PackageInfo packageInfo = zzesqVar2.c;
                int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
                zzg zzgVar = zzesqVar2.d;
                if (i3 > zzgVar.zza()) {
                    zzgVar.zzs();
                    zzgVar.zzv(i3);
                }
                JSONObject jSONObjectZzp = zzgVar.zzp();
                String string = (jSONObjectZzp == null || (jSONArrayOptJSONArray = jSONObjectZzp.optJSONArray(zzfdnVar.zzf)) == null) ? null : jSONArrayOptJSONArray.toString();
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString("native_advanced_settings", string);
                }
                int i4 = zzfdnVar.zzk;
                if (i4 > 1) {
                    bundle.putInt("max_num_ads", i4);
                }
                zzbrx zzbrxVar = zzfdnVar.zzb;
                if (zzbrxVar != null) {
                    if (TextUtils.isEmpty(zzbrxVar.zzc)) {
                        if (zzbrxVar.zza >= 2) {
                            int i5 = zzbrxVar.zzd;
                            if (i5 == 2 || i5 != 3) {
                                str = "l";
                            } else {
                                str = "p";
                            }
                        } else {
                            int i6 = zzbrxVar.zzb;
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    zzcgn.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                                } else {
                                    str = "p";
                                }
                            }
                            str = "l";
                        }
                        bundle.putString("ia_var", str);
                    } else {
                        bundle.putString("ad_tag", zzbrxVar.zzc);
                    }
                    bundle.putBoolean("instr", true);
                }
                if (zzfdnVar.zza() != null) {
                    bundle.putBoolean("has_delayed_banner_listener", true);
                }
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesq.zzc(this.zza);
            }
        });
    }
}
