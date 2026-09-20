package defpackage;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class kn extends FrameLayout {
    public boolean w;
    public boolean x;

    static {
        new r1();
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.x;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.w;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f) {
        throw null;
    }

    public void setMaxCardElevation(float f) {
        throw null;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z == this.x) {
            return;
        }
        this.x = z;
        throw null;
    }

    public void setRadius(float f) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        throw null;
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }
}
