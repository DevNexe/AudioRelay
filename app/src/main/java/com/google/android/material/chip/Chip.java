package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.ads.AdError;
import defpackage.B8C;
import defpackage.C0239D;
import defpackage.Th;
import defpackage.UT;
import defpackage.XTd3;
import defpackage.b65;
import defpackage.bi5;
import defpackage.ea;
import defpackage.eh2;
import defpackage.ej4;
import defpackage.ij4;
import defpackage.ja2;
import defpackage.jj96;
import defpackage.jo5;
import defpackage.m65;
import defpackage.mq;
import defpackage.qa2;
import defpackage.s15;
import defpackage.sv0;
import defpackage.uo0;
import defpackage.ys3;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class Chip extends jj96 implements com.google.android.material.chip.QnHx.InterfaceC0078QnHx, ij4 {
    public static final Rect Q = new Rect();
    public static final int[] R = {R.attr.state_selected};
    public static final int[] S = {R.attr.state_checkable};
    public com.google.android.material.chip.QnHx A;
    public InsetDrawable B;
    public RippleDrawable C;
    public View.OnClickListener D;
    public CompoundButton.OnCheckedChangeListener E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public final CQf M;
    public final Rect N;
    public final RectF O;
    public final QnHx P;

    public class CQf extends sv0 {
        public CQf(Chip chip) {
            super(chip);
        }

        @Override // defpackage.sv0
        public final void l(ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            Rect rect = Chip.Q;
            Chip chip = Chip.this;
            if (chip.e()) {
                com.google.android.material.chip.QnHx qnHx = chip.A;
                if (qnHx != null && qnHx.g0) {
                    z = true;
                }
                if (!z || chip.D == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // defpackage.sv0
        public final boolean o(int i, int i2) {
            boolean z = false;
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.D;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.M.t(1, 1);
                }
            }
            return z;
        }

        @Override // defpackage.sv0
        public final void p(UT ut) {
            Chip chip = Chip.this;
            boolean zF = chip.f();
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            accessibilityNodeInfo.setCheckable(zF);
            accessibilityNodeInfo.setClickable(chip.isClickable());
            if (chip.f() || chip.isClickable()) {
                ut.i(chip.f() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                ut.i("android.view.View");
            }
            CharSequence text = chip.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                ut.o(text);
            } else {
                accessibilityNodeInfo.setContentDescription(text);
            }
        }

        @Override // defpackage.sv0
        public final void q(int i, UT ut) {
            AccessibilityNodeInfo accessibilityNodeInfo = ut.a;
            if (i != 1) {
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(Chip.Q);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfo.setContentDescription(context.getString(com.azefsw.audioconnect.R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            ut.b(UT.QnHx.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }

        @Override // defpackage.sv0
        public final void r(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.I = z;
                chip.refreshDrawableState();
            }
        }

        public final int v(float f, float f2) {
            Rect rect = Chip.Q;
            Chip chip = Chip.this;
            return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }
    }

    public class QnHx extends B8C {
        public QnHx() {
        }

        @Override // defpackage.B8C
        public final void J0(int i) {
        }

        @Override // defpackage.B8C
        public final void K0(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            com.google.android.material.chip.QnHx qnHx = chip.A;
            chip.setText(qnHx.Z0 ? qnHx.a0 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(qa2.a(context, attributeSet, com.azefsw.audioconnect.R.attr.chipStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.azefsw.audioconnect.R.attr.chipStyle);
        this.N = new Rect();
        this.O = new RectF();
        this.P = new QnHx();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.QnHx qnHx = new com.google.android.material.chip.QnHx(context2, attributeSet);
        Context context3 = qnHx.A0;
        int[] iArr = Th.z;
        TypedArray typedArrayD = m65.d(context3, attributeSet, iArr, com.azefsw.audioconnect.R.attr.chipStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        qnHx.b1 = typedArrayD.hasValue(37);
        Context context4 = qnHx.A0;
        ColorStateList colorStateListB = ja2.b(context4, typedArrayD, 24);
        if (qnHx.T != colorStateListB) {
            qnHx.T = colorStateListB;
            qnHx.onStateChange(qnHx.getState());
        }
        ColorStateList colorStateListB2 = ja2.b(context4, typedArrayD, 11);
        if (qnHx.U != colorStateListB2) {
            qnHx.U = colorStateListB2;
            qnHx.onStateChange(qnHx.getState());
        }
        float dimension = typedArrayD.getDimension(19, 0.0f);
        if (qnHx.V != dimension) {
            qnHx.V = dimension;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        if (typedArrayD.hasValue(12)) {
            qnHx.A(typedArrayD.getDimension(12, 0.0f));
        }
        qnHx.F(ja2.b(context4, typedArrayD, 22));
        qnHx.G(typedArrayD.getDimension(23, 0.0f));
        qnHx.P(ja2.b(context4, typedArrayD, 36));
        String text = typedArrayD.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(qnHx.a0, text)) {
            qnHx.a0 = text;
            qnHx.G0.d = true;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        s15 s15Var = (!typedArrayD.hasValue(0) || (resourceId3 = typedArrayD.getResourceId(0, 0)) == 0) ? null : new s15(context4, resourceId3);
        s15Var.k = typedArrayD.getDimension(1, s15Var.k);
        qnHx.Q(s15Var);
        int i = typedArrayD.getInt(3, 0);
        if (i == 1) {
            qnHx.Y0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            qnHx.Y0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            qnHx.Y0 = TextUtils.TruncateAt.END;
        }
        qnHx.E(typedArrayD.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            qnHx.E(typedArrayD.getBoolean(15, false));
        }
        qnHx.B(ja2.c(context4, typedArrayD, 14));
        if (typedArrayD.hasValue(17)) {
            qnHx.D(ja2.b(context4, typedArrayD, 17));
        }
        qnHx.C(typedArrayD.getDimension(16, -1.0f));
        qnHx.M(typedArrayD.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            qnHx.M(typedArrayD.getBoolean(26, false));
        }
        qnHx.H(ja2.c(context4, typedArrayD, 25));
        qnHx.L(ja2.b(context4, typedArrayD, 30));
        qnHx.J(typedArrayD.getDimension(28, 0.0f));
        qnHx.w(typedArrayD.getBoolean(6, false));
        qnHx.z(typedArrayD.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            qnHx.z(typedArrayD.getBoolean(8, false));
        }
        qnHx.x(ja2.c(context4, typedArrayD, 7));
        if (typedArrayD.hasValue(9)) {
            qnHx.y(ja2.b(context4, typedArrayD, 9));
        }
        qnHx.q0 = (!typedArrayD.hasValue(39) || (resourceId2 = typedArrayD.getResourceId(39, 0)) == 0) ? null : eh2.a(context4, resourceId2);
        qnHx.r0 = (!typedArrayD.hasValue(33) || (resourceId = typedArrayD.getResourceId(33, 0)) == 0) ? null : eh2.a(context4, resourceId);
        float dimension2 = typedArrayD.getDimension(21, 0.0f);
        if (qnHx.s0 != dimension2) {
            qnHx.s0 = dimension2;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        qnHx.O(typedArrayD.getDimension(35, 0.0f));
        qnHx.N(typedArrayD.getDimension(34, 0.0f));
        float dimension3 = typedArrayD.getDimension(41, 0.0f);
        if (qnHx.v0 != dimension3) {
            qnHx.v0 = dimension3;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        float dimension4 = typedArrayD.getDimension(40, 0.0f);
        if (qnHx.w0 != dimension4) {
            qnHx.w0 = dimension4;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        qnHx.K(typedArrayD.getDimension(29, 0.0f));
        qnHx.I(typedArrayD.getDimension(27, 0.0f));
        float dimension5 = typedArrayD.getDimension(13, 0.0f);
        if (qnHx.z0 != dimension5) {
            qnHx.z0 = dimension5;
            qnHx.invalidateSelf();
            qnHx.u();
        }
        qnHx.a1 = typedArrayD.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayD.recycle();
        TypedArray typedArrayD2 = m65.d(context2, attributeSet, iArr, com.azefsw.audioconnect.R.attr.chipStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.J = typedArrayD2.getBoolean(32, false);
        this.L = (int) Math.ceil(typedArrayD2.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayD2.recycle();
        setChipDrawable(qnHx);
        qnHx.i(bi5.byN.i(this));
        TypedArray typedArrayD3 = m65.d(context2, attributeSet, iArr, com.azefsw.audioconnect.R.attr.chipStyle, com.azefsw.audioconnect.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(ja2.b(context2, typedArrayD3, 2));
        }
        boolean zHasValue = typedArrayD3.hasValue(37);
        typedArrayD3.recycle();
        this.M = new CQf(this);
        g();
        if (!zHasValue) {
            setOutlineProvider(new mq(this));
        }
        setChecked(this.F);
        setText(qnHx.a0);
        setEllipsize(qnHx.Y0);
        j();
        if (!this.A.Z0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        i();
        if (this.J) {
            setMinHeight(this.L);
        }
        this.K = bi5.NUlFixed.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.O;
        rectF.setEmpty();
        if (e() && this.D != null) {
            com.google.android.material.chip.QnHx qnHx = this.A;
            Rect bounds = qnHx.getBounds();
            rectF.setEmpty();
            if (qnHx.T()) {
                float f = qnHx.z0 + qnHx.y0 + qnHx.k0 + qnHx.x0 + qnHx.w0;
                if (uo0.b(qnHx) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.N;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private s15 getTextAppearance() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.G0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.H != z) {
            this.H = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.G != z) {
            this.G = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.QnHx.InterfaceC0078QnHx
    public final void a() {
        d(this.L);
        requestLayout();
        invalidateOutline();
    }

    public final void d(int i) {
        this.L = i;
        if (!this.J) {
            InsetDrawable insetDrawable = this.B;
            if (insetDrawable == null) {
                int[] iArr = ys3.a;
                h();
                return;
            } else {
                if (insetDrawable != null) {
                    this.B = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = ys3.a;
                    h();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.A.V));
        int iMax2 = Math.max(0, i - this.A.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.B;
            if (insetDrawable2 == null) {
                int[] iArr3 = ys3.a;
                h();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.B = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = ys3.a;
                    h();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.B != null) {
            Rect rect = new Rect();
            this.B.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = ys3.a;
                h();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.B = new InsetDrawable((Drawable) this.A, i2, i3, i2, i3);
        int[] iArr6 = ys3.a;
        h();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int action = motionEvent.getAction();
        CQf cQf = this.M;
        if (action == 10) {
            try {
                Field declaredField = sv0.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(cQf)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = sv0.class.getDeclaredMethod("u", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(cQf, Integer.MIN_VALUE);
                    z = true;
                } else {
                    z = false;
                }
            } catch (IllegalAccessException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (NoSuchFieldException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (NoSuchMethodException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (InvocationTargetException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        } else {
            z = false;
        }
        if (!z) {
            AccessibilityManager accessibilityManager = cQf.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action2 = motionEvent.getAction();
                if (action2 == 7 || action2 == 9) {
                    int iV = cQf.v(motionEvent.getX(), motionEvent.getY());
                    cQf.u(iV);
                    if (iV != Integer.MIN_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (action2 == 10 && cQf.m != Integer.MIN_VALUE) {
                    cQf.u(Integer.MIN_VALUE);
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (!z2 && !super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        CQf cQf = this.M;
        cQf.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && cQf.m(i3, null)) {
                                    i2++;
                                    z = true;
                                }
                                zM = z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = cQf.l;
                                if (i != Integer.MIN_VALUE) {
                                    cQf.o(i, 16);
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = cQf.l;
                    if (i != Integer.MIN_VALUE) {
                        cQf.o(i, 16);
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = cQf.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = cQf.m(1, null);
            }
        }
        if (!zM || cQf.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.jj96, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        com.google.android.material.chip.QnHx qnHx = this.A;
        boolean zV = false;
        if (qnHx != null && com.google.android.material.chip.QnHx.t(qnHx.h0)) {
            com.google.android.material.chip.QnHx qnHx2 = this.A;
            ?? IsEnabled = isEnabled();
            if (this.I) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.H) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.G) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.I) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.H) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.G) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(qnHx2.U0, iArr)) {
                qnHx2.U0 = iArr;
                if (qnHx2.T()) {
                    zV = qnHx2.v(qnHx2.getState(), iArr);
                }
            }
        }
        if (zV) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            Object objA = qnHx.h0;
            if (objA == null) {
                objA = null;
            } else if (objA instanceof jo5) {
                objA = ((jo5) objA).a();
            }
            if (objA != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        return qnHx != null && qnHx.m0;
    }

    public final void g() {
        if (e()) {
            com.google.android.material.chip.QnHx qnHx = this.A;
            if ((qnHx != null && qnHx.g0) && this.D != null) {
                bi5.m(this, this.M);
                return;
            }
        }
        bi5.m(this, null);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.B;
        return insetDrawable == null ? this.A : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.o0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.p0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.U;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return Math.max(0.0f, qnHx.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.A;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.z0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getChipIcon() {
        Object objA;
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || (objA = qnHx.c0) == null) {
            return null;
        }
        if (objA instanceof jo5) {
            objA = ((jo5) objA).a();
        }
        return objA;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.d0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.V;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.s0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.X;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.Y;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    public Drawable getCloseIcon() {
        Object objA;
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || (objA = qnHx.h0) == null) {
            return null;
        }
        if (objA instanceof jo5) {
            objA = ((jo5) objA).a();
        }
        return objA;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.l0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.y0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.k0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.x0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.j0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.Y0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        CQf cQf = this.M;
        if (cQf.l == 1 || cQf.k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public eh2 getHideMotionSpec() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.r0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.u0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.t0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.Z;
        }
        return null;
    }

    public ej4 getShapeAppearanceModel() {
        return this.A.w.a;
    }

    public eh2 getShowMotionSpec() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.q0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.w0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            return qnHx.v0;
        }
        return 0.0f;
    }

    public final void h() {
        this.C = new RippleDrawable(ys3.a(this.A.Z), getBackgroundDrawable(), null);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx.V0) {
            qnHx.V0 = false;
            qnHx.W0 = null;
            qnHx.onStateChange(qnHx.getState());
        }
        RippleDrawable rippleDrawable = this.C;
        Field field = bi5.a;
        bi5.LPt8Fixed.q(this, rippleDrawable);
        i();
    }

    public final void i() {
        com.google.android.material.chip.QnHx qnHx;
        if (TextUtils.isEmpty(getText()) || (qnHx = this.A) == null) {
            return;
        }
        int iQ = (int) (qnHx.q() + qnHx.z0 + qnHx.w0);
        com.google.android.material.chip.QnHx qnHx2 = this.A;
        int iP = (int) (qnHx2.p() + qnHx2.s0 + qnHx2.v0);
        if (this.B != null) {
            Rect rect = new Rect();
            this.B.getPadding(rect);
            iP += rect.left;
            iQ += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = bi5.a;
        bi5.NUlFixed.k(this, iP, paddingTop, iQ, paddingBottom);
    }

    public final void j() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            paint.drawableState = qnHx.getState();
        }
        s15 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.P);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0239D.G(this, this.A);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        if (f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, S);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        CQf cQf = this.M;
        int i2 = cQf.l;
        if (i2 != Integer.MIN_VALUE) {
            cQf.j(i2);
        }
        if (z) {
            cQf.m(i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (f() || isClickable()) {
            accessibilityNodeInfo.setClassName(f() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (!chipGroup.y) {
                i = -1;
                break;
            }
            int i2 = 0;
            i = 0;
            while (true) {
                if (i2 >= chipGroup.getChildCount()) {
                    i = -1;
                    break;
                }
                if (chipGroup.getChildAt(i2) instanceof Chip) {
                    if (((Chip) chipGroup.getChildAt(i2)) == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                i2++;
            }
            Object tag = getTag(com.azefsw.audioconnect.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) UT.F1.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.K != i) {
            this.K = i;
            i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.G) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z = true;
                }
                z = false;
            } else {
                if (this.G) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.D;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.M.t(1, 1);
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z = true;
        } else {
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.jj96, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.C) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.jj96, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.w(z);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.w(qnHx.A0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null) {
            this.F = z;
            return;
        }
        if (qnHx.m0) {
            boolean zIsChecked = isChecked();
            super.setChecked(z);
            if (zIsChecked == z || (onCheckedChangeListener = this.E) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.x(XTd3.l(qnHx.A0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.y(XTd3.k(qnHx.A0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.z(qnHx.A0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.U == colorStateList) {
            return;
        }
        qnHx.U = colorStateList;
        qnHx.onStateChange(qnHx.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListK;
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.U == (colorStateListK = XTd3.k(qnHx.A0, i))) {
            return;
        }
        qnHx.U = colorStateListK;
        qnHx.onStateChange(qnHx.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.A(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.QnHx qnHx) {
        com.google.android.material.chip.QnHx qnHx2 = this.A;
        if (qnHx2 != qnHx) {
            if (qnHx2 != null) {
                qnHx2.X0 = new WeakReference<>(null);
            }
            this.A = qnHx;
            qnHx.Z0 = false;
            qnHx.X0 = new WeakReference<>(this);
            d(this.L);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.z0 == f) {
            return;
        }
        qnHx.z0 = f;
        qnHx.invalidateSelf();
        qnHx.u();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            float dimension = qnHx.A0.getResources().getDimension(i);
            if (qnHx.z0 != dimension) {
                qnHx.z0 = dimension;
                qnHx.invalidateSelf();
                qnHx.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.B(XTd3.l(qnHx.A0, i));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.C(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.D(XTd3.k(qnHx.A0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.E(qnHx.A0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.V == f) {
            return;
        }
        qnHx.V = f;
        qnHx.invalidateSelf();
        qnHx.u();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            float dimension = qnHx.A0.getResources().getDimension(i);
            if (qnHx.V != dimension) {
                qnHx.V = dimension;
                qnHx.invalidateSelf();
                qnHx.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.s0 == f) {
            return;
        }
        qnHx.s0 = f;
        qnHx.invalidateSelf();
        qnHx.u();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            float dimension = qnHx.A0.getResources().getDimension(i);
            if (qnHx.s0 != dimension) {
                qnHx.s0 = dimension;
                qnHx.invalidateSelf();
                qnHx.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.F(XTd3.k(qnHx.A0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.G(qnHx.A0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.H(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.l0 == charSequence) {
            return;
        }
        String str = ea.d;
        Locale locale = Locale.getDefault();
        int i = b65.a;
        ea eaVar = b65.QnHx.a(locale) == 1 ? ea.g : ea.f;
        qnHx.l0 = eaVar.c(charSequence, eaVar.c);
        qnHx.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.I(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.H(XTd3.l(qnHx.A0, i));
        }
        g();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.J(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.K(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.L(XTd3.k(qnHx.A0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.jj96, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // defpackage.jj96, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.Y0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.J = z;
        d(this.L);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(eh2 eh2Var) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.r0 = eh2Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.r0 = eh2.a(qnHx.A0, i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.N(qnHx.A0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.O(qnHx.A0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.A == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.a1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.E = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.P(colorStateList);
        }
        if (this.A.V0) {
            return;
        }
        h();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.P(XTd3.k(qnHx.A0, i));
            if (this.A.V0) {
                return;
            }
            h();
        }
    }

    @Override // defpackage.ij4
    public void setShapeAppearanceModel(ej4 ej4Var) {
        this.A.setShapeAppearanceModel(ej4Var);
    }

    public void setShowMotionSpec(eh2 eh2Var) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.q0 = eh2Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.q0 = eh2.a(qnHx.A0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(qnHx.Z0 ? null : charSequence, bufferType);
        com.google.android.material.chip.QnHx qnHx2 = this.A;
        if (qnHx2 == null || TextUtils.equals(qnHx2.a0, charSequence)) {
            return;
        }
        qnHx2.a0 = charSequence;
        qnHx2.G0.d = true;
        qnHx2.invalidateSelf();
        qnHx2.u();
    }

    public void setTextAppearance(s15 s15Var) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.Q(s15Var);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.w0 == f) {
            return;
        }
        qnHx.w0 = f;
        qnHx.invalidateSelf();
        qnHx.u();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            float dimension = qnHx.A0.getResources().getDimension(i);
            if (qnHx.w0 != dimension) {
                qnHx.w0 = dimension;
                qnHx.invalidateSelf();
                qnHx.u();
            }
        }
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx == null || qnHx.v0 == f) {
            return;
        }
        qnHx.v0 = f;
        qnHx.invalidateSelf();
        qnHx.u();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            float dimension = qnHx.A0.getResources().getDimension(i);
            if (qnHx.v0 != dimension) {
                qnHx.v0 = dimension;
                qnHx.invalidateSelf();
                qnHx.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.M(z);
        }
        g();
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.E(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.Q(new s15(qnHx.A0, i));
        }
        j();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.Q(new s15(qnHx.A0, i));
        }
        j();
    }
}
