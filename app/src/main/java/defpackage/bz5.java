package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzes;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class bz5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzau c;

    public bz5(zzau zzauVar, Context context) {
        this.c = zzauVar;
        this.b = context;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "mobile_ads_settings");
        return new zzes();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzg(new ObjectWrapper(this.b), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.b;
        zzbiy.zzc(context);
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue();
        zzau zzauVar = this.c;
        if (!zBooleanValue) {
            return zzauVar.c.zza(context);
        }
        try {
            IBinder iBinderZze = ((zzcn) zzcgr.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcn ? (zzcn) iInterfaceQueryLocalInterface : new zzcn(obj);
                }
            })).zze(new ObjectWrapper(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(iBinderZze);
        } catch (RemoteException | zzcgq | NullPointerException e) {
            zzauVar.g = zzcad.zza(context);
            zzauVar.g.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
