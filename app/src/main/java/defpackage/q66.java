package defpackage;

import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class q66 implements zzo {
    public final /* synthetic */ zzbxp w;

    public q66(zzbxp zzbxpVar) {
        this.w = zzbxpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcgn.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbxp zzbxpVar = this.w;
        zzbxpVar.b.onAdOpened(zzbxpVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzcgn.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzcgn.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcgn.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        zzcgn.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbxp zzbxpVar = this.w;
        zzbxpVar.b.onAdClosed(zzbxpVar);
    }
}
