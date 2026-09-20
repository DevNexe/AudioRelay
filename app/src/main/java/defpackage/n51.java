package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class n51 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public QnHx A;
    public CQf B;
    public boolean C;
    public int D;
    public final int[] E = new int[2];
    public final float w;
    public final int x;
    public final int y;
    public final View z;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n51 n51Var = n51.this;
            n51Var.a();
            View view = n51Var.z;
            if (view.isEnabled() && !view.isLongClickable() && n51Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                n51Var.C = true;
            }
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = n51.this.z.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public n51(View view) {
        this.z = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.w = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.x = tapTimeout;
        this.y = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        CQf cQf = this.B;
        View view = this.z;
        if (cQf != null) {
            view.removeCallbacks(cQf);
        }
        QnHx qnHx = this.A;
        if (qnHx != null) {
            view.removeCallbacks(qnHx);
        }
    }

    public abstract ek4 b();

    public abstract boolean c();

    public boolean d() {
        ek4 ek4VarB = b();
        if (ek4VarB == null || !ek4VarB.c()) {
            return true;
        }
        ek4VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        zp0 zp0VarH;
        boolean z4 = this.C;
        View view2 = this.z;
        if (z4) {
            ek4 ek4VarB = b();
            if (ek4VarB == null || !ek4VarB.c() || (zp0VarH = ek4VarB.h()) == null || !zp0VarH.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.E;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                zp0VarH.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = zp0VarH.b(motionEventObtainNoHistory, this.D);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            z2 = z3 || !d();
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.D = motionEvent.getPointerId(0);
                    if (this.A == null) {
                        this.A = new QnHx();
                    }
                    view2.postDelayed(this.A, this.x);
                    if (this.B == null) {
                        this.B = new CQf();
                    }
                    view2.postDelayed(this.B, this.y);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.D);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.w;
                        float f2 = -f;
                        if (!(x >= f2 && y >= f2 && x < ((float) (view2.getRight() - view2.getLeft())) + f && y < ((float) (view2.getBottom() - view2.getTop())) + f)) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z = false;
            } else {
                z = false;
            }
            z2 = z && c();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.C = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.C = false;
        this.D = -1;
        QnHx qnHx = this.A;
        if (qnHx != null) {
            this.z.removeCallbacks(qnHx);
        }
    }
}
