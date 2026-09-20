package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import defpackage.ki6;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeri implements zzeun {
    public final Context a;
    public final zzfyy b;

    public zzeri(Context context, zzfyy zzfyyVar) {
        this.a = context;
        this.b = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeri zzeriVar = this.zza;
                zzeriVar.getClass();
                com.google.android.gms.ads.internal.zzt.zzq();
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfc)).booleanValue();
                Context context = zzeriVar.a;
                String string = !zBooleanValue ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfe)).booleanValue() ? context.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
                com.google.android.gms.ads.internal.zzt.zzq();
                Bundle bundle = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfd)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i = 0; i < 4; i++) {
                        String str = strArr[i];
                        if (defaultSharedPreferences.contains(str)) {
                            bundle2.putString(str, defaultSharedPreferences.getString(str, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new ki6(string, string2, bundle);
            }
        });
    }
}
