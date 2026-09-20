package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nt5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacp extends zzada {
    public static final Parcelable.Creator<zzacp> CREATOR = new nt5();
    public final zzada[] w;
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;

    public zzacp(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.w = new zzada[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.w[i3] = (zzada) parcel.readParcelable(zzada.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzada, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacp.class == obj.getClass()) {
            zzacp zzacpVar = (zzacp) obj;
            if (this.zzb == zzacpVar.zzb && this.zzc == zzacpVar.zzc && this.zzd == zzacpVar.zzd && this.zze == zzacpVar.zze && zzel.zzT(this.zza, zzacpVar.zza) && Arrays.equals(this.w, zzacpVar.w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.zzb + 527) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        zzada[] zzadaVarArr = this.w;
        parcel.writeInt(zzadaVarArr.length);
        for (zzada zzadaVar : zzadaVarArr) {
            parcel.writeParcelable(zzadaVar, 0);
        }
    }

    public zzacp(String str, int i, int i2, long j, long j2, zzada[] zzadaVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.w = zzadaVarArr;
    }
}
