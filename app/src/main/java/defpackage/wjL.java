package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class wjL extends AutoCompleteTextView implements h85 {
    public static final int[] z = {R.attr.popupBackground};
    public final NWnB w;
    public final YUjp x;
    public final d7G y;

    public wjL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        X.z(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.y.d(inputConnectionOnCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c65.g(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(XTd3.l(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.y.e(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.y.b(keyListener));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.azefsw.audioconnect.R.attr.autoCompleteTextViewStyle);
        d85.a(context);
        c75.a(this, getContext());
        g85 g85VarL = g85.l(getContext(), attributeSet, z, com.azefsw.audioconnect.R.attr.autoCompleteTextViewStyle);
        if (g85VarL.k(0)) {
            setDropDownBackgroundDrawable(g85VarL.e(0));
        }
        g85VarL.m();
        NWnB nWnB = new NWnB(this);
        this.w = nWnB;
        nWnB.d(attributeSet, com.azefsw.audioconnect.R.attr.autoCompleteTextViewStyle);
        YUjp yUjp = new YUjp(this);
        this.x = yUjp;
        yUjp.f(attributeSet, com.azefsw.audioconnect.R.attr.autoCompleteTextViewStyle);
        yUjp.b();
        d7G d7g = new d7G(this);
        this.y = d7g;
        d7g.c(attributeSet, com.azefsw.audioconnect.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerB = d7g.b(keyListener);
            if (keyListenerB == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerB);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
