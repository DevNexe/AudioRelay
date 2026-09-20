package defpackage;

import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;

/* JADX INFO: loaded from: classes3.dex */
public final class nm6 extends zzfqw {
    public final /* synthetic */ om6 x;

    public nm6(om6 om6Var) {
        this.x = om6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void a() {
        om6 om6Var = this.x;
        zzfrg zzfrgVar = om6Var.a;
        zzfrgVar.b.zzd("unlinkToDeath", new Object[0]);
        zzfrgVar.m.asBinder().unlinkToDeath(zzfrgVar.j, 0);
        zzfrg zzfrgVar2 = om6Var.a;
        zzfrgVar2.m = null;
        zzfrgVar2.g = false;
    }
}
