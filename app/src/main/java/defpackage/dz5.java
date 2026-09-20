package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzaow;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzfoh;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class dz5 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public dz5(zzato zzatoVar) {
        this.w = 2;
        this.x = zzatoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        boolean z = false;
        switch (this.w) {
            case 0:
                if (((zzaow) this.x).b != null) {
                    return;
                }
                synchronized (zzaow.c) {
                    if (((zzaow) this.x).b != null) {
                        return;
                    }
                    try {
                        zBooleanValue = ((Boolean) zzbiy.zzca.zze()).booleanValue();
                        break;
                    } catch (IllegalStateException unused) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        try {
                            zzaow.d = zzfoh.zzb(((zzaow) this.x).a.a, "ADSHIELD", null);
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                    z = zBooleanValue;
                    ((zzaow) this.x).b = Boolean.valueOf(z);
                    zzaow.c.open();
                    return;
                }
            case 1:
                zzaqb zzaqbVar = (zzaqb) this.x;
                zzaqbVar.getClass();
                try {
                    if (zzaqbVar.f == null && zzaqbVar.i) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(zzaqbVar.a);
                        advertisingIdClient.start();
                        zzaqbVar.f = advertisingIdClient;
                        return;
                    }
                    return;
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused3) {
                    zzaqbVar.f = null;
                    return;
                }
            case 2:
                return;
            case 3:
                zzcia zzciaVar = (zzcia) this.x;
                zzcib zzcibVar = zzciaVar.L;
                if (zzcibVar != null) {
                    zzcibVar.zzd();
                    zzciaVar.L.zzi();
                    return;
                }
                return;
            default:
                int i = zzcik.O;
                ((zzcik) this.x).b("surfaceDestroyed", new String[0]);
                return;
        }
    }

    public /* synthetic */ dz5(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }
}
