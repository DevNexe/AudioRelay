package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.CQf;
import defpackage.fy6;
import defpackage.k15;
import defpackage.oa3;
import defpackage.qb6;
import defpackage.qx0;
import defpackage.xx0;
import defpackage.yx0;
import defpackage.z66;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final CQf a;

    public FirebaseAnalytics(CQf cQf) {
        oa3.h(cQf);
        this.a = cQf;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (b == null) {
                    b = new FirebaseAnalytics(CQf.f(context, null, null, null, null));
                }
            }
        }
        return b;
    }

    @Keep
    public static fy6 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        CQf cQfF = CQf.f(context, null, null, null, bundle);
        if (cQfF == null) {
            return null;
        }
        return new z66(cQfF);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = xx0.m;
            qx0 qx0VarB = qx0.b();
            qx0VarB.a();
            return (String) k15.b(((xx0) qx0VarB.d.d(yx0.class)).getId(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        CQf cQf = this.a;
        cQf.getClass();
        cQf.c(new qb6(cQf, activity, str, str2));
    }
}
