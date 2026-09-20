package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import defpackage.sr0;

/* JADX INFO: loaded from: classes.dex */
public final class FJCM extends sr0 {
    final /* synthetic */ EQ this$0;

    public class QnHx extends sr0 {
        public QnHx() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FJCM.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            EQ eq = FJCM.this.this$0;
            int i = eq.w + 1;
            eq.w = i;
            if (i == 1 && eq.z) {
                eq.B.f(YKK.CQf.ON_START);
                eq.z = false;
            }
        }
    }

    public FJCM(EQ eq) {
        this.this$0 = eq;
    }

    @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = PRnFixed.x;
            ((PRnFixed) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).w = this.this$0.D;
        }
    }

    @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        EQ eq = this.this$0;
        int i = eq.x - 1;
        eq.x = i;
        if (i == 0) {
            eq.A.postDelayed(eq.C, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        EQ.F1.a(activity, new QnHx());
    }

    @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        EQ eq = this.this$0;
        int i = eq.w - 1;
        eq.w = i;
        if (i == 0 && eq.y) {
            eq.B.f(YKK.CQf.ON_STOP);
            eq.z = true;
        }
    }
}
