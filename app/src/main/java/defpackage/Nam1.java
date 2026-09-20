package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class Nam1 implements wz4 {
    public final View a;
    public final Window b;
    public final lm5 c;

    public Nam1(View view, Window window) {
        this.a = view;
        this.b = window;
        this.c = window != null ? new lm5(view, window) : null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    @Override // defpackage.wz4
    public final void a(long j, boolean z, j81<? super yu, yu> j81Var) {
        boolean z2;
        lm5 lm5Var = this.c;
        if (lm5Var != null) {
            lm5Var.a.b(z);
        }
        Window window = this.b;
        if (window == null) {
            return;
        }
        if (z) {
            if (lm5Var != null) {
                z2 = lm5Var.a.a();
            }
            if (!z2) {
                j = j81Var.invoke(new yu(j)).a;
            }
        }
        window.setStatusBarColor(hH.A(j));
    }
}
