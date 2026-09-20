package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.UT;
import defpackage.bi5;
import defpackage.yi5;
import defpackage.yx4;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.F1<V> {
    public yi5 a;
    public boolean b;
    public int c = 2;
    public final float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    public final QnHx g = new QnHx();

    public class CQf implements Runnable {
        public final View w;

        public CQf(View view, boolean z) {
            this.w = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            yi5 yi5Var = SwipeDismissBehavior.this.a;
            if (yi5Var == null || !yi5Var.g()) {
                return;
            }
            Field field = bi5.a;
            bi5.LPt8Fixed.m(this.w, this);
        }
    }

    public class QnHx extends yi5.F1 {
        public int a;
        public int b = -1;

        public QnHx() {
        }

        @Override // yi5.F1
        public final int a(View view, int i) {
            int width;
            int width2;
            int width3;
            Field field = bi5.a;
            boolean z = bi5.NUlFixed.d(view) == 1;
            int i2 = SwipeDismissBehavior.this.c;
            if (i2 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i2 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // yi5.F1
        public final int b(View view, int i) {
            return view.getTop();
        }

        @Override // yi5.F1
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // yi5.F1
        public final void e(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // yi5.F1
        public final void f(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // yi5.F1
        public final void g(View view, int i, int i2) {
            float f = this.a;
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f2 = (width * swipeDismissBehavior.e) + f;
            float width2 = (view.getWidth() * swipeDismissBehavior.f) + this.a;
            float f3 = i;
            if (f3 <= f2) {
                view.setAlpha(1.0f);
            } else if (f3 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0053  */
        /* JADX WARN: Code duplicated, block: B:28:0x0055  */
        @Override // yi5.F1
        public final void h(View view, float f, float f2) {
            boolean z;
            int i;
            this.b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z2 = true;
            if (f != 0.0f) {
                Field field = bi5.a;
                boolean z3 = bi5.NUlFixed.d(view) == 1;
                int i2 = swipeDismissBehavior.c;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.a) >= Math.round(view.getWidth() * swipeDismissBehavior.d)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                int left = view.getLeft();
                int i3 = this.a;
                i = left < i3 ? i3 - width : i3 + width;
            } else {
                i = this.a;
                z2 = false;
            }
            if (swipeDismissBehavior.a.q(i, view.getTop())) {
                CQf cQf = new CQf(view, z2);
                Field field2 = bi5.a;
                bi5.LPt8Fixed.m(view, cQf);
            }
        }

        @Override // yi5.F1
        public final boolean i(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.s(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zO = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b = false;
        }
        if (!zO) {
            return false;
        }
        if (this.a == null) {
            this.a = new yi5(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.a.r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean h(CoordinatorLayout coordinatorLayout, V v, int i) {
        Field field = bi5.a;
        if (bi5.LPt8Fixed.c(v) == 0) {
            bi5.LPt8Fixed.s(v, 1);
            bi5.j(v, 1048576);
            bi5.f(v, 0);
            if (s(v)) {
                bi5.k(v, UT.QnHx.l, new yx4(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        yi5 yi5Var = this.a;
        if (yi5Var == null) {
            return false;
        }
        yi5Var.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
