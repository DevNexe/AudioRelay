package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfyk;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public final class vc7 implements zzfyk {
    public final /* synthetic */ zzbzp w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ zzaa y;

    public vc7(zzaa zzaaVar, zzbzp zzbzpVar, boolean z) {
        this.y = zzaaVar;
        this.w = zzbzpVar;
        this.x = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        try {
            this.w.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(@Nonnull Object obj) {
        zzaa zzaaVar = this.y;
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.w.zzf(arrayList);
            if (zzaaVar.K || this.x) {
                for (Uri uri : arrayList) {
                    boolean zQ0 = zzaa.Q0(uri, zzaaVar.W, zzaaVar.X);
                    zzfju zzfjuVar = zzaaVar.J;
                    if (zQ0) {
                        zzfjuVar.zzc(zzaa.R0(uri, zzaaVar.T, "1").toString(), null);
                    } else {
                        if (((Boolean) zzay.zzc().zzb(zzbiy.zzgx)).booleanValue()) {
                            zzfjuVar.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }
}
