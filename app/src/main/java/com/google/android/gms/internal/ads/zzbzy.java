package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.Th;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbzy extends defpackage.com5Fixed {
    public static final Parcelable.Creator<zzbzy> CREATOR = new zzbzz();
    public final View zza;
    public final Map zzb;

    public zzbzy(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) ObjectWrapper.M0(IObjectWrapper.Stub.L0(iBinder));
        this.zzb = (Map) ObjectWrapper.M0(IObjectWrapper.Stub.L0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.F(parcel, 1, new ObjectWrapper(this.zza));
        Th.F(parcel, 2, new ObjectWrapper(this.zzb));
        Th.X(parcel, iP);
    }
}
