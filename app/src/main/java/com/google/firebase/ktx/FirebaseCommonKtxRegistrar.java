package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.q22;
import defpackage.ry;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ry<?>> getComponents() {
        return Collections.singletonList(q22.a("fire-core-ktx", "20.1.2"));
    }
}
