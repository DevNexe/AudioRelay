package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyx extends RemoteCreator {
    public zzbyx() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbzd ? (zzbzd) iInterfaceQueryLocalInterface : new zzbzb(iBinder);
    }

    public final zzbza zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbzd) b(activity)).zze(new ObjectWrapper(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbza ? (zzbza) iInterfaceQueryLocalInterface : new zzbyy(iBinderZze);
        } catch (RemoteException e) {
            zzcgn.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcgn.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
