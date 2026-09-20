package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ht4 implements gt4 {
    public static boolean a;
    public static Constructor<StaticLayout> b;

    @Override // defpackage.gt4
    public StaticLayout a(it4 it4Var) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<StaticLayout> constructor;
        StaticLayout staticLayoutNewInstance = null;
        if (a) {
            constructor = b;
        } else {
            a = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                b = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            constructor = b;
        }
        if (constructor != null) {
            try {
                staticLayoutNewInstance = constructor.newInstance(it4Var.a, Integer.valueOf(it4Var.b), Integer.valueOf(it4Var.c), it4Var.d, Integer.valueOf(it4Var.e), it4Var.g, it4Var.f, Float.valueOf(it4Var.k), Float.valueOf(it4Var.l), Boolean.valueOf(it4Var.n), it4Var.i, Integer.valueOf(it4Var.j), Integer.valueOf(it4Var.h));
            } catch (IllegalAccessException unused2) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused3) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused4) {
                b = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        return staticLayoutNewInstance != null ? staticLayoutNewInstance : new StaticLayout(it4Var.a, it4Var.b, it4Var.c, it4Var.d, it4Var.e, it4Var.g, it4Var.k, it4Var.l, it4Var.n, it4Var.i, it4Var.j);
    }
}
