package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.Th;
import defpackage.com5Fixed;
import defpackage.za7;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed extends com5Fixed {
    public static final Parcelable.Creator<NUlFixed> CREATOR = new za7();
    public final String w;

    @Nullable
    public final zzj x;
    public final boolean y;
    public final boolean z;

    public NUlFixed(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.w = str;
        zzk zzkVar = null;
        if (iBinder != null) {
            try {
                int i = zzy.w;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                IObjectWrapper iObjectWrapperZzd = (iInterfaceQueryLocalInterface instanceof zzz ? (zzz) iInterfaceQueryLocalInterface : new zzx(iBinder)).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.M0(iObjectWrapperZzd);
                if (bArr != null) {
                    zzkVar = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.x = zzkVar;
        this.y = z;
        this.z = z2;
    }

    public NUlFixed(String str, @Nullable zzj zzjVar, boolean z, boolean z2) {
        this.w = str;
        this.x = zzjVar;
        this.y = z;
        this.z = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 1, this.w);
        zzj zzjVar = this.x;
        if (zzjVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzjVar = null;
        }
        Th.F(parcel, 2, zzjVar);
        Th.z(parcel, 3, this.y);
        Th.z(parcel, 4, this.z);
        Th.X(parcel, iP);
    }
}
