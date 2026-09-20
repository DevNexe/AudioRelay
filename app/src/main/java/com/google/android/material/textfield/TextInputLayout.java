package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.Mt0;
import defpackage.Th;
import defpackage.UT;
import defpackage.XTd3;
import defpackage.au;
import defpackage.b65;
import defpackage.bi5;
import defpackage.bp0;
import defpackage.c65;
import defpackage.d_OZ;
import defpackage.ea;
import defpackage.ee0;
import defpackage.ej4;
import defpackage.ex0;
import defpackage.g14c;
import defpackage.g85;
import defpackage.ja2;
import defpackage.ke0;
import defpackage.la2;
import defpackage.lo2;
import defpackage.lv;
import defpackage.m65;
import defpackage.qa2;
import defpackage.r80;
import defpackage.rs0;
import defpackage.s15;
import defpackage.tm;
import defpackage.u92;
import defpackage.uo0;
import defpackage.ur;
import defpackage.w92;
import defpackage.wj0;
import defpackage.xj5;
import defpackage.yj1;
import defpackage.zt;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    public EditText A;
    public final LinkedHashSet<YKK> A0;
    public CharSequence B;
    public int B0;
    public int C;
    public final SparseArray<rs0> C0;
    public int D;
    public final CheckableImageButton D0;
    public final yj1 E;
    public final LinkedHashSet<auxFixed> E0;
    public boolean F;
    public ColorStateList F0;
    public int G;
    public boolean G0;
    public boolean H;
    public PorterDuff.Mode H0;
    public g14c I;
    public boolean I0;
    public int J;
    public ColorDrawable J0;
    public int K;
    public int K0;
    public CharSequence L;
    public Drawable L0;
    public boolean M;
    public View.OnLongClickListener M0;
    public g14c N;
    public View.OnLongClickListener N0;
    public ColorStateList O;
    public final CheckableImageButton O0;
    public int P;
    public ColorStateList P0;
    public ColorStateList Q;
    public ColorStateList Q0;
    public ColorStateList R;
    public ColorStateList R0;
    public CharSequence S;
    public int S0;
    public final g14c T;
    public int T0;
    public CharSequence U;
    public int U0;
    public final g14c V;
    public ColorStateList V0;
    public boolean W;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public CharSequence a0;
    public int a1;
    public boolean b0;
    public boolean b1;
    public la2 c0;
    public final au c1;
    public la2 d0;
    public boolean d1;
    public final ej4 e0;
    public boolean e1;
    public final int f0;
    public ValueAnimator f1;
    public int g0;
    public boolean g1;
    public int h0;
    public boolean h1;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public final Rect o0;
    public final Rect p0;
    public final RectF q0;
    public Typeface r0;
    public final CheckableImageButton s0;
    public ColorStateList t0;
    public boolean u0;
    public PorterDuff.Mode v0;
    public final FrameLayout w;
    public boolean w0;
    public final LinearLayout x;
    public ColorDrawable x0;
    public final LinearLayout y;
    public int y0;
    public final FrameLayout z;
    public View.OnLongClickListener z0;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.D0.performClick();
            textInputLayout.D0.jumpDrawablesToCurrentState();
        }
    }

    public class F1 implements Runnable {
        public F1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.A.requestLayout();
        }
    }

    public class LPt8Fixed implements ValueAnimator.AnimatorUpdateListener {
        public LPt8Fixed() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.c1.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class NUlFixed extends d_OZ {
        public final TextInputLayout d;

        public NUlFixed(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.d_OZ
        public void d(View view, UT ut) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !textInputLayout.b1;
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            if (z) {
                ut.o(text);
            } else if (!TextUtils.isEmpty(string)) {
                ut.o(string);
                if (z3 && placeholderText != null) {
                    ut.o(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                ut.o(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    ut.l(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    ut.o(string);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z6);
                } else {
                    ut.h(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public class QnHx implements TextWatcher {
        public QnHx() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.h1, false);
            if (textInputLayout.F) {
                textInputLayout.n(editable.length());
            }
            if (textInputLayout.M) {
                textInputLayout.t(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static class T23 extends defpackage.CQf {
        public static final Parcelable.Creator<T23> CREATOR = new QnHx();
        public CharSequence A;
        public CharSequence B;
        public CharSequence C;
        public CharSequence y;
        public boolean z;

        public static class QnHx implements Parcelable.ClassLoaderCreator<T23> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final T23 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new T23(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new T23[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new T23(parcel, null);
            }
        }

        public T23(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.y) + " hint=" + ((Object) this.A) + " helperText=" + ((Object) this.B) + " placeholderText=" + ((Object) this.C) + "}";
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            TextUtils.writeToParcel(this.y, parcel, i);
            parcel.writeInt(this.z ? 1 : 0);
            TextUtils.writeToParcel(this.A, parcel, i);
            TextUtils.writeToParcel(this.B, parcel, i);
            TextUtils.writeToParcel(this.C, parcel, i);
        }

        public T23(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.z = parcel.readInt() == 1;
            this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public interface YKK {
        void a(TextInputLayout textInputLayout);
    }

    public interface auxFixed {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x050d  */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        AttributeSet attributeSet2;
        super(qa2.a(context, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout), attributeSet, R.attr.textInputStyle);
        this.C = -1;
        this.D = -1;
        this.E = new yj1(this);
        this.o0 = new Rect();
        this.p0 = new Rect();
        this.q0 = new RectF();
        this.A0 = new LinkedHashSet<>();
        this.B0 = 0;
        SparseArray<rs0> sparseArray = new SparseArray<>();
        this.C0 = sparseArray;
        this.E0 = new LinkedHashSet<>();
        au auVar = new au(this);
        this.c1 = auVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.w = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.x = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.y = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.z = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LinearInterpolator linearInterpolator = ur.a;
        auVar.H = linearInterpolator;
        auVar.h();
        auVar.G = linearInterpolator;
        auVar.h();
        if (auVar.h != 8388659) {
            auVar.h = 8388659;
            auVar.h();
        }
        int[] iArr = Th.V;
        m65.a(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        m65.b(context2, attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout, 20, 18, 33, 38, 42);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout);
        g85 g85Var = new g85(context2, typedArrayObtainStyledAttributes);
        this.W = g85Var.a(41, true);
        setHint(g85Var.j(4));
        this.e1 = g85Var.a(40, true);
        this.d1 = g85Var.a(35, true);
        if (g85Var.k(3)) {
            setMinWidth(g85Var.d(3, -1));
        }
        if (g85Var.k(2)) {
            setMaxWidth(g85Var.d(2, -1));
        }
        ej4 ej4Var = new ej4(ej4.b(context2, attributeSet, R.attr.textInputStyle, R.style.Widget_Design_TextInputLayout));
        this.e0 = ej4Var;
        this.f0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.i0 = g85Var.c(7, 0);
        this.k0 = g85Var.d(14, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.l0 = g85Var.d(15, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.j0 = this.k0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(8, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(9, -1.0f);
        ej4.QnHx qnHx = new ej4.QnHx(ej4Var);
        if (dimension >= 0.0f) {
            qnHx.e = new defpackage.F1(dimension);
        }
        if (dimension2 >= 0.0f) {
            qnHx.f = new defpackage.F1(dimension2);
        }
        if (dimension3 >= 0.0f) {
            qnHx.g = new defpackage.F1(dimension3);
        }
        if (dimension4 >= 0.0f) {
            qnHx.h = new defpackage.F1(dimension4);
        }
        this.e0 = new ej4(qnHx);
        ColorStateList colorStateListA = ja2.a(context2, g85Var, 5);
        if (colorStateListA != null) {
            int defaultColor = colorStateListA.getDefaultColor();
            this.W0 = defaultColor;
            this.n0 = defaultColor;
            if (colorStateListA.isStateful()) {
                this.X0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.Y0 = colorStateListA.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.Z0 = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.Y0 = this.W0;
                ColorStateList colorStateListK = XTd3.k(context2, R.color.mtrl_filled_background_color);
                this.X0 = colorStateListK.getColorForState(new int[]{-16842910}, -1);
                this.Z0 = colorStateListK.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.n0 = 0;
            this.W0 = 0;
            this.X0 = 0;
            this.Y0 = 0;
            this.Z0 = 0;
        }
        if (g85Var.k(1)) {
            ColorStateList colorStateListB = g85Var.b(1);
            this.R0 = colorStateListB;
            this.Q0 = colorStateListB;
        }
        ColorStateList colorStateListA2 = ja2.a(context2, g85Var, 12);
        this.U0 = typedArrayObtainStyledAttributes.getColor(12, 0);
        this.S0 = r80.b(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.a1 = r80.b(context2, R.color.mtrl_textinput_disabled_color);
        this.T0 = r80.b(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListA2 != null) {
            setBoxStrokeColorStateList(colorStateListA2);
        }
        if (g85Var.k(13)) {
            setBoxStrokeErrorColor(ja2.a(context2, g85Var, 13));
        }
        if (g85Var.h(42, -1) != -1) {
            setHintTextAppearance(g85Var.h(42, 0));
        }
        int iH = g85Var.h(33, 0);
        CharSequence charSequenceJ = g85Var.j(28);
        boolean zA = g85Var.a(29, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.O0 = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (ja2.d(context2)) {
            u92.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        if (g85Var.k(30)) {
            setErrorIconDrawable(g85Var.e(30));
        }
        if (g85Var.k(31)) {
            setErrorIconTintList(ja2.a(context2, g85Var, 31));
        }
        if (g85Var.k(32)) {
            setErrorIconTintMode(xj5.b(g85Var.g(32, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        Field field = bi5.a;
        bi5.LPt8Fixed.s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iH2 = g85Var.h(38, 0);
        boolean zA2 = g85Var.a(37, false);
        CharSequence charSequenceJ2 = g85Var.j(36);
        int iH3 = g85Var.h(50, 0);
        CharSequence charSequenceJ3 = g85Var.j(49);
        int iH4 = g85Var.h(53, 0);
        CharSequence charSequenceJ4 = g85Var.j(52);
        int iH5 = g85Var.h(63, 0);
        CharSequence charSequenceJ5 = g85Var.j(62);
        boolean zA3 = g85Var.a(16, false);
        setCounterMaxLength(g85Var.g(17, -1));
        this.K = g85Var.h(20, 0);
        this.J = g85Var.h(18, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.s0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (ja2.d(context2)) {
            u92.g((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (g85Var.k(59)) {
            setStartIconDrawable(g85Var.e(59));
            if (g85Var.k(58)) {
                setStartIconContentDescription(g85Var.j(58));
            }
            setStartIconCheckable(g85Var.a(57, true));
        }
        if (g85Var.k(60)) {
            setStartIconTintList(ja2.a(context2, g85Var, 60));
        }
        if (g85Var.k(61)) {
            setStartIconTintMode(xj5.b(g85Var.g(61, -1), null));
        }
        setBoxBackgroundMode(g85Var.g(6, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.D0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (ja2.d(context2)) {
            u92.h((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams(), 0);
        }
        sparseArray.append(-1, new ee0(this));
        sparseArray.append(0, new lo2(this));
        sparseArray.append(1, new com.google.android.material.textfield.F1(this));
        sparseArray.append(2, new com.google.android.material.textfield.QnHx(this));
        sparseArray.append(3, new com.google.android.material.textfield.CQf(this));
        if (g85Var.k(25)) {
            setEndIconMode(g85Var.g(25, 0));
            if (g85Var.k(24)) {
                setEndIconDrawable(g85Var.e(24));
            }
            if (g85Var.k(23)) {
                setEndIconContentDescription(g85Var.j(23));
            }
            setEndIconCheckable(g85Var.a(22, true));
        } else if (g85Var.k(46)) {
            setEndIconMode(g85Var.a(46, false) ? 1 : 0);
            setEndIconDrawable(g85Var.e(45));
            setEndIconContentDescription(g85Var.j(44));
            if (g85Var.k(47)) {
                setEndIconTintList(ja2.a(context2, g85Var, 47));
            }
            if (g85Var.k(48)) {
                setEndIconTintMode(xj5.b(g85Var.g(48, -1), null));
            }
        }
        if (g85Var.k(46)) {
            attributeSet2 = null;
        } else {
            if (g85Var.k(26)) {
                setEndIconTintList(ja2.a(context2, g85Var, 26));
            }
            if (g85Var.k(27)) {
                attributeSet2 = null;
                setEndIconTintMode(xj5.b(g85Var.g(27, -1), null));
            } else {
                attributeSet2 = null;
            }
        }
        g14c g14cVar = new g14c(context2, attributeSet2);
        this.T = g14cVar;
        g14cVar.setId(R.id.textinput_prefix_text);
        g14cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        bi5.auxFixed.f(g14cVar, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(g14cVar);
        g14c g14cVar2 = new g14c(context2, attributeSet2);
        this.V = g14cVar2;
        g14cVar2.setId(R.id.textinput_suffix_text);
        g14cVar2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        bi5.auxFixed.f(g14cVar2, 1);
        linearLayout2.addView(g14cVar2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceJ2);
        setHelperTextTextAppearance(iH2);
        setErrorEnabled(zA);
        setErrorTextAppearance(iH);
        setErrorContentDescription(charSequenceJ);
        setCounterTextAppearance(this.K);
        setCounterOverflowTextAppearance(this.J);
        setPlaceholderText(charSequenceJ3);
        setPlaceholderTextAppearance(iH3);
        setPrefixText(charSequenceJ4);
        setPrefixTextAppearance(iH4);
        setSuffixText(charSequenceJ5);
        setSuffixTextAppearance(iH5);
        if (g85Var.k(34)) {
            setErrorTextColor(g85Var.b(34));
        }
        if (g85Var.k(39)) {
            setHelperTextColor(g85Var.b(39));
        }
        if (g85Var.k(43)) {
            setHintTextColor(g85Var.b(43));
        }
        if (g85Var.k(21)) {
            setCounterTextColor(g85Var.b(21));
        }
        if (g85Var.k(19)) {
            setCounterOverflowTextColor(g85Var.b(19));
        }
        if (g85Var.k(51)) {
            setPlaceholderTextColor(g85Var.b(51));
        }
        if (g85Var.k(54)) {
            setPrefixTextColor(g85Var.b(54));
        }
        if (g85Var.k(64)) {
            setSuffixTextColor(g85Var.b(64));
        }
        setCounterEnabled(zA3);
        setEnabled(g85Var.a(0, true));
        g85Var.m();
        bi5.LPt8Fixed.s(this, 2);
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i < 26) {
            return;
        }
        bi5.FJCM.l(this, 1);
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = uo0.g(drawable).mutate();
            if (z) {
                uo0.CQf.h(drawable, colorStateList);
            }
            if (z2) {
                uo0.CQf.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private rs0 getEndIconDelegate() {
        SparseArray<rs0> sparseArray = this.C0;
        rs0 rs0Var = sparseArray.get(this.B0);
        return rs0Var != null ? rs0Var : sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.O0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if ((this.B0 != 0) && g()) {
            return this.D0;
        }
        return null;
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    public static void l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = bi5.a;
        boolean zA = bi5.F1.a(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zA || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z);
        bi5.LPt8Fixed.s(checkableImageButton, z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.A != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.B0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.A = editText;
        setMinWidth(this.C);
        setMaxWidth(this.D);
        h();
        setTextInputAccessibilityDelegate(new NUlFixed(this));
        Typeface typeface = this.A.getTypeface();
        au auVar = this.c1;
        tm tmVar = auVar.v;
        if (tmVar != null) {
            tmVar.y = true;
        }
        if (auVar.s != typeface) {
            auVar.s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (auVar.t != typeface) {
            auVar.t = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            auVar.h();
        }
        float textSize = this.A.getTextSize();
        if (auVar.i != textSize) {
            auVar.i = textSize;
            auVar.h();
        }
        int gravity = this.A.getGravity();
        int i = (gravity & (-113)) | 48;
        if (auVar.h != i) {
            auVar.h = i;
            auVar.h();
        }
        if (auVar.g != gravity) {
            auVar.g = gravity;
            auVar.h();
        }
        this.A.addTextChangedListener(new QnHx());
        if (this.Q0 == null) {
            this.Q0 = this.A.getHintTextColors();
        }
        if (this.W) {
            if (TextUtils.isEmpty(this.a0)) {
                CharSequence hint = this.A.getHint();
                this.B = hint;
                setHint(hint);
                this.A.setHint((CharSequence) null);
            }
            this.b0 = true;
        }
        if (this.I != null) {
            n(this.A.getText().length());
        }
        q();
        this.E.b();
        this.x.bringToFront();
        this.y.bringToFront();
        this.z.bringToFront();
        this.O0.bringToFront();
        Iterator<YKK> it = this.A0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.O0.setVisibility(z ? 0 : 8);
        this.z.setVisibility(z ? 8 : 0);
        x();
        if (this.B0 != 0) {
            return;
        }
        p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.a0)) {
            return;
        }
        this.a0 = charSequence;
        au auVar = this.c1;
        if (charSequence == null || !TextUtils.equals(auVar.w, charSequence)) {
            auVar.w = charSequence;
            auVar.x = null;
            Bitmap bitmap = auVar.z;
            if (bitmap != null) {
                bitmap.recycle();
                auVar.z = null;
            }
            auVar.h();
        }
        if (this.b1) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.M == z) {
            return;
        }
        if (z) {
            g14c g14cVar = new g14c(getContext(), null);
            this.N = g14cVar;
            g14cVar.setId(R.id.textinput_placeholder);
            g14c g14cVar2 = this.N;
            Field field = bi5.a;
            bi5.auxFixed.f(g14cVar2, 1);
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
            g14c g14cVar3 = this.N;
            if (g14cVar3 != null) {
                this.w.addView(g14cVar3);
                this.N.setVisibility(0);
            }
        } else {
            g14c g14cVar4 = this.N;
            if (g14cVar4 != null) {
                g14cVar4.setVisibility(8);
            }
            this.N = null;
        }
        this.M = z;
    }

    public final void a(float f) {
        au auVar = this.c1;
        if (auVar.c == f) {
            return;
        }
        if (this.f1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1 = valueAnimator;
            valueAnimator.setInterpolator(ur.b);
            this.f1.setDuration(167L);
            this.f1.addUpdateListener(new LPt8Fixed());
        }
        this.f1.setFloatValues(auVar.c, f);
        this.f1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.w;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final void b() {
        boolean z;
        la2 la2Var = this.c0;
        if (la2Var == null) {
            return;
        }
        la2Var.setShapeAppearanceModel(this.e0);
        boolean z2 = false;
        if (this.h0 != 2) {
            z = false;
        } else {
            if (this.j0 > -1 && this.m0 != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            la2 la2Var2 = this.c0;
            float f = this.j0;
            int i = this.m0;
            la2Var2.w.k = f;
            la2Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
            la2.CQf cQf = la2Var2.w;
            if (cQf.d != colorStateListValueOf) {
                cQf.d = colorStateListValueOf;
                la2Var2.onStateChange(la2Var2.getState());
            }
        }
        int iB = this.n0;
        if (this.h0 == 1) {
            TypedValue typedValueA = w92.a(getContext(), R.attr.colorSurface);
            iB = lv.b(this.n0, typedValueA != null ? typedValueA.data : 0);
        }
        this.n0 = iB;
        this.c0.j(ColorStateList.valueOf(iB));
        if (this.B0 == 3) {
            this.A.getBackground().invalidateSelf();
        }
        la2 la2Var3 = this.d0;
        if (la2Var3 != null) {
            if (this.j0 > -1 && this.m0 != 0) {
                z2 = true;
            }
            if (z2) {
                la2Var3.j(ColorStateList.valueOf(this.m0));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.D0, this.G0, this.F0, this.I0, this.H0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.A;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.B != null) {
            boolean z = this.b0;
            this.b0 = false;
            CharSequence hint = editText.getHint();
            this.A.setHint(this.B);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.A.setHint(hint);
                this.b0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.w;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.A) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.h1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.h1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.W) {
            au auVar = this.c1;
            auVar.getClass();
            int iSave = canvas.save();
            if (auVar.x != null && auVar.b) {
                auVar.N.getLineLeft(0);
                auVar.E.setTextSize(auVar.B);
                float f = auVar.q;
                float f2 = auVar.r;
                float f3 = auVar.A;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                auVar.N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        la2 la2Var = this.d0;
        if (la2Var != null) {
            Rect bounds = la2Var.getBounds();
            bounds.top = bounds.bottom - this.j0;
            this.d0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.g1) {
            return;
        }
        this.g1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        au auVar = this.c1;
        if (auVar != null) {
            auVar.C = drawableState;
            ColorStateList colorStateList2 = auVar.l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = auVar.k) != null && colorStateList.isStateful())) {
                auVar.h();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.A != null) {
            Field field = bi5.a;
            s(bi5.auxFixed.c(this) && isEnabled(), false);
        }
        q();
        z();
        if (z) {
            invalidate();
        }
        this.g1 = false;
    }

    public final int e() {
        float f;
        if (!this.W) {
            return 0;
        }
        int i = this.h0;
        au auVar = this.c1;
        if (i == 0 || i == 1) {
            TextPaint textPaint = auVar.F;
            textPaint.setTextSize(auVar.j);
            textPaint.setTypeface(auVar.s);
            textPaint.setLetterSpacing(auVar.M);
            f = -textPaint.ascent();
        } else {
            if (i != 2) {
                return 0;
            }
            TextPaint textPaint2 = auVar.F;
            textPaint2.setTextSize(auVar.j);
            textPaint2.setTypeface(auVar.s);
            textPaint2.setLetterSpacing(auVar.M);
            f = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f;
    }

    public final boolean f() {
        return this.W && !TextUtils.isEmpty(this.a0) && (this.c0 instanceof ke0);
    }

    public final boolean g() {
        return this.z.getVisibility() == 0 && this.D0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.A;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public la2 getBoxBackground() {
        int i = this.h0;
        if (i == 1 || i == 2) {
            return this.c0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.n0;
    }

    public int getBoxBackgroundMode() {
        return this.h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        la2 la2Var = this.c0;
        return la2Var.w.a.h.a(la2Var.g());
    }

    public float getBoxCornerRadiusBottomStart() {
        la2 la2Var = this.c0;
        return la2Var.w.a.g.a(la2Var.g());
    }

    public float getBoxCornerRadiusTopEnd() {
        la2 la2Var = this.c0;
        return la2Var.w.a.f.a(la2Var.g());
    }

    public float getBoxCornerRadiusTopStart() {
        la2 la2Var = this.c0;
        return la2Var.w.a.e.a(la2Var.g());
    }

    public int getBoxStrokeColor() {
        return this.U0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.V0;
    }

    public int getBoxStrokeWidth() {
        return this.k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.l0;
    }

    public int getCounterMaxLength() {
        return this.G;
    }

    public CharSequence getCounterOverflowDescription() {
        g14c g14cVar;
        if (this.F && this.H && (g14cVar = this.I) != null) {
            return g14cVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.Q;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.Q0;
    }

    public EditText getEditText() {
        return this.A;
    }

    public CharSequence getEndIconContentDescription() {
        return this.D0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.D0.getDrawable();
    }

    public int getEndIconMode() {
        return this.B0;
    }

    public CheckableImageButton getEndIconView() {
        return this.D0;
    }

    public CharSequence getError() {
        yj1 yj1Var = this.E;
        if (yj1Var.k) {
            return yj1Var.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.E.m;
    }

    public int getErrorCurrentTextColors() {
        return this.E.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.O0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.E.g();
    }

    public CharSequence getHelperText() {
        yj1 yj1Var = this.E;
        if (yj1Var.q) {
            return yj1Var.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        g14c g14cVar = this.E.r;
        if (g14cVar != null) {
            return g14cVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        au auVar = this.c1;
        TextPaint textPaint = auVar.F;
        textPaint.setTextSize(auVar.j);
        textPaint.setTypeface(auVar.s);
        textPaint.setLetterSpacing(auVar.M);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        au auVar = this.c1;
        return auVar.e(auVar.l);
    }

    public ColorStateList getHintTextColor() {
        return this.R0;
    }

    public int getMaxWidth() {
        return this.D;
    }

    public int getMinWidth() {
        return this.C;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.D0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.D0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.S;
    }

    public ColorStateList getPrefixTextColor() {
        return this.T.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.T;
    }

    public CharSequence getStartIconContentDescription() {
        return this.s0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.s0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.U;
    }

    public ColorStateList getSuffixTextColor() {
        return this.V.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.V;
    }

    public Typeface getTypeface() {
        return this.r0;
    }

    public final void h() {
        int i = this.h0;
        if (i != 0) {
            ej4 ej4Var = this.e0;
            if (i == 1) {
                this.c0 = new la2(ej4Var);
                this.d0 = new la2();
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(ex0.c(new StringBuilder(), this.h0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
                if (!this.W || (this.c0 instanceof ke0)) {
                    this.c0 = new la2(ej4Var);
                } else {
                    this.c0 = new ke0(ej4Var);
                }
                this.d0 = null;
            }
        } else {
            this.c0 = null;
            this.d0 = null;
        }
        EditText editText = this.A;
        if ((editText == null || this.c0 == null || editText.getBackground() != null || this.h0 == 0) ? false : true) {
            EditText editText2 = this.A;
            la2 la2Var = this.c0;
            Field field = bi5.a;
            bi5.LPt8Fixed.q(editText2, la2Var);
        }
        z();
        if (this.h0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.i0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ja2.d(getContext())) {
                this.i0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.A != null && this.h0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.A;
                Field field2 = bi5.a;
                bi5.NUlFixed.k(editText3, bi5.NUlFixed.f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), bi5.NUlFixed.e(this.A), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ja2.d(getContext())) {
                EditText editText4 = this.A;
                Field field3 = bi5.a;
                bi5.NUlFixed.k(editText4, bi5.NUlFixed.f(editText4), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), bi5.NUlFixed.e(this.A), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.h0 != 0) {
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    public final void i() {
        float f;
        float fB;
        float f2;
        float fB2;
        int i;
        float fB3;
        int i2;
        if (f()) {
            RectF rectF = this.q0;
            int width = this.A.getWidth();
            int gravity = this.A.getGravity();
            au auVar = this.c1;
            boolean zC = auVar.c(auVar.w);
            auVar.y = zC;
            Rect rect = auVar.e;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f2 = i2;
                    } else {
                        f = rect.right;
                        fB = auVar.b();
                    }
                } else if (zC) {
                    f = rect.right;
                    fB = auVar.b();
                } else {
                    i2 = rect.left;
                    f2 = i2;
                }
                rectF.left = f2;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    fB2 = (width / 2.0f) + (auVar.b() / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (auVar.y) {
                        fB3 = auVar.b();
                        fB2 = fB3 + f2;
                    } else {
                        i = rect.right;
                        fB2 = i;
                    }
                } else if (auVar.y) {
                    i = rect.right;
                    fB2 = i;
                } else {
                    fB3 = auVar.b();
                    fB2 = fB3 + f2;
                }
                rectF.right = fB2;
                TextPaint textPaint = auVar.F;
                textPaint.setTextSize(auVar.j);
                textPaint.setTypeface(auVar.s);
                textPaint.setLetterSpacing(auVar.M);
                textPaint.ascent();
                float f3 = rectF.left;
                float f4 = this.f0;
                rectF.left = f3 - f4;
                rectF.right += f4;
                int i3 = this.j0;
                this.g0 = i3;
                rectF.top = 0.0f;
                rectF.bottom = i3;
                rectF.offset(-getPaddingLeft(), 0.0f);
                ke0 ke0Var = (ke0) this.c0;
                ke0Var.getClass();
                ke0Var.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = width / 2.0f;
            fB = auVar.b() / 2.0f;
            f2 = f - fB;
            rectF.left = f2;
            rectF.top = rect.top;
            if (gravity != 17) {
                fB2 = (width / 2.0f) + (auVar.b() / 2.0f);
            } else {
                fB2 = (width / 2.0f) + (auVar.b() / 2.0f);
            }
            rectF.right = fB2;
            TextPaint textPaint2 = auVar.F;
            textPaint2.setTextSize(auVar.j);
            textPaint2.setTypeface(auVar.s);
            textPaint2.setLetterSpacing(auVar.M);
            textPaint2.ascent();
            float f5 = rectF.left;
            float f6 = this.f0;
            rectF.left = f5 - f6;
            rectF.right += f6;
            int i4 = this.j0;
            this.g0 = i4;
            rectF.top = 0.0f;
            rectF.bottom = i4;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ke0 ke0Var2 = (ke0) this.c0;
            ke0Var2.getClass();
            ke0Var2.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = uo0.g(drawable).mutate();
        uo0.CQf.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public final void m(TextView textView, int i) {
        boolean z = true;
        try {
            c65.e(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            c65.e(textView, 2131755353);
            textView.setTextColor(r80.b(getContext(), R.color.design_error));
        }
    }

    public final void n(int i) {
        boolean z = this.H;
        int i2 = this.G;
        String string = null;
        if (i2 == -1) {
            this.I.setText(String.valueOf(i));
            this.I.setContentDescription(null);
            this.H = false;
        } else {
            this.H = i > i2;
            Context context = getContext();
            this.I.setContentDescription(context.getString(this.H ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.G)));
            if (z != this.H) {
                o();
            }
            String str = ea.d;
            Locale locale = Locale.getDefault();
            int i3 = b65.a;
            ea eaVar = b65.QnHx.a(locale) == 1 ? ea.g : ea.f;
            g14c g14cVar = this.I;
            String string2 = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.G));
            if (string2 == null) {
                eaVar.getClass();
            } else {
                string = eaVar.c(string2, eaVar.c).toString();
            }
            g14cVar.setText(string);
        }
        if (this.A == null || z == this.H) {
            return;
        }
        s(false, false);
        z();
        q();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g14c g14cVar = this.I;
        if (g14cVar != null) {
            m(g14cVar, this.H ? this.J : this.K);
            if (!this.H && (colorStateList2 = this.Q) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (!this.H || (colorStateList = this.R) == null) {
                return;
            }
            this.I.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.A;
        if (editText != null) {
            Rect rect = this.o0;
            wj0.a(this, editText, rect);
            la2 la2Var = this.d0;
            if (la2Var != null) {
                int i5 = rect.bottom;
                la2Var.setBounds(rect.left, i5 - this.l0, rect.right, i5);
            }
            if (this.W) {
                float textSize = this.A.getTextSize();
                au auVar = this.c1;
                if (auVar.i != textSize) {
                    auVar.i = textSize;
                    auVar.h();
                }
                int gravity = this.A.getGravity();
                int i6 = (gravity & (-113)) | 48;
                if (auVar.h != i6) {
                    auVar.h = i6;
                    auVar.h();
                }
                if (auVar.g != gravity) {
                    auVar.g = gravity;
                    auVar.h();
                }
                if (this.A == null) {
                    throw new IllegalStateException();
                }
                Field field = bi5.a;
                boolean z2 = false;
                boolean z3 = bi5.NUlFixed.d(this) == 1;
                int i7 = rect.bottom;
                Rect rect2 = this.p0;
                rect2.bottom = i7;
                int i8 = this.h0;
                g14c g14cVar = this.T;
                if (i8 == 1) {
                    int compoundPaddingLeft = this.A.getCompoundPaddingLeft() + rect.left;
                    if (this.S != null && !z3) {
                        compoundPaddingLeft = (compoundPaddingLeft - g14cVar.getMeasuredWidth()) + g14cVar.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.i0;
                    int compoundPaddingRight = rect.right - this.A.getCompoundPaddingRight();
                    if (this.S != null && z3) {
                        compoundPaddingRight += g14cVar.getMeasuredWidth() - g14cVar.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i8 != 2) {
                    int compoundPaddingLeft2 = this.A.getCompoundPaddingLeft() + rect.left;
                    if (this.S != null && !z3) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - g14cVar.getMeasuredWidth()) + g14cVar.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.A.getCompoundPaddingRight();
                    if (this.S != null && z3) {
                        compoundPaddingRight2 += g14cVar.getMeasuredWidth() - g14cVar.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.A.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - e();
                    rect2.right = rect.right - this.A.getPaddingRight();
                }
                int i9 = rect2.left;
                int i10 = rect2.top;
                int i11 = rect2.right;
                int i12 = rect2.bottom;
                Rect rect3 = auVar.e;
                if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                    rect3.set(i9, i10, i11, i12);
                    auVar.D = true;
                    auVar.g();
                }
                if (this.A == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = auVar.F;
                textPaint.setTextSize(auVar.i);
                textPaint.setTypeface(auVar.t);
                textPaint.setLetterSpacing(0.0f);
                float f = -textPaint.ascent();
                rect2.left = this.A.getCompoundPaddingLeft() + rect.left;
                rect2.top = this.h0 == 1 && this.A.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.A.getCompoundPaddingTop();
                rect2.right = rect.right - this.A.getCompoundPaddingRight();
                int compoundPaddingBottom = this.h0 == 1 && this.A.getMinLines() <= 1 ? (int) (rect2.top + f) : rect.bottom - this.A.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i13 = rect2.left;
                int i14 = rect2.top;
                int i15 = rect2.right;
                Rect rect4 = auVar.d;
                if (rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom) {
                    z2 = true;
                }
                if (!z2) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    auVar.D = true;
                    auVar.g();
                }
                auVar.h();
                if (!f() || this.b1) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int iMax;
        super.onMeasure(i, i2);
        if (this.A != null && this.A.getMeasuredHeight() < (iMax = Math.max(this.y.getMeasuredHeight(), this.x.getMeasuredHeight()))) {
            this.A.setMinimumHeight(iMax);
            z = true;
        } else {
            z = false;
        }
        boolean zP = p();
        if (z || zP) {
            this.A.post(new F1());
        }
        if (this.N != null && (editText = this.A) != null) {
            this.N.setGravity(editText.getGravity());
            this.N.setPadding(this.A.getCompoundPaddingLeft(), this.A.getCompoundPaddingTop(), this.A.getCompoundPaddingRight(), this.A.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof T23)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T23 t23 = (T23) parcelable;
        super.onRestoreInstanceState(t23.w);
        setError(t23.y);
        if (t23.z) {
            this.D0.post(new CQf());
        }
        setHint(t23.A);
        setHelperText(t23.B);
        setPlaceholderText(t23.C);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        T23 t23 = new T23(super.onSaveInstanceState());
        if (this.E.e()) {
            t23.y = getError();
        }
        t23.z = (this.B0 != 0) && this.D0.isChecked();
        t23.A = getHint();
        t23.B = getHelperText();
        t23.C = getPlaceholderText();
        return t23;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public final boolean p() {
        boolean z;
        boolean z2;
        if (this.A == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        LinearLayout linearLayout = this.x;
        boolean z3 = true;
        if (!(startIconDrawable == null && this.S == null) && linearLayout.getMeasuredWidth() > 0) {
            int measuredWidth = linearLayout.getMeasuredWidth() - this.A.getPaddingLeft();
            if (this.x0 == null || this.y0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.x0 = colorDrawable;
                this.y0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = c65.CQf.a(this.A);
            Drawable drawable = drawableArrA[0];
            ColorDrawable colorDrawable2 = this.x0;
            if (drawable != colorDrawable2) {
                c65.CQf.e(this.A, colorDrawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.x0 != null) {
            Drawable[] drawableArrA2 = c65.CQf.a(this.A);
            c65.CQf.e(this.A, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.x0 = null;
            z = true;
        } else {
            z = false;
        }
        if (this.O0.getVisibility() != 0) {
            if (!((this.B0 != 0) && g()) && this.U == null) {
                z2 = false;
            } else if (this.y.getMeasuredWidth() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else if (this.y.getMeasuredWidth() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int measuredWidth2 = this.V.getMeasuredWidth() - this.A.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = u92.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrA3 = c65.CQf.a(this.A);
            ColorDrawable colorDrawable3 = this.J0;
            if (colorDrawable3 == null || this.K0 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.J0 = colorDrawable4;
                    this.K0 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = drawableArrA3[2];
                ColorDrawable colorDrawable5 = this.J0;
                if (drawable2 != colorDrawable5) {
                    this.L0 = drawable2;
                    c65.CQf.e(this.A, drawableArrA3[0], drawableArrA3[1], colorDrawable5, drawableArrA3[3]);
                } else {
                    z3 = z;
                }
            } else {
                this.K0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                c65.CQf.e(this.A, drawableArrA3[0], drawableArrA3[1], this.J0, drawableArrA3[3]);
            }
        } else {
            if (this.J0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = c65.CQf.a(this.A);
            if (drawableArrA4[2] == this.J0) {
                c65.CQf.e(this.A, drawableArrA4[0], drawableArrA4[1], this.L0, drawableArrA4[3]);
            } else {
                z3 = z;
            }
            this.J0 = null;
        }
        return z3;
    }

    public final void q() {
        Drawable background;
        g14c g14cVar;
        EditText editText = this.A;
        if (editText == null || this.h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = bp0.a;
        Drawable drawableMutate = background.mutate();
        yj1 yj1Var = this.E;
        if (yj1Var.e()) {
            drawableMutate.setColorFilter(Mt0.c(yj1Var.g(), PorterDuff.Mode.SRC_IN));
        } else if (this.H && (g14cVar = this.I) != null) {
            drawableMutate.setColorFilter(Mt0.c(g14cVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            uo0.a(drawableMutate);
            this.A.refreshDrawableState();
        }
    }

    public final void r() {
        if (this.h0 != 1) {
            FrameLayout frameLayout = this.w;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        ColorStateList colorStateList;
        g14c g14cVar;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.A;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.A;
        boolean z4 = editText2 != null && editText2.hasFocus();
        yj1 yj1Var = this.E;
        boolean zE = yj1Var.e();
        ColorStateList colorStateList2 = this.Q0;
        au auVar = this.c1;
        if (colorStateList2 != null) {
            auVar.i(colorStateList2);
            ColorStateList colorStateList3 = this.Q0;
            if (auVar.k != colorStateList3) {
                auVar.k = colorStateList3;
                auVar.h();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.Q0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.a1) : this.a1;
            auVar.i(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (auVar.k != colorStateListValueOf) {
                auVar.k = colorStateListValueOf;
                auVar.h();
            }
        } else if (zE) {
            g14c g14cVar2 = yj1Var.l;
            auVar.i(g14cVar2 != null ? g14cVar2.getTextColors() : null);
        } else if (this.H && (g14cVar = this.I) != null) {
            auVar.i(g14cVar.getTextColors());
        } else if (z4 && (colorStateList = this.R0) != null) {
            auVar.i(colorStateList);
        }
        if (z3 || !this.d1 || (isEnabled() && z4)) {
            if (z2 || this.b1) {
                ValueAnimator valueAnimator = this.f1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1.cancel();
                }
                if (z && this.e1) {
                    a(1.0f);
                } else {
                    auVar.j(1.0f);
                }
                this.b1 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.A;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z2 || !this.b1) {
            ValueAnimator valueAnimator2 = this.f1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1.cancel();
            }
            if (z && this.e1) {
                a(0.0f);
            } else {
                auVar.j(0.0f);
            }
            if (f() && (!((ke0) this.c0).U.isEmpty()) && f()) {
                ((ke0) this.c0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.b1 = true;
            g14c g14cVar3 = this.N;
            if (g14cVar3 != null && this.M) {
                g14cVar3.setText((CharSequence) null);
                this.N.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.n0 != i) {
            this.n0 = i;
            this.W0 = i;
            this.Y0 = i;
            this.Z0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(r80.b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.W0 = defaultColor;
        this.n0 = defaultColor;
        this.X0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.Y0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.Z0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.h0) {
            return;
        }
        this.h0 = i;
        if (this.A != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.S0 = colorStateList.getDefaultColor();
            this.a1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.T0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.U0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.U0 != colorStateList.getDefaultColor()) {
            this.U0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.V0 != colorStateList) {
            this.V0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.k0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.l0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.F != z) {
            yj1 yj1Var = this.E;
            if (z) {
                g14c g14cVar = new g14c(getContext(), null);
                this.I = g14cVar;
                g14cVar.setId(R.id.textinput_counter);
                Typeface typeface = this.r0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                yj1Var.a(this.I, 2);
                u92.h((ViewGroup.MarginLayoutParams) this.I.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.I != null) {
                    EditText editText = this.A;
                    n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                yj1Var.i(this.I, 2);
                this.I = null;
            }
            this.F = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.G != i) {
            if (i > 0) {
                this.G = i;
            } else {
                this.G = -1;
            }
            if (!this.F || this.I == null) {
                return;
            }
            EditText editText = this.A;
            n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.J != i) {
            this.J = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.K != i) {
            this.K = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.Q0 = colorStateList;
        this.R0 = colorStateList;
        if (this.A != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.D0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.D0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? XTd3.l(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.B0;
        this.B0 = i;
        Iterator<auxFixed> it = this.E0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.h0)) {
            getEndIconDelegate().a();
            c();
        } else {
            throw new IllegalStateException("The current box background mode " + this.h0 + " is not supported by the end icon mode " + i);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.M0;
        CheckableImageButton checkableImageButton = this.D0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.M0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.D0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            this.G0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            this.I0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (g() != z) {
            this.D0.setVisibility(z ? 0 : 8);
            x();
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        yj1 yj1Var = this.E;
        if (!yj1Var.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            yj1Var.h();
            return;
        }
        yj1Var.c();
        yj1Var.j = charSequence;
        yj1Var.l.setText(charSequence);
        int i = yj1Var.h;
        if (i != 1) {
            yj1Var.i = 1;
        }
        yj1Var.k(i, yj1Var.i, yj1Var.j(yj1Var.l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        yj1 yj1Var = this.E;
        yj1Var.m = charSequence;
        g14c g14cVar = yj1Var.l;
        if (g14cVar != null) {
            g14cVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        yj1 yj1Var = this.E;
        if (yj1Var.k == z) {
            return;
        }
        yj1Var.c();
        TextInputLayout textInputLayout = yj1Var.b;
        if (z) {
            g14c g14cVar = new g14c(yj1Var.a, null);
            yj1Var.l = g14cVar;
            g14cVar.setId(R.id.textinput_error);
            yj1Var.l.setTextAlignment(5);
            Typeface typeface = yj1Var.u;
            if (typeface != null) {
                yj1Var.l.setTypeface(typeface);
            }
            int i = yj1Var.n;
            yj1Var.n = i;
            g14c g14cVar2 = yj1Var.l;
            if (g14cVar2 != null) {
                textInputLayout.m(g14cVar2, i);
            }
            ColorStateList colorStateList = yj1Var.o;
            yj1Var.o = colorStateList;
            g14c g14cVar3 = yj1Var.l;
            if (g14cVar3 != null && colorStateList != null) {
                g14cVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = yj1Var.m;
            yj1Var.m = charSequence;
            g14c g14cVar4 = yj1Var.l;
            if (g14cVar4 != null) {
                g14cVar4.setContentDescription(charSequence);
            }
            yj1Var.l.setVisibility(4);
            g14c g14cVar5 = yj1Var.l;
            Field field = bi5.a;
            bi5.auxFixed.f(g14cVar5, 1);
            yj1Var.a(yj1Var.l, 0);
        } else {
            yj1Var.h();
            yj1Var.i(yj1Var.l, 0);
            yj1Var.l = null;
            textInputLayout.q();
            textInputLayout.z();
        }
        yj1Var.k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? XTd3.l(getContext(), i) : null);
        k(this.O0, this.P0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.N0;
        CheckableImageButton checkableImageButton = this.O0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.N0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.O0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.P0 = colorStateList;
        CheckableImageButton checkableImageButton = this.O0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = uo0.g(drawable).mutate();
            uo0.CQf.h(drawable, colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.O0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = uo0.g(drawable).mutate();
            uo0.CQf.i(drawable, mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        yj1 yj1Var = this.E;
        yj1Var.n = i;
        g14c g14cVar = yj1Var.l;
        if (g14cVar != null) {
            yj1Var.b.m(g14cVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        yj1 yj1Var = this.E;
        yj1Var.o = colorStateList;
        g14c g14cVar = yj1Var.l;
        if (g14cVar == null || colorStateList == null) {
            return;
        }
        g14cVar.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.d1 != z) {
            this.d1 = z;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        yj1 yj1Var = this.E;
        if (zIsEmpty) {
            if (yj1Var.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!yj1Var.q) {
            setHelperTextEnabled(true);
        }
        yj1Var.c();
        yj1Var.p = charSequence;
        yj1Var.r.setText(charSequence);
        int i = yj1Var.h;
        if (i != 2) {
            yj1Var.i = 2;
        }
        yj1Var.k(i, yj1Var.i, yj1Var.j(yj1Var.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        yj1 yj1Var = this.E;
        yj1Var.t = colorStateList;
        g14c g14cVar = yj1Var.r;
        if (g14cVar == null || colorStateList == null) {
            return;
        }
        g14cVar.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        yj1 yj1Var = this.E;
        if (yj1Var.q == z) {
            return;
        }
        yj1Var.c();
        if (z) {
            g14c g14cVar = new g14c(yj1Var.a, null);
            yj1Var.r = g14cVar;
            g14cVar.setId(R.id.textinput_helper_text);
            yj1Var.r.setTextAlignment(5);
            Typeface typeface = yj1Var.u;
            if (typeface != null) {
                yj1Var.r.setTypeface(typeface);
            }
            yj1Var.r.setVisibility(4);
            g14c g14cVar2 = yj1Var.r;
            Field field = bi5.a;
            bi5.auxFixed.f(g14cVar2, 1);
            int i = yj1Var.s;
            yj1Var.s = i;
            g14c g14cVar3 = yj1Var.r;
            if (g14cVar3 != null) {
                c65.e(g14cVar3, i);
            }
            ColorStateList colorStateList = yj1Var.t;
            yj1Var.t = colorStateList;
            g14c g14cVar4 = yj1Var.r;
            if (g14cVar4 != null && colorStateList != null) {
                g14cVar4.setTextColor(colorStateList);
            }
            yj1Var.a(yj1Var.r, 1);
        } else {
            yj1Var.c();
            int i2 = yj1Var.h;
            if (i2 == 2) {
                yj1Var.i = 0;
            }
            yj1Var.k(i2, yj1Var.i, yj1Var.j(yj1Var.r, null));
            yj1Var.i(yj1Var.r, 1);
            yj1Var.r = null;
            TextInputLayout textInputLayout = yj1Var.b;
            textInputLayout.q();
            textInputLayout.z();
        }
        yj1Var.q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        yj1 yj1Var = this.E;
        yj1Var.s = i;
        g14c g14cVar = yj1Var.r;
        if (g14cVar != null) {
            c65.e(g14cVar, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.e1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.W) {
            this.W = z;
            if (z) {
                CharSequence hint = this.A.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.a0)) {
                        setHint(hint);
                    }
                    this.A.setHint((CharSequence) null);
                }
                this.b0 = true;
            } else {
                this.b0 = false;
                if (!TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(this.A.getHint())) {
                    this.A.setHint(this.a0);
                }
                setHintInternal(null);
            }
            if (this.A != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        au auVar = this.c1;
        View view = auVar.a;
        s15 s15Var = new s15(view.getContext(), i);
        ColorStateList colorStateList = s15Var.a;
        if (colorStateList != null) {
            auVar.l = colorStateList;
        }
        float f = s15Var.k;
        if (f != 0.0f) {
            auVar.j = f;
        }
        ColorStateList colorStateList2 = s15Var.b;
        if (colorStateList2 != null) {
            auVar.L = colorStateList2;
        }
        auVar.J = s15Var.f;
        auVar.K = s15Var.g;
        auVar.I = s15Var.h;
        auVar.M = s15Var.j;
        tm tmVar = auVar.v;
        if (tmVar != null) {
            tmVar.y = true;
        }
        zt ztVar = new zt(auVar);
        s15Var.a();
        auVar.v = new tm(ztVar, s15Var.n);
        s15Var.c(view.getContext(), auVar.v);
        auVar.h();
        this.R0 = auVar.l;
        if (this.A != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.R0 != colorStateList) {
            if (this.Q0 == null) {
                this.c1.i(colorStateList);
            }
            this.R0 = colorStateList;
            if (this.A != null) {
                s(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.D = i;
        EditText editText = this.A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.C = i;
        EditText editText = this.A;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? XTd3.l(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.B0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.F0 = colorStateList;
        this.G0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.H0 = mode;
        this.I0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.M && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        EditText editText = this.A;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.P = i;
        g14c g14cVar = this.N;
        if (g14cVar != null) {
            c65.e(g14cVar, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            g14c g14cVar = this.N;
            if (g14cVar == null || colorStateList == null) {
                return;
            }
            g14cVar.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.S = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.T.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i) {
        c65.e(this.T, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.T.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.s0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? XTd3.l(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.z0;
        CheckableImageButton checkableImageButton = this.s0;
        checkableImageButton.setOnClickListener(onClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.z0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.s0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            this.u0 = true;
            d(this.s0, true, colorStateList, this.w0, this.v0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.v0 != mode) {
            this.v0 = mode;
            this.w0 = true;
            d(this.s0, this.u0, this.t0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        CheckableImageButton checkableImageButton = this.s0;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            u();
            p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.U = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.V.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i) {
        c65.e(this.V, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.V.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(NUlFixed nUl) {
        EditText editText = this.A;
        if (editText != null) {
            bi5.m(editText, nUl);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.r0) {
            this.r0 = typeface;
            au auVar = this.c1;
            tm tmVar = auVar.v;
            boolean z2 = true;
            if (tmVar != null) {
                tmVar.y = true;
            }
            if (auVar.s != typeface) {
                auVar.s = typeface;
                z = true;
            } else {
                z = false;
            }
            if (auVar.t != typeface) {
                auVar.t = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                auVar.h();
            }
            yj1 yj1Var = this.E;
            if (typeface != yj1Var.u) {
                yj1Var.u = typeface;
                g14c g14cVar = yj1Var.l;
                if (g14cVar != null) {
                    g14cVar.setTypeface(typeface);
                }
                g14c g14cVar2 = yj1Var.r;
                if (g14cVar2 != null) {
                    g14cVar2.setTypeface(typeface);
                }
            }
            g14c g14cVar3 = this.I;
            if (g14cVar3 != null) {
                g14cVar3.setTypeface(typeface);
            }
        }
    }

    public final void t(int i) {
        if (i != 0 || this.b1) {
            g14c g14cVar = this.N;
            if (g14cVar == null || !this.M) {
                return;
            }
            g14cVar.setText((CharSequence) null);
            this.N.setVisibility(4);
            return;
        }
        g14c g14cVar2 = this.N;
        if (g14cVar2 == null || !this.M) {
            return;
        }
        g14cVar2.setText(this.L);
        this.N.setVisibility(0);
        this.N.bringToFront();
    }

    public final void u() {
        if (this.A == null) {
            return;
        }
        int iF = 0;
        if (!(this.s0.getVisibility() == 0)) {
            EditText editText = this.A;
            Field field = bi5.a;
            iF = bi5.NUlFixed.f(editText);
        }
        g14c g14cVar = this.T;
        int compoundPaddingTop = this.A.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.A.getCompoundPaddingBottom();
        Field field2 = bi5.a;
        bi5.NUlFixed.k(g14cVar, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void v() {
        this.T.setVisibility((this.S == null || this.b1) ? 8 : 0);
        p();
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.V0.getDefaultColor();
        int colorForState = this.V0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.V0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.m0 = colorForState2;
        } else if (z2) {
            this.m0 = colorForState;
        } else {
            this.m0 = defaultColor;
        }
    }

    public final void x() {
        if (this.A == null) {
            return;
        }
        int iE = 0;
        if (!g()) {
            if (!(this.O0.getVisibility() == 0)) {
                EditText editText = this.A;
                Field field = bi5.a;
                iE = bi5.NUlFixed.e(editText);
            }
        }
        g14c g14cVar = this.V;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.A.getPaddingTop();
        int paddingBottom = this.A.getPaddingBottom();
        Field field2 = bi5.a;
        bi5.NUlFixed.k(g14cVar, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void y() {
        g14c g14cVar = this.V;
        int visibility = g14cVar.getVisibility();
        boolean z = (this.U == null || this.b1) ? false : true;
        g14cVar.setVisibility(z ? 0 : 8);
        if (visibility != g14cVar.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        p();
    }

    public final void z() {
        g14c g14cVar;
        EditText editText;
        EditText editText2;
        if (this.c0 == null || this.h0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.A) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.A) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        yj1 yj1Var = this.E;
        if (!zIsEnabled) {
            this.m0 = this.a1;
        } else if (yj1Var.e()) {
            if (this.V0 != null) {
                w(z2, z3);
            } else {
                this.m0 = yj1Var.g();
            }
        } else if (!this.H || (g14cVar = this.I) == null) {
            if (z2) {
                this.m0 = this.U0;
            } else if (z3) {
                this.m0 = this.T0;
            } else {
                this.m0 = this.S0;
            }
        } else if (this.V0 != null) {
            w(z2, z3);
        } else {
            this.m0 = g14cVar.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && yj1Var.k && yj1Var.e()) {
            z = true;
        }
        setErrorIconVisible(z);
        k(this.O0, this.P0);
        k(this.s0, this.t0);
        ColorStateList colorStateList = this.F0;
        CheckableImageButton checkableImageButton = this.D0;
        k(checkableImageButton, colorStateList);
        rs0 endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof com.google.android.material.textfield.CQf) {
            if (!yj1Var.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable drawableMutate = uo0.g(getEndIconDrawable()).mutate();
                uo0.CQf.g(drawableMutate, yj1Var.g());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        if (z2 && isEnabled()) {
            this.j0 = this.l0;
        } else {
            this.j0 = this.k0;
        }
        if (this.h0 == 2 && f() && !this.b1 && this.g0 != this.j0) {
            if (f()) {
                ((ke0) this.c0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            i();
        }
        if (this.h0 == 1) {
            if (!isEnabled()) {
                this.n0 = this.X0;
            } else if (z3 && !z2) {
                this.n0 = this.Z0;
            } else if (z2) {
                this.n0 = this.Y0;
            } else {
                this.n0 = this.W0;
            }
        }
        b();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.D0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.D0;
        checkableImageButton.setImageDrawable(drawable);
        k(checkableImageButton, this.F0);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.s0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.s0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            k(checkableImageButton, this.t0);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.O0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.E.k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.D0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.D0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
