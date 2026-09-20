package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.T23;
import androidx.appcompat.view.menu.YKK;
import androidx.appcompat.view.menu.byN;
import defpackage.yc2;
import defpackage.yj5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.CQf implements androidx.appcompat.view.menu.NUlFixed.CQf, byN {
    public androidx.appcompat.view.menu.NUlFixed L;
    public Context M;
    public int N;
    public androidx.appcompat.widget.QnHx O;
    public T23.QnHx P;
    public androidx.appcompat.view.menu.NUlFixed.QnHx Q;
    public boolean R;
    public int S;
    public final int T;
    public final int U;
    public NUlFixed V;

    public static class CQf implements T23.QnHx {
        @Override // androidx.appcompat.view.menu.T23.QnHx
        public final void a(androidx.appcompat.view.menu.NUlFixed nUl, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.T23.QnHx
        public final boolean b(androidx.appcompat.view.menu.NUlFixed nUl) {
            return false;
        }
    }

    public static class F1 extends androidx.appcompat.widget.CQf.QnHx {

        @ViewDebug.ExportedProperty
        public boolean a;

        @ViewDebug.ExportedProperty
        public int b;

        @ViewDebug.ExportedProperty
        public int c;

        @ViewDebug.ExportedProperty
        public boolean d;

        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public F1(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public F1(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public F1(F1 f1) {
            super(f1);
            this.a = f1.a;
        }

        public F1() {
            super(-2, -2);
            this.a = false;
        }
    }

    public class LPt8Fixed implements androidx.appcompat.view.menu.NUlFixed.QnHx {
        public LPt8Fixed() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // androidx.appcompat.view.menu.NUlFixed.QnHx
        public final boolean a(androidx.appcompat.view.menu.NUlFixed nUl, MenuItem menuItem) {
            boolean z;
            NUlFixed nUl2 = ActionMenuView.this.V;
            if (nUl2 == null) {
                return false;
            }
            Iterator<yc2> it = Toolbar.this.f0.a.iterator();
            while (it.hasNext()) {
                if (it.next().d()) {
                    z = true;
                    if (z) {
                        return true;
                    }
                    return false;
                }
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.NUlFixed.QnHx
        public final void b(androidx.appcompat.view.menu.NUlFixed nUl) {
            androidx.appcompat.view.menu.NUlFixed.QnHx qnHx = ActionMenuView.this.Q;
            if (qnHx != null) {
                qnHx.b(nUl);
            }
        }
    }

    public interface NUlFixed {
    }

    public interface QnHx {
        boolean a();

        boolean b();
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.T = (int) (56.0f * f);
        this.U = (int) (f * 4.0f);
        this.M = context;
        this.N = 0;
    }

    public static F1 i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            F1 f1 = new F1();
            ((LinearLayout.LayoutParams) f1).gravity = 16;
            return f1;
        }
        F1 f2 = layoutParams instanceof F1 ? new F1((F1) layoutParams) : new F1(layoutParams);
        if (((LinearLayout.LayoutParams) f2).gravity <= 0) {
            ((LinearLayout.LayoutParams) f2).gravity = 16;
        }
        return f2;
    }

    @Override // androidx.appcompat.view.menu.NUlFixed.CQf
    public final boolean a(YKK ykk) {
        return this.L.p(ykk, null, 0);
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof F1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.CQf
    /* JADX INFO: renamed from: e */
    public final androidx.appcompat.widget.CQf.QnHx generateDefaultLayoutParams() {
        F1 f1 = new F1();
        ((LinearLayout.LayoutParams) f1).gravity = 16;
        return f1;
    }

    @Override // androidx.appcompat.widget.CQf
    /* JADX INFO: renamed from: f */
    public final androidx.appcompat.widget.CQf.QnHx generateLayoutParams(AttributeSet attributeSet) {
        return new F1(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.CQf
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ androidx.appcompat.widget.CQf.QnHx generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        F1 f1 = new F1();
        ((LinearLayout.LayoutParams) f1).gravity = 16;
        return f1;
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.L == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.NUlFixed nUl = new androidx.appcompat.view.menu.NUlFixed(context);
            this.L = nUl;
            nUl.e = new LPt8Fixed();
            androidx.appcompat.widget.QnHx qnHx = new androidx.appcompat.widget.QnHx(context);
            this.O = qnHx;
            qnHx.G = true;
            qnHx.H = true;
            T23.QnHx cQf = this.P;
            if (cQf == null) {
                cQf = new CQf();
            }
            qnHx.A = cQf;
            this.L.b(qnHx, this.M);
            androidx.appcompat.widget.QnHx qnHx2 = this.O;
            qnHx2.C = this;
            this.L = qnHx2.y;
        }
        return this.L;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.QnHx qnHx = this.O;
        androidx.appcompat.widget.QnHx.LPt8Fixed lPt8 = qnHx.D;
        if (lPt8 != null) {
            return lPt8.getDrawable();
        }
        if (qnHx.F) {
            return qnHx.E;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.N;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof QnHx)) {
            zA = false | ((QnHx) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof QnHx)) ? zA : zA | ((QnHx) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.QnHx qnHx = this.O;
        if (qnHx != null) {
            qnHx.g();
            if (this.O.k()) {
                this.O.h();
                this.O.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.QnHx qnHx = this.O;
        if (qnHx != null) {
            qnHx.h();
            androidx.appcompat.widget.QnHx.C0019QnHx c0019QnHx = qnHx.O;
            if (c0019QnHx == null || !c0019QnHx.b()) {
                return;
            }
            c0019QnHx.j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.R) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zA = yj5.a(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                F1 f1 = (F1) childAt.getLayoutParams();
                if (f1.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) f1).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) f1).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) f1).leftMargin) + ((LinearLayout.LayoutParams) f1).rightMargin;
                    j(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                F1 f2 = (F1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !f2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) f2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) f2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            F1 f3 = (F1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !f3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) f3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) f3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // androidx.appcompat.widget.CQf, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        ?? r4;
        int i6;
        androidx.appcompat.view.menu.NUlFixed nUl;
        boolean z3 = this.R;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.R = z4;
        if (z3 != z4) {
            this.S = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.R && (nUl = this.L) != null && size != this.S) {
            this.S = size;
            nUl.o(true);
        }
        int childCount = getChildCount();
        if (!this.R || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                F1 f1 = (F1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) f1).rightMargin = 0;
                ((LinearLayout.LayoutParams) f1).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.T;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z5 = false;
        long j = 0;
        int i15 = 0;
        while (true) {
            i3 = this.U;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = i8;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i13 + 1;
                if (z6) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                F1 f2 = (F1) childAt.getLayoutParams();
                f2.f = false;
                f2.c = 0;
                f2.b = 0;
                f2.d = false;
                ((LinearLayout.LayoutParams) f2).leftMargin = 0;
                ((LinearLayout.LayoutParams) f2).rightMargin = 0;
                f2.e = z6 && ((ActionMenuItemView) childAt).d();
                int i19 = f2.a ? 1 : i10;
                F1 f3 = (F1) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = actionMenuItemView != null && actionMenuItemView.d();
                if (i19 <= 0 || (z7 && i19 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i19 * i12, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i12;
                    if (measuredWidth % i12 != 0) {
                        i6++;
                    }
                    if (z7 && i6 < 2) {
                        i6 = 2;
                    }
                }
                f3.d = !f3.a && z7;
                f3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12 * i6, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (f2.d) {
                    i15++;
                }
                if (f2.a) {
                    z5 = true;
                }
                i10 -= i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
                i13 = i18;
            }
            i14++;
            size3 = i16;
            i8 = i17;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i20 = mode;
        int i21 = i8;
        int i22 = size3;
        boolean z8 = z5 && i13 == 2;
        boolean z9 = false;
        while (true) {
            if (i15 <= 0 || i10 <= 0) {
                z = z9;
                break;
            }
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i25 < childCount2) {
                F1 f4 = (F1) getChildAt(i25).getLayoutParams();
                boolean z10 = z9;
                if (f4.d) {
                    int i26 = f4.b;
                    if (i26 < i23) {
                        j2 = 1 << i25;
                        i23 = i26;
                        i24 = 1;
                    } else if (i26 == i23) {
                        j2 |= 1 << i25;
                        i24++;
                    }
                }
                i25++;
                z9 = z10;
            }
            z = z9;
            j |= j2;
            if (i24 > i10) {
                break;
            }
            int i27 = i23 + 1;
            int i28 = 0;
            while (i28 < childCount2) {
                View childAt2 = getChildAt(i28);
                F1 f5 = (F1) childAt2.getLayoutParams();
                int i29 = iMax;
                int i30 = childMeasureSpec;
                int i31 = childCount2;
                long j3 = 1 << i28;
                if ((j2 & j3) != 0) {
                    if (z8 && f5.e) {
                        r4 = 1;
                        r4 = 1;
                        if (i10 == 1) {
                            childAt2.setPadding(i3 + i12, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    f5.b += r4;
                    f5.f = r4;
                    i10--;
                } else if (f5.b == i27) {
                    j |= j3;
                }
                i28++;
                childMeasureSpec = i30;
                iMax = i29;
                childCount2 = i31;
            }
            z9 = true;
        }
        int i32 = iMax;
        int i33 = childMeasureSpec;
        int i34 = childCount2;
        boolean z11 = !z5 && i13 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i13 - 1 && !z11 && iMax2 <= 1)) {
            i4 = i34;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((F1) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i35 = i34 - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((F1) getChildAt(i35).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i36 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : 0;
            boolean z12 = z;
            i4 = i34;
            for (int i37 = 0; i37 < i4; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    F1 f6 = (F1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        f6.c = i36;
                        f6.f = true;
                        if (i37 == 0 && !f6.e) {
                            ((LinearLayout.LayoutParams) f6).leftMargin = (-i36) / 2;
                        }
                    } else if (f6.a) {
                        f6.c = i36;
                        f6.f = true;
                        ((LinearLayout.LayoutParams) f6).rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) f6).leftMargin = i36 / 2;
                        }
                        if (i37 != i4 - 1) {
                            ((LinearLayout.LayoutParams) f6).rightMargin = i36 / 2;
                        }
                    }
                    z12 = true;
                }
            }
            z2 = z12;
        }
        if (z2) {
            int i38 = 0;
            while (i38 < i4) {
                View childAt4 = getChildAt(i38);
                F1 f7 = (F1) childAt4.getLayoutParams();
                if (f7.f) {
                    i5 = i33;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((f7.b * i12) + f7.c, 1073741824), i5);
                } else {
                    i5 = i33;
                }
                i38++;
                i33 = i5;
            }
        }
        setMeasuredDimension(i21, i20 != 1073741824 ? i32 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.O.L = z;
    }

    public void setOnMenuItemClickListener(NUlFixed nUl) {
        this.V = nUl;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.QnHx qnHx = this.O;
        androidx.appcompat.widget.QnHx.LPt8Fixed lPt8 = qnHx.D;
        if (lPt8 != null) {
            lPt8.setImageDrawable(drawable);
        } else {
            qnHx.F = true;
            qnHx.E = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
    }

    public void setPopupTheme(int i) {
        if (this.N != i) {
            this.N = i;
            if (i == 0) {
                this.M = getContext();
            } else {
                this.M = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.QnHx qnHx) {
        this.O = qnHx;
        qnHx.C = this;
        this.L = qnHx.y;
    }

    @Override // androidx.appcompat.widget.CQf, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new F1(getContext(), attributeSet);
    }
}
