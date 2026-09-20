package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfyy;
import defpackage.w36;
import defpackage.x36;
import java.io.IOException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class x36 implements QnHx.InterfaceC0075QnHx {
    public final /* synthetic */ zzbdx a;
    public final /* synthetic */ zzchf b;
    public final /* synthetic */ zzbeh c;

    public x36(zzbeh zzbehVar, zzbdx zzbdxVar, v36 v36Var) {
        this.c = zzbehVar;
        this.a = zzbdxVar;
        this.b = v36Var;
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        synchronized (this.c.c) {
            try {
                zzbeh zzbehVar = this.c;
                if (zzbehVar.b) {
                    return;
                }
                zzbehVar.b = true;
                final zzbdw zzbdwVar = zzbehVar.a;
                if (zzbdwVar == null) {
                    return;
                }
                zzfyy zzfyyVar = zzcha.zza;
                final zzbdx zzbdxVar = this.a;
                final zzchf zzchfVar = this.b;
                final zzfyx zzfyxVarZza = zzfyyVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbec
                    @Override // java.lang.Runnable
                    public final void run() {
                        x36 x36Var = this.zza;
                        zzbdw zzbdwVar2 = zzbdwVar;
                        zzbdx zzbdxVar2 = zzbdxVar;
                        zzchf zzchfVar2 = zzchfVar;
                        try {
                            zzbdz zzbdzVarZzq = zzbdwVar2.zzq();
                            zzbdu zzbduVarZzg = zzbdwVar2.zzp() ? zzbdzVarZzq.zzg(zzbdxVar2) : zzbdzVarZzq.zzf(zzbdxVar2);
                            if (!zzbduVarZzg.zze()) {
                                zzchfVar2.zze(new RuntimeException("No entry contents."));
                                zzbeh.a(x36Var.c);
                                return;
                            }
                            w36 w36Var = new w36(x36Var, zzbduVarZzg.zzc());
                            int i = w36Var.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            w36Var.unread(i);
                            zzchfVar2.zzd(zzbej.zzb(w36Var, zzbduVarZzg.zzd(), zzbduVarZzg.zzg(), zzbduVarZzg.zza(), zzbduVarZzg.zzf()));
                        } catch (RemoteException | IOException e) {
                            zzcgn.zzh("Unable to obtain a cache service instance.", e);
                            zzchfVar2.zze(e);
                            zzbeh.a(x36Var.c);
                        }
                    }
                });
                final zzchf zzchfVar2 = this.b;
                zzchfVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbed
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchf zzchfVar3 = zzchfVar2;
                        Future future = zzfyxVarZza;
                        if (zzchfVar3.isCancelled()) {
                            future.cancel(true);
                        }
                    }
                }, zzcha.zzf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
    }
}
