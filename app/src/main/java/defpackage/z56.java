package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsu;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzfyy;

/* JADX INFO: loaded from: classes3.dex */
public final class z56 implements Runnable {
    public final /* synthetic */ zzbtq w;
    public final /* synthetic */ zzbsm x;
    public final /* synthetic */ zzbtr y;

    public z56(zzbtr zzbtrVar, zzbtq zzbtqVar, zzbsu zzbsuVar) {
        this.y = zzbtrVar;
        this.w = zzbtqVar;
        this.x = zzbsuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.y.a) {
            if (this.w.zze() != -1 && this.w.zze() != 1) {
                this.w.zzg();
                zzfyy zzfyyVar = zzcha.zze;
                final zzbsm zzbsmVar = this.x;
                zzfyyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbte
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbsmVar.zzc();
                    }
                });
                zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
