package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.CSv;
import defpackage.kj0;
import defpackage.oy;
import defpackage.q22;
import defpackage.qx0;
import defpackage.ry;
import defpackage.yb0;
import defpackage.yx0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(FirebaseCrashlytics.class);
        qnHxA.a(new kj0(1, 0, qx0.class));
        qnHxA.a(new kj0(1, 0, yx0.class));
        qnHxA.a(new kj0(0, 2, yb0.class));
        qnHxA.a(new kj0(0, 2, CSv.class));
        qnHxA.e = new oy(this, 1);
        qnHxA.c();
        return Arrays.asList(qnHxA.b(), q22.a("fire-cls", "18.2.13"));
    }
}
