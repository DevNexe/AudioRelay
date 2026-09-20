package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class bp0 {
    public static final int[] a = {R.attr.state_checked};
    public static final int[] b = new int[0];
    public static final Rect c = new Rect();

    public static class CQf {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static class QnHx {
        public static final boolean a;
        public static final Method b;
        public static final Field c;
        public static final Field d;
        public static final Field e;
        public static final Field f;

        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            b = method;
                            c = field;
                            d = field2;
                            e = field3;
                            f = field4;
                            a = true;
                            return;
                        }
                        b = null;
                        c = null;
                        d = null;
                        e = null;
                        f = null;
                        a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        b = method;
                        c = field;
                        d = field2;
                        e = field3;
                        f = field4;
                        a = true;
                        return;
                    }
                    b = null;
                    c = null;
                    d = null;
                    e = null;
                    f = null;
                    a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z) {
                b = method;
                c = field;
                d = field2;
                e = field3;
                f = field4;
                a = true;
                return;
            }
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            a = false;
        }
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = b;
        int[] iArr2 = a;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr2);
            } else {
                drawable.setState(iArr);
            }
            drawable.setState(state);
            return;
        }
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr2);
        } else {
            drawable.setState(iArr);
        }
        drawable.setState(state2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        Object objA;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = CQf.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        if (drawable instanceof jo5) {
            objA = drawable;
            objA = ((jo5) drawable).a();
        }
        if (i >= 29) {
            boolean z = QnHx.a;
        } else if (QnHx.a) {
            try {
                Object objInvoke = QnHx.b.invoke(objA, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(QnHx.c.getInt(objInvoke), QnHx.d.getInt(objInvoke), QnHx.e.getInt(objInvoke), QnHx.f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
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
