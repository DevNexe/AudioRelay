package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccv {
    public static final zzccj zza(Context context, String str, zzbvf zzbvfVar) {
        try {
            IBinder iBinderZze = ((zzccn) zzcgr.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcgp() { // from class: com.google.android.gms.internal.ads.zzccu
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof zzccn ? (zzccn) iInterfaceQueryLocalInterface : new zzccn(obj);
                }
            })).zze(new ObjectWrapper(context), str, zzbvfVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof zzccj ? (zzccj) iInterfaceQueryLocalInterface : new zzcch(iBinderZze);
        } catch (RemoteException | zzcgq e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
