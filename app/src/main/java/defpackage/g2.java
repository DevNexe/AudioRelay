package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class g2 implements View.OnTouchListener {
    public static final int M = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public int C;
    public int D;
    public final float[] E;
    public final float[] F;
    public final float[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final QnHx w;
    public final AccelerateInterpolator x;
    public final View y;
    public CQf z;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g2 g2Var = g2.this;
            if (g2Var.K) {
                boolean z = g2Var.I;
                QnHx qnHx = g2Var.w;
                if (z) {
                    g2Var.I = false;
                    qnHx.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    qnHx.e = jCurrentAnimationTimeMillis;
                    qnHx.g = -1L;
                    qnHx.f = jCurrentAnimationTimeMillis;
                    qnHx.h = 0.5f;
                }
                if ((qnHx.g > 0 && AnimationUtils.currentAnimationTimeMillis() > qnHx.g + ((long) qnHx.i)) || !g2Var.e()) {
                    g2Var.K = false;
                    return;
                }
                boolean z2 = g2Var.J;
                View view = g2Var.y;
                if (z2) {
                    g2Var.J = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (qnHx.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = qnHx.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - qnHx.f;
                qnHx.f = jCurrentAnimationTimeMillis2;
                i42.b(((h42) g2Var).N, (int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * qnHx.d));
                Field field = bi5.a;
                bi5.LPt8Fixed.m(view, this);
            }
        }
    }

    public static class QnHx {
        public int a;
        public int b;
        public float c;
        public float d;
        public float h;
        public int i;
        public long e = Long.MIN_VALUE;
        public long g = -1;
        public long f = 0;

        public final float a(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.g;
            if (j3 < 0 || j < j3) {
                return g2.b((j - j2) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.h;
            return (g2.b((j - j3) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public g2(View view) {
        QnHx qnHx = new QnHx();
        this.w = qnHx;
        this.x = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.A = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.B = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.E = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.F = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.G = fArr5;
        this.y = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.C = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.D = M;
        qnHx.a = RCHTTPStatusCodes.ERROR;
        qnHx.b = RCHTTPStatusCodes.ERROR;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.A[i] * f2, 0.0f, this.B[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.x;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.E[i];
            float f5 = this.F[i];
            float f6 = this.G[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.E[i];
        float f9 = this.F[i];
        float f10 = this.G[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.C;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.K && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.I) {
            this.K = false;
            return;
        }
        QnHx qnHx = this.w;
        qnHx.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - qnHx.e);
        int i3 = qnHx.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        qnHx.i = i;
        qnHx.h = qnHx.a(jCurrentAnimationTimeMillis);
        qnHx.g = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    public final boolean e() {
        boolean z;
        QnHx qnHx = this.w;
        float f = qnHx.d;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = qnHx.c;
        if (iAbs == 0) {
            return false;
        }
        ListView listView = ((h42) this).N;
        int count = listView.getCount();
        if (count == 0) {
            z = false;
        } else {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? iAbs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) : i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.L) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return false;
        }
        this.J = true;
        this.H = false;
        float x = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.y;
        float fA = a(x, width, view2.getWidth(), 0);
        float fA2 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        QnHx qnHx = this.w;
        qnHx.c = fA;
        qnHx.d = fA2;
        if (!this.K && e()) {
            if (this.z == null) {
                this.z = new CQf();
            }
            this.K = true;
            this.I = true;
            if (this.H || (i = this.D) <= 0) {
                this.z.run();
            } else {
                CQf cQf = this.z;
                long j = i;
                Field field = bi5.a;
                bi5.LPt8Fixed.n(view2, cQf, j);
            }
            this.H = true;
        }
        return false;
    }
}
