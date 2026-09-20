package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class jj96 extends CheckBox implements h85 {
    public final P8Z w;
    public final NWnB x;
    public final YUjp y;
    public Zz z;

    public jj96(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private Zz getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new Zz(this);
        }
        return this.z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        NWnB nWnB = this.x;
        if (nWnB != null) {
            nWnB.a();
        }
        YUjp yUjp = this.y;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        P8Z p8z = this.w;
        if (p8z != null) {
            p8z.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        NWnB nWnB = this.x;
        if (nWnB != null) {
            return nWnB.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        NWnB nWnB = this.x;
        if (nWnB != null) {
            return nWnB.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        P8Z p8z = this.w;
        if (p8z != null) {
            return p8z.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        P8Z p8z = this.w;
        if (p8z != null) {
            return p8z.c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.y.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.y.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        NWnB nWnB = this.x;
        if (nWnB != null) {
            nWnB.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        NWnB nWnB = this.x;
        if (nWnB != null) {
            nWnB.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        P8Z p8z = this.w;
        if (p8z != null) {
            if (p8z.f) {
                p8z.f = false;
            } else {
                p8z.f = true;
                p8z.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.y;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.y;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        NWnB nWnB = this.x;
        if (nWnB != null) {
            nWnB.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        NWnB nWnB = this.x;
        if (nWnB != null) {
            nWnB.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        P8Z p8z = this.w;
        if (p8z != null) {
            p8z.b = colorStateList;
            p8z.d = true;
            p8z.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        P8Z p8z = this.w;
        if (p8z != null) {
            p8z.c = mode;
            p8z.e = true;
            p8z.a();
        }
    }

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        YUjp yUjp = this.y;
        yUjp.k(colorStateList);
        yUjp.b();
    }

    @Override // defpackage.h85
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        YUjp yUjp = this.y;
        yUjp.l(mode);
        yUjp.b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj96(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d85.a(context);
        c75.a(this, getContext());
        P8Z p8z = new P8Z(this);
        this.w = p8z;
        p8z.b(attributeSet, i);
        NWnB nWnB = new NWnB(this);
        this.x = nWnB;
        nWnB.d(attributeSet, i);
        YUjp yUjp = new YUjp(this);
        this.y = yUjp;
        yUjp.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(XTd3.l(getContext(), i));
    }
}
