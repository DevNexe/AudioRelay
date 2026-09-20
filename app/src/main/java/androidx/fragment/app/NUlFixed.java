package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FJCM.QnHx c;

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NUlFixed nUl = NUlFixed.this;
            nUl.a.endViewTransition(nUl.b);
            nUl.c.a();
        }
    }

    public NUlFixed(View view, ViewGroup viewGroup, FJCM.QnHx qnHx) {
        this.a = viewGroup;
        this.b = view;
        this.c = qnHx;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.post(new QnHx());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
