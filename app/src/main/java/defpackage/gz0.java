package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.LPt8Fixed;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gz0 extends LPt8Fixed {
    public gz0(FloatingActionButton floatingActionButton, FloatingActionButton.CQf cQf) {
        super(floatingActionButton, cQf);
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final float c() {
        return this.r.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void d(Rect rect) {
        if (FloatingActionButton.this.E) {
            super.d(rect);
            return;
        }
        boolean z = this.b;
        FloatingActionButton floatingActionButton = this.r;
        if (!z || floatingActionButton.getSizeDimension() >= 0) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (0 - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void e() {
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void f() {
        l();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void g(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            FloatingActionButton floatingActionButton = this.r;
            if (!floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(0.0f);
                floatingActionButton.setTranslationZ(0.0f);
                return;
            }
            floatingActionButton.setElevation(this.d);
            if (floatingActionButton.isPressed()) {
                floatingActionButton.setTranslationZ(this.f);
            } else if (floatingActionButton.isFocused() || floatingActionButton.isHovered()) {
                floatingActionButton.setTranslationZ(this.e);
            } else {
                floatingActionButton.setTranslationZ(0.0f);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void h(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.r;
        if (i == 21) {
            floatingActionButton.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(LPt8Fixed.x, m(f, f3));
            stateListAnimator.addState(LPt8Fixed.y, m(f, f2));
            stateListAnimator.addState(LPt8Fixed.z, m(f, f2));
            stateListAnimator.addState(LPt8Fixed.A, m(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(LPt8Fixed.w);
            stateListAnimator.addState(LPt8Fixed.B, animatorSet);
            stateListAnimator.addState(LPt8Fixed.C, m(0.0f, 0.0f));
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (n()) {
            l();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void j() {
    }

    @Override // com.google.android.material.floatingactionbutton.LPt8Fixed
    public final void k() {
    }

    public final AnimatorSet m(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.r;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(LPt8Fixed.w);
        return animatorSet;
    }

    public final boolean n() {
        if (FloatingActionButton.this.E) {
            return true;
        }
        return !(!this.b || this.r.getSizeDimension() >= 0);
    }
}
