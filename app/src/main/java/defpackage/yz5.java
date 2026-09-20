package defpackage;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yz5 extends a16 {
    public final /* synthetic */ View b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ zzau e;

    public yz5(zzau zzauVar, View view, HashMap map, HashMap map2) {
        this.e = zzauVar;
        this.b = view;
        this.c = map;
        this.d = map2;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzi(new ObjectWrapper(this.b), new ObjectWrapper(this.c), new ObjectWrapper(this.d));
    }

    @Override // defpackage.a16
    public final Object c() {
        View view = this.b;
        zzbiy.zzc(view.getContext());
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue();
        HashMap map = this.d;
        HashMap map2 = this.c;
        zzau zzauVar = this.e;
        if (!zBooleanValue) {
            return zzauVar.f.zza(view, map2, map);
        }
        try {
            return zzbmj.zze(((zzbmn) zzcgr.zzb(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzar
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzbmm.zzb(obj);
                }
            })).zze(new ObjectWrapper(view), new ObjectWrapper(map2), new ObjectWrapper(map)));
        } catch (RemoteException | zzcgq | NullPointerException e) {
            zzauVar.g = zzcad.zza(view.getContext());
            zzauVar.g.zzd(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
