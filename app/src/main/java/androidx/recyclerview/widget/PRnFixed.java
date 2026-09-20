package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import defpackage.bi5;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PRnFixed extends RecyclerView.FJCM implements RecyclerView.MZ {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final QnHx B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public class CQf extends RecyclerView.LPt6Fixed {
        public CQf() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LPt6Fixed
        public final void b(RecyclerView recyclerView, int i, int i2) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            PRnFixed pRn = PRnFixed.this;
            int iComputeVerticalScrollRange = pRn.s.computeVerticalScrollRange();
            int i3 = pRn.r;
            int i4 = iComputeVerticalScrollRange - i3;
            int i5 = pRn.a;
            pRn.t = i4 > 0 && i3 >= i5;
            int iComputeHorizontalScrollRange = pRn.s.computeHorizontalScrollRange();
            int i6 = pRn.q;
            boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
            pRn.u = z;
            boolean z2 = pRn.t;
            if (!z2 && !z) {
                if (pRn.v != 0) {
                    pRn.g(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                pRn.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                pRn.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (pRn.u) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i6;
                pRn.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                pRn.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
            }
            int i7 = pRn.v;
            if (i7 == 0 || i7 == 1) {
                pRn.g(1);
            }
        }
    }

    public class F1 extends AnimatorListenerAdapter {
        public boolean w = false;

        public F1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.w = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.w) {
                this.w = false;
                return;
            }
            PRnFixed pRn = PRnFixed.this;
            if (((Float) pRn.z.getAnimatedValue()).floatValue() == 0.0f) {
                pRn.A = 0;
                pRn.g(0);
            } else {
                pRn.A = 2;
                pRn.s.invalidate();
            }
        }
    }

    public class LPt8Fixed implements ValueAnimator.AnimatorUpdateListener {
        public LPt8Fixed() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            PRnFixed pRn = PRnFixed.this;
            pRn.c.setAlpha(iFloatValue);
            pRn.d.setAlpha(iFloatValue);
            pRn.s.invalidate();
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PRnFixed pRn = PRnFixed.this;
            int i = pRn.A;
            ValueAnimator valueAnimator = pRn.z;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            pRn.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(RCHTTPStatusCodes.ERROR);
            valueAnimator.start();
        }
    }

    public PRnFixed(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = valueAnimatorOfFloat;
        this.A = 0;
        QnHx qnHx = new QnHx();
        this.B = qnHx;
        CQf cQf = new CQf();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new F1());
        valueAnimatorOfFloat.addUpdateListener(new LPt8Fixed());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.PRnFixed pRn = recyclerView2.H;
            if (pRn != null) {
                pRn.c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList<RecyclerView.FJCM> arrayList = recyclerView2.I;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.L();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.J.remove(this);
            if (recyclerView3.K == this) {
                recyclerView3.K = null;
            }
            ArrayList arrayList2 = this.s.A0;
            if (arrayList2 != null) {
                arrayList2.remove(cQf);
            }
            this.s.removeCallbacks(qnHx);
        }
        this.s = recyclerView;
        if (recyclerView != null) {
            recyclerView.f(this);
            this.s.J.add(this);
            this.s.g(cQf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MZ
    public final void a() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MZ
    public final boolean b(MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zF || zE)) {
                if (zE) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zF) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                g(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.FJCM
    public final void d(Canvas canvas) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            g(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i = this.q;
                int i2 = this.e;
                int i3 = i - i2;
                int i4 = this.l;
                int i5 = this.k;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.r;
                int i8 = this.f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i8, i7);
                RecyclerView recyclerView = this.s;
                Field field = bi5.a;
                if (bi5.NUlFixed.d(recyclerView) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.u) {
                int i9 = this.r;
                int i10 = this.i;
                int i11 = i9 - i10;
                int i12 = this.o;
                int i13 = this.n;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.q;
                int i16 = this.j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    public final boolean e(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(float f, float f2) {
        RecyclerView recyclerView = this.s;
        Field field = bi5.a;
        boolean z = bi5.NUlFixed.d(recyclerView) == 1;
        int i = this.e;
        if (z) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void g(int i) {
        QnHx qnHx = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(qnHx);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            h();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(qnHx);
            this.s.postDelayed(qnHx, 1200);
        } else if (i == 1) {
            this.s.removeCallbacks(qnHx);
            this.s.postDelayed(qnHx, 1500);
        }
        this.v = i;
    }

    public final void h() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    @Override // androidx.recyclerview.widget.RecyclerView.MZ
    public final void onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (zF) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            g(1);
            this.w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.v == 2) {
            h();
            int i3 = this.w;
            int i4 = this.b;
            if (i3 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i4;
                int i5 = this.q - i4;
                iArr[1] = i5;
                float fMax = Math.max(i4, Math.min(i5, x));
                if (Math.abs(this.o - fMax) >= 2.0f) {
                    float f = this.p;
                    int iComputeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
                    int iComputeHorizontalScrollOffset = this.s.computeHorizontalScrollOffset();
                    int i6 = this.q;
                    int i7 = iArr[1] - iArr[0];
                    if (i7 == 0) {
                        i2 = 0;
                    } else {
                        int i8 = iComputeHorizontalScrollRange - i6;
                        i2 = (int) (((fMax - f) / i7) * i8);
                        int i9 = iComputeHorizontalScrollOffset + i2;
                        if (i9 >= i8 || i9 < 0) {
                            i2 = 0;
                        }
                    }
                    if (i2 != 0) {
                        this.s.scrollBy(i2, 0);
                    }
                    this.p = fMax;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                iArr2[0] = i4;
                int i10 = this.r - i4;
                iArr2[1] = i10;
                float fMax2 = Math.max(i4, Math.min(i10, y));
                if (Math.abs(this.l - fMax2) < 2.0f) {
                    return;
                }
                float f2 = this.m;
                int iComputeVerticalScrollRange = this.s.computeVerticalScrollRange();
                int iComputeVerticalScrollOffset = this.s.computeVerticalScrollOffset();
                int i11 = this.r;
                int i12 = iArr2[1] - iArr2[0];
                if (i12 == 0) {
                    i = 0;
                } else {
                    int i13 = iComputeVerticalScrollRange - i11;
                    i = (int) (((fMax2 - f2) / i12) * i13);
                    int i14 = iComputeVerticalScrollOffset + i;
                    if (i14 >= i13 || i14 < 0) {
                        i = 0;
                    }
                }
                if (i != 0) {
                    this.s.scrollBy(0, i);
                }
                this.m = fMax2;
            }
        }
    }
}
