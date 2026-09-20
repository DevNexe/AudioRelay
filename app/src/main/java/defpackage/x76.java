package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzces;

/* JADX INFO: loaded from: classes3.dex */
public final class x76 {
    public final ft a;
    public final zzg b;
    public final zzces c;

    public x76(ft ftVar, zzg zzgVar, zzces zzcesVar) {
        this.a = ftVar;
        this.b = zzgVar;
        this.c = zzcesVar;
    }

    public final void a(int i, long j) {
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzan)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.b;
        if (j - zzgVar.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        zzbiq zzbiqVar = zzbiy.zzao;
        if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
            zzgVar.zzK(i);
            zzgVar.zzL(j);
        } else {
            zzgVar.zzK(-1);
            zzgVar.zzL(j);
        }
        if (((Boolean) zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
            this.c.zzt();
        }
    }
}
