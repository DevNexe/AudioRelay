package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzchj;

/* JADX INFO: loaded from: classes3.dex */
public final class a66 implements zzchj, zzchh {
    public final /* synthetic */ zzbtl w;

    @Override // com.google.android.gms.internal.ads.zzchh
    /* JADX INFO: renamed from: zza */
    public final void mo43zza() {
        zze.zza("Rejecting reference for JS Engine.");
        this.w.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zze.zza("Releasing engine reference.");
        this.w.d.b();
    }
}
