package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzue {
    public static final zzue zza = new zzue(new zzcp[0]);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzud
    };
    public final zzfuv a;
    public int b;
    public final int zzc;

    public zzue(zzcp... zzcpVarArr) {
        this.a = zzfuv.zzn(zzcpVarArr);
        this.zzc = zzcpVarArr.length;
        int i = 0;
        while (i < this.a.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.a.size(); i3++) {
                if (((zzcp) this.a.get(i)).equals(this.a.get(i3))) {
                    zzdu.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzue.class == obj.getClass()) {
            zzue zzueVar = (zzue) obj;
            if (this.zzc == zzueVar.zzc && this.a.equals(zzueVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.a.hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    public final int zza(zzcp zzcpVar) {
        int iIndexOf = this.a.indexOf(zzcpVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzcp zzb(int i) {
        return (zzcp) this.a.get(i);
    }
}
