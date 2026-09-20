package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.Th;
import defpackage.com5Fixed;
import defpackage.rr5;
import defpackage.tq2;
import defpackage.z50;

/* JADX INFO: loaded from: classes.dex */
public final class YKK extends com5Fixed {
    public static final Parcelable.Creator<YKK> CREATOR = new rr5();
    public final boolean A;
    public final int w;
    public final IBinder x;
    public final z50 y;
    public final boolean z;

    public YKK(int i, IBinder iBinder, z50 z50Var, boolean z, boolean z2) {
        this.w = i;
        this.x = iBinder;
        this.y = z50Var;
        this.z = z;
        this.A = z2;
    }

    public final boolean equals(Object obj) {
        Object zzvVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YKK)) {
            return false;
        }
        YKK ykk = (YKK) obj;
        if (this.y.equals(ykk.y)) {
            Object zzvVar2 = null;
            IBinder iBinder = this.x;
            if (iBinder == null) {
                zzvVar = null;
            } else {
                int i = IAccountAccessor.Stub.w;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                zzvVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzv(iBinder);
            }
            IBinder iBinder2 = ykk.x;
            if (iBinder2 != null) {
                int i2 = IAccountAccessor.Stub.w;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                zzvVar2 = iInterfaceQueryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface2 : new zzv(iBinder2);
            }
            if (tq2.a(zzvVar, zzvVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.F(parcel, 2, this.x);
        Th.I(parcel, 3, this.y, i);
        Th.z(parcel, 4, this.z);
        Th.z(parcel, 5, this.A);
        Th.X(parcel, iP);
    }
}
