package defpackage;

import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbdt;

/* JADX INFO: loaded from: classes3.dex */
public final class s36 implements zzbcf {
    public final /* synthetic */ zzbdt a;

    public s36(zzbdt zzbdtVar) {
        this.a = zzbdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zza(boolean z) {
        zzbdt zzbdtVar = this.a;
        if (z) {
            zzbdtVar.b();
        } else {
            zzbdt.a(zzbdtVar);
        }
    }
}
