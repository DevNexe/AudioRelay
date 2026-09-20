package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import defpackage.d60;
import defpackage.gt3;
import defpackage.ht3;
import defpackage.i76;
import defpackage.oa3;
import defpackage.uz6;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzab extends zzb {
    public zzab() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) i76.a(parcel, Bundle.CREATOR);
            i76.b(parcel);
            zzd zzdVar = (zzd) this;
            oa3.i(zzdVar.w, "onPostInitComplete can be called only once per call to getRemoteService");
            QnHx qnHx = zzdVar.w;
            qnHx.getClass();
            byN byn = new byN(qnHx, i2, strongBinder, bundle);
            auxFixed auxVar = qnHx.l;
            auxVar.sendMessage(auxVar.obtainMessage(1, zzdVar.x, -1, byn));
            zzdVar.w = null;
        } else if (i == 2) {
            parcel.readInt();
            i76.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            uz6 uz6Var = (uz6) i76.a(parcel, uz6.CREATOR);
            i76.b(parcel);
            zzd zzdVar2 = (zzd) this;
            QnHx qnHx2 = zzdVar2.w;
            oa3.i(qnHx2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            oa3.h(uz6Var);
            qnHx2.B = uz6Var;
            if (qnHx2.usesClientTelemetry()) {
                d60 d60Var = uz6Var.z;
                gt3 gt3VarA = gt3.a();
                ht3 ht3Var = d60Var == null ? null : d60Var.w;
                synchronized (gt3VarA) {
                    try {
                        if (ht3Var == null) {
                            ht3Var = gt3.c;
                        } else {
                            ht3 ht3Var2 = gt3VarA.a;
                            if (ht3Var2 == null || ht3Var2.w < ht3Var.w) {
                            }
                        }
                        gt3VarA.a = ht3Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = uz6Var.w;
            oa3.i(zzdVar2.w, "onPostInitComplete can be called only once per call to getRemoteService");
            QnHx qnHx3 = zzdVar2.w;
            qnHx3.getClass();
            byN byn2 = new byN(qnHx3, i3, strongBinder2, bundle2);
            auxFixed auxVar2 = qnHx3.l;
            auxVar2.sendMessage(auxVar2.obtainMessage(1, zzdVar2.x, -1, byn2));
            zzdVar2.w = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
