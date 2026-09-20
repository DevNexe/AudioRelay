package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import defpackage.C0239D;
import defpackage.X;
import defpackage.cj4;
import defpackage.dj1;
import defpackage.eh2;
import defpackage.ej4;
import defpackage.ez0;
import defpackage.fz0;
import defpackage.gz0;
import defpackage.ns4;
import defpackage.qw0;
import defpackage.ua2;
import defpackage.ur;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LPt8Fixed {
    public ej4 a;
    public boolean b;
    public float d;
    public float e;
    public float f;
    public eh2 g;
    public eh2 h;
    public Animator i;
    public eh2 j;
    public eh2 k;
    public float l;
    public ArrayList<Animator.AnimatorListener> o;
    public ArrayList<Animator.AnimatorListener> p;
    public ArrayList<NUlFixed> q;
    public final FloatingActionButton r;
    public final cj4 s;
    public final Matrix u;
    public fz0 v;
    public static final qw0 w = ur.c;
    public static final int[] x = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] y = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] z = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] A = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] B = {R.attr.state_enabled};
    public static final int[] C = new int[0];
    public boolean c = true;
    public float m = 1.0f;
    public int n = 0;
    public final Rect t = new Rect();

    public class CQf extends T23 {
        public CQf(gz0 gz0Var) {
            super(gz0Var);
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.T23
        public final float a() {
            return 0.0f;
        }
    }

    public class F1 extends T23 {
        public final /* synthetic */ LPt8Fixed y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(gz0 gz0Var) {
            super(gz0Var);
            this.y = gz0Var;
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.T23
        public final float a() {
            LPt8Fixed lPt8 = this.y;
            return lPt8.d + lPt8.e;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.LPt8$LPt8, reason: collision with other inner class name */
    public class C0081LPt8 extends T23 {
        public final /* synthetic */ LPt8Fixed y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0081LPt8(gz0 gz0Var) {
            super(gz0Var);
            this.y = gz0Var;
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.T23
        public final float a() {
            LPt8Fixed lPt8 = this.y;
            return lPt8.d + lPt8.f;
        }
    }

    public interface NUlFixed {
        void a();

        void b();
    }

    public class QnHx extends ua2 {
        public QnHx() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            LPt8Fixed.this.m = f;
            float[] fArr = this.a;
            matrix.getValues(fArr);
            float[] fArr2 = this.b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = ((f2 - f3) * f) + f3;
            }
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    public abstract class T23 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean w;
        public final /* synthetic */ LPt8Fixed x;

        public T23(gz0 gz0Var) {
            this.x = gz0Var;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.x.getClass();
            this.w = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z = this.w;
            LPt8Fixed lPt8 = this.x;
            if (!z) {
                lPt8.getClass();
                a();
                this.w = true;
            }
            valueAnimator.getAnimatedFraction();
            lPt8.getClass();
        }
    }

    public interface YKK {
    }

    public class auxFixed extends T23 {
        public final /* synthetic */ LPt8Fixed y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public auxFixed(gz0 gz0Var) {
            super(gz0Var);
            this.y = gz0Var;
        }

        @Override // com.google.android.material.floatingactionbutton.LPt8Fixed.T23
        public final float a() {
            return this.y.d;
        }
    }

    public LPt8Fixed(FloatingActionButton floatingActionButton, FloatingActionButton.CQf cQf) {
        new RectF();
        new RectF();
        this.u = new Matrix();
        this.r = floatingActionButton;
        this.s = cQf;
        ns4 ns4Var = new ns4();
        gz0 gz0Var = (gz0) this;
        ns4Var.a(x, b(new C0081LPt8(gz0Var)));
        ns4Var.a(y, b(new F1(gz0Var)));
        ns4Var.a(z, b(new F1(gz0Var)));
        ns4Var.a(A, b(new F1(gz0Var)));
        ns4Var.a(B, b(new auxFixed(gz0Var)));
        ns4Var.a(C, b(new CQf(gz0Var)));
        this.l = floatingActionButton.getRotation();
    }

    public static ValueAnimator b(T23 t23) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(w);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(t23);
        valueAnimator.addUpdateListener(t23);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final AnimatorSet a(eh2 eh2Var, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.r;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eh2Var.c("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        eh2Var.c("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new ez0());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        eh2Var.c("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new ez0());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.u;
        matrix.reset();
        floatingActionButton.getDrawable();
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new dj1(), new QnHx(), new Matrix(matrix));
        eh2Var.c("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        X.A(animatorSet, arrayList);
        return animatorSet;
    }

    public float c() {
        throw null;
    }

    public void d(Rect rect) {
        int sizeDimension = this.b ? (0 - this.r.getSizeDimension()) / 2 : 0;
        float fC = this.c ? c() + this.f : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fC));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fC * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public void e() {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(int[] iArr) {
        throw null;
    }

    public void h(float f, float f2, float f3) {
        throw null;
    }

    public final void i() {
        ArrayList<NUlFixed> arrayList = this.q;
        if (arrayList != null) {
            Iterator<NUlFixed> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public final void l() {
        d(this.t);
        C0239D.l(null, "Didn't initialize content background");
        throw null;
    }
}
