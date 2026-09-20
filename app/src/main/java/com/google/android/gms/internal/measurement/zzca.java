package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.w46;
import defpackage.w96;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeLong(j);
        M0(parcelK0, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.c(parcelK0, bundle);
        M0(parcelK0, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelK0 = K0();
        parcelK0.writeLong(j);
        M0(parcelK0, 43);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeLong(j);
        M0(parcelK0, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        ClassLoader classLoader = w46.a;
        parcelK0.writeInt(z ? 1 : 0);
        w46.d(parcelK0, zzcfVar);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(IObjectWrapper iObjectWrapper, w96 w96Var, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        w46.c(parcelK0, w96Var);
        parcelK0.writeLong(j);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.c(parcelK0, bundle);
        parcelK0.writeInt(z ? 1 : 0);
        parcelK0.writeInt(z2 ? 1 : 0);
        parcelK0.writeLong(j);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(5);
        parcelK0.writeString(str);
        w46.d(parcelK0, iObjectWrapper);
        w46.d(parcelK0, iObjectWrapper2);
        w46.d(parcelK0, iObjectWrapper3);
        M0(parcelK0, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        w46.c(parcelK0, bundle);
        parcelK0.writeLong(j);
        M0(parcelK0, 27);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeLong(j);
        M0(parcelK0, 28);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeLong(j);
        M0(parcelK0, 29);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeLong(j);
        M0(parcelK0, 30);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        w46.d(parcelK0, zzcfVar);
        parcelK0.writeLong(j);
        M0(parcelK0, 31);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeLong(j);
        M0(parcelK0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeLong(j);
        M0(parcelK0, 26);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        w46.d(parcelK0, zzcfVar);
        parcelK0.writeLong(j);
        M0(parcelK0, 32);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, zzciVar);
        M0(parcelK0, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        parcelK0.writeLong(j);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        parcelK0.writeLong(j);
        M0(parcelK0, 44);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        Parcel parcelK0 = K0();
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeLong(j);
        M0(parcelK0, 15);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcelK0 = K0();
        ClassLoader classLoader = w46.a;
        parcelK0.writeInt(z ? 1 : 0);
        M0(parcelK0, 39);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel parcelK0 = K0();
        ClassLoader classLoader = w46.a;
        parcelK0.writeInt(z ? 1 : 0);
        parcelK0.writeLong(j);
        M0(parcelK0, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.d(parcelK0, iObjectWrapper);
        parcelK0.writeInt(z ? 1 : 0);
        parcelK0.writeLong(j);
        M0(parcelK0, 4);
    }
}
