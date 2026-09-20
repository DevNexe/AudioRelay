package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class g14c extends TextView implements h85, h2 {
    public boolean A;
    public Future<na3> B;
    public final NWnB w;
    public final YUjp x;
    public final NVzj y;
    public Zz z;

    public g14c() {
        throw null;
    }

    public g14c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private Zz getEmojiTextViewHelper() {
        if (this.z == null) {
            this.z = new Zz(this);
        }
        return this.z;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<na3> future = this.B;
        if (future != null) {
            try {
                this.B = null;
                c65.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        NVzj nVzj;
        if (Build.VERSION.SDK_INT >= 28 || (nVzj = this.y) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = nVzj.b;
        return textClassifier == null ? NVzj.QnHx.a(nVzj.a) : textClassifier;
    }

    public na3.QnHx getTextMetricsParamsCompat() {
        return c65.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.x.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            vq0.a(editorInfo, getText());
        }
        X.z(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        YUjp yUjp = this.x;
        if (yUjp == null || h2.b) {
            return;
        }
        yUjp.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<na3> future = this.B;
        if (future != null) {
            try {
                this.B = null;
                c65.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            c65.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            c65.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0239D.k(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(na3 na3Var) {
        c65.d(this, na3Var);
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        NVzj nVzj;
        if (Build.VERSION.SDK_INT >= 28 || (nVzj = this.y) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVzj.b = textClassifier;
        }
    }

    public void setTextFuture(Future<na3> future) {
        this.B = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0032  */
    public void setTextMetricsParamsCompat(na3.QnHx qnHx) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = qnHx.b;
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            i = 1;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            i = 2;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            i = 3;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            i = 4;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            i = 5;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            i = 6;
        } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            i = 7;
        } else {
            i = 1;
        }
        c65.CQf.h(this, i);
        TextPaint textPaint = qnHx.a;
        if (i2 >= 23) {
            getPaint().set(textPaint);
            c65.F1.e(this, qnHx.c);
            c65.F1.h(this, qnHx.d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.A) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            hc5 hc5Var = ac5.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.A = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.A = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g14c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d85.a(context);
        this.A = false;
        c75.a(this, getContext());
        NWnB nWnB = new NWnB(this);
        this.w = nWnB;
        nWnB.d(attributeSet, i);
        YUjp yUjp = new YUjp(this);
        this.x = yUjp;
        yUjp.f(attributeSet, i);
        yUjp.b();
        this.y = new NVzj(this);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? XTd3.l(context, i) : null, i2 != 0 ? XTd3.l(context, i2) : null, i3 != 0 ? XTd3.l(context, i3) : null, i4 != 0 ? XTd3.l(context, i4) : null);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? XTd3.l(context, i) : null, i2 != 0 ? XTd3.l(context, i2) : null, i3 != 0 ? XTd3.l(context, i3) : null, i4 != 0 ? XTd3.l(context, i4) : null);
        YUjp yUjp = this.x;
        if (yUjp != null) {
            yUjp.b();
        }
    }
}
