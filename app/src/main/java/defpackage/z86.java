package defpackage;

import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;

/* JADX INFO: loaded from: classes3.dex */
public final class z86 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ zzcia y;

    public z86(zzcia zzciaVar, int i, int i2) {
        this.y = zzciaVar;
        this.w = i;
        this.x = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcib zzcibVar = this.y.L;
        if (zzcibVar != null) {
            zzcibVar.zzj(this.w, this.x);
        }
    }
}
