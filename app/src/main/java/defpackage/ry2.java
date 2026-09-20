package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class ry2 {
    public static final ThreadLocal<vy2<Rect, Rect>> a = new ThreadLocal<>();

    public static class QnHx {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }
}
