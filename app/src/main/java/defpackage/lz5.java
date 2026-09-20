package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzfmn;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class lz5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ zzaqb x;

    public lz5(zzaqb zzaqbVar, int i) {
        this.x = zzaqbVar;
        this.w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzamx zzamxVarZza;
        zzaqb zzaqbVar = this.x;
        int i = this.w;
        if (i > 0) {
            try {
                Thread.sleep(i * AdError.NETWORK_ERROR_CODE);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaqbVar.a.getPackageManager().getPackageInfo(zzaqbVar.a.getPackageName(), 0);
            Context context = zzaqbVar.a;
            zzamxVarZza = zzfmn.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzamxVarZza = null;
        }
        this.x.j = zzamxVarZza;
        if (this.w < 4) {
            if (zzamxVarZza != null && zzamxVarZza.zzai() && !zzamxVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzamxVarZza.zzaj() && zzamxVarZza.zzf().zze() && zzamxVarZza.zzf().zza() != -2) {
                return;
            }
            zzaqb zzaqbVar2 = this.x;
            int i2 = this.w + 1;
            if (zzaqbVar2.n) {
                Future<?> futureSubmit = zzaqbVar2.b.submit(new lz5(zzaqbVar2, i2));
                if (i2 == 0) {
                    zzaqbVar2.k = futureSubmit;
                }
            }
        }
    }
}
