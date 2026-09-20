package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.tq2;
import java.util.Arrays;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccc extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzccc> CREATOR = new zzccd();
    public final String zza;
    public final int zzb;

    public zzccc(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzccc zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzccc(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzccc)) {
            zzccc zzcccVar = (zzccc) obj;
            if (tq2.a(this.zza, zzcccVar.zza) && tq2.a(Integer.valueOf(this.zzb), Integer.valueOf(zzcccVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, this.zza);
        Th.G(parcel, 3, this.zzb);
        Th.X(parcel, iP);
    }
}
