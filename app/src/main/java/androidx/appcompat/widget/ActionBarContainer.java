package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.coM7Fixed;
import defpackage.xApe;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable A;
    public Drawable B;
    public Drawable C;
    public final boolean D;
    public boolean E;
    public final int F;
    public boolean w;
    public F1 x;
    public View y;
    public View z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        coM7Fixed com7 = new coM7Fixed(this);
        Field field = bi5.a;
        bi5.LPt8Fixed.q(this, com7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.x);
        boolean z = false;
        this.A = typedArrayObtainStyledAttributes.getDrawable(0);
        this.B = typedArrayObtainStyledAttributes.getDrawable(2);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.D = true;
            this.C = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.D ? !(this.A != null || this.B != null) : this.C == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful()) {
            this.A.setState(getDrawableState());
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            this.B.setState(getDrawableState());
        }
        Drawable drawable3 = this.C;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.C.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.y = findViewById(R.id.action_bar);
        this.z = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.w || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        F1 f1 = this.x;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (f1 == null || f1.getVisibility() == 8) ? false : true;
        if (f1 != null && f1.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f1.getLayoutParams();
            int measuredHeight2 = measuredHeight - f1.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            f1.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.D) {
            Drawable drawable2 = this.C;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.A != null) {
                if (this.y.getVisibility() == 0) {
                    this.A.setBounds(this.y.getLeft(), this.y.getTop(), this.y.getRight(), this.y.getBottom());
                } else {
                    View view = this.z;
                    if (view == null || view.getVisibility() != 0) {
                        this.A.setBounds(0, 0, 0, 0);
                    } else {
                        this.A.setBounds(this.z.getLeft(), this.z.getTop(), this.z.getRight(), this.z.getBottom());
                    }
                }
                z3 = true;
            }
            this.E = z4;
            if (!z4 || (drawable = this.B) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(f1.getLeft(), f1.getTop(), f1.getRight(), f1.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.y == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.F) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.y == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        F1 f1 = this.x;
        if (f1 == null || f1.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        View view = this.y;
        boolean z = true;
        int iA = 0;
        if (view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0) {
            View view2 = this.z;
            if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                z = false;
            }
            if (!z) {
                iA = a(this.z);
            }
        } else {
            iA = a(this.y);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.x) + iA, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.A);
        }
        this.A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.y;
            if (view != null) {
                this.A.setBounds(view.getLeft(), this.y.getTop(), this.y.getRight(), this.y.getBottom());
            }
        }
        boolean z = true;
        if (!this.D ? this.A != null || this.B != null : this.C != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.C);
        }
        this.C = drawable;
        boolean z = this.D;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.C) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.A != null || this.B != null) : this.C == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.B;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.B);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E && (drawable2 = this.B) != null) {
                drawable2.setBounds(this.x.getLeft(), this.x.getTop(), this.x.getRight(), this.x.getBottom());
            }
        }
        setWillNotDraw(!this.D ? !(this.A == null && this.B == null) : this.C != null);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(F1 f1) {
        F1 f2 = this.x;
        if (f2 != null) {
            removeView(f2);
        }
        this.x = f1;
        if (f1 != null) {
            addView(f1);
            ViewGroup.LayoutParams layoutParams = f1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            f1.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.w = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.C;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.A;
        boolean z = this.D;
        return (drawable == drawable2 && !z) || (drawable == this.B && this.E) || ((drawable == this.C && z) || super.verifyDrawable(drawable));
    }
}
