package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbqw;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class sv5 extends a16 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbvf c;
    public final /* synthetic */ OnH5AdsEventListener d;

    public sv5(Context context, zzbvf zzbvfVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.b = context;
        this.c = zzbvfVar;
        this.d = onH5AdsEventListener;
    }

    @Override // defpackage.a16
    public final /* synthetic */ Object a() {
        return new zzbqw();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzj(new ObjectWrapper(this.b), this.c, ModuleDescriptor.MODULE_VERSION, new zzbqj(this.d));
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.b;
        try {
            return ((zzbqs) zzcgr.zzb(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzaf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzbqr.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), this.c, ModuleDescriptor.MODULE_VERSION, new zzbqj(this.d));
        } catch (RemoteException | zzcgq | NullPointerException unused) {
            return null;
        }
    }
}
