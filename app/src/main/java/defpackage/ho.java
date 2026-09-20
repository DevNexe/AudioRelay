package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ho extends u95 {
    public static final String[] T = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final CQf U;
    public static final F1 V;
    public static final LPt8Fixed W;
    public static final NUlFixed X;
    public static final YKK Y;

    public class CQf extends Property<byN, PointF> {
        public CQf() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(byN byn) {
            return null;
        }

        @Override // android.util.Property
        public final void set(byN byn, PointF pointF) {
            byN byn2 = byn;
            PointF pointF2 = pointF;
            byn2.getClass();
            byn2.a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            byn2.b = iRound;
            int i = byn2.f + 1;
            byn2.f = i;
            if (i == byn2.g) {
                wj5.a(byn2.e, byn2.a, iRound, byn2.c, byn2.d);
                byn2.f = 0;
                byn2.g = 0;
            }
        }
    }

    public class F1 extends Property<byN, PointF> {
        public F1() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(byN byn) {
            return null;
        }

        @Override // android.util.Property
        public final void set(byN byn, PointF pointF) {
            byN byn2 = byn;
            PointF pointF2 = pointF;
            byn2.getClass();
            byn2.c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            byn2.d = iRound;
            int i = byn2.g + 1;
            byn2.g = i;
            if (byn2.f == i) {
                wj5.a(byn2.e, byn2.a, byn2.b, byn2.c, iRound);
                byn2.f = 0;
                byn2.g = 0;
            }
        }
    }

    public class LPt8Fixed extends Property<View, PointF> {
        public LPt8Fixed() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            wj5.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class NUlFixed extends Property<View, PointF> {
        public NUlFixed() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            wj5.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    public class QnHx extends Property<Drawable, PointF> {
        public final Rect a;

        public QnHx() {
            super(PointF.class, "boundsOrigin");
            this.a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    public class T23 extends ga5 {
        public boolean w = false;
        public final /* synthetic */ ViewGroup x;

        public T23(ViewGroup viewGroup) {
            this.x = viewGroup;
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            if (!this.w) {
                bj5.a(this.x, false);
            }
            u95Var.E(this);
        }

        @Override // defpackage.ga5, u95.LPt8Fixed
        public final void b() {
            bj5.a(this.x, false);
        }

        @Override // defpackage.ga5, u95.LPt8Fixed
        public final void d() {
            bj5.a(this.x, false);
            this.w = true;
        }

        @Override // defpackage.ga5, u95.LPt8Fixed
        public final void e() {
            bj5.a(this.x, true);
        }
    }

    public class YKK extends Property<View, PointF> {
        public YKK() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            wj5.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    public class auxFixed extends AnimatorListenerAdapter {
        private byN mViewBounds;

        public auxFixed(byN byn) {
            this.mViewBounds = byn;
        }
    }

    public static class byN {
        public int a;
        public int b;
        public int c;
        public int d;
        public final View e;
        public int f;
        public int g;

        public byN(View view) {
            this.e = view;
        }
    }

    static {
        new QnHx();
        U = new CQf();
        V = new F1();
        W = new LPt8Fixed();
        X = new NUlFixed();
        Y = new YKK();
    }

    public final void Q(la5 la5Var) {
        Field field = bi5.a;
        View view = la5Var.b;
        if (!bi5.auxFixed.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = la5Var.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.u95
    public final void h(la5 la5Var) {
        Q(la5Var);
    }

    @Override // defpackage.u95
    public final void k(la5 la5Var) {
        Q(la5Var);
    }

    @Override // defpackage.u95
    public final Animator p(ViewGroup viewGroup, la5 la5Var, la5 la5Var2) {
        int i;
        ho hoVar;
        Animator animatorOfObject;
        if (la5Var == null || la5Var2 == null) {
            return null;
        }
        HashMap map = la5Var.a;
        HashMap map2 = la5Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        View view = la5Var2.b;
        wj5.a(view, i2, i4, i6, i8);
        if (i14 != 2) {
            hoVar = this;
            animatorOfObject = (i2 == i3 && i4 == i5) ? ObjectAnimator.ofObject(view, W, (TypeConverter) null, hoVar.P.A0(i6, i8, i7, i9)) : ObjectAnimator.ofObject(view, X, (TypeConverter) null, hoVar.P.A0(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            hoVar = this;
            animatorOfObject = ObjectAnimator.ofObject(view, Y, (TypeConverter) null, hoVar.P.A0(i2, i4, i3, i5));
        } else {
            hoVar = this;
            byN byn = new byN(view);
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(byn, U, (TypeConverter) null, hoVar.P.A0(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(byn, V, (TypeConverter) null, hoVar.P.A0(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new auxFixed(byn));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            bj5.a(viewGroup4, true);
            hoVar.a(new T23(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // defpackage.u95
    public final String[] w() {
        return T;
    }
}
