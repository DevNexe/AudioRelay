package com.google.android.gms.common.internal;

import android.os.Bundle;
import defpackage.v50;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed implements QnHx.InterfaceC0075QnHx {
    public final /* synthetic */ v50 a;

    public LPt8Fixed(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        this.a.onConnected();
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        this.a.onConnectionSuspended(i);
    }
}
