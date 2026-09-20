package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.cq3;
import defpackage.ez;
import defpackage.fx0;
import defpackage.ic0;
import defpackage.kj0;
import defpackage.kw;
import defpackage.q22;
import defpackage.ry;
import defpackage.sx0;
import defpackage.yb0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(yb0.class);
        qnHxA.a(new kj0(1, 0, Context.class));
        qnHxA.e = new ez() { // from class: com.google.firebase.crashlytics.ndk.QnHx
            @Override // defpackage.ez
            public final Object a(cq3 cq3Var) {
                this.w.getClass();
                Context context = (Context) cq3Var.d(Context.class);
                return new sx0(new ic0(context, new JniNativeApi(context), new fx0(context)), !(kw.f(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
            }
        };
        qnHxA.c();
        return Arrays.asList(qnHxA.b(), q22.a("fire-cls-ndk", "18.2.13"));
    }
}
