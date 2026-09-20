package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class jy5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbvf d;
    public final /* synthetic */ zzau e;

    public jy5(zzau zzauVar, Context context, String str, zzbvf zzbvfVar) {
        this.e = zzauVar;
        this.b = context;
        this.c = str;
        this.d = zzbvfVar;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "native_ad");
        return new zzeo();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzb(new ObjectWrapper(this.b), this.c, this.d, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.b;
        zzbiy.zzc(context);
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue();
        zzbvf zzbvfVar = this.d;
        String str = this.c;
        zzau zzauVar = this.e;
        if (!zBooleanValue) {
            return zzauVar.b.zza(context, str, zzbvfVar);
        }
        try {
            IBinder iBinderZze = ((zzbp) zzcgr.zzb(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzal
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbp ? (zzbp) iInterfaceQueryLocalInterface : new zzbp(obj);
                }
            })).zze(new ObjectWrapper(context), str, zzbvfVar, ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(iBinderZze);
        } catch (RemoteException | zzcgq | NullPointerException e) {
            zzauVar.g = zzcad.zza(context);
            zzauVar.g.zzd(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
