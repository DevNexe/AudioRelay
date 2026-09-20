package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class wj5 {
    public static final ak5 a;
    public static final QnHx b;

    public class CQf extends Property<View, Rect> {
        public CQf() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            Field field = bi5.a;
            return bi5.YKK.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            Field field = bi5.a;
            bi5.YKK.c(view, rect);
        }
    }

    public class QnHx extends Property<View, Float> {
        public QnHx() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(wj5.a.H(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            wj5.a.I(view, fFloatValue);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new dk5();
        } else if (i >= 23) {
            a = new ck5();
        } else if (i >= 22) {
            a = new bk5();
        } else {
            a = new ak5();
        }
        b = new QnHx();
        new CQf();
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.A(view, i, i2, i3, i4);
    }
}
