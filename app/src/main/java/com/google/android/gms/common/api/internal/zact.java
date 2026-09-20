package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.F1;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.zac;
import defpackage.ep5;
import defpackage.jq5;
import defpackage.mr5;
import defpackage.nq5;
import defpackage.os;
import defpackage.pq5;
import defpackage.wp5;
import defpackage.z50;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zact extends zac implements F1.QnHx, F1.CQf {
    public static final ep5 D = nq5.a;
    public final os A;
    public pq5 B;
    public jq5 C;
    public final Context w;
    public final Handler x;
    public final ep5 y = D;
    public final Set<Scope> z;

    public zact(Context context, mr5 mr5Var, os osVar) {
        this.w = context;
        this.x = mr5Var;
        this.A = osVar;
        this.z = osVar.b;
    }

    @Override // defpackage.v50
    public final void onConnected() {
        this.B.b(this);
    }

    @Override // defpackage.lu2
    public final void onConnectionFailed(z50 z50Var) {
        ((wp5) this.C).b(z50Var);
    }

    @Override // defpackage.v50
    public final void onConnectionSuspended(int i) {
        this.B.disconnect();
    }
}
