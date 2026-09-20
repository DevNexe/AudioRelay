package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblh {
    public final Context a;

    public zzblh(Context context) {
        this.a = context;
    }

    public final void zza(zzcak zzcakVar) {
        try {
            ((zzbli) zzcgr.zzb(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcgp() { // from class: com.google.android.gms.internal.ads.zzblg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return iInterfaceQueryLocalInterface instanceof zzbli ? (zzbli) iInterfaceQueryLocalInterface : new zzbli(obj);
                }
            })).zze(zzcakVar);
        } catch (RemoteException e) {
            zzcgn.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcgq e2) {
            zzcgn.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
