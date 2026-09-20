package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzboa extends RemoteCreator {
    public zzboa() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbmn ? (zzbmn) iInterfaceQueryLocalInterface : new zzbml(iBinder);
    }

    public final zzbmk zza(View view, HashMap map, HashMap map2) {
        try {
            IBinder iBinderZze = ((zzbmn) b(view.getContext())).zze(new ObjectWrapper(view), new ObjectWrapper(map), new ObjectWrapper(map2));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbmk ? (zzbmk) iInterfaceQueryLocalInterface : new zzbmi(iBinderZze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcgn.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
