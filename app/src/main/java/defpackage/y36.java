package defpackage;

import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzchf;

/* JADX INFO: loaded from: classes3.dex */
public final class y36 implements QnHx.CQf {
    public final /* synthetic */ zzchf a;
    public final /* synthetic */ zzbeh b;

    public y36(zzbeh zzbehVar, v36 v36Var) {
        this.b = zzbehVar;
        this.a = v36Var;
    }

    @Override // com.google.android.gms.common.internal.QnHx.CQf
    public final void onConnectionFailed(z50 z50Var) {
        synchronized (this.b.c) {
            this.a.zze(new RuntimeException("Connection failed."));
        }
    }
}
