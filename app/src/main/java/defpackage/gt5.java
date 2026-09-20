package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class gt5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvf c;

    public gt5(Context context, zzbvf zzbvfVar) {
        this.b = context;
        this.c = zzbvfVar;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzo(new ObjectWrapper(this.b), this.c, ModuleDescriptor.MODULE_VERSION);
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.b;
        try {
            return ((zzcfh) zzcgr.zzb(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzab
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzcfg.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), this.c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | zzcgq | NullPointerException unused) {
            return null;
        }
    }
}
