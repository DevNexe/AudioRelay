package defpackage;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class gh3 extends QueryInfoGenerationCallback {
    public final tp1 a;
    public final jh3 b;

    public gh3(jh3 jh3Var, tp1 tp1Var) {
        this.a = tp1Var;
        this.b = jh3Var;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        this.b.c = str;
        this.a.c();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        this.b.b = queryInfo;
        this.a.c();
    }
}
