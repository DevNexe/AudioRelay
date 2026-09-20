package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.hk1;
import defpackage.tp3;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements hk1<F1> {

    public static class CQf {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class F1 {
    }

    public static class QnHx {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: we3
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    @Override // defpackage.hk1
    public final List<Class<? extends hk1<?>>> a() {
        return Collections.emptyList();
    }

    @Override // defpackage.hk1
    public final F1 b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new F1();
        }
        QnHx.a(new tp3(1, this, context.getApplicationContext()));
        return new F1();
    }
}
