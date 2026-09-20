package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.azefsw.audioconnect.R;
import defpackage.UT;
import defpackage.X;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.cq0;
import defpackage.dq0;
import defpackage.ej4;
import defpackage.eq0;
import defpackage.fq0;
import defpackage.k65;
import defpackage.la2;
import defpackage.rs0;
import defpackage.ur;
import defpackage.w92;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends rs0 {
    public final QnHx d;
    public final ViewOnFocusChangeListenerC0083CQf e;
    public final F1 f;
    public final LPt8Fixed g;

    @SuppressLint({"ClickableViewAccessibility"})
    public final NUlFixed h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public la2 m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    /* JADX INFO: renamed from: com.google.android.material.textfield.CQf$CQf, reason: collision with other inner class name */
    public class ViewOnFocusChangeListenerC0083CQf implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0083CQf() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            CQf cQf = CQf.this;
            cQf.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            cQf.f(false);
            cQf.i = false;
        }
    }

    public class F1 extends TextInputLayout.NUlFixed {
        public F1(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.NUlFixed, defpackage.d_OZ
        public final void d(View view, UT ut) {
            super.d(view, ut);
            boolean zIsShowingHintText = true;
            if (!(CQf.this.a.getEditText().getKeyListener() != null)) {
                ut.i(Spinner.class.getName());
            }
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            if (i >= 26) {
                zIsShowingHintText = accessibilityNodeInfo.isShowingHintText();
            } else {
                Bundle extras = accessibilityNodeInfo.getExtras();
                if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                    zIsShowingHintText = false;
                }
            }
            if (zIsShowingHintText) {
                ut.l(null);
            }
        }

        @Override // defpackage.d_OZ
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            CQf cQf = CQf.this;
            EditText editText = cQf.a.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && cQf.n.isTouchExplorationEnabled()) {
                if (cQf.a.getEditText().getKeyListener() != null) {
                    return;
                }
                CQf.d(cQf, autoCompleteTextView);
            }
        }
    }

    public class LPt8Fixed implements TextInputLayout.YKK {
        public LPt8Fixed() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.YKK
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            CQf cQf = CQf.this;
            int boxBackgroundMode = cQf.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(cQf.m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(cQf.l);
            }
            if (!(autoCompleteTextView.getKeyListener() != null)) {
                TextInputLayout textInputLayout2 = cQf.a;
                int boxBackgroundMode2 = textInputLayout2.getBoxBackgroundMode();
                la2 boxBackground = textInputLayout2.getBoxBackground();
                int iT = X.t(autoCompleteTextView, R.attr.colorControlHighlight);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iT2 = X.t(autoCompleteTextView, R.attr.colorSurface);
                    la2 la2Var = new la2(boxBackground.w.a);
                    int iX = X.x(0.1f, iT, iT2);
                    la2Var.j(new ColorStateList(iArr, new int[]{iX, 0}));
                    la2Var.setTint(iT2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iX, iT2});
                    la2 la2Var2 = new la2(boxBackground.w.a);
                    la2Var2.setTint(-1);
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, la2Var, la2Var2), boxBackground});
                    Field field = bi5.a;
                    bi5.LPt8Fixed.q(autoCompleteTextView, layerDrawable);
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = textInputLayout2.getBoxBackgroundColor();
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{X.x(0.1f, iT, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                    Field field2 = bi5.a;
                    bi5.LPt8Fixed.q(autoCompleteTextView, rippleDrawable);
                }
            }
            autoCompleteTextView.setOnTouchListener(new dq0(cQf, autoCompleteTextView));
            autoCompleteTextView.setOnFocusChangeListener(cQf.e);
            autoCompleteTextView.setOnDismissListener(new eq0(cQf));
            autoCompleteTextView.setThreshold(0);
            QnHx qnHx = cQf.d;
            autoCompleteTextView.removeTextChangedListener(qnHx);
            autoCompleteTextView.addTextChangedListener(qnHx);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!(autoCompleteTextView.getKeyListener() != null)) {
                Field field3 = bi5.a;
                bi5.LPt8Fixed.s(cQf.c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(cQf.f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    public class NUlFixed implements TextInputLayout.auxFixed {

        public class QnHx implements Runnable {
            public final /* synthetic */ AutoCompleteTextView w;

            public QnHx(AutoCompleteTextView autoCompleteTextView) {
                this.w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.w.removeTextChangedListener(CQf.this.d);
            }
        }

        public NUlFixed() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.auxFixed
        public final void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new QnHx(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == CQf.this.e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            autoCompleteTextView.setOnDismissListener(null);
        }
    }

    public class QnHx extends k65 {

        /* JADX INFO: renamed from: com.google.android.material.textfield.CQf$QnHx$QnHx, reason: collision with other inner class name */
        public class RunnableC0084QnHx implements Runnable {
            public final /* synthetic */ AutoCompleteTextView w;

            public RunnableC0084QnHx(AutoCompleteTextView autoCompleteTextView) {
                this.w = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsPopupShowing = this.w.isPopupShowing();
                QnHx qnHx = QnHx.this;
                CQf.this.f(zIsPopupShowing);
                CQf.this.i = zIsPopupShowing;
            }
        }

        public QnHx() {
        }

        @Override // defpackage.k65, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            CQf cQf = CQf.this;
            EditText editText = cQf.a.getEditText();
            if (!(editText instanceof AutoCompleteTextView)) {
                throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (cQf.n.isTouchExplorationEnabled()) {
                if ((autoCompleteTextView.getKeyListener() != null) && !cQf.c.hasFocus()) {
                    autoCompleteTextView.dismissDropDown();
                }
            }
            autoCompleteTextView.post(new RunnableC0084QnHx(autoCompleteTextView));
        }
    }

    public class YKK implements View.OnClickListener {
        public YKK() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CQf cQf = CQf.this;
            CQf.d(cQf, (AutoCompleteTextView) cQf.a.getEditText());
        }
    }

    public CQf(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new QnHx();
        this.e = new ViewOnFocusChangeListenerC0083CQf();
        this.f = new F1(textInputLayout);
        this.g = new LPt8Fixed();
        this.h = new NUlFixed();
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }

    public static void d(CQf cQf, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            cQf.getClass();
            return;
        }
        cQf.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - cQf.k;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            cQf.i = false;
        }
        if (cQf.i) {
            cQf.i = false;
            return;
        }
        cQf.f(!cQf.j);
        if (!cQf.j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // defpackage.rs0
    public final void a() {
        Context context = this.b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        la2 la2VarE = e(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        la2 la2VarE2 = e(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = la2VarE;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, la2VarE);
        this.l.addState(new int[0], la2VarE2);
        Drawable drawableL = XTd3.l(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableL);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new YKK());
        LinkedHashSet<TextInputLayout.YKK> linkedHashSet = textInputLayout.A0;
        LPt8Fixed lPt8 = this.g;
        linkedHashSet.add(lPt8);
        if (textInputLayout.A != null) {
            lPt8.a(textInputLayout);
        }
        textInputLayout.E0.add(this.h);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = ur.a;
        valueAnimatorOfFloat.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat.setDuration(67);
        valueAnimatorOfFloat.addUpdateListener(new cq0(this));
        this.p = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(50);
        valueAnimatorOfFloat2.addUpdateListener(new cq0(this));
        this.o = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new fq0(this));
        this.n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // defpackage.rs0
    public final boolean b(int i) {
        return i != 0;
    }

    public final la2 e(float f, float f2, float f3, int i) {
        ej4.QnHx qnHx = new ej4.QnHx();
        qnHx.e = new defpackage.F1(f);
        qnHx.f = new defpackage.F1(f);
        qnHx.h = new defpackage.F1(f2);
        qnHx.g = new defpackage.F1(f2);
        ej4 ej4Var = new ej4(qnHx);
        Paint paint = la2.S;
        String simpleName = la2.class.getSimpleName();
        Context context = this.b;
        int iB = w92.b(context, simpleName, R.attr.colorSurface);
        la2 la2Var = new la2();
        la2Var.h(context);
        la2Var.j(ColorStateList.valueOf(iB));
        la2Var.i(f3);
        la2Var.setShapeAppearanceModel(ej4Var);
        la2.CQf cQf = la2Var.w;
        if (cQf.h == null) {
            cQf.h = new Rect();
        }
        la2Var.w.h.set(0, i, 0, i);
        la2Var.invalidateSelf();
        return la2Var;
    }

    public final void f(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.p.cancel();
            this.o.start();
        }
    }
}
