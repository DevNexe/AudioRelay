package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class ko5 extends Drawable implements Drawable.Callback, jo5, c85 {
    public static final PorterDuff.Mode C = PorterDuff.Mode.SRC_IN;
    public boolean A;
    public Drawable B;
    public int w;
    public PorterDuff.Mode x;
    public boolean y;
    public mo5 z;

    public ko5(mo5 mo5Var, Resources resources) {
        Drawable.ConstantState constantState;
        this.z = mo5Var;
        if (mo5Var == null || (constantState = mo5Var.b) == null) {
            return;
        }
        c(constantState.newDrawable(resources));
    }

    @Override // defpackage.jo5
    public final Drawable a() {
        return this.B;
    }

    public boolean b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            mo5 mo5Var = this.z;
            if (mo5Var != null) {
                mo5Var.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean d(int[] iArr) {
        if (!b()) {
            return false;
        }
        mo5 mo5Var = this.z;
        ColorStateList colorStateList = mo5Var.c;
        PorterDuff.Mode mode = mo5Var.d;
        if (colorStateList == null || mode == null) {
            this.y = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.y || colorForState != this.w || mode != this.x) {
                setColorFilter(colorForState, mode);
                this.w = colorForState;
                this.x = mode;
                this.y = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.B.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        mo5 mo5Var = this.z;
        return changingConfigurations | (mo5Var != null ? mo5Var.getChangingConfigurations() : 0) | this.B.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        mo5 mo5Var = this.z;
        if (mo5Var == null) {
            return null;
        }
        if (!(mo5Var.b != null)) {
            return null;
        }
        mo5Var.a = getChangingConfigurations();
        return this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.B.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.B.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.B.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return uo0.b(this.B);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.B.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.B.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.B.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.B.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.B.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.B.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return uo0.QnHx.d(this.B);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        mo5 mo5Var;
        ColorStateList colorStateList = (!b() || (mo5Var = this.z) == null) ? null : mo5Var.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.B.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.B.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.A && super.mutate() == this) {
            this.z = new mo5(this.z);
            Drawable drawable = this.B;
            if (drawable != null) {
                drawable.mutate();
            }
            mo5 mo5Var = this.z;
            if (mo5Var != null) {
                Drawable drawable2 = this.B;
                mo5Var.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return uo0.c(this.B, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.B.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.B.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        uo0.QnHx.e(this.B, z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.B.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.B.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.B.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.B.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.B.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.z.c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.z.d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.B.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public ko5(Drawable drawable) {
        this.z = new mo5(this.z);
        c(drawable);
    }
}
