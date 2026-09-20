package defpackage;

import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzcvd;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oc6 implements zzbpq {
    public final /* synthetic */ zzcvd a;

    public oc6(zzcvd zzcvdVar) {
        this.a = zzcvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        zzcvd zzcvdVar = this.a;
        if (zzcvd.a(zzcvdVar, map)) {
            zzcvdVar.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a.d.zzj();
                }
            });
        }
    }
}
