package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public class zv1 {
    public static zv1 a;

    public zv1() {
    }

    public static final long b(KeyEvent keyEvent) {
        return fp1.m(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public void a(float f, float f2, hj4 hj4Var) {
        throw null;
    }

    public /* synthetic */ zv1(int i) {
    }
}
