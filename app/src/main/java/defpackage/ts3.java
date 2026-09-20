package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ts3 extends View {
    public static final int[] B = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] C = new int[0];
    public h81<sd5> A;
    public ae5 w;
    public Boolean x;
    public Long y;
    public u85 z;

    public ts3(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) throws Throwable {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.z;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.y;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? B : C;
            ae5 ae5Var = this.w;
            if (ae5Var != null) {
                ae5Var.setState(iArr);
            }
        } else {
            u85 u85Var = new u85(this, 1);
            this.z = u85Var;
            postDelayed(u85Var, 50L);
        }
        this.y = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m47setRippleState$lambda2(ts3 ts3Var) {
        ae5 ae5Var = ts3Var.w;
        if (ae5Var != null) {
            ae5Var.setState(C);
        }
        ts3Var.z = null;
    }

    public final void b(qd3 qd3Var, boolean z, long j, int i, long j2, float f, eNa ena) throws Throwable {
        if (this.w == null || !ur1.a(Boolean.valueOf(z), this.x)) {
            ae5 ae5Var = new ae5(z);
            setBackground(ae5Var);
            this.w = ae5Var;
            this.x = Boolean.valueOf(z);
        }
        ae5 ae5Var2 = this.w;
        this.A = ena;
        e(f, i, j, j2);
        if (z) {
            long j3 = qd3Var.a;
            ae5Var2.setHotspot(kt2.c(j3), kt2.d(j3));
        } else {
            ae5Var2.setHotspot(ae5Var2.getBounds().centerX(), ae5Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws Throwable {
        this.A = null;
        u85 u85Var = this.z;
        if (u85Var != null) {
            removeCallbacks(u85Var);
            this.z.run();
        } else {
            ae5 ae5Var = this.w;
            if (ae5Var != null) {
                ae5Var.setState(C);
            }
        }
        ae5 ae5Var2 = this.w;
        if (ae5Var2 == null) {
            return;
        }
        ae5Var2.setVisible(false, false);
        unscheduleDrawable(ae5Var2);
    }

    public final void d() throws Throwable {
        setRippleState(false);
    }

    public final void e(float f, int i, long j, long j2) {
        ae5 ae5Var = this.w;
        if (ae5Var == null) {
            return;
        }
        Integer num = ae5Var.y;
        if (num == null || num.intValue() != i) {
            ae5Var.y = Integer.valueOf(i);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!ae5.B) {
                        ae5.B = true;
                        ae5.A = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = ae5.A;
                    if (method != null) {
                        method.invoke(ae5Var, Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
            } else {
                ae5.QnHx.a.a(ae5Var, i);
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = yu.b(j2, f);
        yu yuVar = ae5Var.x;
        if (!(yuVar != null ? yu.c(yuVar.a, jB) : false)) {
            ae5Var.x = new yu(jB);
            ae5Var.setColor(ColorStateList.valueOf(hH.A(jB)));
        }
        Rect rectZ = hH.z(ps0.q0(j));
        setLeft(rectZ.left);
        setTop(rectZ.top);
        setRight(rectZ.right);
        setBottom(rectZ.bottom);
        ae5Var.setBounds(rectZ);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        h81<sd5> h81Var = this.A;
        if (h81Var != null) {
            h81Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
