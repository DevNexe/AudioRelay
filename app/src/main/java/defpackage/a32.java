package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.PRnFixed;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a32 {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static class QnHx extends sr0 {
        @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            PRnFixed.c(activity);
        }

        @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // defpackage.sr0, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
