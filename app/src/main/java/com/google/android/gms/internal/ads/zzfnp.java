package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnp extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzfnp> CREATOR = new zzfnq();
    public zzamx w = null;
    public byte[] x;
    public final int zza;

    public zzfnp(int i, byte[] bArr) {
        this.zza = i;
        this.x = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.zza);
        byte[] bArrZzaw = this.x;
        if (bArrZzaw == null) {
            bArrZzaw = this.w.zzaw();
        }
        Th.B(parcel, 2, bArrZzaw);
        Th.X(parcel, iP);
    }

    public final zzamx zza() {
        if (this.w == null) {
            try {
                this.w = zzamx.zze(this.x, zzgnz.zza());
                this.x = null;
            } catch (zzgoz | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.w;
    }

    public final void zzb() {
        zzamx zzamxVar = this.w;
        if (zzamxVar != null || this.x == null) {
            if (zzamxVar == null || this.x != null) {
                if (zzamxVar != null && this.x != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzamxVar != null || this.x != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
