package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.ads.AdError;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dc1<V extends View> extends nj5<V> {
    public QnHx c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public class QnHx implements Runnable {
        public final CoordinatorLayout w;
        public final V x;

        public QnHx(CoordinatorLayout coordinatorLayout, V v) {
            this.w = coordinatorLayout;
            this.x = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dc1 dc1Var;
            OverScroller overScroller;
            V v = this.x;
            if (v == null || (overScroller = (dc1Var = dc1.this).d) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.w;
            if (!zComputeScrollOffset) {
                dc1Var.y(v, coordinatorLayout);
                return;
            }
            dc1Var.A(coordinatorLayout, v, dc1Var.d.getCurrY());
            Field field = bi5.a;
            bi5.LPt8Fixed.m(v, this);
        }
    }

    public dc1() {
        this.f = -1;
        this.h = -1;
    }

    public final void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        z(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean g(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.g) > this.h) {
                this.g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = u(v) && coordinatorLayout.o(v, x, y2);
            this.e = z;
            if (z) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean r(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.g - y;
                this.g = y;
                z(coordinatorLayout, v, x() - i, v(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f = motionEvent.getPointerId(i2);
                    this.g = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.e || z;
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.i.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE);
            float yVelocity = this.i.getYVelocity(this.f);
            int i3 = -w(v);
            QnHx qnHx = this.c;
            if (qnHx != null) {
                v.removeCallbacks(qnHx);
                this.c = null;
            }
            if (this.d == null) {
                this.d = new OverScroller(v.getContext());
            }
            this.d.fling(0, s(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.d.computeScrollOffset()) {
                QnHx qnHx2 = new QnHx(coordinatorLayout, v);
                this.c = qnHx2;
                Field field = bi5.a;
                bi5.LPt8Fixed.m(v, qnHx2);
            } else {
                y(v, coordinatorLayout);
            }
            z = true;
        }
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i = null;
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
            return true;
        }
        z = false;
        this.e = false;
        this.f = -1;
        velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i = null;
        }
        velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.e) {
            return true;
        }
    }

    public boolean u(V v) {
        return false;
    }

    public int v(V v) {
        return -v.getHeight();
    }

    public int w(V v) {
        return v.getHeight();
    }

    public int x() {
        return s();
    }

    public void y(View view, CoordinatorLayout coordinatorLayout) {
    }

    public int z(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int iM;
        int iS = s();
        if (i2 == 0 || iS < i2 || iS > i3 || iS == (iM = C0239D.m(i, i2, i3))) {
            return 0;
        }
        oj5 oj5Var = this.a;
        if (oj5Var == null) {
            this.b = iM;
        } else if (oj5Var.d != iM) {
            oj5Var.d = iM;
            oj5Var.a();
        }
        return iS - iM;
    }

    public dc1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.h = -1;
    }
}
