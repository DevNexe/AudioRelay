package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class in {
    public static final in a = new in();

    public final void a(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
