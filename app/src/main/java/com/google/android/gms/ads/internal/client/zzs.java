package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.Th;
import defpackage.com5Fixed;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzs extends com5Fixed {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzs(int i, int i2, String str, long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = j;
    }

    public static zzs zza(JSONObject jSONObject) {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(InAppPurchaseMetaData.KEY_CURRENCY), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        Th.G(parcel, 2, this.zzb);
        Th.J(parcel, 3, this.zzc);
        Th.H(parcel, 4, this.zzd);
        Th.X(parcel, iP);
    }
}
