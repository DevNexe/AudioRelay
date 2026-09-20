package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoh {
    public final zzfok a;
    public final boolean b = true;

    public zzfoh(zzfok zzfokVar) {
        this.a = zzfokVar;
    }

    public static zzfoh zzb(Context context, String str, String str2) {
        zzfok zzfoiVar;
        try {
            try {
                try {
                    IBinder iBinderB = DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        zzfoiVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfoiVar = iInterfaceQueryLocalInterface instanceof zzfok ? (zzfok) iInterfaceQueryLocalInterface : new zzfoi(iBinderB);
                    }
                    zzfoiVar.zze(new ObjectWrapper(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfoh(zzfoiVar);
                } catch (Exception e) {
                    throw new zzfnj(e);
                }
            } catch (Exception e2) {
                throw new zzfnj(e2);
            }
        } catch (RemoteException | zzfnj | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfoh(new zzfol());
        }
    }

    public static zzfoh zzc() {
        zzfol zzfolVar = new zzfol();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfoh(zzfolVar);
    }

    public final zzfog zza(byte[] bArr) {
        return new zzfog(this, bArr);
    }
}
