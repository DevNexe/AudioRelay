package defpackage;

import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzdno;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qe6 implements zzbpq {
    public final WeakReference a;

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzdno zzdnoVar = (zzdno) this.a.get();
        if (zzdnoVar == null) {
            return;
        }
        zzdnoVar.g.zza();
    }
}
