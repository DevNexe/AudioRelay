package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.q22;
import defpackage.ry;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ry<?>> getComponents() {
        return Collections.singletonList(q22.a("fire-analytics-ktx", "21.1.1"));
    }
}
