package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdl extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzcdl> CREATOR = new zzcdm();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzcdl(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = list;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzcdl zza(JSONObject jSONObject) {
        return new zzcdl(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbu.zzc(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbu.zzc(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.zza);
        Th.J(parcel, 3, this.zzb);
        Th.z(parcel, 4, this.zzc);
        Th.z(parcel, 5, this.zzd);
        Th.L(parcel, 6, this.zze);
        Th.z(parcel, 7, this.zzf);
        Th.z(parcel, 8, this.zzg);
        Th.L(parcel, 9, this.zzh);
        Th.X(parcel, iP);
    }
}
