package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.xApe;
import defpackage.yj5;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends defpackage.QnHx {
    public CharSequence A;
    public CharSequence B;
    public View C;
    public LinearLayout D;
    public TextView E;
    public TextView F;
    public final int G;
    public final int H;
    public boolean I;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.A, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : XTd3.l(context, resourceId);
        Field field = bi5.a;
        bi5.LPt8Fixed.q(this, drawable);
        this.G = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.x = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c() {
        if (this.D == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.D = linearLayout;
            this.E = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.F = (TextView) this.D.findViewById(R.id.action_bar_subtitle);
            int i = this.G;
            if (i != 0) {
                this.E.setTextAppearance(getContext(), i);
            }
            int i2 = this.H;
            if (i2 != 0) {
                this.F.setTextAppearance(getContext(), i2);
            }
        }
        this.E.setText(this.A);
        this.F.setText(this.B);
        boolean z = !TextUtils.isEmpty(this.A);
        boolean z2 = !TextUtils.isEmpty(this.B);
        int i3 = 0;
        this.F.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.D;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.D.getParent() == null) {
            addView(this.D);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.QnHx
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.QnHx
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = yj5.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.C == null && linearLayout.getVisibility() != 8) {
            paddingRight += defpackage.QnHx.b(this.D, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.C;
        if (view != null) {
            defpackage.QnHx.b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.x;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.C == null) {
            if (this.I) {
                this.D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.D.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.D.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = defpackage.QnHx.a(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view = this.C;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.C.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.x > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.QnHx
    public void setContentHeight(int i) {
        this.x = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.C;
        if (view2 != null) {
            removeView(view2);
        }
        this.C = view;
        if (view != null && (linearLayout = this.D) != null) {
            removeView(linearLayout);
            this.D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B = charSequence;
        c();
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        c();
        bi5.n(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.I) {
            requestLayout();
        }
        this.I = z;
    }

    @Override // defpackage.QnHx, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
