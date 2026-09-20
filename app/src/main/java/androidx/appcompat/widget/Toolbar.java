package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.view.menu.FJCM;
import androidx.appcompat.view.menu.T23;
import com.azefsw.audioconnect.R;
import defpackage.ApLL;
import defpackage.XTd3;
import defpackage.Xd;
import defpackage.Ye0;
import defpackage.ax4;
import defpackage.bi5;
import defpackage.g14c;
import defpackage.g85;
import defpackage.pc2;
import defpackage.t85;
import defpackage.u92;
import defpackage.xApe;
import defpackage.yc2;
import defpackage.yf0;
import defpackage.yj5;
import defpackage.yt;
import defpackage.yu3;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public Xd A;
    public final Drawable B;
    public final CharSequence C;
    public ApLL D;
    public View E;
    public Context F;
    public int G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public yu3 P;
    public int Q;
    public int R;
    public final int S;
    public CharSequence T;
    public CharSequence U;
    public ColorStateList V;
    public ColorStateList W;
    public boolean a0;
    public boolean b0;
    public final ArrayList<View> c0;
    public final ArrayList<View> d0;
    public final int[] e0;
    public final pc2 f0;
    public ArrayList<MenuItem> g0;
    public final QnHx h0;
    public androidx.appcompat.widget.LPt8Fixed i0;
    public LPt8Fixed j0;
    public boolean k0;
    public final CQf l0;
    public ActionMenuView w;
    public g14c x;
    public g14c y;
    public ApLL z;

    public class CQf implements Runnable {
        public CQf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.QnHx qnHx;
            ActionMenuView actionMenuView = Toolbar.this.w;
            if (actionMenuView == null || (qnHx = actionMenuView.O) == null) {
                return;
            }
            qnHx.l();
        }
    }

    public class F1 implements View.OnClickListener {
        public F1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LPt8Fixed lPt8 = Toolbar.this.j0;
            androidx.appcompat.view.menu.YKK ykk = lPt8 == null ? null : lPt8.x;
            if (ykk != null) {
                ykk.collapseActionView();
            }
        }
    }

    public class LPt8Fixed implements T23 {
        public androidx.appcompat.view.menu.NUlFixed w;
        public androidx.appcompat.view.menu.YKK x;

        public LPt8Fixed() {
        }

        @Override // androidx.appcompat.view.menu.T23
        public final void a(androidx.appcompat.view.menu.NUlFixed nUl, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.T23
        public final boolean b() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.T23
        public final boolean e(androidx.appcompat.view.menu.YKK ykk) {
            Toolbar toolbar = Toolbar.this;
            KeyEvent.Callback callback = toolbar.E;
            if (callback instanceof yt) {
                ((yt) callback).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.E);
            toolbar.removeView(toolbar.D);
            toolbar.E = null;
            ArrayList<View> arrayList = toolbar.d0;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    arrayList.clear();
                    this.x = null;
                    toolbar.requestLayout();
                    ykk.C = false;
                    ykk.n.o(false);
                    return true;
                }
                toolbar.addView(arrayList.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.T23
        public final void f(Context context, androidx.appcompat.view.menu.NUlFixed nUl) {
            androidx.appcompat.view.menu.YKK ykk;
            androidx.appcompat.view.menu.NUlFixed nUl2 = this.w;
            if (nUl2 != null && (ykk = this.x) != null) {
                nUl2.d(ykk);
            }
            this.w = nUl;
        }

        @Override // androidx.appcompat.view.menu.T23
        public final void g() {
            if (this.x != null) {
                androidx.appcompat.view.menu.NUlFixed nUl = this.w;
                boolean z = false;
                if (nUl != null) {
                    int size = nUl.size();
                    for (int i = 0; i < size; i++) {
                        if (this.w.getItem(i) == this.x) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    return;
                }
                e(this.x);
            }
        }

        @Override // androidx.appcompat.view.menu.T23
        public final boolean i(FJCM fjcm) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.T23
        public final boolean j(androidx.appcompat.view.menu.YKK ykk) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.D.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.D);
                }
                toolbar.addView(toolbar.D);
            }
            View actionView = ykk.getActionView();
            toolbar.E = actionView;
            this.x = ykk;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.E);
                }
                NUlFixed nUl = new NUlFixed();
                nUl.a = (toolbar.J & 112) | 8388611;
                nUl.b = 2;
                toolbar.E.setLayoutParams(nUl);
                toolbar.addView(toolbar.E);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((NUlFixed) childAt.getLayoutParams()).b != 2 && childAt != toolbar.w) {
                    toolbar.removeViewAt(childCount);
                    toolbar.d0.add(childAt);
                }
            }
            toolbar.requestLayout();
            ykk.C = true;
            ykk.n.o(false);
            KeyEvent.Callback callback = toolbar.E;
            if (callback instanceof yt) {
                ((yt) callback).onActionViewExpanded();
            }
            return true;
        }
    }

    public class QnHx implements ActionMenuView.NUlFixed {
        public QnHx() {
        }
    }

    public interface YKK {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static NUlFixed g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof NUlFixed) {
            return new NUlFixed((NUlFixed) layoutParams);
        }
        if (layoutParams instanceof Ye0.QnHx) {
            return new NUlFixed((Ye0.QnHx) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new NUlFixed((ViewGroup.MarginLayoutParams) layoutParams) : new NUlFixed(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ax4(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return u92.b(marginLayoutParams) + u92.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        Field field = bi5.a;
        boolean z = bi5.NUlFixed.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, bi5.NUlFixed.d(this));
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                NUlFixed nUl = (NUlFixed) childAt.getLayoutParams();
                if (nUl.b == 0 && r(childAt)) {
                    int i3 = nUl.a;
                    Field field2 = bi5.a;
                    int iD = bi5.NUlFixed.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, iD) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iD == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            NUlFixed nUl2 = (NUlFixed) childAt2.getLayoutParams();
            if (nUl2.b == 0 && r(childAt2)) {
                int i5 = nUl2.a;
                Field field3 = bi5.a;
                int iD2 = bi5.NUlFixed.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, iD2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iD2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        NUlFixed nUlG;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            nUlG = new NUlFixed();
        } else {
            nUlG = !checkLayoutParams(layoutParams) ? g(layoutParams) : (NUlFixed) layoutParams;
        }
        nUlG.b = 1;
        if (!z || this.E == null) {
            addView(view, nUlG);
        } else {
            view.setLayoutParams(nUlG);
            this.d0.add(view);
        }
    }

    public final void c() {
        if (this.D == null) {
            ApLL apLL = new ApLL(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.D = apLL;
            apLL.setImageDrawable(this.B);
            this.D.setContentDescription(this.C);
            NUlFixed nUl = new NUlFixed();
            nUl.a = (this.J & 112) | 8388611;
            nUl.b = 2;
            this.D.setLayoutParams(nUl);
            this.D.setOnClickListener(new F1());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof NUlFixed);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.w;
        if (actionMenuView.L == null) {
            androidx.appcompat.view.menu.NUlFixed nUl = (androidx.appcompat.view.menu.NUlFixed) actionMenuView.getMenu();
            if (this.j0 == null) {
                this.j0 = new LPt8Fixed();
            }
            this.w.setExpandedActionViewsExclusive(true);
            nUl.b(this.j0, this.F);
        }
    }

    public final void e() {
        if (this.w == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.w = actionMenuView;
            actionMenuView.setPopupTheme(this.G);
            this.w.setOnMenuItemClickListener(this.h0);
            ActionMenuView actionMenuView2 = this.w;
            actionMenuView2.P = null;
            actionMenuView2.Q = null;
            NUlFixed nUl = new NUlFixed();
            nUl.a = (this.J & 112) | 8388613;
            this.w.setLayoutParams(nUl);
            b(this.w, false);
        }
    }

    public final void f() {
        if (this.z == null) {
            this.z = new ApLL(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            NUlFixed nUl = new NUlFixed();
            nUl.a = (this.J & 112) | 8388611;
            this.z.setLayoutParams(nUl);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new NUlFixed();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ApLL apLL = this.D;
        if (apLL != null) {
            return apLL.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ApLL apLL = this.D;
        if (apLL != null) {
            return apLL.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        yu3 yu3Var = this.P;
        if (yu3Var != null) {
            return yu3Var.g ? yu3Var.a : yu3Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.R;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        yu3 yu3Var = this.P;
        if (yu3Var != null) {
            return yu3Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        yu3 yu3Var = this.P;
        if (yu3Var != null) {
            return yu3Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        yu3 yu3Var = this.P;
        if (yu3Var != null) {
            return yu3Var.g ? yu3Var.b : yu3Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.Q;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.NUlFixed nUl;
        ActionMenuView actionMenuView = this.w;
        return actionMenuView != null && (nUl = actionMenuView.L) != null && nUl.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.R, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        Field field = bi5.a;
        return bi5.NUlFixed.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = bi5.a;
        return bi5.NUlFixed.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.Q, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        Xd xd = this.A;
        if (xd != null) {
            return xd.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        Xd xd = this.A;
        if (xd != null) {
            return xd.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.w.getMenu();
    }

    public View getNavButtonView() {
        return this.z;
    }

    public CharSequence getNavigationContentDescription() {
        ApLL apLL = this.z;
        if (apLL != null) {
            return apLL.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ApLL apLL = this.z;
        if (apLL != null) {
            return apLL.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.QnHx getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.w.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.F;
    }

    public int getPopupTheme() {
        return this.G;
    }

    public CharSequence getSubtitle() {
        return this.U;
    }

    public final TextView getSubtitleTextView() {
        return this.y;
    }

    public CharSequence getTitle() {
        return this.T;
    }

    public int getTitleMarginBottom() {
        return this.O;
    }

    public int getTitleMarginEnd() {
        return this.M;
    }

    public int getTitleMarginStart() {
        return this.L;
    }

    public int getTitleMarginTop() {
        return this.N;
    }

    public final TextView getTitleTextView() {
        return this.x;
    }

    public yf0 getWrapper() {
        if (this.i0 == null) {
            this.i0 = new androidx.appcompat.widget.LPt8Fixed(this);
        }
        return this.i0;
    }

    public final int h(View view, int i) {
        NUlFixed nUl = (NUlFixed) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = nUl.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.S & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) nUl).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) nUl).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) nUl).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void k(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.g0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        pc2 pc2Var = this.f0;
        Iterator<yc2> it2 = pc2Var.a.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.g0 = currentMenuItems2;
        Iterator<yc2> it3 = pc2Var.a.iterator();
        while (it3.hasNext()) {
            it3.next().b();
        }
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.d0.contains(view);
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        NUlFixed nUl = (NUlFixed) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) nUl).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iH = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iH, iMax + measuredWidth, view.getMeasuredHeight() + iH);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) nUl).rightMargin + iMax;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        NUlFixed nUl = (NUlFixed) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) nUl).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iH = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iH, iMax, view.getMeasuredHeight() + iH);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) nUl).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.l0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.b0 = false;
        }
        if (!this.b0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.b0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.b0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:103:0x0292 A[LOOP:0: B:102:0x0290->B:103:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02ae A[LOOP:1: B:105:0x02ac->B:106:0x02ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02cd A[LOOP:2: B:108:0x02cb->B:109:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0310  */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:118:0x031b A[LOOP:3: B:117:0x0319->B:118:0x031b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x021f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        g14c g14cVar;
        g14c g14cVar2;
        NUlFixed nUl;
        NUlFixed nUl2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList<View> arrayList;
        int size;
        int iN2;
        int i17;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        Field field = bi5.a;
        boolean z3 = bi5.NUlFixed.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.e0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = bi5.LPt8Fixed.d(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i4 - i2) : 0;
        if (r(this.z)) {
            if (z3) {
                iO = o(this.z, i26, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(this.z, paddingLeft, iMin2, iArr);
            }
            if (r(this.D)) {
                if (z3) {
                    iO = o(this.D, iO, iMin2, iArr);
                } else {
                    iN = n(this.D, iN, iMin2, iArr);
                }
            }
            if (r(this.w)) {
                if (z3) {
                    iN = n(this.w, iN, iMin2, iArr);
                } else {
                    iO = o(this.w, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i26 - currentContentInsetRight);
            if (r(this.E)) {
                if (z3) {
                    iMin = o(this.E, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.E, iMax, iMin2, iArr);
                }
            }
            if (r(this.A)) {
                if (z3) {
                    iMin = o(this.A, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.A, iMax, iMin2, iArr);
                }
            }
            zR = r(this.x);
            zR2 = r(this.y);
            if (zR) {
                NUlFixed nUl3 = (NUlFixed) this.x.getLayoutParams();
                measuredHeight = this.x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl3).topMargin + ((ViewGroup.MarginLayoutParams) nUl3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                NUlFixed nUl4 = (NUlFixed) this.y.getLayoutParams();
                measuredHeight += this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl4).topMargin + ((ViewGroup.MarginLayoutParams) nUl4).bottomMargin;
            }
            if (!zR || zR2) {
                if (zR) {
                    g14cVar = this.x;
                } else {
                    g14cVar = this.y;
                }
                if (zR2) {
                    g14cVar2 = this.y;
                } else {
                    g14cVar2 = this.x;
                }
                nUl = (NUlFixed) g14cVar.getLayoutParams();
                nUl2 = (NUlFixed) g14cVar2.getLayoutParams();
                z2 = (!zR && this.x.getMeasuredWidth() > 0) || (zR2 && this.y.getMeasuredWidth() > 0);
                i5 = this.S & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
                    if (iMax2 < i13) {
                        iMax2 = i13;
                    } else {
                        i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i15 = ((ViewGroup.MarginLayoutParams) nUl).bottomMargin;
                        i16 = this.O;
                        if (i14 < i15 + i16) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) nUl2).bottomMargin + i16) - i14));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) nUl2).bottomMargin) - this.O) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.L;
                    } else {
                        i10 = 0;
                    }
                    int i27 = i10 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zR) {
                        NUlFixed nUl5 = (NUlFixed) this.x.getLayoutParams();
                        int measuredWidth2 = iMin - this.x.getMeasuredWidth();
                        int measuredHeight2 = this.x.getMeasuredHeight() + paddingTop;
                        this.x.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.M;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) nUl5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zR2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                        this.y.layout(iMin - this.y.getMeasuredWidth(), i28, iMin, this.y.getMeasuredHeight() + i28);
                        i12 = iMin - this.M;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                } else {
                    if (z2) {
                        i7 = this.L;
                    } else {
                        i7 = 0;
                    }
                    int i29 = i7 - iArr[0];
                    iMax += Math.max(0, i29);
                    iArr[0] = Math.max(0, -i29);
                    if (zR) {
                        NUlFixed nUl6 = (NUlFixed) this.x.getLayoutParams();
                        int measuredWidth3 = this.x.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.x.getMeasuredHeight() + paddingTop;
                        this.x.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.M;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) nUl6).bottomMargin;
                    } else {
                        i8 = iMax;
                    }
                    if (zR2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.y.getMeasuredWidth() + iMax;
                        this.y.layout(iMax, i30, measuredWidth4, this.y.getMeasuredHeight() + i30);
                        i9 = measuredWidth4 + this.M;
                    } else {
                        i9 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    }
                }
            } else {
                i6 = paddingLeft;
                iMin2 = iMin2;
            }
            arrayList = this.c0;
            a(arrayList, 3);
            size = arrayList.size();
            iN2 = iMax;
            for (i17 = 0; i17 < size; i17++) {
                iN2 = n(arrayList.get(i17), iN2, iMin2, iArr);
            }
            i18 = iMin2;
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = o(arrayList.get(i19), iMin, i18, iArr);
            }
            a(arrayList, 1);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = arrayList.get(i22);
                NUlFixed nUl7 = (NUlFixed) view.getLayoutParams();
                int i32 = ((ViewGroup.MarginLayoutParams) nUl7).leftMargin - i21;
                int i33 = ((ViewGroup.MarginLayoutParams) nUl7).rightMargin - i20;
                int iMax3 = Math.max(0, i32);
                int iMax4 = Math.max(0, i33);
                int iMax5 = Math.max(0, -i32);
                int iMax6 = Math.max(0, -i33);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i20 = iMax6;
                i21 = iMax5;
            }
            i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iN2) {
                if (i25 > iMin) {
                    iN2 = i24 - (i25 - iMin);
                } else {
                    iN2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iN2 = n(arrayList.get(i23), iN2, i18, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i26;
        if (r(this.D)) {
            if (z3) {
                iO = o(this.D, iO, iMin2, iArr);
            } else {
                iN = n(this.D, iN, iMin2, iArr);
            }
        }
        if (r(this.w)) {
            if (z3) {
                iN = n(this.w, iN, iMin2, iArr);
            } else {
                iO = o(this.w, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i26 - currentContentInsetRight2);
        if (r(this.E)) {
            if (z3) {
                iMin = o(this.E, iMin, iMin2, iArr);
            } else {
                iMax = n(this.E, iMax, iMin2, iArr);
            }
        }
        if (r(this.A)) {
            if (z3) {
                iMin = o(this.A, iMin, iMin2, iArr);
            } else {
                iMax = n(this.A, iMax, iMin2, iArr);
            }
        }
        zR = r(this.x);
        zR2 = r(this.y);
        if (zR) {
            NUlFixed nUl8 = (NUlFixed) this.x.getLayoutParams();
            measuredHeight = this.x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl8).topMargin + ((ViewGroup.MarginLayoutParams) nUl8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            NUlFixed nUl9 = (NUlFixed) this.y.getLayoutParams();
            measuredHeight += this.y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) nUl9).topMargin + ((ViewGroup.MarginLayoutParams) nUl9).bottomMargin;
        }
        if (zR) {
            if (zR) {
                g14cVar = this.x;
            } else {
                g14cVar = this.y;
            }
            if (zR2) {
                g14cVar2 = this.y;
            } else {
                g14cVar2 = this.x;
            }
            nUl = (NUlFixed) g14cVar.getLayoutParams();
            nUl2 = (NUlFixed) g14cVar2.getLayoutParams();
            if (zR) {
            }
            i5 = this.S & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) nUl).bottomMargin;
                    i16 = this.O;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) nUl2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) nUl2).bottomMargin) - this.O) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.L;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zR) {
                    NUlFixed nUl10 = (NUlFixed) this.x.getLayoutParams();
                    int measuredWidth5 = iMin - this.x.getMeasuredWidth();
                    int measuredHeight4 = this.x.getMeasuredHeight() + paddingTop;
                    this.x.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.M;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) nUl10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zR2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                    this.y.layout(iMin - this.y.getMeasuredWidth(), i211, iMin, this.y.getMeasuredHeight() + i211);
                    i12 = iMin - this.M;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.L;
                } else {
                    i7 = 0;
                }
                int i212 = i7 - iArr[0];
                iMax += Math.max(0, i212);
                iArr[0] = Math.max(0, -i212);
                if (zR) {
                    NUlFixed nUl11 = (NUlFixed) this.x.getLayoutParams();
                    int measuredWidth6 = this.x.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.x.getMeasuredHeight() + paddingTop;
                    this.x.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.M;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) nUl11).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zR2) {
                    int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.y.getMeasuredWidth() + iMax;
                    this.y.layout(iMax, i34, measuredWidth7, this.y.getMeasuredHeight() + i34);
                    i9 = measuredWidth7 + this.M;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        } else {
            if (zR) {
                g14cVar = this.x;
            } else {
                g14cVar = this.y;
            }
            if (zR2) {
                g14cVar2 = this.y;
            } else {
                g14cVar2 = this.x;
            }
            nUl = (NUlFixed) g14cVar.getLayoutParams();
            nUl2 = (NUlFixed) g14cVar2.getLayoutParams();
            if (zR) {
            }
            i5 = this.S & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) nUl).topMargin + this.N;
                if (iMax2 < i13) {
                    iMax2 = i13;
                } else {
                    i14 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i15 = ((ViewGroup.MarginLayoutParams) nUl).bottomMargin;
                    i16 = this.O;
                    if (i14 < i15 + i16) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) nUl2).bottomMargin + i16) - i14));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) nUl2).bottomMargin) - this.O) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.L;
                } else {
                    i10 = 0;
                }
                int i213 = i10 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zR) {
                    NUlFixed nUl12 = (NUlFixed) this.x.getLayoutParams();
                    int measuredWidth8 = iMin - this.x.getMeasuredWidth();
                    int measuredHeight6 = this.x.getMeasuredHeight() + paddingTop;
                    this.x.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.M;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) nUl12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zR2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                    this.y.layout(iMin - this.y.getMeasuredWidth(), i214, iMin, this.y.getMeasuredHeight() + i214);
                    i12 = iMin - this.M;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
            } else {
                if (z2) {
                    i7 = this.L;
                } else {
                    i7 = 0;
                }
                int i215 = i7 - iArr[0];
                iMax += Math.max(0, i215);
                iArr[0] = Math.max(0, -i215);
                if (zR) {
                    NUlFixed nUl13 = (NUlFixed) this.x.getLayoutParams();
                    int measuredWidth9 = this.x.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.x.getMeasuredHeight() + paddingTop;
                    this.x.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.M;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) nUl13).bottomMargin;
                } else {
                    i8 = iMax;
                }
                if (zR2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((NUlFixed) this.y.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.y.getMeasuredWidth() + iMax;
                    this.y.layout(iMax, i35, measuredWidth10, this.y.getMeasuredHeight() + i35);
                    i9 = measuredWidth10 + this.M;
                } else {
                    i9 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                }
            }
        }
        arrayList = this.c0;
        a(arrayList, 3);
        size = arrayList.size();
        iN2 = iMax;
        while (i17 < size) {
            iN2 = n(arrayList.get(i17), iN2, iMin2, iArr);
        }
        i18 = iMin2;
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = o(arrayList.get(i19), iMin, i18, iArr);
        }
        a(arrayList, 1);
        int i36 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i36;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = arrayList.get(i22);
            NUlFixed nUl14 = (NUlFixed) view2.getLayoutParams();
            int i37 = ((ViewGroup.MarginLayoutParams) nUl14).leftMargin - i21;
            int i38 = ((ViewGroup.MarginLayoutParams) nUl14).rightMargin - i20;
            int iMax7 = Math.max(0, i37);
            int iMax8 = Math.max(0, i38);
            int iMax9 = Math.max(0, -i37);
            int iMax10 = Math.max(0, -i38);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i20 = iMax10;
            i21 = iMax9;
        }
        i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iN2) {
            if (i25 > iMin) {
                iN2 = i24 - (i25 - iMin);
            } else {
                iN2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iN2 = n(arrayList.get(i23), iN2, i18, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int iCombineMeasuredStates;
        int i4;
        int iCombineMeasuredStates2;
        int iMax2;
        int iJ;
        boolean z;
        boolean zA = yj5.a(this);
        int i5 = !zA ? 1 : 0;
        if (r(this.z)) {
            q(this.z, i, 0, i2, this.K);
            i3 = i(this.z) + this.z.getMeasuredWidth();
            iMax = Math.max(0, j(this.z) + this.z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.z.getMeasuredState());
        } else {
            i3 = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.D)) {
            q(this.D, i, 0, i2, this.K);
            i3 = i(this.D) + this.D.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.D) + this.D.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.D.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, i3) + 0;
        int iMax4 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.e0;
        iArr[zA ? 1 : 0] = iMax4;
        if (r(this.w)) {
            q(this.w, i, iMax3, i2, this.K);
            i4 = i(this.w) + this.w.getMeasuredWidth();
            iMax = Math.max(iMax, j(this.w) + this.w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.w.getMeasuredState());
        } else {
            i4 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, i4);
        iArr[i5] = Math.max(0, currentContentInsetEnd - i4);
        if (r(this.E)) {
            iMax5 += p(this.E, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, j(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        }
        if (r(this.A)) {
            iMax5 += p(this.A, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, j(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (((NUlFixed) childAt.getLayoutParams()).b == 0 && r(childAt)) {
                iMax5 += p(childAt, i, iMax5, i2, 0, iArr);
                iMax = Math.max(iMax, j(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i7 = this.N + this.O;
        int i8 = this.L + this.M;
        if (r(this.x)) {
            p(this.x, i, iMax5 + i8, i2, i7, iArr);
            int i9 = i(this.x) + this.x.getMeasuredWidth();
            iJ = j(this.x) + this.x.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.x.getMeasuredState());
            iMax2 = i9;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iJ = 0;
        }
        if (r(this.y)) {
            iMax2 = Math.max(iMax2, p(this.y, i, iMax5 + i8, i2, iJ + i7, iArr));
            iJ += j(this.y) + this.y.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.y.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iJ);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.k0) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount2) {
                z = true;
                break;
            }
            View childAt2 = getChildAt(i10);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
            i10++;
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof auxFixed)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        auxFixed auxVar = (auxFixed) parcelable;
        super.onRestoreInstanceState(auxVar.w);
        ActionMenuView actionMenuView = this.w;
        androidx.appcompat.view.menu.NUlFixed nUl = actionMenuView != null ? actionMenuView.L : null;
        int i = auxVar.y;
        if (i != 0 && this.j0 != null && nUl != null && (menuItemFindItem = nUl.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (auxVar.z) {
            CQf cQf = this.l0;
            removeCallbacks(cQf);
            post(cQf);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.P == null) {
            this.P = new yu3();
        }
        yu3 yu3Var = this.P;
        boolean z = i == 1;
        if (z == yu3Var.g) {
            return;
        }
        yu3Var.g = z;
        if (!yu3Var.h) {
            yu3Var.a = yu3Var.e;
            yu3Var.b = yu3Var.f;
            return;
        }
        if (z) {
            int i2 = yu3Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = yu3Var.e;
            }
            yu3Var.a = i2;
            int i3 = yu3Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = yu3Var.f;
            }
            yu3Var.b = i3;
            return;
        }
        int i4 = yu3Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = yu3Var.e;
        }
        yu3Var.a = i4;
        int i5 = yu3Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = yu3Var.f;
        }
        yu3Var.b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.YKK ykk;
        auxFixed auxVar = new auxFixed(super.onSaveInstanceState());
        LPt8Fixed lPt8 = this.j0;
        if (lPt8 != null && (ykk = lPt8.x) != null) {
            auxVar.y = ykk.a;
        }
        ActionMenuView actionMenuView = this.w;
        boolean z = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.QnHx qnHx = actionMenuView.O;
            if (qnHx != null && qnHx.k()) {
                z = true;
            }
        }
        auxVar.z = z;
        return auxVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.a0 = false;
        }
        if (!this.a0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.a0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.a0 = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(XTd3.l(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.k0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.R) {
            this.R = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.Q) {
            this.Q = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(XTd3.l(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(XTd3.l(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.z.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(YKK ykk) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.w.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.G != i) {
            this.G = i;
            if (i == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.O = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.M = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.L = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.N = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public static class NUlFixed extends Ye0.QnHx {
        public int b;

        public NUlFixed(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public NUlFixed() {
            this.b = 0;
            this.a = 8388627;
        }

        public NUlFixed(NUlFixed nUl) {
            super((Ye0.QnHx) nUl);
            this.b = 0;
            this.b = nUl.b;
        }

        public NUlFixed(Ye0.QnHx qnHx) {
            super(qnHx);
            this.b = 0;
        }

        public NUlFixed(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public NUlFixed(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.S = 8388627;
        this.c0 = new ArrayList<>();
        this.d0 = new ArrayList<>();
        this.e0 = new int[2];
        this.f0 = new pc2();
        this.g0 = new ArrayList<>();
        this.h0 = new QnHx();
        this.l0 = new CQf();
        Context context2 = getContext();
        int[] iArr = xApe.R;
        g85 g85VarL = g85.l(context2, attributeSet, iArr, R.attr.toolbarStyle);
        bi5.l(this, context, iArr, attributeSet, g85VarL.b, R.attr.toolbarStyle);
        this.H = g85VarL.h(28, 0);
        this.I = g85VarL.h(19, 0);
        TypedArray typedArray = g85VarL.b;
        this.S = typedArray.getInteger(0, 8388627);
        this.J = typedArray.getInteger(2, 48);
        int iC = g85VarL.c(22, 0);
        iC = g85VarL.k(27) ? g85VarL.c(27, iC) : iC;
        this.O = iC;
        this.N = iC;
        this.M = iC;
        this.L = iC;
        int iC2 = g85VarL.c(25, -1);
        if (iC2 >= 0) {
            this.L = iC2;
        }
        int iC3 = g85VarL.c(24, -1);
        if (iC3 >= 0) {
            this.M = iC3;
        }
        int iC4 = g85VarL.c(26, -1);
        if (iC4 >= 0) {
            this.N = iC4;
        }
        int iC5 = g85VarL.c(23, -1);
        if (iC5 >= 0) {
            this.O = iC5;
        }
        this.K = g85VarL.d(13, -1);
        int iC6 = g85VarL.c(9, Integer.MIN_VALUE);
        int iC7 = g85VarL.c(5, Integer.MIN_VALUE);
        int iD = g85VarL.d(7, 0);
        int iD2 = g85VarL.d(8, 0);
        if (this.P == null) {
            this.P = new yu3();
        }
        yu3 yu3Var = this.P;
        yu3Var.h = false;
        if (iD != Integer.MIN_VALUE) {
            yu3Var.e = iD;
            yu3Var.a = iD;
        }
        if (iD2 != Integer.MIN_VALUE) {
            yu3Var.f = iD2;
            yu3Var.b = iD2;
        }
        if (iC6 != Integer.MIN_VALUE || iC7 != Integer.MIN_VALUE) {
            yu3Var.a(iC6, iC7);
        }
        this.Q = g85VarL.c(10, Integer.MIN_VALUE);
        this.R = g85VarL.c(6, Integer.MIN_VALUE);
        this.B = g85VarL.e(4);
        this.C = g85VarL.j(3);
        CharSequence charSequenceJ = g85VarL.j(21);
        if (!TextUtils.isEmpty(charSequenceJ)) {
            setTitle(charSequenceJ);
        }
        CharSequence charSequenceJ2 = g85VarL.j(18);
        if (!TextUtils.isEmpty(charSequenceJ2)) {
            setSubtitle(charSequenceJ2);
        }
        this.F = getContext();
        setPopupTheme(g85VarL.h(17, 0));
        Drawable drawableE = g85VarL.e(16);
        if (drawableE != null) {
            setNavigationIcon(drawableE);
        }
        CharSequence charSequenceJ3 = g85VarL.j(15);
        if (!TextUtils.isEmpty(charSequenceJ3)) {
            setNavigationContentDescription(charSequenceJ3);
        }
        Drawable drawableE2 = g85VarL.e(11);
        if (drawableE2 != null) {
            setLogo(drawableE2);
        }
        CharSequence charSequenceJ4 = g85VarL.j(12);
        if (!TextUtils.isEmpty(charSequenceJ4)) {
            setLogoDescription(charSequenceJ4);
        }
        if (g85VarL.k(29)) {
            setTitleTextColor(g85VarL.b(29));
        }
        if (g85VarL.k(20)) {
            setSubtitleTextColor(g85VarL.b(20));
        }
        if (g85VarL.k(14)) {
            k(g85VarL.h(14, 0));
        }
        g85VarL.m();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new NUlFixed(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ApLL apLL = this.D;
        if (apLL != null) {
            apLL.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.D.setImageDrawable(drawable);
        } else {
            ApLL apLL = this.D;
            if (apLL != null) {
                apLL.setImageDrawable(this.B);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.A == null) {
                this.A = new Xd(getContext());
            }
            if (!m(this.A)) {
                b(this.A, true);
            }
        } else {
            Xd xd = this.A;
            if (xd != null && m(xd)) {
                removeView(this.A);
                this.d0.remove(this.A);
            }
        }
        Xd xd2 = this.A;
        if (xd2 != null) {
            xd2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A == null) {
            this.A = new Xd(getContext());
        }
        Xd xd = this.A;
        if (xd != null) {
            xd.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        ApLL apLL = this.z;
        if (apLL != null) {
            apLL.setContentDescription(charSequence);
            t85.a(this.z, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.z)) {
                b(this.z, true);
            }
        } else {
            ApLL apLL = this.z;
            if (apLL != null && m(apLL)) {
                removeView(this.z);
                this.d0.remove(this.z);
            }
        }
        ApLL apLL2 = this.z;
        if (apLL2 != null) {
            apLL2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            g14c g14cVar = this.y;
            if (g14cVar != null && m(g14cVar)) {
                removeView(this.y);
                this.d0.remove(this.y);
            }
        } else {
            if (this.y == null) {
                Context context = getContext();
                g14c g14cVar2 = new g14c(context, null);
                this.y = g14cVar2;
                g14cVar2.setSingleLine();
                this.y.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.I;
                if (i != 0) {
                    this.y.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.W;
                if (colorStateList != null) {
                    this.y.setTextColor(colorStateList);
                }
            }
            if (!m(this.y)) {
                b(this.y, true);
            }
        }
        g14c g14cVar3 = this.y;
        if (g14cVar3 != null) {
            g14cVar3.setText(charSequence);
        }
        this.U = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.W = colorStateList;
        g14c g14cVar = this.y;
        if (g14cVar != null) {
            g14cVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            g14c g14cVar = this.x;
            if (g14cVar != null && m(g14cVar)) {
                removeView(this.x);
                this.d0.remove(this.x);
            }
        } else {
            if (this.x == null) {
                Context context = getContext();
                g14c g14cVar2 = new g14c(context, null);
                this.x = g14cVar2;
                g14cVar2.setSingleLine();
                this.x.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.H;
                if (i != 0) {
                    this.x.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.V;
                if (colorStateList != null) {
                    this.x.setTextColor(colorStateList);
                }
            }
            if (!m(this.x)) {
                b(this.x, true);
            }
        }
        g14c g14cVar3 = this.x;
        if (g14cVar3 != null) {
            g14cVar3.setText(charSequence);
        }
        this.T = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.V = colorStateList;
        g14c g14cVar = this.x;
        if (g14cVar != null) {
            g14cVar.setTextColor(colorStateList);
        }
    }

    public static class auxFixed extends defpackage.CQf {
        public static final Parcelable.Creator<auxFixed> CREATOR = new QnHx();
        public int y;
        public boolean z;

        public class QnHx implements Parcelable.ClassLoaderCreator<auxFixed> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final auxFixed createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new auxFixed(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new auxFixed[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new auxFixed(parcel, null);
            }
        }

        public auxFixed(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.y = parcel.readInt();
            this.z = parcel.readInt() != 0;
        }

        @Override // defpackage.CQf, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.w, i);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z ? 1 : 0);
        }

        public auxFixed(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
