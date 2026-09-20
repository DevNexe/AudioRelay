package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzegn;
import com.google.android.gms.internal.ads.zzego;

/* JADX INFO: loaded from: classes3.dex */
public final class uh6 implements zzdeh {
    public boolean a = false;
    public final /* synthetic */ zzegn b;
    public final /* synthetic */ zzchf c;

    public uh6(zzegn zzegnVar, zzchf zzchfVar) {
        this.b = zzegnVar;
        this.c = zzchfVar;
    }

    public final synchronized void a(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzay.zzc().zzb(zzbiy.zzey)).booleanValue()) {
            i = 3;
        }
        this.c.zze(new zzego(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final synchronized void zza(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        a(new zze(i, "Error from: " + this.b.zza + ", code: " + i, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final synchronized void zzb(zze zzeVar) {
        if (this.a) {
            return;
        }
        this.a = true;
        a(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final synchronized void zzc(int i, String str) {
        if (this.a) {
            return;
        }
        this.a = true;
        if (str == null) {
            str = "Error from: " + this.b.zza + ", code: " + i;
        }
        a(new zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final synchronized void zzd() {
        this.c.zzd(null);
    }
}
