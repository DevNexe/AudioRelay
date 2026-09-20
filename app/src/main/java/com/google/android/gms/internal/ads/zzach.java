package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.jt5;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class zzach implements zzbp {
    public static final Parcelable.Creator<zzach> CREATOR = new jt5();
    public final String zza;
    public final String zzb;

    public zzach(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    public zzach(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzach zzachVar = (zzach) obj;
            if (this.zza.equals(zzachVar.zza) && this.zzb.equals(zzachVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + bl2.a(this.zza, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        byte b;
        switch (this.zza) {
            case "ALBUM":
                b = 2;
                break;
            case "TITLE":
                b = 0;
                break;
            case "DESCRIPTION":
                b = 4;
                break;
            case "ALBUMARTIST":
                b = 3;
                break;
            case "ARTIST":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            zzbkVar.zzr(this.zzb);
            return;
        }
        if (b == 1) {
            zzbkVar.zze(this.zzb);
            return;
        }
        if (b == 2) {
            zzbkVar.zzd(this.zzb);
        } else if (b == 3) {
            zzbkVar.zzc(this.zzb);
        } else {
            if (b != 4) {
                return;
            }
            zzbkVar.zzi(this.zzb);
        }
    }
}
