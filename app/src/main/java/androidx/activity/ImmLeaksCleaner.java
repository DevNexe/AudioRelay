package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import defpackage.d32;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements auxFixed {
    public static Field A;
    public static int x;
    public static Field y;
    public static Field z;
    public final Activity w;

    public ImmLeaksCleaner(Activity activity) {
        this.w = activity;
    }

    @Override // androidx.lifecycle.auxFixed
    public final void h(d32 d32Var, YKK.CQf cQf) {
        if (cQf != YKK.CQf.ON_DESTROY) {
            return;
        }
        if (x == 0) {
            try {
                x = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                z = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                A = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                y = declaredField3;
                declaredField3.setAccessible(true);
                x = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (x == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.w.getSystemService("input_method");
            try {
                Object obj = y.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) z.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                A.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
