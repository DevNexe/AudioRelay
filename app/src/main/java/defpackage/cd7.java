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
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public final class cd7 implements zzfyk {
    public final /* synthetic */ zzbzp w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ zzaa y;

    public cd7(zzaa zzaaVar, zzbzp zzbzpVar, boolean z) {
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
        zzaa zzaaVar;
        List<Uri> list = (List) obj;
        try {
            ArrayList arrayList = zzaa.Y;
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                zzaaVar = this.y;
                if (zHasNext) {
                    if (zzaa.Q0((Uri) it.next(), zzaaVar.U, zzaaVar.V)) {
                        zzaaVar.Q.getAndIncrement();
                        break;
                    }
                } else {
                    break;
                }
            }
            this.w.zzf(list);
            if (zzaaVar.L || this.x) {
                for (Uri uri : list) {
                    boolean zQ0 = zzaa.Q0(uri, zzaaVar.U, zzaaVar.V);
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
