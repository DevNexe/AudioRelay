package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View w;
    public ViewTreeObserver x;
    public final Runnable y;

    public cv2(ViewGroup viewGroup, Runnable runnable) {
        this.w = viewGroup;
        this.x = viewGroup.getViewTreeObserver();
        this.y = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        cv2 cv2Var = new cv2(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(cv2Var);
        viewGroup.addOnAttachStateChangeListener(cv2Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.x.isAlive();
        View view = this.w;
        if (zIsAlive) {
            this.x.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.y.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.x = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.x.isAlive();
        View view2 = this.w;
        if (zIsAlive) {
            this.x.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
