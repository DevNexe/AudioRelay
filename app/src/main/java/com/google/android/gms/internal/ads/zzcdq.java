package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdq implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final zzg c;
    public final zzces d;
    public String e = "-1";
    public int f = -1;

    public zzcdq(Context context, zzg zzgVar, zzces zzcesVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
        this.d = zzcesVar;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.b;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzav)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        }
    }

    public final void b(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzat)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzar)).booleanValue()) {
            this.c.zzH(z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue() && z && (context = this.a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzam)).booleanValue()) {
            this.d.zzt();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzav)).booleanValue()) {
            boolean zZza = zzcdp.zza(str, "gad_has_consent_for_cookies");
            zzg zzgVar = this.c;
            if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzat)).booleanValue()) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != zzgVar.zzb()) {
                        zzgVar.zzH(true);
                    }
                    zzgVar.zzE(i);
                    return;
                }
                return;
            }
            if (zzcdp.zza(str, "IABTCF_gdprApplies") || zzcdp.zza(str, "IABTCF_TCString") || zzcdp.zza(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(zzgVar.zzn(str))) {
                    zzgVar.zzH(true);
                }
                zzgVar.zzF(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String strValueOf = String.valueOf(str);
        int iHashCode = strValueOf.hashCode();
        if (iHashCode != -2004976699) {
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            if (string2.equals("-1") || this.e.equals(string2)) {
                return;
            }
            this.e = string2;
            b(string2, i2);
            return;
        }
        if (b != 1) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzat)).booleanValue() || i2 == -1 || this.f == i2) {
            return;
        }
        this.f = i2;
        b(string2, i2);
    }
}
