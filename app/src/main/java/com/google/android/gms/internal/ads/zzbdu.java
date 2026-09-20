package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.Th;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdu extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbdu> CREATOR = new zzbdv();

    @GuardedBy("this")
    public final boolean A;

    @GuardedBy("this")
    public ParcelFileDescriptor w;

    @GuardedBy("this")
    public final boolean x;

    @GuardedBy("this")
    public final boolean y;

    @GuardedBy("this")
    public final long z;

    public zzbdu() {
        this(null, false, false, 0L, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iP = Th.P(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.w;
        }
        Th.I(parcel, 2, parcelFileDescriptor, i);
        Th.z(parcel, 3, zzd());
        Th.z(parcel, 4, zzf());
        Th.H(parcel, 5, zza());
        Th.z(parcel, 6, zzg());
        Th.X(parcel, iP);
    }

    public final synchronized long zza() {
        return this.z;
    }

    public final synchronized InputStream zzc() {
        if (this.w == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.w);
        this.w = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.x;
    }

    public final synchronized boolean zze() {
        return this.w != null;
    }

    public final synchronized boolean zzf() {
        return this.y;
    }

    public final synchronized boolean zzg() {
        return this.A;
    }

    public zzbdu(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.w = parcelFileDescriptor;
        this.x = z;
        this.y = z2;
        this.z = j;
        this.A = z3;
    }
}
