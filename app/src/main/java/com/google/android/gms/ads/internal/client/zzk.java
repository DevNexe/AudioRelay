package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    public zzcaf c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface : new zzbt(iBinder);
    }

    public final zzbs zza(Context context, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        zzbiy.zzc(context);
        if (!((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbt) b(context)).zze(new ObjectWrapper(context), zzqVar, str, zzbvfVar, ModuleDescriptor.MODULE_VERSION, i);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(iBinderZze);
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
                zzcgn.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbt) zzcgr.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface2 : new zzbt(obj);
                }
            })).zze(new ObjectWrapper(context), zzqVar, str, zzbvfVar, ModuleDescriptor.MODULE_VERSION, i);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface2 : new zzbq(iBinderZze2);
        } catch (RemoteException | zzcgq | NullPointerException e2) {
            zzcaf zzcafVarZza = zzcad.zza(context);
            this.c = zzcafVarZza;
            zzcafVarZza.zzd(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcgn.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
