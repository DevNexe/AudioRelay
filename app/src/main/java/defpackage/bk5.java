package defpackage;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class bk5 extends ak5 {
    public static boolean I = true;

    @Override // defpackage.kd
    @SuppressLint({"NewApi"})
    public void A(View view, int i, int i2, int i3, int i4) {
        if (I) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                I = false;
            }
        }
    }
}
