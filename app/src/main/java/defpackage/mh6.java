package defpackage;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzego;
import com.google.android.gms.internal.ads.zzejm;
import com.google.android.gms.internal.ads.zzejx;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfds;
import com.google.android.gms.internal.ads.zzfem;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfyk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class mh6 implements zzfyk {
    public final /* synthetic */ zzfjq A;
    public final /* synthetic */ zzfde B;
    public final /* synthetic */ zzejx C;
    public final /* synthetic */ long w;
    public final /* synthetic */ String x;
    public final /* synthetic */ zzfcs y;
    public final /* synthetic */ zzfcv z;

    public mh6(zzejx zzejxVar, long j, String str, zzfcs zzfcsVar, zzfcv zzfcvVar, zzfjq zzfjqVar, zzfde zzfdeVar) {
        this.C = zzejxVar;
        this.w = j;
        this.x = str;
        this.y = zzfcsVar;
        this.z = zzfcvVar;
        this.A = zzfjqVar;
        this.B = zzfdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        int i;
        zze zzeVar;
        zzejx zzejxVar = this.C;
        long jC = zzejxVar.a.c() - this.w;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzejm) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfds) {
            i = 5;
        } else {
            i = ((th instanceof zzeas) && zzfem.zza(th).zza == 3) ? 1 : 6;
        }
        zzejx zzejxVar2 = this.C;
        String str = this.x;
        zzfcs zzfcsVar = this.y;
        zzejx.a(zzejxVar2, str, i, jC, zzfcsVar.zzah);
        if (zzejxVar.e) {
            zzejxVar.b.zza(this.z, this.y, i, th instanceof zzego ? (zzego) th : null, jC);
        }
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzhd)).booleanValue()) {
            zzejxVar.c.zzd(this.A.zzc(this.B, zzfcsVar, zzfcsVar.zzo));
        }
        zze zzeVarZza = zzfem.zza(th);
        int i2 = zzeVarZza.zza;
        if ((i2 == 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarZza = zzfem.zza(new zzego(13, zzeVarZza.zzd));
        }
        zzejxVar.f.zze(zzfcsVar, jC, zzeVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        zzejx zzejxVar = this.C;
        long jC = zzejxVar.a.c() - this.w;
        zzejx zzejxVar2 = this.C;
        String str = this.x;
        zzfcs zzfcsVar = this.y;
        zzejx.a(zzejxVar2, str, 0, jC, zzfcsVar.zzah);
        if (zzejxVar.e) {
            zzejxVar.b.zza(this.z, this.y, 0, null, jC);
        }
        zzejxVar.f.zzf(zzfcsVar, jC, null);
    }
}
