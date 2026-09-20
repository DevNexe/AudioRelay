package defpackage;

import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchj;

/* JADX INFO: loaded from: classes3.dex */
public final class b66 implements zzchj {
    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsm zzbsmVar = (zzbsm) obj;
        zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbto
            @Override // java.lang.Runnable
            public final void run() {
                zzbsm zzbsmVar2 = zzbsmVar;
                zzbsmVar2.zzr("/result", zzbpp.zzo);
                zzbsmVar2.zzc();
            }
        });
    }
}
