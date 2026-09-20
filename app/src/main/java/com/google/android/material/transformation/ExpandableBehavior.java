package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bi5;
import defpackage.qv0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.F1<View> {
    public int a;

    public class QnHx implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View w;
        public final /* synthetic */ int x;
        public final /* synthetic */ qv0 y;

        public QnHx(View view, int i, qv0 qv0Var) {
            this.w = view;
            this.x = i;
            this.y = qv0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.w;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.x) {
                qv0 qv0Var = this.y;
                expandableBehavior.s((View) qv0Var, view, qv0Var.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        qv0 qv0Var = (qv0) view2;
        if (!(!qv0Var.a() ? this.a != 1 : !((i = this.a) == 0 || i == 2))) {
            return false;
        }
        this.a = qv0Var.a() ? 1 : 2;
        s((View) qv0Var, view, qv0Var.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        qv0 qv0Var;
        int i2;
        Field field = bi5.a;
        if (!bi5.auxFixed.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    qv0Var = null;
                    break;
                }
                View view2 = (View) arrayListJ.get(i3);
                if (b(view, view2)) {
                    qv0Var = (qv0) view2;
                    break;
                }
                i3++;
            }
            if (qv0Var != null) {
                if (!qv0Var.a() ? this.a != 1 : !((i2 = this.a) == 0 || i2 == 2)) {
                    int i4 = qv0Var.a() ? 1 : 2;
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new QnHx(view, i4, qv0Var));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
