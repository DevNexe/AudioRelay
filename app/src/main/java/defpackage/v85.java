package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.azefsw.audioconnect.R;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class v85 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static v85 G;
    public static v85 H;
    public int B;
    public int C;
    public w85 D;
    public boolean E;
    public boolean F;
    public final View w;
    public final CharSequence x;
    public final int y;
    public final u85 z = new u85(this, 0);
    public final ty A = new ty(this, 3);

    public v85(View view, CharSequence charSequence) {
        this.w = view;
        this.x = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = wi5.a;
        this.y = Build.VERSION.SDK_INT >= 28 ? wi5.CQf.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.F = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(v85 v85Var) {
        v85 v85Var2 = G;
        if (v85Var2 != null) {
            v85Var2.w.removeCallbacks(v85Var2.z);
        }
        G = v85Var;
        if (v85Var != null) {
            v85Var.w.postDelayed(v85Var.z, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        v85 v85Var = H;
        View view = this.w;
        if (v85Var == this) {
            H = null;
            w85 w85Var = this.D;
            if (w85Var != null) {
                View view2 = w85Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) w85Var.a.getSystemService("window")).removeView(view2);
                }
                this.D = null;
                this.F = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (G == this) {
            b(null);
        }
        view.removeCallbacks(this.A);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        long longPressTimeout;
        long j;
        long j2;
        Field field = bi5.a;
        View view = this.w;
        if (bi5.auxFixed.b(view)) {
            b(null);
            v85 v85Var = H;
            if (v85Var != null) {
                v85Var.a();
            }
            H = this;
            this.E = z;
            w85 w85Var = new w85(view.getContext());
            this.D = w85Var;
            int width = this.B;
            int i3 = this.C;
            boolean z2 = this.E;
            View view2 = w85Var.b;
            boolean z3 = view2.getParent() != null;
            Context context = w85Var.a;
            if (z3) {
                if (view2.getParent() != null) {
                    ((WindowManager) context.getSystemService("window")).removeView(view2);
                }
            }
            w85Var.c.setText(this.x);
            WindowManager.LayoutParams layoutParams = w85Var.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = w85Var.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = w85Var.g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = w85Var.f;
                view.getLocationOnScreen(iArr2);
                int i4 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i4;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i5 = iArr2[1];
                int i6 = ((i + i5) - dimensionPixelOffset3) - measuredHeight;
                int i7 = i5 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i6 >= 0) {
                        layoutParams.y = i6;
                    } else {
                        layoutParams.y = i7;
                    }
                } else if (measuredHeight + i7 <= rect.height()) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.E) {
                j2 = 2500;
            } else {
                if ((bi5.LPt8Fixed.g(view) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            ty tyVar = this.A;
            view.removeCallbacks(tyVar);
            view.postDelayed(tyVar, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.D != null && this.E) {
            return false;
        }
        View view2 = this.w;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z = true;
        if (action != 7) {
            if (action == 10) {
                this.F = true;
                a();
            }
        } else if (view2.isEnabled() && this.D == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.F) {
                this.B = x;
                this.C = y;
                this.F = false;
            } else {
                int iAbs = Math.abs(x - this.B);
                int i = this.y;
                if (iAbs > i || Math.abs(y - this.C) > i) {
                    this.B = x;
                    this.C = y;
                    this.F = false;
                } else {
                    z = false;
                }
            }
            if (z) {
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.B = view.getWidth() / 2;
        this.C = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
