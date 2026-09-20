package defpackage;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class y46 implements Runnable {
    public final /* synthetic */ AdManagerAdView w;
    public final /* synthetic */ zzbs x;
    public final /* synthetic */ zzboh y;

    public y46(zzboh zzbohVar, AdManagerAdView adManagerAdView, zzbs zzbsVar) {
        this.y = zzbohVar;
        this.w = adManagerAdView;
        this.x = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbs zzbsVar = this.x;
        AdManagerAdView adManagerAdView = this.w;
        if (adManagerAdView.zzb(zzbsVar)) {
            this.y.w.onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            zzcgn.zzj("Could not bind.");
        }
    }
}
