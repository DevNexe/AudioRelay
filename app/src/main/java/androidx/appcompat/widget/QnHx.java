package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.FJCM;
import androidx.appcompat.view.menu.T23;
import androidx.appcompat.view.menu.auxFixed;
import androidx.appcompat.view.menu.byN;
import com.azefsw.audioconnect.R;
import defpackage.Xd;
import defpackage.alJ;
import defpackage.ek4;
import defpackage.n51;
import defpackage.t85;
import defpackage.uc2;
import defpackage.uo0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class QnHx extends androidx.appcompat.view.menu.QnHx {
    public LPt8Fixed D;
    public Drawable E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final SparseBooleanArray M;
    public NUlFixed N;
    public C0019QnHx O;
    public F1 P;
    public CQf Q;
    public final YKK R;

    public class CQf extends ActionMenuItemView.CQf {
        public CQf() {
        }
    }

    public class F1 implements Runnable {
        public final NUlFixed w;

        public F1(NUlFixed nUl) {
            this.w = nUl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.NUlFixed.QnHx qnHx;
            QnHx qnHx2 = QnHx.this;
            androidx.appcompat.view.menu.NUlFixed nUl = qnHx2.y;
            if (nUl != null && (qnHx = nUl.e) != null) {
                qnHx.b(nUl);
            }
            View view = (View) qnHx2.C;
            if (view != null && view.getWindowToken() != null) {
                NUlFixed nUl2 = this.w;
                boolean z = true;
                if (!nUl2.b()) {
                    if (nUl2.f == null) {
                        z = false;
                    } else {
                        nUl2.d(0, 0, false, false);
                    }
                }
                if (z) {
                    qnHx2.N = nUl2;
                }
            }
            qnHx2.P = null;
        }
    }

    public class LPt8Fixed extends Xd implements ActionMenuView.QnHx {

        /* JADX INFO: renamed from: androidx.appcompat.widget.QnHx$LPt8$QnHx, reason: collision with other inner class name */
        public class C0018QnHx extends n51 {
            public C0018QnHx(View view) {
                super(view);
            }

            @Override // defpackage.n51
            public final ek4 b() {
                NUlFixed nUl = QnHx.this.N;
                if (nUl == null) {
                    return null;
                }
                return nUl.a();
            }

            @Override // defpackage.n51
            public final boolean c() {
                QnHx.this.l();
                return true;
            }

            @Override // defpackage.n51
            public final boolean d() {
                QnHx qnHx = QnHx.this;
                if (qnHx.P != null) {
                    return false;
                }
                qnHx.h();
                return true;
            }
        }

        public LPt8Fixed(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            t85.a(this, getContentDescription());
            setOnTouchListener(new C0018QnHx(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.QnHx
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.QnHx
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            QnHx.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                uo0.CQf.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class NUlFixed extends auxFixed {
        public NUlFixed(Context context, androidx.appcompat.view.menu.NUlFixed nUl, LPt8Fixed lPt8) {
            super(context, nUl, lPt8, true);
            this.g = 8388613;
            YKK ykk = QnHx.this.R;
            this.i = ykk;
            uc2 uc2Var = this.j;
            if (uc2Var != null) {
                uc2Var.d(ykk);
            }
        }

        @Override // androidx.appcompat.view.menu.auxFixed
        public final void c() {
            QnHx qnHx = QnHx.this;
            androidx.appcompat.view.menu.NUlFixed nUl = qnHx.y;
            if (nUl != null) {
                nUl.c(true);
            }
            qnHx.N = null;
            super.c();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.QnHx$QnHx, reason: collision with other inner class name */
    public class C0019QnHx extends auxFixed {
        public C0019QnHx(Context context, FJCM fjcm, View view) {
            super(context, fjcm, view, false);
            if (!((fjcm.y.x & 32) == 32)) {
                View view2 = QnHx.this.D;
                this.f = view2 == null ? (View) QnHx.this.C : view2;
            }
            YKK ykk = QnHx.this.R;
            this.i = ykk;
            uc2 uc2Var = this.j;
            if (uc2Var != null) {
                uc2Var.d(ykk);
            }
        }

        @Override // androidx.appcompat.view.menu.auxFixed
        public final void c() {
            QnHx.this.O = null;
            super.c();
        }
    }

    public class YKK implements T23.QnHx {
        public YKK() {
        }

        @Override // androidx.appcompat.view.menu.T23.QnHx
        public final void a(androidx.appcompat.view.menu.NUlFixed nUl, boolean z) {
            if (nUl instanceof FJCM) {
                nUl.j().c(false);
            }
            T23.QnHx qnHx = QnHx.this.A;
            if (qnHx != null) {
                qnHx.a(nUl, z);
            }
        }

        @Override // androidx.appcompat.view.menu.T23.QnHx
        public final boolean b(androidx.appcompat.view.menu.NUlFixed nUl) {
            QnHx qnHx = QnHx.this;
            if (nUl == qnHx.y) {
                return false;
            }
            ((FJCM) nUl).y.getClass();
            qnHx.getClass();
            T23.QnHx qnHx2 = qnHx.A;
            if (qnHx2 != null) {
                return qnHx2.b(nUl);
            }
            return false;
        }
    }

    public QnHx(Context context) {
        super(context);
        this.M = new SparseBooleanArray();
        this.R = new YKK();
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void a(androidx.appcompat.view.menu.NUlFixed nUl, boolean z) {
        h();
        C0019QnHx c0019QnHx = this.O;
        if (c0019QnHx != null && c0019QnHx.b()) {
            c0019QnHx.j.dismiss();
        }
        T23.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.a(nUl, z);
        }
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean b() {
        ArrayList<androidx.appcompat.view.menu.YKK> arrayListK;
        int size;
        int i;
        boolean z;
        QnHx qnHx = this;
        androidx.appcompat.view.menu.NUlFixed nUl = qnHx.y;
        if (nUl != null) {
            arrayListK = nUl.k();
            size = arrayListK.size();
        } else {
            arrayListK = null;
            size = 0;
        }
        int i2 = qnHx.K;
        int i3 = qnHx.J;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) qnHx.C;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            androidx.appcompat.view.menu.YKK ykk = arrayListK.get(i4);
            int i7 = ykk.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (qnHx.L && ykk.C) {
                i2 = 0;
            }
            i4++;
        }
        if (qnHx.G && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = qnHx.M;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            androidx.appcompat.view.menu.YKK ykk2 = arrayListK.get(i9);
            int i11 = ykk2.y;
            boolean z3 = (i11 & 2) == i;
            int i12 = ykk2.b;
            if (z3) {
                View viewC = qnHx.c(ykk2, null, viewGroup);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                ykk2.f(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = (i8 > 0 || z4) && i3 > 0;
                    if (z5) {
                        View viewC2 = qnHx.c(ykk2, null, viewGroup);
                        viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewC2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            androidx.appcompat.view.menu.YKK ykk3 = arrayListK.get(i13);
                            if (ykk3.b == i12) {
                                if ((ykk3.x & 32) == 32) {
                                    i8++;
                                }
                                ykk3.f(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    ykk2.f(z5);
                } else {
                    ykk2.f(false);
                }
                i9++;
                i = 2;
                qnHx = this;
                z = true;
            }
            i9++;
            i = 2;
            qnHx = this;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View c(androidx.appcompat.view.menu.YKK ykk, View view, ViewGroup viewGroup) {
        byN.QnHx qnHx;
        View actionView = ykk.getActionView();
        if (actionView == null || ykk.e()) {
            if (view instanceof byN.QnHx) {
                qnHx = (byN.QnHx) view;
            } else {
                qnHx = (byN.QnHx) this.z.inflate(this.B, viewGroup, false);
            }
            qnHx.c(ykk);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qnHx;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.C);
            if (this.Q == null) {
                this.Q = new CQf();
            }
            actionMenuItemView.setPopupCallback(this.Q);
            actionView = (View) qnHx;
        }
        actionView.setVisibility(ykk.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void f(Context context, androidx.appcompat.view.menu.NUlFixed nUl) {
        this.x = context;
        LayoutInflater.from(context);
        this.y = nUl;
        Resources resources = context.getResources();
        if (!this.H) {
            this.G = true;
        }
        int i = 2;
        this.I = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.K = i;
        int measuredWidth = this.I;
        if (this.G) {
            if (this.D == null) {
                LPt8Fixed lPt8 = new LPt8Fixed(this.w);
                this.D = lPt8;
                if (this.F) {
                    lPt8.setImageDrawable(this.E);
                    this.E = null;
                    this.F = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.D.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.D.getMeasuredWidth();
        } else {
            this.D = null;
        }
        this.J = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.T23
    public final void g() {
        int i;
        boolean z;
        ViewGroup viewGroup = (ViewGroup) this.C;
        ArrayList<androidx.appcompat.view.menu.YKK> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.NUlFixed nUl = this.y;
            if (nUl != null) {
                nUl.i();
                ArrayList<androidx.appcompat.view.menu.YKK> arrayListK = this.y.k();
                int size = arrayListK.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.appcompat.view.menu.YKK ykk = arrayListK.get(i2);
                    if ((ykk.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        androidx.appcompat.view.menu.YKK itemData = childAt instanceof byN.QnHx ? ((byN.QnHx) childAt).getItemData() : null;
                        View viewC = c(ykk, childAt, viewGroup);
                        if (ykk != itemData) {
                            viewC.setPressed(false);
                            viewC.jumpDrawablesToCurrentState();
                        }
                        if (viewC != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewC.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewC);
                            }
                            ((ViewGroup) this.C).addView(viewC, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.D) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.C).requestLayout();
        androidx.appcompat.view.menu.NUlFixed nUl2 = this.y;
        if (nUl2 != null) {
            nUl2.i();
            ArrayList<androidx.appcompat.view.menu.YKK> arrayList2 = nUl2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                alJ alj = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.NUlFixed nUl3 = this.y;
        if (nUl3 != null) {
            nUl3.i();
            arrayList = nUl3.j;
        }
        if (this.G && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.D == null) {
                this.D = new LPt8Fixed(this.w);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.D.getParent();
            if (viewGroup3 != this.C) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.D);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.C;
                LPt8Fixed lPt8 = this.D;
                actionMenuView.getClass();
                ActionMenuView.F1 f1 = new ActionMenuView.F1();
                ((LinearLayout.LayoutParams) f1).gravity = 16;
                f1.a = true;
                actionMenuView.addView(lPt8, f1);
            }
        } else {
            LPt8Fixed lPt9 = this.D;
            if (lPt9 != null) {
                Object parent = lPt9.getParent();
                Object obj = this.C;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.D);
                }
            }
        }
        ((ActionMenuView) this.C).setOverflowReserved(this.G);
    }

    public final boolean h() {
        Object obj;
        F1 f1 = this.P;
        if (f1 != null && (obj = this.C) != null) {
            ((View) obj).removeCallbacks(f1);
            this.P = null;
            return true;
        }
        NUlFixed nUl = this.N;
        if (nUl == null) {
            return false;
        }
        if (nUl.b()) {
            nUl.j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.T23
    public final boolean i(FJCM fjcm) {
        View childAt;
        boolean z;
        boolean z2 = false;
        if (!fjcm.hasVisibleItems()) {
            return false;
        }
        FJCM fjcm2 = fjcm;
        while (true) {
            androidx.appcompat.view.menu.NUlFixed nUl = fjcm2.x;
            if (nUl == this.y) {
                break;
            }
            fjcm2 = (FJCM) nUl;
        }
        ViewGroup viewGroup = (ViewGroup) this.C;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = 0;
                    break;
                }
                childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof byN.QnHx) && ((byN.QnHx) childAt).getItemData() == fjcm2.y) {
                    break;
                }
                i++;
            }
        } else {
            childAt = 0;
            break;
        }
        if (childAt == 0) {
            return false;
        }
        fjcm.y.getClass();
        int size = fjcm.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = fjcm.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C0019QnHx c0019QnHx = new C0019QnHx(this.x, fjcm, childAt);
        this.O = c0019QnHx;
        c0019QnHx.h = z;
        uc2 uc2Var = c0019QnHx.j;
        if (uc2Var != null) {
            uc2Var.n(z);
        }
        C0019QnHx c0019QnHx2 = this.O;
        if (c0019QnHx2.b()) {
            z2 = true;
        } else if (c0019QnHx2.f != null) {
            c0019QnHx2.d(0, 0, false, false);
            z2 = true;
        }
        if (!z2) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        T23.QnHx qnHx = this.A;
        if (qnHx != null) {
            qnHx.b(fjcm);
        }
        return true;
    }

    public final boolean k() {
        NUlFixed nUl = this.N;
        return nUl != null && nUl.b();
    }

    public final boolean l() {
        androidx.appcompat.view.menu.NUlFixed nUl;
        if (!this.G || k() || (nUl = this.y) == null || this.C == null || this.P != null) {
            return false;
        }
        nUl.i();
        if (nUl.j.isEmpty()) {
            return false;
        }
        F1 f1 = new F1(new NUlFixed(this.x, this.y, this.D));
        this.P = f1;
        ((View) this.C).post(f1);
        return true;
    }
}
