package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import defpackage.ek4;
import defpackage.g14c;
import defpackage.n51;
import defpackage.t85;
import defpackage.xApe;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends g14c implements byN.QnHx, View.OnClickListener, ActionMenuView.QnHx {
    public YKK C;
    public CharSequence D;
    public Drawable E;
    public NUlFixed.CQf F;
    public QnHx G;
    public CQf H;
    public boolean I;
    public boolean J;
    public final int K;
    public int L;
    public final int M;

    public static abstract class CQf {
    }

    public class QnHx extends n51 {
        public QnHx() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.n51
        public final ek4 b() {
            androidx.appcompat.widget.QnHx.C0019QnHx c0019QnHx;
            CQf cQf = ActionMenuItemView.this.H;
            if (cQf == null || (c0019QnHx = androidx.appcompat.widget.QnHx.this.O) == null) {
                return null;
            }
            return c0019QnHx.a();
        }

        @Override // defpackage.n51
        public final boolean c() {
            ek4 ek4VarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            NUlFixed.CQf cQf = actionMenuItemView.F;
            return cQf != null && cQf.a(actionMenuItemView.C) && (ek4VarB = b()) != null && ek4VarB.c();
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.I = e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xApe.z, 0, 0);
        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.M = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.L = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.QnHx
    public final boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.QnHx
    public final boolean b() {
        return d() && this.C.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.byN.QnHx
    public final void c(YKK ykk) {
        this.C = ykk;
        setIcon(ykk.getIcon());
        setTitle(ykk.getTitleCondensed());
        setId(ykk.a);
        setVisibility(ykk.isVisible() ? 0 : 8);
        setEnabled(ykk.isEnabled());
        if (ykk.hasSubMenu() && this.G == null) {
            this.G = new QnHx();
        }
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.D);
        if (this.E != null) {
            if (!((this.C.y & 4) == 4) || (!this.I && !this.J)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.D : null);
        CharSequence charSequence = this.C.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.C.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.C.r;
        if (TextUtils.isEmpty(charSequence2)) {
            t85.a(this, z3 ? null : this.C.e);
        } else {
            t85.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.byN.QnHx
    public YKK getItemData() {
        return this.C;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NUlFixed.CQf cQf = this.F;
        if (cQf != null) {
            cQf.a(this.C);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.I = e();
        f();
    }

    @Override // defpackage.g14c, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zD = d();
        if (zD && (i3 = this.L) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.K;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zD || this.E == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.E.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        QnHx qnHx;
        if (this.C.hasSubMenu() && (qnHx = this.G) != null && qnHx.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.J != z) {
            this.J = z;
            YKK ykk = this.C;
            if (ykk != null) {
                NUlFixed nUl = ykk.n;
                nUl.k = true;
                nUl.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.M;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(NUlFixed.CQf cQf) {
        this.F = cQf;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.L = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(CQf cQf) {
        this.H = cQf;
    }

    public void setTitle(CharSequence charSequence) {
        this.D = charSequence;
        f();
    }
}
