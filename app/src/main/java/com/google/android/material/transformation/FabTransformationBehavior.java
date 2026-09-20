package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.azefsw.audioconnect.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.Kl;
import defpackage.X;
import defpackage.bi5;
import defpackage.eh2;
import defpackage.fh2;
import defpackage.jq;
import defpackage.n95;
import defpackage.o95;
import defpackage.ok4;
import defpackage.qLd;
import defpackage.rq;
import defpackage.to0;
import defpackage.tq;
import defpackage.ur;
import defpackage.yq;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public static class CQf {
        public eh2 a;
        public qLd b;
    }

    public class QnHx extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ View x;
        public final /* synthetic */ View y;

        public QnHx(boolean z, View view, View view2) {
            this.w = z;
            this.x = view;
            this.y = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.w) {
                return;
            }
            this.x.setVisibility(4);
            View view = this.y;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.w) {
                this.x.setVisibility(0);
                View view = this.y;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair u(float f, float f2, boolean z, CQf cQf) {
        fh2 fh2VarC;
        fh2 fh2VarC2;
        if (f == 0.0f || f2 == 0.0f) {
            fh2VarC = cQf.a.c("translationXLinear");
            fh2VarC2 = cQf.a.c("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            fh2VarC = cQf.a.c("translationXCurveDownwards");
            fh2VarC2 = cQf.a.c("translationYCurveDownwards");
        } else {
            fh2VarC = cQf.a.c("translationXCurveUpwards");
            fh2VarC2 = cQf.a.c("translationYCurveUpwards");
        }
        return new Pair(fh2VarC, fh2VarC2);
    }

    public static float x(CQf cQf, fh2 fh2Var, float f) {
        long j = fh2Var.a;
        fh2 fh2VarC = cQf.a.c("expansion");
        float interpolation = fh2Var.b().getInterpolation((((fh2VarC.a + fh2VarC.b) + 17) - j) / fh2Var.b);
        LinearInterpolator linearInterpolator = ur.a;
        return ((0.0f - f) * interpolation) + f;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.F1
    public final void c(CoordinatorLayout.YKK ykk) {
        if (ykk.h == 0) {
            ykk.h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x037f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        CQf cQf;
        AnimatorSet animatorSetA;
        ArrayList arrayList2;
        boolean z3;
        ObjectAnimator objectAnimatorOfInt;
        CQf cQf2;
        ViewGroup viewGroup;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt2;
        CQf cQfZ = z(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Field field = bi5.a;
        float fI = bi5.byN.i(view2) - bi5.byN.i(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fI);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fI);
        }
        cQfZ.a.c("elevation").a(objectAnimatorOfFloat);
        arrayList3.add(objectAnimatorOfFloat);
        RectF rectF = this.d;
        float fV = v(view, view2, cQfZ.b);
        float fW = w(view, view2, cQfZ.b);
        Pair pairU = u(fV, fW, z, cQfZ);
        fh2 fh2Var = (fh2) pairU.first;
        fh2 fh2Var2 = (fh2) pairU.second;
        RectF rectF2 = this.e;
        Rect rect = this.c;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fV);
                view2.setTranslationY(-fW);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fX = x(cQfZ, fh2Var, -fV);
            float fX2 = x(cQfZ, fh2Var2, -fW);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            y(view2, rectF2);
            rectF2.offset(fX, fX2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fV);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fW);
        }
        fh2Var.a(objectAnimatorOfFloat2);
        fh2Var2.a(objectAnimatorOfFloat3);
        arrayList3.add(objectAnimatorOfFloat2);
        arrayList3.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fV2 = v(view, view2, cQfZ.b);
        float fW2 = w(view, view2, cQfZ.b);
        Pair pairU2 = u(fV2, fW2, z, cQfZ);
        fh2 fh2Var3 = (fh2) pairU2.first;
        fh2 fh2Var4 = (fh2) pairU2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = z ? fV2 : this.g;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? fW2 : this.h;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fh2Var3.a(objectAnimatorOfFloat7);
        fh2Var4.a(objectAnimatorOfFloat8);
        arrayList3.add(objectAnimatorOfFloat7);
        arrayList3.add(objectAnimatorOfFloat8);
        boolean z4 = view2 instanceof yq;
        if (z4 && (view instanceof ImageView)) {
            yq yqVar = (yq) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                fWidth = fWidth;
                arrayList = arrayList4;
            } else {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, to0.a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, to0.a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.QnHx(view2));
                cQfZ.a.c("iconFade").a(objectAnimatorOfInt2);
                arrayList3.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.CQf cQf3 = new com.google.android.material.transformation.CQf(yqVar, drawable);
                arrayList = arrayList4;
                arrayList.add(cQf3);
            }
        } else {
            fWidth = fWidth;
            arrayList = arrayList4;
        }
        if (z4) {
            yq yqVar2 = (yq) view2;
            qLd qld = cQfZ.b;
            y(view, rectF);
            rectF.offset(this.g, this.h);
            y(view2, rectF2);
            rectF2.offset(-v(view, view2, qld), 0.0f);
            float fCenterX = rectF.centerX() - rectF2.left;
            qLd qld2 = cQfZ.b;
            y(view, rectF);
            rectF.offset(this.g, this.h);
            y(view2, rectF2);
            rectF2.offset(0.0f, -w(view, view2, qld2));
            float fCenterY = rectF.centerY() - rectF2.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (bi5.auxFixed.c(floatingActionButton)) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                throw null;
            }
            float fWidth2 = rect.width() / 2.0f;
            fh2 fh2VarC = cQfZ.a.c("expansion");
            if (z) {
                if (!z2) {
                    yqVar2.setRevealInfo(new yq.LPt8Fixed(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = yqVar2.getRevealInfo().c;
                }
                double d = 0.0f - fCenterX;
                double d2 = 0.0f - fCenterY;
                float fHypot = (float) Math.hypot(d, d2);
                double d3 = fWidth - fCenterX;
                float fHypot2 = (float) Math.hypot(d3, d2);
                double d4 = fHeight - fCenterY;
                float fHypot3 = (float) Math.hypot(d3, d4);
                float fHypot4 = (float) Math.hypot(d, d4);
                if (fHypot <= fHypot2 || fHypot <= fHypot3 || fHypot <= fHypot4) {
                    fHypot = (fHypot2 <= fHypot3 || fHypot2 <= fHypot4) ? fHypot3 > fHypot4 ? fHypot3 : fHypot4 : fHypot2;
                }
                animatorSetA = tq.a(yqVar2, fCenterX, fCenterY, fHypot);
                animatorSetA.addListener(new F1(yqVar2));
                long j = fh2VarC.a;
                int i = (int) fCenterX;
                int i2 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList3.add(animatorCreateCircularReveal);
                }
                cQf = cQfZ;
            } else {
                float f = yqVar2.getRevealInfo().c;
                AnimatorSet animatorSetA2 = tq.a(yqVar2, fCenterX, fCenterY, fWidth2);
                long j2 = fh2VarC.a;
                int i3 = (int) fCenterX;
                int i4 = (int) fCenterY;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, f, f);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList3.add(animatorCreateCircularReveal2);
                }
                CQf cQf4 = cQfZ;
                ok4<String, fh2> ok4Var = cQf4.a.a;
                int i5 = ok4Var.y;
                long jMax = 0;
                int i6 = 0;
                while (i6 < i5) {
                    fh2 fh2VarK = ok4Var.k(i6);
                    jMax = Math.max(jMax, fh2VarK.a + fh2VarK.b);
                    i6++;
                    ok4Var = ok4Var;
                    i5 = i5;
                    animatorSetA2 = animatorSetA2;
                    cQf4 = cQf4;
                }
                cQf = cQf4;
                AnimatorSet animatorSet = animatorSetA2;
                long j3 = fh2VarC.a + fh2VarC.b;
                if (j3 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j3);
                    animatorCreateCircularReveal3.setDuration(jMax - j3);
                    arrayList3.add(animatorCreateCircularReveal3);
                }
                animatorSetA = animatorSet;
            }
            fh2VarC.a(animatorSetA);
            arrayList3.add(animatorSetA);
            arrayList2 = arrayList;
            arrayList2.add(new rq(yqVar2));
        } else {
            cQf = cQfZ;
            z4 = z4;
            arrayList2 = arrayList;
        }
        if (z4) {
            yq yqVar3 = (yq) view2;
            Field field2 = bi5.a;
            ColorStateList colorStateListG = bi5.byN.g(view);
            int colorForState = colorStateListG != null ? colorStateListG.getColorForState(view.getDrawableState(), colorStateListG.getDefaultColor()) : 0;
            int i7 = 16777215 & colorForState;
            z3 = z;
            if (z3) {
                if (!z2) {
                    yqVar3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(yqVar3, yq.F1.a, i7);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(yqVar3, yq.F1.a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(Kl.a);
            cQf2 = cQf;
            cQf2.a.c("color").a(objectAnimatorOfInt);
            arrayList3.add(objectAnimatorOfInt);
        } else {
            z3 = z;
            cQf2 = cQf;
        }
        boolean z5 = view2 instanceof ViewGroup;
        if (z5) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                } else {
                    viewGroup = null;
                }
            } else if ((view2 instanceof o95) || (view2 instanceof n95)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                } else {
                    viewGroup = null;
                }
            } else if (z5) {
                viewGroup = (ViewGroup) view2;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (z3) {
                    if (!z2) {
                        jq.a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, jq.a, 1.0f);
                } else {
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, jq.a, 0.0f);
                }
                cQf2.a.c("contentFade").a(objectAnimatorOfFloat4);
                arrayList3.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        X.A(animatorSet2, arrayList3);
        animatorSet2.addListener(new QnHx(z3, view2, view));
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i8));
        }
        return animatorSet2;
    }

    public final float v(View view, View view2, qLd qld) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        y(view2, rectF2);
        qld.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, qLd qld) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        y(view, rectF);
        rectF.offset(this.g, this.h);
        y(view2, rectF2);
        qld.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract CQf z(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
