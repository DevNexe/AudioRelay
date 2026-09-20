package defpackage;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class h86 extends zzb {
    public final /* synthetic */ zzcfw b;

    public h86(zzcfw zzcfwVar) {
        this.b = zzcfwVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcfw zzcfwVar = this.b;
        zzbjb zzbjbVar = new zzbjb(zzcfwVar.e, zzcfwVar.f.zza);
        synchronized (this.b.a) {
            try {
                zzt.zze();
                zzbje.zza(this.b.g, zzbjbVar);
            } catch (IllegalArgumentException e) {
                zzcgn.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
