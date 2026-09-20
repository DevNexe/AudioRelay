package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.LPt6Fixed;
import androidx.fragment.app.QnHx;
import androidx.fragment.app.RBi;
import androidx.fragment.app.y;
import com.azefsw.audioconnect.R;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v51 extends FrameLayout {
    public ArrayList<View> w;
    public ArrayList<View> x;
    public View.OnApplyWindowInsetsListener y;
    public boolean z;

    public v51(Context context, AttributeSet attributeSet, RBi rBi) {
        View view;
        super(context, attributeSet);
        this.z = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ko6.z);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentC = rBi.C(id);
        if (classAttribute != null && fragmentC == null) {
            if (id <= 0) {
                throw new IllegalStateException(fc2.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            y yVarE = rBi.E();
            context.getClassLoader();
            Fragment fragmentA = yVarE.a(classAttribute);
            fragmentA.Y = true;
            x51<?> x51Var = fragmentA.O;
            if ((x51Var == null ? null : x51Var.w) != null) {
                fragmentA.Y = true;
            }
            QnHx qnHx = new QnHx(rBi);
            qnHx.o = true;
            fragmentA.Z = this;
            qnHx.e(getId(), fragmentA, string, 1);
            if (qnHx.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            qnHx.p.y(qnHx, true);
        }
        for (LPt6Fixed lPt6 : rBi.c.e()) {
            Fragment fragment = lPt6.c;
            if (fragment.S == getId() && (view = fragment.a0) != null && view.getParent() == null) {
                fragment.Z = this;
                lPt6.b();
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.x;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        jm5 jm5VarG;
        jm5 jm5VarG2 = jm5.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.y;
        if (onApplyWindowInsetsListener != null) {
            jm5VarG = jm5.g(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null);
        } else {
            Field field = bi5.a;
            WindowInsets windowInsetsF = jm5VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = bi5.T23.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    jm5VarG2 = jm5.g(windowInsetsB, this);
                }
            }
            jm5VarG = jm5VarG2;
        }
        if (!jm5VarG.a.j()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Field field2 = bi5.a;
                WindowInsets windowInsetsF2 = jm5VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = bi5.T23.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        jm5.g(windowInsetsA, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.z && this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                super.drawChild(canvas, this.w.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.z || (arrayList = this.w) == null || arrayList.size() <= 0 || !this.w.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.x;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.w;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.z = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.z = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.y = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.x == null) {
                this.x = new ArrayList<>();
            }
            this.x.add(view);
        }
        super.startViewTransition(view);
    }
}
