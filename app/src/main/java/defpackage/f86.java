package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchf;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f86 implements Runnable {
    public final /* synthetic */ Context w;
    public final /* synthetic */ zzchf x;

    public f86(Context context, zzchf zzchfVar) {
        this.w = context;
        this.x = zzchfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchf zzchfVar = this.x;
        try {
            zzchfVar.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.w));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzchfVar.zze(e);
            zzcgn.zzh("Exception while getting advertising Id info", e);
        }
    }
}
