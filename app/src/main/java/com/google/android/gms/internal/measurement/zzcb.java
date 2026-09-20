package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.w46;
import defpackage.w96;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcb extends zzbn implements zzcc {
    public zzcb() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface : new zzca(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        zzcf zzcdVar = null;
        zzcf zzcdVar2 = null;
        zzcf zzcdVar3 = null;
        zzci zzcgVar = null;
        zzci zzcgVar2 = null;
        zzci zzcgVar3 = null;
        zzcf zzcdVar4 = null;
        zzcf zzcdVar5 = null;
        zzcf zzcdVar6 = null;
        zzcf zzcdVar7 = null;
        zzcf zzcdVar8 = null;
        zzcf zzcdVar9 = null;
        zzck zzcjVar = null;
        zzcf zzcdVar10 = null;
        zzcf zzcdVar11 = null;
        zzcf zzcdVar12 = null;
        zzcf zzcdVar13 = null;
        zzcf zzcdVar14 = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                w96 w96Var = (w96) w46.a(parcel, w96.CREATOR);
                long j = parcel.readLong();
                w46.b(parcel);
                initialize(iObjectWrapperL0, w96Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) w46.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                w46.b(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder);
                }
                long j3 = parcel.readLong();
                w46.b(parcel);
                logEventAndBundle(string3, string4, bundle2, zzcdVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                ClassLoader classLoader = w46.a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                w46.b(parcel);
                setUserProperty(string5, string6, iObjectWrapperL1, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = w46.a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar14 = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcd(strongBinder2);
                }
                w46.b(parcel);
                getUserProperties(string7, string8, z, zzcdVar14);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar13 = iInterfaceQueryLocalInterface3 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface3 : new zzcd(strongBinder3);
                }
                w46.b(parcel);
                getMaxUserProperties(string9, zzcdVar13);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                w46.b(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                w46.b(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                w46.b(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar12 = iInterfaceQueryLocalInterface4 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface4 : new zzcd(strongBinder4);
                }
                w46.b(parcel);
                getConditionalUserProperties(string13, string14, zzcdVar12);
                break;
            case 11:
                ClassLoader classLoader3 = w46.a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                w46.b(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                w46.b(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                w46.b(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                w46.b(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                w46.b(parcel);
                setCurrentScreen(iObjectWrapperL2, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar11 = iInterfaceQueryLocalInterface5 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface5 : new zzcd(strongBinder5);
                }
                w46.b(parcel);
                getCurrentScreenName(zzcdVar11);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar10 = iInterfaceQueryLocalInterface6 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface6 : new zzcd(strongBinder6);
                }
                w46.b(parcel);
                getCurrentScreenClass(zzcdVar10);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzcjVar = iInterfaceQueryLocalInterface7 instanceof zzck ? (zzck) iInterfaceQueryLocalInterface7 : new zzcj(strongBinder7);
                }
                w46.b(parcel);
                setInstanceIdProvider(zzcjVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar9 = iInterfaceQueryLocalInterface8 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface8 : new zzcd(strongBinder8);
                }
                w46.b(parcel);
                getCachedAppInstanceId(zzcdVar9);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar8 = iInterfaceQueryLocalInterface9 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface9 : new zzcd(strongBinder9);
                }
                w46.b(parcel);
                getAppInstanceId(zzcdVar8);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar7 = iInterfaceQueryLocalInterface10 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface10 : new zzcd(strongBinder10);
                }
                w46.b(parcel);
                getGmpAppId(zzcdVar7);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar6 = iInterfaceQueryLocalInterface11 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface11 : new zzcd(strongBinder11);
                }
                w46.b(parcel);
                generateEventId(zzcdVar6);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                w46.b(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                w46.b(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                w46.b(parcel);
                onActivityStarted(iObjectWrapperL3, j14);
                break;
            case 26:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                w46.b(parcel);
                onActivityStopped(iObjectWrapperL4, j15);
                break;
            case 27:
                IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                w46.b(parcel);
                onActivityCreated(iObjectWrapperL5, bundle5, j16);
                break;
            case 28:
                IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                w46.b(parcel);
                onActivityDestroyed(iObjectWrapperL6, j17);
                break;
            case 29:
                IObjectWrapper iObjectWrapperL7 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                w46.b(parcel);
                onActivityPaused(iObjectWrapperL7, j18);
                break;
            case 30:
                IObjectWrapper iObjectWrapperL8 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                w46.b(parcel);
                onActivityResumed(iObjectWrapperL8, j19);
                break;
            case 31:
                IObjectWrapper iObjectWrapperL9 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar5 = iInterfaceQueryLocalInterface12 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface12 : new zzcd(strongBinder12);
                }
                long j20 = parcel.readLong();
                w46.b(parcel);
                onActivitySaveInstanceState(iObjectWrapperL9, zzcdVar5, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar4 = iInterfaceQueryLocalInterface13 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface13 : new zzcd(strongBinder13);
                }
                long j21 = parcel.readLong();
                w46.b(parcel);
                performAction(bundle6, zzcdVar4, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                IObjectWrapper iObjectWrapperL10 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL11 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL12 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                w46.b(parcel);
                logHealthData(i2, string19, iObjectWrapperL10, iObjectWrapperL11, iObjectWrapperL12);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar3 = iInterfaceQueryLocalInterface14 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface14 : new zzcg(strongBinder14);
                }
                w46.b(parcel);
                setEventInterceptor(zzcgVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar2 = iInterfaceQueryLocalInterface15 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface15 : new zzcg(strongBinder15);
                }
                w46.b(parcel);
                registerOnMeasurementEventListener(zzcgVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcgVar = iInterfaceQueryLocalInterface16 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface16 : new zzcg(strongBinder16);
                }
                w46.b(parcel);
                unregisterOnMeasurementEventListener(zzcgVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(w46.a);
                w46.b(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar3 = iInterfaceQueryLocalInterface17 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface17 : new zzcd(strongBinder17);
                }
                int i3 = parcel.readInt();
                w46.b(parcel);
                getTestFlag(zzcdVar3, i3);
                break;
            case 39:
                ClassLoader classLoader4 = w46.a;
                z = parcel.readInt() != 0;
                w46.b(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcdVar2 = iInterfaceQueryLocalInterface18 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface18 : new zzcd(strongBinder18);
                }
                w46.b(parcel);
                isDataCollectionEnabled(zzcdVar2);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                w46.b(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                w46.b(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                w46.b(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) w46.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                w46.b(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
