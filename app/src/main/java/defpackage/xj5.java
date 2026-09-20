package defpackage;

import android.graphics.PorterDuff;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class xj5 {

    public static class CQf {
        public final int a;
        public final int b;
        public final int c;

        public CQf(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i3;
            this.c = i4;
        }
    }

    public interface QnHx {
    }

    public static boolean a(View view) {
        Field field = bi5.a;
        return bi5.NUlFixed.d(view) == 1;
    }

    public static PorterDuff.Mode b(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
