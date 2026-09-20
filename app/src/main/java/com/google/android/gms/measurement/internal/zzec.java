package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import defpackage.d37;
import defpackage.ft5;
import defpackage.m16;
import defpackage.p97;
import defpackage.w46;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzec extends zzbm implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void A(p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 18);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List C(String str, String str2, String str3) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(null);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        Parcel parcelL0 = L0(parcelK0, 17);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(ft5.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void D(p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void I0(m16 m16Var, p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, m16Var);
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void J(p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void L(d37 d37Var, p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, d37Var);
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void O(ft5 ft5Var, p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, ft5Var);
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 12);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List P(String str, String str2, p97 p97Var) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.c(parcelK0, p97Var);
        Parcel parcelL0 = L0(parcelK0, 16);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(ft5.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void V(long j, String str, String str2, String str3) {
        Parcel parcelK0 = K0();
        parcelK0.writeLong(j);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final String d(p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, p97Var);
        Parcel parcelL0 = L0(parcelK0, 11);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void h0(p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 20);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List m(String str, String str2, String str3, boolean z) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(null);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        ClassLoader classLoader = w46.a;
        parcelK0.writeInt(z ? 1 : 0);
        Parcel parcelL0 = L0(parcelK0, 15);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(d37.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final List m0(String str, String str2, boolean z, p97 p97Var) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        ClassLoader classLoader = w46.a;
        parcelK0.writeInt(z ? 1 : 0);
        w46.c(parcelK0, p97Var);
        Parcel parcelL0 = L0(parcelK0, 14);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(d37.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final void s(Bundle bundle, p97 p97Var) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        w46.c(parcelK0, p97Var);
        M0(parcelK0, 19);
    }

    @Override // com.google.android.gms.measurement.internal.zzee
    public final byte[] v0(m16 m16Var, String str) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, m16Var);
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 9);
        byte[] bArrCreateByteArray = parcelL0.createByteArray();
        parcelL0.recycle();
        return bArrCreateByteArray;
    }
}
