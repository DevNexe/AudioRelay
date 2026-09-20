package defpackage;

import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzdtl;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class df6 implements zzbpq {
    public final WeakReference a;
    public final String b;
    public final zzbpq c;
    public final /* synthetic */ zzdtl d;

    public /* synthetic */ df6(zzdtl zzdtlVar, WeakReference weakReference, String str, zzbpq zzbpqVar) {
        this.d = zzdtlVar;
        this.a = weakReference;
        this.b = str;
        this.c = zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        Object obj2 = this.a.get();
        if (obj2 == null) {
            this.d.zzk(this.b, this);
        } else {
            this.c.zza(obj2, map);
        }
    }
}
