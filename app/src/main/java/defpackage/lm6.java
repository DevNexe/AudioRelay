package defpackage;

import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;

/* JADX INFO: loaded from: classes3.dex */
public final class lm6 extends zzfqw {
    public final /* synthetic */ zzfrg x;

    public lm6(zzfrg zzfrgVar) {
        this.x = zzfrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        zzfrg zzfrgVar = this.x;
        if (zzfrgVar.m != null) {
            zzfrgVar.b.zzd("Unbind from service.", new Object[0]);
            zzfrgVar.a.unbindService(zzfrgVar.l);
            zzfrgVar.g = false;
            zzfrgVar.m = null;
            zzfrgVar.l = null;
        }
        zzfrgVar.a();
    }
}
