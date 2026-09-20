package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ap0 {
    public static final oz1 a = qLd.h(3, QnHx.w);

    public static final class QnHx extends cx1 implements h81<Handler> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final long a(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? cm4.c : ps0.e(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
