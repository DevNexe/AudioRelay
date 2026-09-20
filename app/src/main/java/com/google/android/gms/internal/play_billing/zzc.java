package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.sz6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzc extends zzh implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle A0(String str, String str2, String str3) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        parcelK0.writeString(null);
        Parcel parcelL0 = L0(parcelK0, 3);
        Bundle bundle = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle B0(String str, String str2, String str3, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(9);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 11);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle H0(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(9);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 12);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle T(String str, String str2, String str3) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        Parcel parcelL0 = L0(parcelK0, 4);
        Bundle bundle = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int a(String str, String str2) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        Parcel parcelL0 = L0(parcelK0, 5);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle b0(String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(10);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        parcelK0.writeInt(1);
        bundle2.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 901);
        Bundle bundle3 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle e0(String str, String str2, String str3, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(6);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 9);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle f(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(i);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        parcelK0.writeString(null);
        int i2 = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 8);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int g(int i, String str, String str2) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(i);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        Parcel parcelL0 = L0(parcelK0, 1);
        int i2 = parcelL0.readInt();
        parcelL0.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle l(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(9);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 902);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final Bundle u(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        int i = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 2);
        Bundle bundle2 = (Bundle) sz6.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zze
    public final int w0(int i, String str, String str2, Bundle bundle) {
        Parcel parcelK0 = zzh.K0();
        parcelK0.writeInt(i);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        int i2 = sz6.a;
        parcelK0.writeInt(1);
        bundle.writeToParcel(parcelK0, 0);
        Parcel parcelL0 = L0(parcelK0, 10);
        int i3 = parcelL0.readInt();
        parcelL0.recycle();
        return i3;
    }
}
