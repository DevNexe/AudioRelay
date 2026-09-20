package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public class nj5<V extends View> extends CoordinatorLayout.F1<V> {
    public oj5 a;
    public int b;

    public nj5() {
        this.b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        t(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new oj5(v);
        }
        oj5 oj5Var = this.a;
        View view = oj5Var.a;
        oj5Var.b = view.getTop();
        oj5Var.c = view.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        oj5 oj5Var2 = this.a;
        if (oj5Var2.d != i2) {
            oj5Var2.d = i2;
            oj5Var2.a();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        oj5 oj5Var = this.a;
        if (oj5Var != null) {
            return oj5Var.d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.q(v, i);
    }

    public nj5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
