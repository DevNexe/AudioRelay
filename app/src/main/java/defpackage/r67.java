package defpackage;

import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzapa;
import com.google.android.gms.internal.ads.zzapb;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class r67 implements Callable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r67(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                zzs zzsVar = (zzs) obj;
                return new zzapb(zzapa.zzs(zzsVar.w.zza, zzsVar.z, false));
            default:
                return new n17(((x66) obj).d);
        }
    }
}
