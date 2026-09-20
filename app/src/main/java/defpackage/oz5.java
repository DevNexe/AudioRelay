package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzet;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class oz5 extends a16 {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzau e;

    public oz5(zzau zzauVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.e = zzauVar;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.d, "native_ad_view_delegate");
        return new zzet();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzh(new ObjectWrapper(this.b), new ObjectWrapper(this.c));
    }

    @Override // defpackage.a16
    public final Object c() {
        Context context = this.d;
        zzbiy.zzc(context);
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue();
        FrameLayout frameLayout = this.c;
        FrameLayout frameLayout2 = this.b;
        zzau zzauVar = this.e;
        if (!zBooleanValue) {
            return zzauVar.d.zza(context, frameLayout2, frameLayout);
        }
        try {
            return zzbmd.zzbB(((zzbmh) zzcgr.zzb(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzbmg.zzb(obj);
                }
            })).zze(new ObjectWrapper(context), new ObjectWrapper(frameLayout2), new ObjectWrapper(frameLayout), ModuleDescriptor.MODULE_VERSION));
        } catch (RemoteException | zzcgq | NullPointerException e) {
            zzauVar.g = zzcad.zza(context);
            zzauVar.g.zzd(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
