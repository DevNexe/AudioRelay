package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.CSv;
import defpackage.kj0;
import defpackage.lm3;
import defpackage.mx0;
import defpackage.q22;
import defpackage.qx0;
import defpackage.ry;
import defpackage.tN;
import defpackage.yx0;
import defpackage.yy;
import defpackage.zx0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static lm3 lambda$getComponents$0(yy yyVar) {
        mx0 mx0Var;
        Context context = (Context) yyVar.d(Context.class);
        qx0 qx0Var = (qx0) yyVar.d(qx0.class);
        yx0 yx0Var = (yx0) yyVar.d(yx0.class);
        tN tNVar = (tN) yyVar.d(tN.class);
        synchronized (tNVar) {
            if (!tNVar.a.containsKey("frc")) {
                tNVar.a.put("frc", new mx0(tNVar.b));
            }
            mx0Var = (mx0) tNVar.a.get("frc");
        }
        return new lm3(context, qx0Var, yx0Var, mx0Var, yyVar.u(CSv.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(lm3.class);
        qnHxA.a(new kj0(1, 0, Context.class));
        qnHxA.a(new kj0(1, 0, qx0.class));
        qnHxA.a(new kj0(1, 0, yx0.class));
        qnHxA.a(new kj0(1, 0, tN.class));
        qnHxA.a(new kj0(0, 1, CSv.class));
        qnHxA.e = new zx0(1);
        qnHxA.c();
        return Arrays.asList(qnHxA.b(), q22.a("fire-rc", "21.1.2"));
    }
}
