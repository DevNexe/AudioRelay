package defpackage;

import android.media.Spatializer;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzvo;

/* JADX INFO: loaded from: classes3.dex */
public final class bc7 implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ zzvo a;

    public bc7(zzvo zzvoVar) {
        this.a = zzvoVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        zzvo zzvoVar = this.a;
        zzfwd zzfwdVar = zzvo.i;
        zzvoVar.e();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        zzvo zzvoVar = this.a;
        zzfwd zzfwdVar = zzvo.i;
        zzvoVar.e();
    }
}
