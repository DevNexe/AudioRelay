package defpackage;

import android.app.Activity;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class q2H0 extends r80 {
    public static final /* synthetic */ int b = 0;

    public static class CQf {
        public static void a(Object obj) {
            ((SharedElementCallback$OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface F1 {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public interface LPt8Fixed {
        void f();
    }

    public static class QnHx {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }
}
