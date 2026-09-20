package defpackage;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes3.dex */
public class ga2 extends kn implements Checkable, ij4 {
    public static final int[] z = {R.attr.state_dragged};
    public boolean y;

    public interface QnHx {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // defpackage.kn
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // defpackage.kn
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // defpackage.kn
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // defpackage.kn
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // defpackage.kn
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // defpackage.kn
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public ej4 getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (this.y) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("kn");
        accessibilityEvent.setChecked(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("kn");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    @Override // defpackage.kn, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.kn
    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // defpackage.kn
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z2) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        XTd3.l(getContext(), i);
        throw null;
    }

    public void setCheckedIconSize(int i) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
    }

    public void setDragged(boolean z2) {
        if (this.y != z2) {
            this.y = z2;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                throw null;
            }
            invalidate();
        }
    }

    @Override // defpackage.kn
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(QnHx qnHx) {
    }

    @Override // defpackage.kn
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    @Override // defpackage.kn
    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        XTd3.k(getContext(), i);
        throw null;
    }

    @Override // defpackage.ij4
    public void setShapeAppearanceModel(ej4 ej4Var) {
        setClipToOutline(ej4Var.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    @Override // defpackage.kn
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }

    @Override // defpackage.kn
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
