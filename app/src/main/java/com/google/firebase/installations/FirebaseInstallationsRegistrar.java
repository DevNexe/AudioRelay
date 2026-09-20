package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.iE;
import defpackage.kj0;
import defpackage.oy;
import defpackage.q22;
import defpackage.qx0;
import defpackage.rc1;
import defpackage.ry;
import defpackage.sc1;
import defpackage.xx0;
import defpackage.yx0;
import defpackage.yy;
import defpackage.zx0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yx0 lambda$getComponents$0(yy yyVar) {
        return new xx0((qx0) yyVar.d(qx0.class), yyVar.u(sc1.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(yx0.class);
        int i = 0;
        qnHxA.a(new kj0(1, 0, qx0.class));
        qnHxA.a(new kj0(0, 1, sc1.class));
        qnHxA.e = new zx0(i);
        iE iEVar = new iE();
        ry.QnHx qnHxA2 = ry.a(rc1.class);
        qnHxA2.d = 1;
        qnHxA2.e = new oy(iEVar, i);
        return Arrays.asList(qnHxA.b(), qnHxA2.b(), q22.a("fire-installations", "17.0.3"));
    }
}
