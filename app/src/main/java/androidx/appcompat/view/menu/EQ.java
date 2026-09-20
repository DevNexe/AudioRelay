package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.uc2;
import defpackage.vr$z;
import defpackage.xc2;
import defpackage.zp0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class EQ extends uc2 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final xc2 E;
    public PopupWindow.OnDismissListener H;
    public View I;
    public View J;
    public T23.QnHx K;
    public ViewTreeObserver L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean Q;
    public final Context x;
    public final NUlFixed y;
    public final LPt8Fixed z;
    public final QnHx F = new QnHx();
    public final CQf G = new CQf();
    public int P = 0;

    public class CQf implements View.OnAttachStateChangeListener {
        public CQf() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            EQ eq = EQ.this;
            ViewTreeObserver viewTreeObserver = eq.L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    eq.L = view.getViewTreeObserver();
                }
                eq.L.removeGlobalOnLayoutListener(eq.F);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class QnHx implements ViewTreeObserver.OnGlobalLayoutListener {
        public QnHx() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            EQ eq = EQ.this;
            if (!eq.c() || eq.E.T) {
                return;
            }
            View view = eq.J;
            if (view == null || !view.isShown()) {
                eq.dismiss();
            } else {
                eq.E.show();
            }
        }
    }

    public EQ(int i, int i2, Context context, View view, NUlFixed nUl, boolean z) {
        this.x = context;
        this.y = nUl;
        this.A = z;
        this.z = new LPt8Fixed(nUl, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.C = i;
        this.D = i2;
        Resources resources = context.getResources();
        this.B = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.I = view;
        this.E = new xc2(context, i, i2);
        nUl.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void a(NUlFixed nUl, boolean z) {
        if (nUl != this.y) {
            return;
        }
        dismiss();
        T23.QnHx qnHx = this.K;
        if (qnHx != null) {
            qnHx.a(nUl, z);
        }
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ek4
    public final boolean c() {
        return !this.M && this.E.c();
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void d(T23.QnHx qnHx) {
        this.K = qnHx;
    }

    @Override // defpackage.ek4
    public final void dismiss() {
        if (c()) {
            this.E.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.T23
    public final void g() {
        this.N = false;
        LPt8Fixed lPt8 = this.z;
        if (lPt8 != null) {
            lPt8.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ek4
    public final zp0 h() {
        return this.E.y;
    }

    @Override // androidx.appcompat.view.menu.T23
    public final boolean i(FJCM fjcm) {
        boolean z;
        if (fjcm.hasVisibleItems()) {
            auxFixed auxVar = new auxFixed(this.C, this.D, this.x, this.J, fjcm, this.A);
            T23.QnHx qnHx = this.K;
            auxVar.i = qnHx;
            uc2 uc2Var = auxVar.j;
            if (uc2Var != null) {
                uc2Var.d(qnHx);
            }
            boolean zT = uc2.t(fjcm);
            auxVar.h = zT;
            uc2 uc2Var2 = auxVar.j;
            if (uc2Var2 != null) {
                uc2Var2.n(zT);
            }
            auxVar.k = this.H;
            this.H = null;
            this.y.c(false);
            xc2 xc2Var = this.E;
            int width = xc2Var.B;
            int iE = xc2Var.e();
            int i = this.P;
            View view = this.I;
            Field field = bi5.a;
            if ((Gravity.getAbsoluteGravity(i, bi5.NUlFixed.d(view)) & 7) == 5) {
                width += this.I.getWidth();
            }
            if (auxVar.b()) {
                z = true;
            } else if (auxVar.f == null) {
                z = false;
            } else {
                auxVar.d(width, iE, true, true);
                z = true;
            }
            if (z) {
                T23.QnHx qnHx2 = this.K;
                if (qnHx2 != null) {
                    qnHx2.b(fjcm);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uc2
    public final void k(NUlFixed nUl) {
    }

    @Override // defpackage.uc2
    public final void m(View view) {
        this.I = view;
    }

    @Override // defpackage.uc2
    public final void n(boolean z) {
        this.z.y = z;
    }

    @Override // defpackage.uc2
    public final void o(int i) {
        this.P = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.M = true;
        this.y.c(true);
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.L = this.J.getViewTreeObserver();
            }
            this.L.removeGlobalOnLayoutListener(this.F);
            this.L = null;
        }
        this.J.removeOnAttachStateChangeListener(this.G);
        PopupWindow.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.uc2
    public final void p(int i) {
        this.E.B = i;
    }

    @Override // defpackage.uc2
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.H = onDismissListener;
    }

    @Override // defpackage.uc2
    public final void r(boolean z) {
        this.Q = z;
    }

    @Override // defpackage.uc2
    public final void s(int i) {
        this.E.i(i);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ek4
    public final void show() {
        View view;
        boolean z = true;
        if (!c()) {
            if (this.M || (view = this.I) == null) {
                z = false;
            } else {
                this.J = view;
                xc2 xc2Var = this.E;
                xc2Var.U.setOnDismissListener(this);
                xc2Var.L = this;
                xc2Var.T = true;
                vr$z vr_z = xc2Var.U;
                vr_z.setFocusable(true);
                View view2 = this.J;
                boolean z2 = this.L == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.L = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.F);
                }
                view2.addOnAttachStateChangeListener(this.G);
                xc2Var.K = view2;
                xc2Var.H = this.P;
                boolean z3 = this.N;
                Context context = this.x;
                LPt8Fixed lPt8 = this.z;
                if (!z3) {
                    this.O = uc2.l(lPt8, context, this.B);
                    this.N = true;
                }
                xc2Var.g(this.O);
                vr_z.setInputMethodMode(2);
                Rect rect = this.w;
                xc2Var.S = rect != null ? new Rect(rect) : null;
                xc2Var.show();
                zp0 zp0Var = xc2Var.y;
                zp0Var.setOnKeyListener(this);
                if (this.Q) {
                    NUlFixed nUl = this.y;
                    if (nUl.m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) zp0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(nUl.m);
                        }
                        frameLayout.setEnabled(false);
                        zp0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                xc2Var.f(lPt8);
                xc2Var.show();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
