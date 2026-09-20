package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.YKK;
import com.azefsw.audioconnect.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class byN extends ViewGroup {
    public h81<sd5> A;
    public boolean B;
    public boolean C;
    public WeakReference<l40> w;
    public IBinder x;
    public k40 y;
    public l40 z;

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                byN.this.a(g30Var2, 8);
            }
            return sd5.a;
        }
    }

    public /* synthetic */ byN(Context context) {
        this(context, null, 0);
    }

    public static boolean g(l40 l40Var) {
        return !(l40Var instanceof uk3) || ((uk3.F1) ((uk3) l40Var).o.getValue()).compareTo(uk3.F1.ShuttingDown) > 0;
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(l40 l40Var) {
        if (this.z != l40Var) {
            this.z = l40Var;
            if (l40Var != null) {
                this.w = null;
            }
            k40 k40Var = this.y;
            if (k40Var != null) {
                k40Var.a();
                this.y = null;
                if (isAttachedToWindow()) {
                    d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.x != iBinder) {
            this.x = iBinder;
            this.w = null;
        }
    }

    public abstract void a(g30 g30Var, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.C) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (!(this.z != null || isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        d();
    }

    public final void d() {
        if (this.y == null) {
            try {
                this.C = true;
                this.y = YKK.a(this, h(), X.n(-656146368, new QnHx(), true));
            } finally {
                this.C = false;
            }
        }
    }

    public void e(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.y != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.B;
    }

    public final l40 h() {
        l40 l40Var;
        l40 l40VarB = this.z;
        if (l40VarB == null) {
            l40VarB = wm5.b(this);
            if (l40VarB == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (l40VarB != null || !(parent instanceof View)) {
                        l40VarB = l40VarB;
                        break;
                    }
                    l40VarB = l40VarB;
                    l40 l40VarB2 = wm5.b((View) parent);
                    parent = parent.getParent();
                    l40VarB = l40VarB2;
                }
            }
            if (l40VarB != null) {
                l40 l40Var2 = g(l40VarB) ? l40VarB : null;
                if (l40Var2 != null) {
                    this.w = new WeakReference<>(l40Var2);
                }
            } else {
                l40VarB = null;
            }
            if (l40VarB == null) {
                WeakReference<l40> weakReference = this.w;
                if (weakReference == null || (l40Var = weakReference.get()) == null || !g(l40Var)) {
                    l40VarB = l40Var;
                    l40VarB = null;
                }
                if (l40VarB == null) {
                    if (!isAttachedToWindow()) {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    l40 l40VarB3 = wm5.b(view);
                    if (l40VarB3 == null) {
                        uk3 uk3VarA = sm5.a.get().a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, uk3VarA);
                        ha1 ha1Var = ha1.w;
                        Handler handler = view.getHandler();
                        int i = pb1.a;
                        view.addOnAttachStateChangeListener(new qm5(fp1.k0(ha1Var, new nb1(handler, "windowRecomposer cleanup", false).B, 0, new rm5(uk3VarA, view, null), 2)));
                        l40VarB = uk3VarA;
                    } else {
                        if (!(l40VarB3 instanceof uk3)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
                        }
                        l40VarB = (uk3) l40VarB3;
                    }
                    l40 l40Var3 = g(l40VarB) ? l40VarB : null;
                    if (l40Var3 != null) {
                        this.w = new WeakReference<>(l40Var3);
                    }
                }
            }
        }
        return l40VarB;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        d();
        f(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(l40 l40Var) {
        setParentContext(l40Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.B = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ww2) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(si5 si5Var) {
        h81<sd5> h81Var = this.A;
        if (h81Var != null) {
            h81Var.invoke();
        }
        this.A = si5Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public byN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        androidx.compose.ui.platform.QnHx qnHx = new androidx.compose.ui.platform.QnHx(this);
        addOnAttachStateChangeListener(qnHx);
        XTd3 xTd3 = new XTd3();
        o70.e(this).a.add(xTd3);
        this.A = new ri5(this, qnHx, xTd3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }
}
