package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ck5 extends bk5 {
    public static boolean J = true;

    @Override // defpackage.kd
    @SuppressLint({"NewApi"})
    public void D(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.D(view, i);
        } else if (J) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                J = false;
            }
        }
    }
}
