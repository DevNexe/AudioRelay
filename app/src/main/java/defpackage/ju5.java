package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class ju5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvf c;

    public ju5(Context context, zzbvf zzbvfVar) {
        this.b = context;
        this.c = zzbvfVar;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzk(new ObjectWrapper(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.b;
        try {
            return ((zzbyt) zzcgr.zzb(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzbys.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), this.c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzcgq | NullPointerException unused) {
            return null;
        }
    }
}
