package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzax;
import com.google.android.gms.ads.internal.client.zzdu;

/* JADX INFO: loaded from: classes.dex */
public final class bf6 extends zzax {
    public final /* synthetic */ zzdu y;

    public bf6(zzdu zzduVar) {
        this.y = zzduVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzdu zzduVar = this.y;
        zzduVar.d.zzb(zzduVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzdu zzduVar = this.y;
        zzduVar.d.zzb(zzduVar.zzi());
        super.onAdLoaded();
    }
}
