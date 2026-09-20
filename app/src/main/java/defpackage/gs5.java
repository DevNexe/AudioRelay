package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzau;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcgr;

/* JADX INFO: loaded from: classes.dex */
public final class gs5 extends a16 {
    public final /* synthetic */ Activity b;
    public final /* synthetic */ zzau c;

    public gs5(zzau zzauVar, Activity activity) {
        this.c = zzauVar;
        this.b = activity;
    }

    @Override // defpackage.a16
    public final /* bridge */ /* synthetic */ Object a() {
        zzau.a(this.b, "ad_overlay");
        return null;
    }

    @Override // defpackage.a16
    public final Object b(zzcc zzccVar) {
        return zzccVar.zzl(new ObjectWrapper(this.b));
    }

    @Override // defpackage.a16
    public final Object c() {
        Activity activity = this.b;
        zzbiy.zzc(activity);
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzim)).booleanValue();
        zzau zzauVar = this.c;
        if (!zBooleanValue) {
            return zzauVar.e.zza(activity);
        }
        try {
            return zzbyz.zzF(((zzbzd) zzcgr.zzb(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcgp() { // from class: com.google.android.gms.ads.internal.client.zzz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcgp
                public final Object zza(Object obj) {
                    return zzbzc.zzb(obj);
                }
            })).zze(new ObjectWrapper(activity)));
        } catch (RemoteException | zzcgq | NullPointerException e) {
            zzauVar.g = zzcad.zza(activity.getApplicationContext());
            zzauVar.g.zzd(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
