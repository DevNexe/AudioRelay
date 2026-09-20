package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import defpackage.d32;
import defpackage.e32;

/* JADX INFO: loaded from: classes.dex */
public final class PRnFixed extends Fragment {
    public static final /* synthetic */ int x = 0;
    public QnHx w;

    public static class CQf implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new CQf());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            PRnFixed.a(activity, YKK.CQf.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            PRnFixed.a(activity, YKK.CQf.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            PRnFixed.a(activity, YKK.CQf.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            PRnFixed.a(activity, YKK.CQf.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            PRnFixed.a(activity, YKK.CQf.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            PRnFixed.a(activity, YKK.CQf.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public interface QnHx {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, YKK.CQf cQf) {
        if (activity instanceof e32) {
            ((e32) activity).c().f(cQf);
        } else if (activity instanceof d32) {
            YKK ykkC = ((d32) activity).c();
            if (ykkC instanceof T23) {
                ((T23) ykkC).f(cQf);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            CQf.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new PRnFixed(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(YKK.CQf cQf) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), cQf);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(YKK.CQf.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        b(YKK.CQf.ON_DESTROY);
        this.w = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        b(YKK.CQf.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        QnHx qnHx = this.w;
        if (qnHx != null) {
            EQ.this.a();
        }
        b(YKK.CQf.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        QnHx qnHx = this.w;
        if (qnHx != null) {
            EQ eq = EQ.this;
            int i = eq.w + 1;
            eq.w = i;
            if (i == 1 && eq.z) {
                eq.B.f(YKK.CQf.ON_START);
                eq.z = false;
            }
        }
        b(YKK.CQf.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        b(YKK.CQf.ON_STOP);
    }
}
