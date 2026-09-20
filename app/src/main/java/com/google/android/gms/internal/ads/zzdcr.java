package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdcr extends com.google.android.gms.ads.internal.client.zzdg {
    public final long A;
    public final String B;
    public final zzegp C;
    public final Bundle D;
    public final String w;
    public final String x;
    public final String y;
    public final List z;

    public zzdcr(zzfcs zzfcsVar, String str, zzegp zzegpVar, zzfcv zzfcvVar) {
        String string = null;
        this.x = zzfcsVar == null ? null : zzfcsVar.zzac;
        this.y = zzfcvVar == null ? null : zzfcvVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = zzfcsVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.w = string != null ? string : str;
        this.z = zzegpVar.zzc();
        this.C = zzegpVar;
        this.A = com.google.android.gms.ads.internal.zzt.zzB().b() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfQ)).booleanValue() || zzfcvVar == null) {
            this.D = new Bundle();
        } else {
            this.D = zzfcvVar.zzj;
        }
        this.B = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhQ)).booleanValue() || zzfcvVar == null || TextUtils.isEmpty(zzfcvVar.zzh)) ? "" : zzfcvVar.zzh;
    }

    public final long zzc() {
        return this.A;
    }

    public final String zzd() {
        return this.B;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.D;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() {
        zzegp zzegpVar = this.C;
        if (zzegpVar != null) {
            return zzegpVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.w;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.x;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        return this.z;
    }

    public final String zzj() {
        return this.y;
    }
}
