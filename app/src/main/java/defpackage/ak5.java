package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ak5 extends zj5 {
    public static boolean G = true;
    public static boolean H = true;

    @SuppressLint({"NewApi"})
    public void J(View view, Matrix matrix) {
        if (G) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                G = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void K(View view, Matrix matrix) {
        if (H) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                H = false;
            }
        }
    }
}
