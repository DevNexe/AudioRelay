package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.CQf;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.CSv;
import defpackage.OU;
import defpackage.hw4;
import defpackage.ix1;
import defpackage.kj0;
import defpackage.oa3;
import defpackage.pe0;
import defpackage.q22;
import defpackage.qx0;
import defpackage.ry;
import defpackage.yy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static CSv lambda$getComponents$0(yy yyVar) {
        boolean z;
        qx0 qx0Var = (qx0) yyVar.d(qx0.class);
        Context context = (Context) yyVar.d(Context.class);
        hw4 hw4Var = (hw4) yyVar.d(hw4.class);
        oa3.h(qx0Var);
        oa3.h(context);
        oa3.h(hw4Var);
        oa3.h(context.getApplicationContext());
        if (OU.c == null) {
            synchronized (OU.class) {
                if (OU.c == null) {
                    Bundle bundle = new Bundle(1);
                    qx0Var.a();
                    if ("[DEFAULT]".equals(qx0Var.b)) {
                        hw4Var.a();
                        qx0Var.a();
                        pe0 pe0Var = qx0Var.g.get();
                        synchronized (pe0Var) {
                            z = pe0Var.b;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    OU.c = new OU(CQf.f(context, null, null, null, bundle).b);
                }
            }
        }
        return OU.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<ry<?>> getComponents() {
        ry.QnHx qnHxA = ry.a(CSv.class);
        qnHxA.a(new kj0(1, 0, qx0.class));
        qnHxA.a(new kj0(1, 0, Context.class));
        qnHxA.a(new kj0(1, 0, hw4.class));
        qnHxA.e = ix1.x;
        qnHxA.c();
        return Arrays.asList(qnHxA.b(), q22.a("fire-analytics", "21.1.1"));
    }
}
