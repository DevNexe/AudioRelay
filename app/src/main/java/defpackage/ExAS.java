package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class ExAS extends Button implements h2, h85 {
    public final NWnB w;
    public final YUjp x;
    public Zz y;

    public ExAS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private Zz getEmojiTextViewHelper() {
        if (this.y == null) {
            this.y = new Zz(this);
        }
        return this.y;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.a();
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h2.b) {
            return super.getAutoSizeMaxTextSize();
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            return Math.round(yUjp.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h2.b) {
            return super.getAutoSizeMinTextSize();
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            return Math.round(yUjp.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h2.b) {
            return super.getAutoSizeStepGranularity();
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            return Math.round(yUjp.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h2.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        YUjp yUjp = this.x;
        return yUjp != null ? yUjp.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (h2.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            return yUjp.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return c65.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            return nWnB.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            return nWnB.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.x.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.x.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        YUjp yUjp = this.x;
        if (yUjp == null || h2.b) {
            return;
        }
        yUjp.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        YUjp yUjp = this.x;
        if (yUjp == null || h2.b) {
            return;
        }
        Jv jv = yUjp.i;
        if (jv.i() && jv.a != 0) {
            jv.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h2.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h2.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h2.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c65.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        NWnB nWnB = this.w;
        if (nWnB != null) {
            nWnB.i(mode);
        }
    }

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        YUjp yUjp = this.x;
        yUjp.k(colorStateList);
        yUjp.b();
    }

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        YUjp yUjp = this.x;
        yUjp.l(mode);
        yUjp.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = h2.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        YUjp yUjp = this.x;
        if (yUjp == null || z) {
            return;
        }
        Jv jv = yUjp.i;
        if (jv.i() && jv.a != 0) {
            return;
        }
        jv.f(f, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExAS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d85.a(context);
        c75.a(this, getContext());
        NWnB nWnB = new NWnB(this);
        this.w = nWnB;
        nWnB.d(attributeSet, i);
        YUjp yUjp = new YUjp(this);
        this.x = yUjp;
        yUjp.f(attributeSet, i);
        yUjp.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }
}
