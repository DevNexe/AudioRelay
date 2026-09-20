package defpackage;

import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzchf;

/* JADX INFO: loaded from: classes3.dex */
public final class q56 implements QnHx.CQf {
    public final /* synthetic */ zzchf a;

    public q56(zzchf zzchfVar) {
        this.a = zzchfVar;
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        this.a.zze(new RuntimeException("Connection failed."));
    }
}
