package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl2;
import defpackage.zt5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadi extends zzada {
    public static final Parcelable.Creator<zzadi> CREATOR = new zt5();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzadi(Parcel parcel) {
        String string = parcel.readString();
        int i = zzel.zza;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadi.class == obj.getClass()) {
            zzadi zzadiVar = (zzadi) obj;
            if (zzel.zzT(this.zzf, zzadiVar.zzf) && zzel.zzT(this.zza, zzadiVar.zza) && zzel.zzT(this.zzb, zzadiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = bl2.a(this.zzf, 527, 31);
        String str = this.zza;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    @Override // com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbk zzbkVar) {
        switch (this.zzf) {
            case "TT2":
            case "TIT2":
                zzbkVar.zzr(this.zzb);
                break;
            case "TP1":
            case "TPE1":
                zzbkVar.zze(this.zzb);
                break;
            case "TP2":
            case "TPE2":
                zzbkVar.zzc(this.zzb);
                break;
            case "TAL":
            case "TALB":
                zzbkVar.zzd(this.zzb);
                break;
            case "TRK":
            case "TRCK":
                String[] strArrZzag = zzel.zzag(this.zzb, "/");
                try {
                    int i = Integer.parseInt(strArrZzag[0]);
                    Integer numValueOf = strArrZzag.length > 1 ? Integer.valueOf(Integer.parseInt(strArrZzag[1])) : null;
                    zzbkVar.zzt(Integer.valueOf(i));
                    zzbkVar.zzs(numValueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case "TYE":
            case "TYER":
                try {
                    zzbkVar.zzm(Integer.valueOf(Integer.parseInt(this.zzb)));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case "TDA":
            case "TDAT":
                try {
                    int i2 = Integer.parseInt(this.zzb.substring(2, 4));
                    int i3 = Integer.parseInt(this.zzb.substring(0, 2));
                    zzbkVar.zzl(Integer.valueOf(i2));
                    zzbkVar.zzk(Integer.valueOf(i3));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case "TDRC":
                ArrayList arrayListA = a(this.zzb);
                int size = arrayListA.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzbkVar.zzk((Integer) arrayListA.get(2));
                        }
                    }
                    zzbkVar.zzl((Integer) arrayListA.get(1));
                }
                zzbkVar.zzm((Integer) arrayListA.get(0));
                break;
            case "TDRL":
                ArrayList arrayListA2 = a(this.zzb);
                int size2 = arrayListA2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzbkVar.zzn((Integer) arrayListA2.get(2));
                        }
                    }
                    zzbkVar.zzo((Integer) arrayListA2.get(1));
                }
                zzbkVar.zzp((Integer) arrayListA2.get(0));
                break;
            case "TCM":
            case "TCOM":
                zzbkVar.zzg(this.zzb);
                break;
            case "TP3":
            case "TPE3":
                zzbkVar.zzh(this.zzb);
                break;
            case "TXT":
            case "TEXT":
                zzbkVar.zzu(this.zzb);
                break;
        }
    }

    public zzadi(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
