package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.Th;
import defpackage.com5Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class zzeh extends com5Fixed {
    public static final Parcelable.Creator<zzeh> CREATOR = new zzei();
    public final int w;
    public final int x;
    public final String y;

    public zzeh() {
        this(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "21.2.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.G(parcel, 2, this.x);
        Th.J(parcel, 3, this.y);
        Th.X(parcel, iP);
    }

    public final int zza() {
        return this.x;
    }

    public zzeh(int i, int i2, String str) {
        this.w = i;
        this.x = i2;
        this.y = str;
    }
}
