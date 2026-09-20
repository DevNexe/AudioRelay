package defpackage;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class zj5 extends kd {
    public static boolean F = true;

    @SuppressLint({"NewApi"})
    public float H(View view) {
        if (F) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void I(View view, float f) {
        if (F) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        view.setAlpha(f);
    }
}
