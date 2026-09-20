package defpackage;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzdkl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g56 implements zzx {
    public boolean a = false;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zza c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Map e;

    public g56(boolean z, zza zzaVar, HashMap map, Map map2) {
        this.b = z;
        this.c = zzaVar;
        this.d = map;
        this.e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z) {
        if (this.a) {
            return;
        }
        zza zzaVar = this.c;
        if (z && this.b) {
            ((zzdkl) zzaVar).zzq();
        }
        this.a = true;
        String str = (String) this.e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = this.d;
        map.put(str, boolValueOf);
        ((zzbsi) zzaVar).zzd("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i) {
    }
}
